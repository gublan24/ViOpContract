package com.abdulaziz.ms.ocv.visualContract.gef.editor.part;

import org.eclipse.draw2d.Bendpoint;
import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionRouter;
import org.eclipse.draw2d.FanRouter;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ManhattanConnectionRouter;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.LineAttributes;
import org.eclipse.swt.widgets.Display;

public class VCLinkPrePostConditionEditPart extends VCLinkEditPart {
	
	

	@Override
	protected IFigure createFigure() {
		
		//TODO Routers 
		
		PolylineConnection  conn = new PolylineConnection ();
		conn.setConnectionRouter(new BendpointConnectionRouter());
		conn.setLineStyle(SWT.LINE_DASHDOTDOT);
		Display display = Display.getCurrent();
	    Color connectionColor = display.getSystemColor(SWT.COLOR_DARK_CYAN);
	    conn.setForegroundColor(connectionColor);
		conn.setLineWidth(3);

		
		PolygonDecoration decoration = new PolygonDecoration();
		decoration.setBackgroundColor(connectionColor);
		PointList decorationPointList = new PointList();
		decorationPointList.addPoint(0, 0);
		decorationPointList.addPoint(-2, 2);
		decorationPointList.addPoint(-2, -2);
		decoration.setTemplate(decorationPointList);
		super.check(conn, decoration);
		
		return conn;
	}

}
