package com.abdulaziz.ms.ocv.visualContract.gef.editor.part;

import java.util.ArrayList;

import org.eclipse.draw2d.AbsoluteBendpoint;
import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gef.editpolicies.ConnectionEndpointEditPolicy;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

import com.abdulaziz.ms.OCV.VCAssociation;
import com.abdulaziz.ms.OCV.VCAssociationDeletion;
import com.abdulaziz.ms.OCV.VCInstance;
import com.abdulaziz.ms.OCV.VCInstanceField;
import com.abdulaziz.ms.OCV.VCLink;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.policy.VCLinkConnectionBendPointPolicy;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.policy.VCLinkConnectionEditPolicy;


public class VCLinkEditPart extends AbstractConnectionEditPart {
	
	private Adapter adapter;

	public VCLinkEditPart() {
		super();
		adapter = new VCLinkAdapter();

	}

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.CONNECTION_ENDPOINTS_ROLE,new ConnectionEndpointEditPolicy());
		installEditPolicy(EditPolicy.CONNECTION_BENDPOINTS_ROLE, new VCLinkConnectionBendPointPolicy());
		installEditPolicy(EditPolicy.CONNECTION_ROLE, new VCLinkConnectionEditPolicy());
	}
	
	public PolygonDecoration createTargetDecoration()
	{
		if(this.decoration == null)
		{
			decoration = new PolygonDecoration();
			Display display = Display.getCurrent();
		    Color connectionColor = display.getSystemColor(SWT.COLOR_BLUE);
			decoration.setBackgroundColor(connectionColor);
			PointList decorationPointList = new PointList();
			decorationPointList.addPoint(0, 0);
			decorationPointList.addPoint(-2, 2);
			decorationPointList.addPoint(-2, -2);
			decoration.setTemplate(decorationPointList);
		}
		
		return decoration;
	}
	PolygonDecoration decoration;
	@Override
	protected IFigure createFigure() {
		PolylineConnection  conn = new PolylineConnection ();
		conn.setConnectionRouter(new BendpointConnectionRouter());

		conn.setLineStyle(SWT.LINE_SOLID);
		Display display = Display.getCurrent();
	    Color connectionColor = display.getSystemColor(SWT.COLOR_BLUE);
	    conn.setForegroundColor(connectionColor);
		conn.setLineWidth(3);
		
		PolygonDecoration decoration = new PolygonDecoration();
		decoration.setBackgroundColor(connectionColor);
		PointList decorationPointList = new PointList();
		decorationPointList.addPoint(0, 0);
		decorationPointList.addPoint(-2, 2);
		decorationPointList.addPoint(-2, -2);
		decoration.setTemplate(decorationPointList);
		
		addTargetDecoration(conn, decoration);
		
		
		
		
		return conn;
	}
	
	public void addTargetDecoration(PolylineConnection conn, RotatableDecoration decoration)
	{	

		if (!((((VCLink) getModel()).getTarget() instanceof VCInstanceField) &&  (((VCLink) getModel()).getSource() instanceof VCInstance)))		
		{
					
			conn.setTargetDecoration(decoration);

		}

		/*
		
		if (((VCLink) getModel()).getTarget() instanceof VCAssociation )
			if (((VCAssociation)((VCLink) getModel()).getTarget()).isDirectional())
			{
				conn.setTargetDecoration(decoration);
			}
			
		if  (((VCLink) getModel()).getSource() instanceof VCAssociation)
		{
			if (((VCAssociation)((VCLink) getModel()).getSource()).isDirectional())
			{
				conn.setTargetDecoration(decoration);
			}
		}
		
		*/
		

		
	}
	
	@Override
	protected void refreshVisuals()
	{
		Connection connection = getConnectionFigure();
		EList<AbsoluteBendpoint> bendPointList = ((VCLink) getModel()).getBendpoints();
		ArrayList<AbsoluteBendpoint> points = new ArrayList<AbsoluteBendpoint>();
		for (AbsoluteBendpoint absoluteBendpoint : bendPointList) {
			points.add(absoluteBendpoint);
			
		}
		connection.setRoutingConstraint(points);
		PolylineConnection fffigure = (PolylineConnection)this.getFigure();
		
		if (((VCLink) getModel()).getTarget() instanceof VCAssociation )
		{
			if (!((VCAssociation)((VCLink) getModel()).getTarget()).isDirectional())
			{
				fffigure.setTargetDecoration(null);
			}
			else 
			{
				fffigure.setTargetDecoration(createTargetDecoration());
			}
		
		}	
		if  (((VCLink) getModel()).getSource() instanceof VCAssociation)
		{
			if (!((VCAssociation)((VCLink) getModel()).getSource()).isDirectional())
			{
				fffigure.setTargetDecoration(null);
			}
			else 
			{
				fffigure.setTargetDecoration(createTargetDecoration());
	
			}
		}
		
		// - - -- - -
		if  (((VCLink) getModel()).getSource() instanceof VCAssociationDeletion)
		{
			if (!((VCAssociationDeletion)((VCLink) getModel()).getSource()).isDirectional())
			{
				fffigure.setTargetDecoration(null);
			}
			else 
			{
				fffigure.setTargetDecoration(createTargetDecoration());
	
			}
		}
		else  if (((VCLink) getModel()).getTarget() instanceof VCAssociationDeletion )
			{
				if (!((VCAssociationDeletion)((VCLink) getModel()).getTarget()).isDirectional())
				{
					fffigure.setTargetDecoration(null);
				}
				else 
				{
					fffigure.setTargetDecoration(createTargetDecoration());
				}
			
			}	
		
		
	}
	
	@Override
	public void activate() {
		if (!isActive()) {
			((VCLink) getModel()).eAdapters().add(adapter);
		}
		super.activate();
	}

	@Override
	public void deactivate() {
		if (isActive()) {
			((VCLink) getModel()).eAdapters().remove(adapter);
		}
		super.deactivate();
	}

	public class VCLinkAdapter implements Adapter {

		@Override
		public void notifyChanged(Notification notification) {
			refreshVisuals();
			
			
		}

		@Override
		public Notifier getTarget() {
			return (VCLink) getModel();
		}

		@Override
		public void setTarget(Notifier newTarget) {
		}

		@Override
		public boolean isAdapterForType(Object type) {
			return type.equals(VCLink.class);
		}

	}
	

}
