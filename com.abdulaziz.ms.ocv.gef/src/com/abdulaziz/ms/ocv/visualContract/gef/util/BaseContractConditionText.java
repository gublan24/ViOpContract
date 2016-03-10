package com.abdulaziz.ms.ocv.visualContract.gef.util;

import com.abdulaziz.ms.OCV.VCInstance;
import com.abdulaziz.ms.OCV.VContractCondition;
import com.abdulaziz.ms.OCV.VContractPostcondition;
import com.abdulaziz.ms.OCV.VContractPrecondition;

public abstract class BaseContractConditionText {

	private VContractCondition contractLayer;
	
	public BaseContractConditionText() {
	}

public BaseContractConditionText(VContractPrecondition contractLayer) {
		this.contractLayer = contractLayer;
	}

	public BaseContractConditionText(VContractPostcondition contractLayer) {
		this.contractLayer = contractLayer;
	}

	public abstract String interpert(VCInstance vcInstance);


	
	

}

