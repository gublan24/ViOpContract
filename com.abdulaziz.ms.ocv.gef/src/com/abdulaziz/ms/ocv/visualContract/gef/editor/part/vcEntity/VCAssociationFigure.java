package com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.Panel;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;

import com.abdulaziz.ms.OCV.VCAssociation;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.figure.VCEntityFigure;

public class VCAssociationFigure extends Figure implements VCEntityFigure {
	
	private static final String ICON = "link-icon.gif";
	private Label label;
	private RectangleFigure rectangleFigure;
	private ConnectionAnchor connectionAnchor;
	private Panel mainPanelFigure;
	private ImageFigure image;
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
		
	//	mainPanelFigure = new Panel();
		//mainPanelFigure.setLayoutManager(layout);
		
	//	add(mainPanelFigure);
		label = new Label();/*
	//	image = new ImageFigure(new Image(null, VCInstanceFigure.class.getResourceAsStream(ICON)));
	//	rectangleFigure = new RectangleFigure();
		//add(rectangleFigure);
		//add(label);
	//	mainPanelFigure.add(image);
	//	mainPanelFigure.add(label);
		//add(mainPanelFigure);
		*/
		
		
	}
	@Override
	protected void paintFigure(Graphics graphics)
	{
		Rectangle r = getBounds().getCopy();
		graphics.setBackgroundColor(fillColor); 
		graphics.fillOval(r);
		graphics.setLineWidth(4);
		graphics.setForegroundColor(ColorConstants.white);
		graphics.drawLine(r.x, r.y, r.x+r.width, r.y+r.height);
		graphics.drawLine(r.x+r.width, r.y, r.x, r.y+r.height);
		graphics.setForegroundColor(fillColor);
		graphics.setLineWidth(2);
		graphics.drawOval(r);

		
	  //  setConstraint(mainPanelFigure, new Rectangle(0,0,r.width, r.height));
	    /*
	    setConstraint(rectangleFigure, new Rectangle(0, 0, r.width, r.height));
	    setConstraint(label, new Rectangle(0, 0, r.width, r.height));
	    */
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