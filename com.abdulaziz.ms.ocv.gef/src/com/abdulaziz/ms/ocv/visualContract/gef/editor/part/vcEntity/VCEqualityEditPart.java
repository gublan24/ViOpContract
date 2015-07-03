package com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;

import com.abdulaziz.ms.OCV.VCEquality;
import com.abdulaziz.ms.OCV.VCValue;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.VCEntityEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcontractCondition.VContractConditionEditPart;

public class VCEqualityEditPart extends VCEntityEditPart {

	@Override
	protected IFigure createFigure() {
		return new VCEqualityFigure();
	}
	
	

	@Override
	protected  void refreshVisuals()
	{
		VCEqualityFigure figure = (VCEqualityFigure) getFigure();
		VCEquality vcEntity = (VCEquality) getModel();		
		VContractConditionEditPart vContractEditPart = (VContractConditionEditPart) getParent();
		figure.setVcEquality(vcEntity);
		Rectangle layout = vcEntity.getConstraints();
		vContractEditPart.setLayoutConstraint(this, figure, layout);

	}

}
