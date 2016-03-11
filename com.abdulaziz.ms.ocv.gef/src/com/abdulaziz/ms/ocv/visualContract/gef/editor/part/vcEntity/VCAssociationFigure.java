package com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.Panel;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.XYAnchor;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.TextLayout;
import org.eclipse.swt.internal.gdip.Rect;

import com.abdulaziz.ms.OCV.VCAssociation;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.figure.VCEntityFigure;

public class VCAssociationFigure extends Figure implements VCEntityFigure {
	
	//private static final String ICON = "link-icon.gif";
	private Label label;
	private RectangleFigure rectangleFigure;
	private ConnectionAnchor connectionAnchor;
	//private Panel mainPanelFigure;
	//private ImageFigure image;
	private VCAssociation vAssociation;
	private Color greenFillColor;
	private Color redFillColor;
	private Color fillColor;

	public void setColor(boolean linkExist)
	{
		if (linkExist)
		fillColor = greenFillColor;
		else 
			fillColor = redFillColor;

			
	}
	
	public VCAssociationFigure()
	{
		
		ToolbarLayout layout = new ToolbarLayout();

		layout.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);
		layout.setStretchMinorAxis(false);
		layout.setSpacing(1);
		greenFillColor= new Color (null,114,195,41);
		redFillColor = ColorConstants.red;
		fillColor = redFillColor;
		setLayoutManager(new XYLayout());
		setOpaque(true);
		label = new Label();
		label.setOpaque(true);
		label.setForegroundColor(ColorConstants.black);
		this.add(label);
	
		
		
	}
	@Override
	protected void paintFigure(Graphics graphics)
	{
		
		
		Rectangle mainRectangle = getBounds().getCopy();
		int sh = 10;
		mainRectangle.shrink(1, sh);
		mainRectangle.y = mainRectangle.y-sh/2;
		int dimOfIntersection =mainRectangle.width/6;
		Rectangle leftOval  = new Rectangle(mainRectangle.getTopLeft().x, mainRectangle.getTopLeft().y, mainRectangle.width/2+dimOfIntersection,mainRectangle.height);
		Rectangle rightOval  = new Rectangle(mainRectangle.getTopLeft().x+mainRectangle.width/2 -dimOfIntersection, mainRectangle.getTopLeft().y, mainRectangle.width/2+dimOfIntersection,mainRectangle.height);
		Rectangle intersectionBetweenLeftRightOvals = rightOval.getCopy();
		intersectionBetweenLeftRightOvals.intersect(leftOval);	
		intersectionBetweenLeftRightOvals.shrink(1, 1);
		graphics.setBackgroundColor(fillColor);
		graphics.fillOval(intersectionBetweenLeftRightOvals);
		graphics.setLineWidth(3);
		graphics.drawOval(leftOval);
		graphics.drawOval(rightOval);
		graphics.setLineWidthFloat((float) 0.3);
		//graphics.drawText(attributeText, mainRectangle.x, mainRectangle.getBottom().y);
		if(!vAssociation.isDirectional())
			label.setText("");
		else 
			label.setText(""+vAssociation.getSecondInstanceVariable().getVariableName());
		setConstraint(label, new Rectangle(0,mainRectangle.height +sh-1 , mainRectangle.width, sh));
		
	}
	public Label getLabel() {
		return label;
	}
	public void setText(String string) {
		this.label.setText( string);
	}
	public RectangleFigure getRectangleFigure() {
		return rectangleFigure;
	}
	public void setRectangleFigure(RectangleFigure rectangleFigure) {
		this.rectangleFigure = rectangleFigure;
	}
	@Override
	public String getName() {
		return label.getText();
	}
	@Override
	public ConnectionAnchor getConnectionAnchor() {
		
		if(connectionAnchor ==null)
		{
			connectionAnchor = new ChopboxAnchor(this);
		}
		return connectionAnchor;
	}
	@Override
	public void setName(String string) {
		setText(string);
		
	}
	public void setvAssociation(VCAssociation vAssociation) {
		this.vAssociation = vAssociation;
	}

	
	

}