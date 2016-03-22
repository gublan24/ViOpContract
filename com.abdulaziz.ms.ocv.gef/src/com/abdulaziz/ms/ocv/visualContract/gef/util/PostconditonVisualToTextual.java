package com.abdulaziz.ms.ocv.visualContract.gef.util;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import com.abdulaziz.ms.OCV.ConditionOption;
import com.abdulaziz.ms.OCV.VCAlternativeBox;
import com.abdulaziz.ms.OCV.VCAssociation;
import com.abdulaziz.ms.OCV.VCAssociationDeletion;
import com.abdulaziz.ms.OCV.VCContract;
import com.abdulaziz.ms.OCV.VCEntity;
import com.abdulaziz.ms.OCV.VCEquality;
import com.abdulaziz.ms.OCV.VCInstance;
import com.abdulaziz.ms.OCV.VCInstanceField;
import com.abdulaziz.ms.OCV.VCLink;
import com.abdulaziz.ms.OCV.VContractCondition;
import com.abdulaziz.ms.OCV.VContractPostcondition;
import com.abdulaziz.ms.OCV.VContractPrecondition;

public class PostconditonVisualToTextual extends VisualToTextualRepresentationHandler {

	@Override
	public String interpert(VCInstance vcInstance) {
		String className = vcInstance.getUmlClass().getClassName();
		String instanceName = vcInstance.getInstanceName();
		String line = "";
		switch (vcInstance.getType()) {
		case VContractUtility.VCINSTANCE_EXISTING:
			line = "There is an existing " + className + " instance "+ instanceName;
			break;
		case VContractUtility.VCINSTANCE_NEW:
			line = className +" new instance " + instanceName +" was created";
			break;
		case VContractUtility.VCINSTANCE_RETRIEVED:
			line = className + " instance " + instanceName + " is retrieved from the domain data";
			break;
		case VContractUtility.VCINSTANCE_TEMPORARY:
			line = className + " temporary instance "+instanceName+"was created";
			break;
		case VContractUtility.VCINSTANCE_PARAMETER:
			line = className + " instance " + instanceName + " is received from the operation parameters";
			break;

		}

		return line;
	}
	
	@Override
	public String interpertAssignment(VCInstanceField vcInstanceField,
			VCEntity vcEntity) {
		String assignedValue = super.inerpertValue(vcEntity);		
		return vcInstanceField.getVCInstance().getInstanceName() + "."+ vcInstanceField.getName() + " was assigned to a value equals to " + assignedValue;
	}

	@Override
	public String inerpertEquality(VCEquality vcEquality) {
		
		String source = "";
		String target ="";
		
		VCEntity vcSource = null;
		for(VCLink incomeLink:vcEquality.getIncomingLinks())
		{
			vcSource = incomeLink.getSource();
			source = inerpertValue(incomeLink.getSource());
		}
		for(VCLink outLink:vcEquality.getOutgoingLinks())
		{
			target = inerpertValue(outLink.getTarget());
		}
		
		if(vcSource instanceof VCInstance)
		{
			return ((VCInstance) vcSource).getInstanceName() +" "+vcEquality.getMeaning()+ " "+target;

		}
		return source +" was set to a value "+vcEquality.getMeaning()+ " "+target;
	}
	
	

	@Override
	public String interpertAlternativeBox(VCAlternativeBox alternative) {
		
		//TODO printed text style 
		String alternativeBoxText = "";
		for (ConditionOption con:alternative.getConditinOptions())
		{
			con.getVcContractAlternativeBox();
			TextualTransfomratiomHandler conditionLevelHandelr = new TextualTransfomratiomHandler(con.getConditionBlock(),new PostconditonVisualToTextual());
			TextualTransfomratiomHandler resultLevelHandelr = new TextualTransfomratiomHandler(con.getResultBlock(),new PostconditonVisualToTextual());

			alternativeBoxText +="If ( ";
			for (String line : conditionLevelHandelr.getInterpertation()) {
				alternativeBoxText =alternativeBoxText +line +"\r\n";
			}	
			alternativeBoxText = alternativeBoxText.substring(0, alternativeBoxText.lastIndexOf("\r\n"));

			alternativeBoxText +=" )"+"\r\n";

			for (String line : resultLevelHandelr.getInterpertation()) {
				alternativeBoxText =alternativeBoxText +"    " +line +"\r\n";
			}
		
			
		}
		return alternativeBoxText ;
	}


	@Override
	public String interpertDirectionalAssociationDeletion(
			VCAssociationDeletion vcAssociation) {
		String line = "" ;
		VCInstance sourceVCInstance = (VCInstance) getSourceVEntity(vcAssociation);
		VCInstance targetVCInstance = (VCInstance) getTargetVEntity(vcAssociation);
		return sourceVCInstance.getInstanceName()+"  was disassociated from "+targetVCInstance.getInstanceName() ;
	}
		@Override
	public String interpertDirectionalAssociationFormation(
			VCAssociation vcAssociation) {
		String line = "" ;
		VCInstance sourceVCInstance = (VCInstance) getSourceVEntity(vcAssociation);
		VCInstance targetVCInstance = (VCInstance) getTargetVEntity(vcAssociation);
		return sourceVCInstance.getInstanceName()+"  was associated with "+targetVCInstance.getInstanceName()+" based on "+vcAssociation.getSecondInstanceVariable().getVariableName() + " match" ;
	}

	@Override
	public String interpertUndirectionalAssociationFormation(
			VCAssociation vcAssociation) {
		String line ="";
		
		VCInstance sourceVCInstance = (VCInstance) getSourceVEntity(vcAssociation);
		VCInstance targetVCInstance = (VCInstance) getTargetVEntity(vcAssociation);
		return sourceVCInstance.getInstanceName()+"  was associated with "+targetVCInstance.getInstanceName();
	}

	@Override
	public String interpertUndirectionalAssociationDeletion(
			VCAssociationDeletion vcAssociation) {
		
		return this.interpertDirectionalAssociationDeletion(vcAssociation);
	}




}
