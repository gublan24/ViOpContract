package com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Adapter;

import com.abdulaziz.ms.OCV.VCEntity;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.figure.VCEntityFigure;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.VCEntityEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcontractCondition.VContractConditionEditPart;

public class VCAttributeEditPart extends VCEntityEditPart {

	private Adapter adapter;

	public VCAttributeEditPart()
	{
		 // adapter = new ModelAdapter();

	}
	@Override
	protected IFigure createFigure() {
		return new VCAttributeFigure();
	}
	
	
	@Override
	protected  void refreshVisuals()
	{
		/*
		VCEntityFigure figure = (VCAttributeFigure) getFigure();
		VCAttribute vcEntity = (VCAttribute) getModel();
		figure.setName(vcEntity.getName());
		VContractConditionEditPart vContactConditonEditPart = (VContractConditionEditPart) getParent();
		Rectangle layout = vcEntity.getConstraints();
		vContactConditonEditPart.setLayoutConstraint(this, figure, layout);
		*/

	}
	/*
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

*/


}
