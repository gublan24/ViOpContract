package com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;

import com.abdulaziz.ms.OCV.VCParameter;
import com.abdulaziz.ms.OCV.VCValue;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.VCEntityEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcontractCondition.VContractConditionEditPart;

public class VCValueEditPart extends VCEntityEditPart {

	@Override
	protected IFigure createFigure() {
		return new VCValueFigure();
	}
	
	@Override
	protected  void refreshVisuals()
	{
		VCValueFigure figure = (VCValueFigure) getFigure();
		VCValue vcEntity = (VCValue) getModel();		
		VContractConditionEditPart vContractEditPart = (VContractConditionEditPart) getParent();
		figure.setVcValue(vcEntity);
		Rectangle layout = vcEntity.getConstraints();
		vContractEditPart.setLayoutConstraint(this, figure, layout);

	}

}
