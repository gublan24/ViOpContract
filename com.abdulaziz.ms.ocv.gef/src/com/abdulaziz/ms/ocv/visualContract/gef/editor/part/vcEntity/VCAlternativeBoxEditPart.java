package com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import com.abdulaziz.ms.OCV.ConditionOption;
import com.abdulaziz.ms.OCV.VCAlternativeBox;
import com.abdulaziz.ms.OCV.VCContract;
import com.abdulaziz.ms.OCV.VCEntity;
import com.abdulaziz.ms.OCV.VContractCondition;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.figure.VCEntityFigure;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.VCEntityEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcontractCondition.VContractConditionEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.policy.VContractXYEditPolicy;

public class VCAlternativeBoxEditPart extends VCEntityEditPart {

	private ModelAdapter adapter;

	public VCAlternativeBoxEditPart() {
		
		adapter = new ModelAdapter();
	}
	@Override
	protected void createEditPolicies() {
		super.createEditPolicies();
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new VContractXYEditPolicy());


	}
	@Override
	protected IFigure createFigure() {		
		return new VCAlternativeBoxFigure();
	}
	
	@Override
	protected  void refreshVisuals()
	{
		VCAlternativeBoxFigure figure = (VCAlternativeBoxFigure) getFigure();
	//	figure.setOptionsArraly(((VCAlternativeBox) getModel()).getConditinOptions());
		VCEntity vcEntity = (VCEntity) getModel();		
		VContractConditionEditPart vContractEditPart = (VContractConditionEditPart) getParent();
		Rectangle layout = vcEntity.getConstraints();
		vContractEditPart.setLayoutConstraint(this, figure, layout);
		

	}
	
	@Override
	public List<Object> getModelChildren() {

		VCAlternativeBox vcAltBox = (VCAlternativeBox) getModel();
		List<Object> list = new ArrayList<>();
		for (ConditionOption conditionOption : vcAltBox.getConditinOptions()) {
			// list.add(conditionOption.getVcContractAlternativeBox());
			if (conditionOption.getConditionBlock() != null && conditionOption.getResultBlock() != null) {
				list.add(conditionOption.getConditionBlock());
				list.add(conditionOption.getResultBlock());
			}

		}

		return list;

	}
	@Override
	public void activate()
	{
		if(! isActive())
		{
			((VCAlternativeBox)getModel()).eAdapters().add(adapter);
		}
		super.activate();
	}
	
	@Override
	public void deactivate()
	{
		if(isActive())
		{
			((VCAlternativeBox)getModel()).eAdapters().remove(adapter);
		}
		super.deactivate();
		
	}

	
	private class ModelAdapter implements Adapter {
	@Override
	public void notifyChanged(Notification notification) {
		refreshChildren();
		refreshVisuals();
		
	}

	@Override
	public Notifier getTarget() {
		return (VCAlternativeBox) getModel();
	}

	@Override
	public void setTarget(Notifier newTarget) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isAdapterForType(Object type) {
		return type.equals(VCAlternativeBox.class);
	}
	}
	



}
