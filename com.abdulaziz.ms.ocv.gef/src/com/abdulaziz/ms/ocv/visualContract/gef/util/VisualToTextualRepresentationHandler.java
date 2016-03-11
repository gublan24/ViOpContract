package com.abdulaziz.ms.ocv.visualContract.gef.util;

import com.abdulaziz.ms.OCV.VCAlternativeBox;
import com.abdulaziz.ms.OCV.VCEntity;
import com.abdulaziz.ms.OCV.VCEquality;
import com.abdulaziz.ms.OCV.VCInstance;
import com.abdulaziz.ms.OCV.VCInstanceField;
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

	public abstract String inerpertEquality(VCEquality vcEquality);

	public abstract String interpertAlternativeBox(VCAlternativeBox alternative);


}

