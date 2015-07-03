package com.abdulaziz.ms.ocv.visualContract.gef.editor.part;

import java.util.List;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.GraphicalEditPolicy;

import com.abdulaziz.ms.OCV.UMLClass;
import com.abdulaziz.ms.OCV.VCEntity;
import com.abdulaziz.ms.OCV.VCLink;
import com.abdulaziz.ms.ocv.uml.gef.editor.figure.UMLClassFigure;
import com.abdulaziz.ms.ocv.uml.gef.editor.part.OCVClassDiagramEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.figure.VCEntityFigure;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcontractCondition.VContractConditionEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.policy.VCEntityEditPolicy;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.policy.VCEntityGraphicalNodeEditPolicy;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.policy.VContractConditionXYEditPolicy;

public abstract class VCEntityEditPart extends AbstractGraphicalEditPart
		implements NodeEditPart {

	private Adapter adapter;

	public VCEntityEditPart() {

		adapter = new ModelAdapter();
	}

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE,	new VCEntityGraphicalNodeEditPolicy());
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new VCEntityEditPolicy());
		
	}

	@Override
	public void activate() {
		if (!isActive()) {
			((VCEntity) getModel()).eAdapters().add(adapter);
		}
		super.activate();
	}

	@Override
	public void deactivate() {
		if (isActive()) {
			((VCEntity) getModel()).eAdapters().remove(adapter);
		}
		super.deactivate();

	}
// can be removed as if subclasses have their own implementation
	@Override
	protected  void refreshVisuals()
	{
		VCEntityFigure figure = (VCEntityFigure) getFigure();
		VCEntity vcEntity = (VCEntity) getModel();		
		VContractConditionEditPart vContractEditPart = (VContractConditionEditPart) getParent();
		Rectangle layout = vcEntity.getConstraints();
		vContractEditPart.setLayoutConstraint(this, figure, layout);

	}


	@Override
	protected List<VCLink> getModelSourceConnections() {
		VCEntity model = (VCEntity) getModel();
		return model.getOutgoingLinks();
	}

	@Override
	protected List<VCLink> getModelTargetConnections() {
		VCEntity model = (VCEntity) getModel();
		return model.getIncomingLinks();
	}

	@Override
	public ConnectionAnchor getSourceConnectionAnchor(
			ConnectionEditPart connection) {
		return ((VCEntityFigure) getFigure()).getConnectionAnchor();
	}

	@Override
	public ConnectionAnchor getTargetConnectionAnchor(
			ConnectionEditPart connection) {
		return ((VCEntityFigure) getFigure()).getConnectionAnchor();
	}

	@Override
	public ConnectionAnchor getSourceConnectionAnchor(Request request) {
		return ((VCEntityFigure) getFigure()).getConnectionAnchor();
	}

	@Override
	public ConnectionAnchor getTargetConnectionAnchor(Request request) {
		return ((VCEntityFigure) getFigure()).getConnectionAnchor();
	}
	
	@Override public void performRequest(Request req) {
	    
	  }

	private class ModelAdapter implements Adapter {
		@Override
		public void notifyChanged(Notification notification) {
			refreshVisuals();
			refreshSourceConnections();
			refreshTargetConnections();

		}

		@Override
		public Notifier getTarget() {
			return (VCEntity) getModel();
		}

		@Override
		public void setTarget(Notifier newTarget) {
			// TODO Auto-generated method stub

		}

		@Override
		public boolean isAdapterForType(Object type) {
			return type.equals(VCEntity.class);
		}
	}

}
