package com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.CompoundCommand;

import com.abdulaziz.ms.OCV.UMLClass;
import com.abdulaziz.ms.OCV.UMLClassDiagram;
import com.abdulaziz.ms.OCV.UMLLink;
import com.abdulaziz.ms.OCV.VCAssociation;
import com.abdulaziz.ms.OCV.VCEntity;
import com.abdulaziz.ms.OCV.VCInstance;
import com.abdulaziz.ms.ocv.visualContract.gef.action.VCAssociationUpdateSelectionAction;
import com.abdulaziz.ms.ocv.visualContract.gef.command.VCAssociationModifyCommand;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.VCEntityEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcontractCondition.VContractConditionEditPart;


public class VCAssociationEditPart extends VCEntityEditPart {

	private Adapter adapter;

	public VCAssociationEditPart()
	{
		  adapter = new ModelAdapter();

	}
	@Override
	protected IFigure createFigure() {
		return new VCAssociationFigure();
	}
	
	@Override
	public void performRequest(Request req) {
	    if(req.getType() == RequestConstants.REQ_OPEN) {
	    	Request request = new Request(VCAssociationUpdateSelectionAction.REQ_UPDATE_VC_ASSOCIATION);
	    	CompoundCommand compoundCommand = new CompoundCommand();
			compoundCommand.add(this.getCommand(request));
			compoundCommand.execute();
	    	/*
	    	VCAssociationModifyCommand command = new VCAssociationModifyCommand();
	    	command.setVCAssociation((VCAssociation) getModel());
	    	command.setControl(this.getViewer().getControl());
	    	if(command.canExecute())command.execute();
	        System.out.println("requested double-click.");
	        */ 
	    }
	}
	
	@Override
	protected  void refreshVisuals()
	{
		VCAssociationFigure figure = (VCAssociationFigure) getFigure();
		VCAssociation vcEntity = (VCAssociation) getModel();
		figure.setText(vcEntity.getName());
		figure.setvAssociation(vcEntity);
		if (((VCAssociation) getModel()).getIncomingLinks().size() == 2) {
				figure.setColor(checkDomianDiagramDirectLink((VCAssociation) getModel()));
			
		}
		VContractConditionEditPart vContractEditPart = (VContractConditionEditPart) getParent();
		Rectangle layout = vcEntity.getConstraints();
		vContractEditPart.setLayoutConstraint(this, figure, layout);

	}

	
	public static boolean isLinkExist(UMLClassDiagram classDiagram,UMLClass umlClassA, UMLClass umlClassB)
	{
		boolean result = false;
		try {
			for (UMLLink link : classDiagram.getLinks()) {
				if (link.getTarget().equals(umlClassA)
						&& link.getSource().equals(umlClassB)
						|| link.getTarget().equals(umlClassB) && link.getSource().equals(umlClassA)) {
					result = true;
					break;
				}

			}
		} catch (Exception e) {
			return false;
		}
		return result;
		
	}
	
	private boolean checkDomianDiagramDirectLink(VCEntity target) {
		
	
		/* Done at VCLinkRules 
		if (!((target.getIncomingLinks().get(0).getSource() instanceof VCInstance) && target.getIncomingLinks().get(1).getSource()instanceof VCInstance ))
			return false;
			*/
		
	if(target.getIncomingLinks().size() < 2)
			return false;
	UMLClass source0 = null;
	UMLClass source1 = null;
		try {
			source0 = ((VCInstance) target.getIncomingLinks().get(0)
					.getSource()).getUmlClass();
			source1 = ((VCInstance) target.getIncomingLinks().get(1)
					.getSource()).getUmlClass();
		} catch (NullPointerException e) {
			
			return false;

		}
	if( source0 == null|| source1  == null)
		return false;
	
		return isLinkExist(source0.getUmlDiagram(), source0, source1);
	}
	
	@Override
	public void activate() {
		if (!isActive()) {
			((VCAssociation) getModel()).eAdapters().add(adapter);
			//TODO
			//((VCEntity)getModel()).getPrecondition().eAdapters().add(adapter);
			
		
		}
		super.activate();
	}

	@Override
	public void deactivate() {
		if (isActive()) {
			((VCAssociation) getModel()).eAdapters().remove(adapter);
			/*
			if(((VCEntity) getModel()).getPrecondition().eAdapters().contains(adapter))
				((VCEntity)getModel()).getPrecondition().eAdapters().remove(adapter);
			else if (((VCEntity) getModel()).getPostcondition().eAdapters().contains(adapter))
				((VCEntity)getModel()).getPostcondition().eAdapters().remove(adapter);
			//((VCEntity)getModel()).getVcContract().getVOperationContract().getUmlOperation().getVSystem().getUmlDiagram().eAdapters().remove(adapter);
			 * 
			 */

		}
		super.deactivate();

	}

	private class ModelAdapter implements Adapter {
		@Override
		public void notifyChanged(Notification notification) {
			/*
			if(notification.getNewValue() != null) // Not A delete command
			*/ 
			refreshVisuals();
			refreshSourceConnections();
			refreshTargetConnections();

		}

		@Override
		public Notifier getTarget() {
			return (VCAssociation) getModel();
		}

		@Override
		public void setTarget(Notifier newTarget) {
			// TODO Auto-generated method stub

		}

		@Override
		public boolean isAdapterForType(Object type) {
			return type.equals(VCAssociation.class);
		}
	}



}
