package com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity;

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

import com.abdulaziz.ms.OCV.VCValue;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.figure.VCEntityFigure;

public class VCValueFigure extends Figure implements VCEntityFigure {

	private ConnectionAnchor connectionAnchor;
	private VCValue vcValue;
	private Label operationParameter;
	
	public VCValueFigure()
	{
		setOpaque(true);
		setLayoutManager(new XYLayout());
		 operationParameter = new Label();
		 operationParameter.setText("value");

		 operationParameter.setOpaque(true);
		 setBackgroundColor(new Color(null, 252,240,225));
		 operationParameter.setBorder(new LineBorder(2));
		add(operationParameter);
	}
	
	@Override
	protected void paintFigure(Graphics graphics)
	{
		if(vcValue.getValue() != null)
		{
	 operationParameter.setText(vcValue.getValue());
		}
		Rectangle r = getBounds().getCopy();
		
	    setConstraint(operationParameter, new Rectangle(0,0,r.width, r.height));
	    
	}

	@Override
	public String getName() {
		return "" ;
	}

	@Override
	public void setName(String value) {
		
	}

	@Override
	public ConnectionAnchor getConnectionAnchor() {
		if(connectionAnchor ==null)
		{
			connectionAnchor = new ChopboxAnchor(this);
		}
		return connectionAnchor;
	}

	public void setVcValue(VCValue vcValue) {
		this.vcValue = vcValue;
	}

}