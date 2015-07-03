package com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;

import com.abdulaziz.ms.OCV.VCEntity;
import com.abdulaziz.ms.OCV.VCParameter;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.figure.VCEntityFigure;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.VCEntityEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcontractCondition.VContractConditionEditPart;

public class VCParameterEditPart extends VCEntityEditPart {

	public VCParameterEditPart()
	{
		super();
	}
	@Override
	protected IFigure createFigure() {
		return new VCParameterFigure();
	}
	
	@Override
	protected  void refreshVisuals()
	{
		VCParameterFigure figure = (VCParameterFigure) getFigure();
		VCParameter vcEntity = (VCParameter) getModel();		
		VContractConditionEditPart vContractEditPart = (VContractConditionEditPart) getParent();
		figure.setVCParameter(vcEntity);
		Rectangle layout = vcEntity.getConstraints();
		vContractEditPart.setLayoutConstraint(this, figure, layout);

	}

}
