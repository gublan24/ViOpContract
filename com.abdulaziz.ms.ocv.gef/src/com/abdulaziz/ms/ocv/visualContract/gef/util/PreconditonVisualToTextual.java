package com.abdulaziz.ms.ocv.visualContract.gef.util;

import com.abdulaziz.ms.OCV.VCAlternativeBox;
import com.abdulaziz.ms.OCV.VCEntity;
import com.abdulaziz.ms.OCV.VCEquality;
import com.abdulaziz.ms.OCV.VCInstance;
import com.abdulaziz.ms.OCV.VCInstanceField;
import com.abdulaziz.ms.OCV.VCLink;
import com.abdulaziz.ms.OCV.VCParameter;
import com.abdulaziz.ms.OCV.VCValue;
import com.abdulaziz.ms.OCV.VContractPrecondition;

public class PreconditonVisualToTextual extends VisualToTextualRepresentationHandler {

	

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
			line = "";
			break;
		case VContractUtility.VCINSTANCE_RETRIEVED:
			line = className + " instance " + instanceName + " is retrieved from the domain data";
			break;
		case VContractUtility.VCINSTANCE_TEMPORARY:
			line = "";
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
		String assignedValue = "";
		if (vcEntity instanceof VCValue)
			assignedValue = ((VCValue) vcEntity).getValue();
		else if (vcEntity instanceof VCParameter)
			assignedValue = ((VCParameter) vcEntity).getOperationParameter().getVariableName();
		else if (vcEntity instanceof VCInstanceField)
			assignedValue = ((VCInstanceField) vcEntity).getUmlClassField().getVariableName();
		return vcInstanceField.getVCInstance().getInstanceName() + "."+ vcInstanceField.getName() + " became " + assignedValue;
	}

	@Override
	public String inerpertEquality(VCEquality vcEquality) {
		
		String source = "";
		String target ="";
		
		for(VCLink incomeLink:vcEquality.getIncomingLinks())
		{
			source = inerpertValue(incomeLink.getSource());
		}
		for(VCLink outLink:vcEquality.getOutgoingLinks())
		{
			target = inerpertValue(outLink.getTarget());
		}
		
		return source +" is set to a value "+vcEquality.getMeaning()+ " "+target;
	}

	@Override
	public String interpertAlternativeBox(VCAlternativeBox alternative) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/*
	 “A ”, <ClassName> ,” instance “, <instanceName> ,“ is retrieved from the domain data.”. |
“A ”, <ClassName>,”  instance “,<instanceName>,” is received from the operation parameters.” |
“There is an existing “,<ClassName>,” instance “, <instanceName>,”

	 */

}
