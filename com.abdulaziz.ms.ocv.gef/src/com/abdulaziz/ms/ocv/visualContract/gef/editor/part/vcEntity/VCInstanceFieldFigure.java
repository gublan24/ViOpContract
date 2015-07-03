package com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity;

import java.beans.PropertyChangeListener;
import java.util.Collection;
import java.util.List;

import javax.swing.text.StyleConstants.ColorConstants;

import org.eclipse.draw2d.AncestorListener;
import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.CoordinateListener;
import org.eclipse.draw2d.EllipseAnchor;
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

import com.abdulaziz.ms.OCV.VCInstanceField;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.figure.VCEntityFigure;

public class VCInstanceFieldFigure extends Figure implements VCEntityFigure {

	private ConnectionAnchor connectionAnchor;
	private VCInstanceField vCInstanceField;
	private Label operationParameter;
	
	public VCInstanceFieldFigure()
	{
		setLayoutManager(new XYLayout());
		 operationParameter = new Label();
		 operationParameter.setText("Instance Field");

		add(operationParameter);
	}
	
	@Override
	protected void paintFigure(Graphics graphics)
	{
		if(vCInstanceField.getUmlClassField() != null)
		{
			 operationParameter.setText(vCInstanceField.getUmlClassField().getVariableName());

		}
		Rectangle r = getBounds().getCopy();
	    setConstraint(operationParameter, new Rectangle(0,0,r.width, r.height));
	    r.shrink(r.width-4, r.height-4);
	    r.setLocation(r.x+1,r.y+1);
	    graphics.setLineWidth(3);
	    setBackgroundColor(new Color(null, 173, 242, 165));
		graphics.drawRoundRectangle(r, 10, 60);
		
		graphics.fillRoundRectangle(r, 10, 60);

	    
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
			connectionAnchor = new EllipseAnchor(this);
		}
		return connectionAnchor;
	}

	public void setInstanceField(VCInstanceField instanceField) {
		this.vCInstanceField = instanceField;
	}

	public void setvCInstanceField(VCInstanceField vCInstanceField) {
		this.vCInstanceField = vCInstanceField;
	}

}