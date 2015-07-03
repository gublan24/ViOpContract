package com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity;

import org.eclipse.draw2d.IFigure;

import com.abdulaziz.ms.OCV.VCInstance;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.VCEntityEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcontractCondition.VContractConditionEditPart;

public class VCInstanceEditPart extends VCEntityEditPart {


	public VCInstanceEditPart()
	{
		super();
	}

	@Override
	protected IFigure createFigure() {
		return new VCInstanceFigure();
	}


	@Override
	protected void refreshVisuals()
	{
		VCInstanceFigure instanceFigure = (VCInstanceFigure)getFigure();
	    VCInstance instanceModel = (VCInstance) getModel();
	    VContractConditionEditPart parentEditPart = (VContractConditionEditPart)getParent();
		instanceFigure.setInstanceName(instanceModel.getInstanceName());
		if(instanceModel.getUmlClass() == null)
		{
			instanceFigure.setUmlClassName("NULL");
			instanceFigure.setfillColorToRed();

		}
		else 
		{
		instanceFigure.setUmlClassName(instanceModel.getUmlClass().getClassName());
		instanceFigure.setFillColorToYallow();
		}
		instanceFigure.setInstanceType(instanceModel.getType());
		parentEditPart.setLayoutConstraint(this, instanceFigure, instanceModel.getConstraints());
		
	}

	


	


}
