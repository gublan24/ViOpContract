package com.abdulaziz.ms.ocv.uml.gef.editor.part.link;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gef.EditPart;

public class OCVAggregationLinkEditPart extends OCVLinkEditPart implements
		EditPart {
	
	
	@Override
	protected IFigure createFigure() {
		PolylineConnection conn = new PolylineConnection();

		PolygonDecoration decoration = new PolygonDecoration();
		decoration.setBackgroundColor(ColorConstants.black);
		PointList decorationPointList = new PointList();
		

		decorationPointList.addPoint(0,0);
		decorationPointList.addPoint(-2,2);
		decorationPointList.addPoint(-4,0);
		decorationPointList.addPoint(-2,-2);
		decoration.setTemplate(decorationPointList);

		conn.setTargetDecoration(decoration);
		return conn;
	}
	


}
