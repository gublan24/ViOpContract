package com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;

import com.abdulaziz.ms.ocv.visualContract.gef.editor.figure.VCEntityFigure;

public class VCReturnFigure extends Figure implements VCEntityFigure {

	private ConnectionAnchor connectionAnchor;
	private String value = "Return";
	private Label operationParameter;
	
	public VCReturnFigure()
	{
		setLayoutManager(new XYLayout());
		 operationParameter = new Label();
		 operationParameter.setText(value);
		operationParameter.setForegroundColor(ColorConstants.white);
		add(operationParameter);
	}
	
	@Override
	protected void paintFigure(Graphics graphics)
	{
		Rectangle r = getBounds();
		//graphics.drawOval(r);	
		graphics.setBackgroundColor(ColorConstants.darkGray);
		graphics.setForegroundColor(ColorConstants.darkGray);

		graphics.setLineStyle(SWT.LINE_SOLID);
		
		graphics.setLineWidth(3);
		int s = 2;
		r.shrink(s, s);
		graphics.drawOval(r);
		
		
		//
		
		
		graphics.fillOval(r);
	    setConstraint(operationParameter, new Rectangle(0,0,r.width+s, r.height));
	    
	}

	@Override
	public String getName() {
		return value ;
	}

	@Override
	public void setName(String value) {
		this.value = value;
		
	}

	@Override
	public ConnectionAnchor getConnectionAnchor() {
		if(connectionAnchor ==null)
		{
			connectionAnchor = new ChopboxAnchor(this);
		}
		return connectionAnchor;
	}

}