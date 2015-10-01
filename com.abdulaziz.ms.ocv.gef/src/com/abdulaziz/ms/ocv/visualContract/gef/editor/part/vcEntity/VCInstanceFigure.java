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

import com.abdulaziz.ms.ocv.visualContract.gef.editor.figure.VCEntityFigure;

public class VCInstanceFigure extends Figure implements VCEntityFigure {

	private ConnectionAnchor connectionAnchor;
	private String instanceType;
	private String umlClassName;
	private String instanceName;
	private static String ICON = "entity.gif";
	private Color fillColor ;
	private Color instanceFilling;
	public VCInstanceFigure() {

		ToolbarLayout layout = new ToolbarLayout();
		layout.setStretchMinorAxis(false);
		layout.setSpacing(1);
		this.setOpaque(true);
		setLayoutManager(new XYLayout());
		instanceFilling = new Color(null, 255, 255, 206);
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
		Rectangle r = getBounds().getCopy();

		int x = r.x;
		int y = r.y;
		graphics.setLineWidth(2);

		Rectangle r2 = new Rectangle(x, y, r.width - 2, r.height - 15);
		setBackgroundColor(fillColor);

		graphics.fillOval(r2);
		graphics.drawOval(r2);

		int centerFix = 0;

		switch (instanceType) {
		case "new":
			centerFix = 27;
			break;
		case "datastore":
		case "parameter":
			centerFix = 45;
			break;
		case "current":
			centerFix = 33;
			break;
		default:
			centerFix = 33;
			break;
		}
		graphics.drawString("<<" + instanceType + ">>", r2.getCenter().x
				- centerFix, r2.getCenter().y - 6);

		graphics.drawLine(r.getBottomLeft().x - 2, r.getBottomLeft().y - 14,
				r.getBottomRight().x - 2, r.getBottomLeft().y - 14);

		graphics.drawString(instanceName + ":" + umlClassName, r2.x + 4, r.y
				+ r.height - 12);

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
		fillColor =new Color(null, 165, 242, 245);
	
		

	}

}
