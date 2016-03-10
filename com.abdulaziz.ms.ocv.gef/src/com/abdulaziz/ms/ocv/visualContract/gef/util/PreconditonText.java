package com.abdulaziz.ms.ocv.visualContract.gef.util;

import com.abdulaziz.ms.OCV.VCInstance;
import com.abdulaziz.ms.OCV.VContractPrecondition;

public class PreconditonText extends BaseContractConditionText {

	

	@Override
	public String interpert(VCInstance vcInstance) {
		String className = vcInstance.getUmlClass().getClassName();
		String instanceName = vcInstance.getInstanceName();
		return "There is an existing "+className+" instance "+instanceName;
		
		
	}
	
	/*
	 “A ”, <ClassName> ,” instance “, <instanceName> ,“ is retrieved from the domain data.”. |
“A ”, <ClassName>,”  instance “,<instanceName>,” is received from the operation parameters.” |
“There is an existing “,<ClassName>,” instance “, <instanceName>,”

	 */

}
