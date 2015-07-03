package com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity;

import java.awt.LinearGradientPaint;
import java.beans.PropertyChangeListener;
import java.util.Collection;
import java.util.List;

import org.eclipse.draw2d.AncestorListener;
import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.CoordinateListener;
import org.eclipse.draw2d.EventDispatcher;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.FocusEvent;
import org.eclipse.draw2d.FocusListener;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IClippingStrategy;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.KeyEvent;
import org.eclipse.draw2d.KeyListener;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LayoutListener;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.draw2d.MouseMotionListener;
import org.eclipse.draw2d.TreeSearch;
import org.eclipse.draw2d.UpdateManager;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw2d.geometry.Translatable;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.graphics.Font;

import com.abdulaziz.ms.OCV.VCParameter;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.figure.VCEntityFigure;

public class VCParameterFigure extends Figure implements VCEntityFigure {

	private ConnectionAnchor connectionAnchor;
	private String value = "operation contract parameter";
	private Label operationParameter;
	private VCParameter vcParameter;
	
	public VCParameterFigure()
	{
		setLayoutManager(new XYLayout());
		setBackgroundColor(ColorConstants.darkGreen);
		 operationParameter = new Label();
		 setOpaque(true);
		 operationParameter. setBackgroundColor(new Color(null, 165, 242, 245));
		 operationParameter.setOpaque(true);
		 operationParameter.setBorder(new LineBorder(new Color(null, 146, 144, 171)));
		 operationParameter.setForegroundColor(ColorConstants.black);
			operationParameter.setText(value);

		add(operationParameter);
	}
	
	@Override
	protected void paintFigure(Graphics graphics)
	{
		if(vcParameter.getOperationParameter() != null)
			operationParameter.setText(vcParameter.getOperationParameter().getVariableName());

		Rectangle r = getBounds().getCopy();
	    setConstraint(operationParameter, new Rectangle(0,0,r.width, r.height));
	    
	}

	@Override
	public String getName() {
		return value ;
	}

	@Override
	public void setName(String parameterName) {
		this.value = parameterName;
		
	}

	@Override
	public ConnectionAnchor getConnectionAnchor() {
		if(connectionAnchor ==null)
		{
			connectionAnchor = new ChopboxAnchor(this);
		}
		return connectionAnchor;
	}

	public void setVCParameter(VCParameter vcEntity) {
		this.vcParameter = vcEntity;
		
	}

}