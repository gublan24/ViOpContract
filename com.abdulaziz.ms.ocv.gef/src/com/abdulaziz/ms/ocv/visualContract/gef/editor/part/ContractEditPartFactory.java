package com.abdulaziz.ms.ocv.visualContract.gef.editor.part;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

import com.abdulaziz.ms.OCV.ConditionOption;
import com.abdulaziz.ms.OCV.VCAlternativeBox;
import com.abdulaziz.ms.OCV.VCAssociation;
import com.abdulaziz.ms.OCV.VCCollectionBox;
import com.abdulaziz.ms.OCV.VCContract;
import com.abdulaziz.ms.OCV.VCEntity;
import com.abdulaziz.ms.OCV.VCEquality;
import com.abdulaziz.ms.OCV.VCInstance;
import com.abdulaziz.ms.OCV.VCInstanceField;
import com.abdulaziz.ms.OCV.VCLink;
import com.abdulaziz.ms.OCV.VCLinkPrePostCondition;
import com.abdulaziz.ms.OCV.VCLoop;
import com.abdulaziz.ms.OCV.VCOperationBox;
import com.abdulaziz.ms.OCV.VCParameter;
import com.abdulaziz.ms.OCV.VCReturn;
import com.abdulaziz.ms.OCV.VCValue;
import com.abdulaziz.ms.OCV.VContractAlternativeBox;
import com.abdulaziz.ms.OCV.VContractCondition;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity.VCAlternativeBoxEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity.VCAssociationEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity.VCAttributeEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity.VCCollectionBoxEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity.VCEqualityEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity.VCInstanceEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity.VCInstanceFieldEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity.VCLoopBoxEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity.VCOperationBoxEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity.VCParameterEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity.VCParameterFigure;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity.VCReturnEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity.VCValueEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcontractCondition.VPostConditionEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcontractCondition.VPreconditionEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.factory.VCCollectionBoxFactory;
import com.abdulaziz.ms.ocv.visualContract.gef.factory.VCOperationBoxFactory;
import com.abdulaziz.ms.ocv.visualContract.gef.util.VContractUtility;

public class ContractEditPartFactory implements EditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		EditPart editPart = null;
		
		//
		 if(model instanceof VContractAlternativeBox)
		{
			editPart  = new VContractAlternativeBoxEditPart();

		}	else if(model instanceof ConditionOption)
		{
			editPart  = new VContractAlternativeBoxEditPart();

		}

		else if (model instanceof VCContract) {
			editPart = new VCContractEditPart();
		}

		else if (model instanceof VContractCondition) {
			editPart = getVContractConditionFactory(model);
		}

		else if (model instanceof VCEntity) {

			editPart = getVCEnityEditPart(model, editPart);

		} else if (model instanceof VCLink) {
			editPart = getVCLinkFactory(model);
		}
	

		if (editPart != null) {
			editPart.setModel(model);
		}

		return editPart;
	}

	private EditPart getVCEnityEditPart(Object model, EditPart editPart) {
		
	
		if (model instanceof VCInstance) {
			
			editPart = new VCInstanceEditPart();
			
		} else if (model instanceof VCAssociation) {
			
			editPart = new VCAssociationEditPart();
			
		}  else if (model instanceof VCParameter)
		{
			editPart = new VCParameterEditPart();
		}
		else if (model instanceof VCValue)
		{
			editPart = new VCValueEditPart();
			
		}else if (model instanceof VCEquality)
		{
			editPart = new VCEqualityEditPart();
			
		}else if (model instanceof VCInstanceField)
		{
			editPart = new VCInstanceFieldEditPart();
			
		}else if (model instanceof VCOperationBox)
		{
			editPart = new VCOperationBoxEditPart();
			
		}else if (model instanceof VCReturn)
		{
			editPart = new VCReturnEditPart();
		}
		else if (model instanceof VCAlternativeBox)
		{
			editPart = new VCAlternativeBoxEditPart();
		}
		
		else if (model instanceof VCCollectionBox)
		{
			editPart = new VCCollectionBoxEditPart();
		}
		else if (model instanceof VCLoop)
		{
			editPart = new VCLoopBoxEditPart();
		}
		
		//
		return editPart;
	}

	private EditPart getVCLinkFactory(Object model) {
		EditPart editPart;
		if (model instanceof VCLinkPrePostCondition)
		{
			editPart = new VCLinkPrePostConditionEditPart();

		}
		else 
		editPart = new VCLinkEditPart();
		return editPart;
	}

	private EditPart getVContractConditionFactory(Object model) {
		EditPart editPart;
		if(((VContractCondition) model).getType().equals(VContractUtility.POSTCONDITON))
		{
			editPart  = new VPostConditionEditPart();
		}
		
		else 
		editPart = new VPreconditionEditPart();
		return editPart;
	}

}
