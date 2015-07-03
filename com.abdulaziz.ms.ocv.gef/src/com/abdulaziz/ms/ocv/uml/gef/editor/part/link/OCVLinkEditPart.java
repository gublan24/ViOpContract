package com.abdulaziz.ms.ocv.uml.gef.editor.part.link;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gef.editpolicies.ConnectionEndpointEditPolicy;

import com.abdulaziz.ms.ocv.uml.gef.editor.factory.UMLLinkFactory;
import com.abdulaziz.ms.ocv.uml.gef.editor.policy.OCVLinkConnectionEditPolicy;

public class OCVLinkEditPart extends AbstractConnectionEditPart {

	public OCVLinkEditPart() {
		super();
	}

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.CONNECTION_ENDPOINTS_ROLE,
				new ConnectionEndpointEditPolicy());
		installEditPolicy(EditPolicy.CONNECTION_ROLE, new OCVLinkConnectionEditPolicy());
	}

	@Override
	protected IFigure createFigure() {
		PolylineConnection conn = new PolylineConnection();
	
		return conn;
	}
	

	
	

}
