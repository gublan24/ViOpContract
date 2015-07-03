package com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;

import com.abdulaziz.ms.OCV.VCEntity;
import com.abdulaziz.ms.OCV.VCInstance;
import com.abdulaziz.ms.OCV.VCInstanceField;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.figure.VCEntityFigure;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.VCEntityEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcontractCondition.VContractConditionEditPart;

public class VCInstanceFieldEditPart extends VCEntityEditPart {

	@Override
	protected IFigure createFigure() {
		return new VCInstanceFieldFigure();
	}
	
	
	@Override
	protected  void refreshVisuals()
	{
		VCInstanceFieldFigure figure = (VCInstanceFieldFigure) getFigure();
		VCInstanceField vcEntity = (VCInstanceField) getModel();		
		VContractConditionEditPart vContractEditPart = (VContractConditionEditPart) getParent();
		Rectangle layout = vcEntity.getConstraints();
		figure.setvCInstanceField(vcEntity);
		vContractEditPart.setLayoutConstraint(this, figure, layout);

	}

}
