package com.abdulaziz.ms.ocv.visualContract.gef.util;

import com.abdulaziz.ms.OCV.VCAlternativeBox;
import com.abdulaziz.ms.OCV.VCAssociation;
import com.abdulaziz.ms.OCV.VCEntity;
import com.abdulaziz.ms.OCV.VCEquality;
import com.abdulaziz.ms.OCV.VCInstance;
import com.abdulaziz.ms.OCV.VCInstanceField;
import com.abdulaziz.ms.OCV.VCLink;
import com.abdulaziz.ms.OCV.VCParameter;
import com.abdulaziz.ms.OCV.VCValue;
import com.abdulaziz.ms.OCV.VContractCondition;
import com.abdulaziz.ms.OCV.VContractPostcondition;
import com.abdulaziz.ms.OCV.VContractPrecondition;

public abstract class VisualToTextualRepresentationHandler {

	public abstract String interpert(VCInstance vcInstance);

	public abstract String interpertAssignment(VCInstanceField vcInstanceField, VCEntity vcEntity);

	public String inerpertValue(VCEntity vcEntity) {
		String assignedValue = "";
		if (vcEntity instanceof VCValue)
			assignedValue = ""+((VCValue) vcEntity).getValue();
		else if (vcEntity instanceof VCParameter)
			assignedValue = "the operation parameter "+((VCParameter) vcEntity).getOperationParameter().getVariableName();
		else if (vcEntity instanceof VCInstanceField)
			assignedValue = "the instance field "+((VCInstanceField) vcEntity).getVCInstance().getInstanceName()+"."+((VCInstanceField) vcEntity).getUmlClassField().getVariableName();
		
		return assignedValue;
		
	}
	
	public VCEntity getSourceVEntity(VCEntity currentVCEntity)
	{
		VCEntity source = null;
		for(VCLink incomingLink:currentVCEntity.getIncomingLinks())
		{
			source = incomingLink.getSource();
		}
	
		return source;
		
	}
	public VCEntity getTargetVEntity(VCEntity currentVCEntity)
	{
		VCEntity target = null;
		for(VCLink outgoingLink:currentVCEntity.getOutgoingLinks())
		{
			target = outgoingLink.getSource();
		}
	
		return target;
		
	}
	
	public String interpertAssociationFormation(VCAssociation vcAssociation)
	{
		if(vcAssociation.isDirectional())
			return interpertDirectionalAssociationFormation(vcAssociation);
		else
			return interpertUndirectionalAssociationFormation(vcAssociation);
		
	}

	public abstract String interpertUndirectionalAssociationFormation(VCAssociation vcAssociation);
	
	public  abstract String interpertDirectionalAssociationFormation(VCAssociation vcAssociation);
	
	public abstract String inerpertEquality(VCEquality vcEquality);

	public abstract String interpertAlternativeBox(VCAlternativeBox alternative);


}

