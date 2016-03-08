package com.abdulaziz.ms.ocv.visualContract.gef.editor.part;

import org.eclipse.draw2d.LabeledContainer;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPolicy;
import org.eclipse.swt.internal.C;

import com.abdulaziz.ms.OCV.VCAlternativeBox;
import com.abdulaziz.ms.OCV.VCInstance;
import com.abdulaziz.ms.OCV.VContractAlternativeBox;
import com.abdulaziz.ms.OCV.VContractCondition;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity.VCAlternativeBoxEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity.VCAlternativeBoxFigure;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcontractCondition.VContractConditionEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.policy.VContractXYEditPolicy;
import com.abdulaziz.ms.ocv.visualContract.gef.util.VContractUtility;

public class VContractAlternativeBoxEditPart extends VContractConditionEditPart {
	

	@Override 
	protected void refreshVisuals()
	{
		
		
		LabeledContainer figure = (LabeledContainer) this.getFigure();
		VContractAlternativeBox vContractAltBox = (VContractAlternativeBox) getModel();
	
		figure.setLabel(""+vContractAltBox.getConditionOption().getName());
		Rectangle constraint = vContractAltBox.getConstaint();
		if(constraint == null)
		constraint = new Rectangle(((VCAlternativeBoxFigure)getFigure().getParent()).getFigureLocation(), new Dimension(100, 100));

		VCAlternativeBoxEditPart vcAlternativeBoxEditPart = (VCAlternativeBoxEditPart) this.getParent();
		vcAlternativeBoxEditPart.setLayoutConstraint(this, figure,constraint);
		
	}
	
	protected  void addDroppedVCInstance(VCInstance newInstance)
	{
		VContractAlternativeBox vcContractCondition = (VContractAlternativeBox) getModel();
		newInstance.setType(VContractUtility.VCINSTANCE_RETRIEVED);
		newInstance.setVContractCondition(vcContractCondition);		
		
		vcContractCondition.getVcEntities().add(newInstance);

	}

}
