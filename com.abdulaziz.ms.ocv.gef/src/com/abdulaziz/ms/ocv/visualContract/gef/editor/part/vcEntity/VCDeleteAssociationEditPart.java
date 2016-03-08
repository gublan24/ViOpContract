package com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import com.abdulaziz.ms.OCV.UMLClass;
import com.abdulaziz.ms.OCV.UMLClassDiagram;
import com.abdulaziz.ms.OCV.UMLLink;
import com.abdulaziz.ms.OCV.VCAssociationDeletion;
import com.abdulaziz.ms.OCV.VCEntity;
import com.abdulaziz.ms.OCV.VCInstance;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.VCEntityEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcontractCondition.VContractConditionEditPart;

public class VCDeleteAssociationEditPart extends VCEntityEditPart {

	private Adapter adapter;

	public VCDeleteAssociationEditPart() {
		adapter = new ModelAdapter();

	}

	@Override
	protected IFigure createFigure() {
		return new VCDeleteAssociationFigure();
	}

	@Override
	protected void refreshVisuals() {
		VCDeleteAssociationFigure figure = (VCDeleteAssociationFigure) getFigure();
		VCAssociationDeletion vcEntity = (VCAssociationDeletion) getModel();
		figure.setText(vcEntity.getName());
		figure.setVCAssociationDeletion(vcEntity);

		if (((VCAssociationDeletion) getModel()).getIncomingLinks().size() == 2) {
			figure.setColor(checkDomianDiagramDirectLink((VCAssociationDeletion) getModel()));

		}
		VContractConditionEditPart vContractEditPart = (VContractConditionEditPart) getParent();
		Rectangle layout = vcEntity.getConstraints();
		vContractEditPart.setLayoutConstraint(this, figure, layout);

	}

	public static boolean isLinkExist(UMLClassDiagram classDiagram,
			UMLClass umlClassA, UMLClass umlClassB) {
		boolean result = false;
		try {
			for (UMLLink link : classDiagram.getLinks()) {
				if (link.getTarget().equals(umlClassA)
						&& link.getSource().equals(umlClassB)
						|| link.getTarget().equals(umlClassB)
						&& link.getSource().equals(umlClassA)) {
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

		if (target.getIncomingLinks().size() < 2)
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
		if (source0 == null || source1 == null)
			return false;

		return isLinkExist(source0.getUmlDiagram(), source0, source1);
	}

	@Override
	public void activate() {
		if (!isActive()) {
			((VCAssociationDeletion) getModel()).eAdapters().add(adapter);

		}
		super.activate();
	}

	@Override
	public void deactivate() {
		if (isActive()) {
			((VCAssociationDeletion) getModel()).eAdapters().remove(adapter);

		}
		super.deactivate();

	}

	private class ModelAdapter implements Adapter {
		@Override
		public void notifyChanged(Notification notification) {
			/*
			 * if(notification.getNewValue() != null) // Not A delete command
			 */
			refreshVisuals();
			refreshSourceConnections();
			refreshTargetConnections();

		}

		@Override
		public Notifier getTarget() {
			return (VCAssociationDeletion) getModel();
		}

		@Override
		public void setTarget(Notifier newTarget) {
			// TODO Auto-generated method stub

		}

		@Override
		public boolean isAdapterForType(Object type) {
			return type.equals(VCAssociationDeletion.class);
		}
	}

}
