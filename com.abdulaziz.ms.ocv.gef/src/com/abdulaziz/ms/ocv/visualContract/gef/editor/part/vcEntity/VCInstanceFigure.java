package com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.Panel;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.jface.resource.FontDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.FontMetrics;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Widget;

import com.abdulaziz.ms.OCV.VCInstance;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.figure.VCEntityFigure;
import com.abdulaziz.ms.ocv.visualContract.gef.util.VContractUtility;

public class VCInstanceFigure extends Figure implements VCEntityFigure {

	private ConnectionAnchor connectionAnchor;
	private String instanceType;
	private String umlClassName;
	private String instanceName;
	private static String ICON = "entity.gif";
	private Color fillColor ;
	private Color instanceFilling;
	private VCInstance vcInstnace;
	public VCInstanceFigure() {

		ToolbarLayout layout = new ToolbarLayout();
		layout.setStretchMinorAxis(false);
		layout.setSpacing(1);
		this.setOpaque(true);
		setLayoutManager(new XYLayout());
		setFillColorToYallow();
		
		
	}
	
	public void setfillColorToRed()
	{
		fillColor = ColorConstants.red;
	}
	
	public void setFillColorToYallow()
	{
		fillColor = instanceFilling;
		
	}

	@Override
	protected void paintFigure(Graphics graphics) {
		Rectangle mainRectangle = getBounds().getCopy();

		int x = mainRectangle.x;
		int y = mainRectangle.y;
		graphics.setLineWidth(2);

		Rectangle shapeRrectangle = new Rectangle(x, y, mainRectangle.width - 2, mainRectangle.height - 15);

		

		int centerFix = 0;

		switch (instanceType) {
		case VContractUtility.VCINSTANCE_NEW:
			centerFix = 27;
			fillColor = new Color(null, 255, 255, 153);
			break;
		case VContractUtility.VCINSTANCE_RETRIEVED:
			centerFix = 40;
			fillColor = new Color(null, 221, 215, 230);
			break;
		case VContractUtility.VCINSTANCE_PARAMETER:
			centerFix = 45;
			fillColor = new Color(null, 194, 220, 220);
			break;
		case VContractUtility.VCINSTANCE_EXISTING:
			fillColor = new Color(null, 253, 200, 100);
			centerFix = 33;
			break;
		case VContractUtility.VCINSTANCE_TEMPORARY:
			fillColor = new Color(null, 250,250,250);
			centerFix = 40;

			break;
		default:
			centerFix = 33;
		}
		
		setBackgroundColor(fillColor);
		graphics.fillOval(shapeRrectangle);
		graphics.drawOval(shapeRrectangle);
		 
		
		/*
		 * Collection Case 
		 */
		
		if (vcInstnace.isCollection()) {
			setBackgroundColor(fillColor);
			graphics.fillOval(shapeRrectangle);
			graphics.drawOval(shapeRrectangle);
			Rectangle arc1Rectangle = shapeRrectangle.getCopy();
			shapeRrectangle.shrink(3, 3);
			arc1Rectangle.shrink(3, 3);
			Rectangle arc2Rectangle = arc1Rectangle.getCopy();
			arc2Rectangle.shrink(3, 3);

			arc1Rectangle.x = arc1Rectangle.x + 3;
			arc1Rectangle.y = arc1Rectangle.y + 3;
			arc2Rectangle.x = arc2Rectangle.x + 6;
			arc2Rectangle.y = arc2Rectangle.y + 6;

			graphics.drawArc(arc1Rectangle, 0, 270);
			graphics.drawArc(arc2Rectangle, 0, 270);

		}
		// --- END Collection Case 
		graphics.drawString("<<" + instanceType + ">>", shapeRrectangle.getCenter().x - centerFix, shapeRrectangle.getCenter().y - 6);
		graphics.drawLine(mainRectangle.getBottomLeft().x - 2, mainRectangle.getBottomLeft().y - 14,mainRectangle.getBottomRight().x - 2, mainRectangle.getBottomLeft().y - 14);
		graphics.drawString(instanceName + ":" + umlClassName, shapeRrectangle.x + 4, mainRectangle.y+ mainRectangle.height - 12);
		
		
		// Deleted Instance case 
		if(vcInstnace.isDeleted())
		{
		graphics.setForegroundColor(ColorConstants.red);
		graphics.setLineWidth(5);
		shapeRrectangle.shrink(2,2);
		Rectangle r = shapeRrectangle.getCopy();
		r.shrink(2,40);
		//graphics.drawLine(shapeRrectangle.getTopRight(),shapeRrectangle.getBottomLeft());
		graphics.drawLine(shapeRrectangle.getTopLeft(),shapeRrectangle.getBottomRight());
		graphics.drawLine(shapeRrectangle.getTopRight(),shapeRrectangle.getBottomLeft());
		graphics.setLineWidth(7);
		graphics.drawOval(shapeRrectangle);
		}
		// --- End Deleted Instance case
 
	}

	public void setName(String string) {
	}

	@Override
	public String getName() {
		return " ";
	}

	@Override
	public ConnectionAnchor getConnectionAnchor() {
		if (connectionAnchor == null) {
			connectionAnchor = new ChopboxAnchor(this);
		}
		return connectionAnchor;
	}

	public void setUmlClassName(String umlClassName) {
		this.umlClassName = umlClassName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
	}

	public void setInstanceType(String type) {
		this.instanceType = type;
	}

	public void setFillColorToBlue() {
		//fillColor =new Color(null, 165, 242, 245);
	
		

	}

	public void setVCInstance(VCInstance instanceModel) {
		this.vcInstnace = instanceModel;
	}

}
