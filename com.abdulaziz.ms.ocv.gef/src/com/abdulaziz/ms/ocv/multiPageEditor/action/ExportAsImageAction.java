package com.abdulaziz.ms.ocv.multiPageEditor.action;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.core.runtime.Path;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.SWTGraphics;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.editparts.LayerManager;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

public class ExportAsImageAction extends Action {

	private GraphicalViewer graphicalViewer;

	public static final String ID = "export-as-image";
	private static Map<String,Integer> ext2swt = new LinkedHashMap<String,Integer>();
	static {
		ext2swt.put( "*.bmp",  SWT.IMAGE_BMP);
		ext2swt.put( "*.gif",  SWT.IMAGE_GIF);
		ext2swt.put( "*.jpg",  SWT.IMAGE_JPEG);
		ext2swt.put( "*.png",  SWT.IMAGE_PNG);
	}
	
	public ExportAsImageAction(GraphicalViewer graphicalViewer) {
		this.graphicalViewer = graphicalViewer;
		setText("Save as image");
		setToolTipText("Save as image");
		setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(ISharedImages.IMG_ETOOL_SAVEAS_EDIT));
		setId(ID);
	}
	
	@Override
	public void run() {
		Shell activeShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		FileDialog dialog = new FileDialog(activeShell, SWT.SAVE);
		dialog.setFilterNames(new String[] { "BITMAP(*.bmp)", "GIF(*.gif)", "JPG(*.jpg)", "PNG(*.png)"});
		dialog.setFilterExtensions(ext2swt.keySet().toArray(new String[0]));
		String fileName = dialog.open();
		if(null == fileName) {
			return ;
		}
		if(!isSupportedExtension(fileName)) {
			MessageDialog.openError(activeShell, "Error", "You should indicate one of the following types : BITMAP(*.bmp), GIF(*.gif), JPG(*.jpg), PNG(*.png)");
			return ;
		}
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		createImage(bos, getImageStyle(fileName));
		writeFile(fileName, bos);
	}

	private void writeFile(String fileName, ByteArrayOutputStream bos) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(fileName);
			fos.write(bos.toByteArray());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();	
			} catch(IOException e) {
				// Ignore
			}
		}
	}
	
	private boolean isSupportedExtension(String fileName) {
		String ext = new Path(fileName).getFileExtension();
		return null != ext && ext2swt.containsKey("*."+ext);
	}

	private int getImageStyle(String fileName) {
		String ext = new Path(fileName).getFileExtension();
		return ext2swt.get("*."+ext);
	}
	
	/**
	 * Writes the content of this editor to the given stream. Possible formats
	 * are for example SWT.IMAGE_BMP, IMAGE_GIF, IMAGE_JPEG, IMAGE_PNG.
	 * 
	 * @param stream
	 * @param format
	 */
	public void createImage(OutputStream stream, int format) {
		SWTGraphics g = null;
		GC gc = null;
		Image image = null;
		LayerManager layerManager = (LayerManager) graphicalViewer.getEditPartRegistry().get(LayerManager.ID);
		IFigure figure = layerManager.getLayer(LayerConstants.PRINTABLE_LAYERS);
		Rectangle r = figure.getBounds();
		try {
			image = new Image(Display.getDefault(), r.width, r.height);
			gc = new GC(image);
			g = new SWTGraphics(gc);
			g.translate(r.x * -1, r.y * -1);
			figure.paint(g);
			ImageLoader imageLoader = new ImageLoader();
			imageLoader.data = new ImageData[] { image.getImageData() };
			imageLoader.save(stream, format);
		} catch (Throwable t) {
			t.printStackTrace();
		} finally {
			if (g != null) {
				g.dispose();
			}
			if (gc != null) {
				gc.dispose();
			}
			if (image != null) {
				image.dispose();
			}
		}
	}
	 
	
}
