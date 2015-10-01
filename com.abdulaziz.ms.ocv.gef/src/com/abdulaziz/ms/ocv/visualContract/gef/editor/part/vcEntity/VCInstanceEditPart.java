package com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity;

import org.eclipse.draw2d.IFigure;

import com.abdulaziz.ms.OCV.VCInstance;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.VCEntityEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcontractCondition.VContractConditionEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.util.VContractUtility;

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
		if(instanceModel.getType().equals(VContractUtility.VCINSTANCE_PARAMETER))
		{
	instanceFigure.setFillColorToBlue();
		}
		else 
		instanceFigure.setFillColorToYallow();
		}
		instanceFigure.setInstanceType(instanceModel.getType());
		
		parentEditPart.setLayoutConstraint(this, instanceFigure, instanceModel.getConstraints());
		
	}

	


	


}
