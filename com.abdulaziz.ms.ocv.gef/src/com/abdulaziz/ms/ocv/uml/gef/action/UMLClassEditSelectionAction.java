package com.abdulaziz.ms.ocv.uml.gef.action;

import java.io.InputStream;
import java.util.List;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.DecorationOverlayIcon;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.ui.IWorkbenchPart;

import com.abdulaziz.ms.OCV.UMLClass;
import com.abdulaziz.ms.ocv.uml.gef.editor.figure.UMLClassFigure;
import com.abdulaziz.ms.ocv.uml.gef.editor.part.OCVClassEditPart;
import com.abdulaziz.ms.ocv.uml.gef.util.AppUtility;
import com.abdulaziz.ms.ocv.visualContract.gef.action.VCAssociationUpdateSelectionAction;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity.VCAssociationEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity.VCAttributeEditPart;

public class UMLClassEditSelectionAction extends SelectionAction {
	

	public final static String EDIT_UML_CLASS = "Edit Class";
	public final static String REQ_EDIT_UML_CLASS = "EditUMLClass";
	private final static InputStream iconInputStream = AppUtility.UMLCLASS_MENU_EDIT_ICON;
	Request request;
	
	public UMLClassEditSelectionAction(IWorkbenchPart part) {
		super(part);
		setId(EDIT_UML_CLASS);
		setText(EDIT_UML_CLASS);
		request = new Request(REQ_EDIT_UML_CLASS);
		setImageDescriptor(new ImageDescriptor() {
			
			@Override
			public ImageData getImageData() {
				return new ImageData(iconInputStream);
			}
		});
	}

	

	@Override
	public void run()
	{
		@SuppressWarnings("unchecked")
		List <EditPart> selectedObjectsEditPart = getSelectedObjects();
		CompoundCommand compoundCommand = new CompoundCommand();
		
		for(EditPart editPart: selectedObjectsEditPart)
		{
			compoundCommand.add(editPart.getCommand(request));
		}
		
		execute(compoundCommand);
	}
	@Override
	protected boolean calculateEnabled() {
		 if(getSelectedObjects().isEmpty()) {
	            return false;
	        }
	        for(Object selectedObject : getSelectedObjects()) {
	            if(!(selectedObject instanceof OCVClassEditPart))
	                return false;
	            
	        }
		return true;
	}

}
