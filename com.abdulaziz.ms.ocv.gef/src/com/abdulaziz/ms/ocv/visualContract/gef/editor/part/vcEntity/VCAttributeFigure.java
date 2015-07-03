package com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;

import com.abdulaziz.ms.ocv.visualContract.gef.editor.figure.VCEntityFigure;

public class VCAttributeFigure extends Figure implements VCEntityFigure {
	
	private Label label;
	private RectangleFigure rectangleFigure;
	private ConnectionAnchor connectionAnchor;
	
	public VCAttributeFigure()
	{
		setLayoutManager(new XYLayout());
		rectangleFigure = new RectangleFigure();
		add(rectangleFigure);
		label = new Label();
		add(label);
		
	}
	@Override
	protected void paintFigure(Graphics graphics)
	{
		Rectangle r = getBounds().getCopy();
	    setConstraint(rectangleFigure, new Rectangle(0, 0, r.width, r.height));
	    setConstraint(label, new Rectangle(0, 0, r.width, r.height));
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
	

}