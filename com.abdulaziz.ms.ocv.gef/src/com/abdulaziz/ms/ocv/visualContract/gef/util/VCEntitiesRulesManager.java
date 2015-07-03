package com.abdulaziz.ms.ocv.visualContract.gef.util;

import com.abdulaziz.ms.OCV.VCEntity;
import com.abdulaziz.ms.OCV.VContractCondition;
import com.abdulaziz.ms.OCV.VContractPostcondition;
import com.abdulaziz.ms.OCV.VContractPrecondition;
import com.abdulaziz.ms.OCV.impl.VCReturnImpl;

public class VCEntitiesRulesManager {
	
	
	
	
	
	public static boolean checkAddEntityRules(VContractCondition vContractCondition,
			VCEntity vEntity) {
		if (vContractCondition instanceof VContractPostcondition && vEntity instanceof VCReturnImpl)
			return isVContractPostconditionAcceptVCReturn((VContractPostcondition)vContractCondition,(VCReturnImpl) vEntity);
		else if  (vContractCondition instanceof VContractPrecondition && vEntity instanceof VCReturnImpl)
			return false;
		else 
			 return true;
				
	}
	
	

	public static void  updateVContractPostconditionVCReturn(VContractPostcondition vContractCondition, VCReturnImpl vEntity)
	{
		if (isVContractPostconditionAcceptVCReturn(vContractCondition, vEntity))
		{
			vContractCondition.setVCReturnIncluded(true);
		}
	}
	
	public static boolean isVContractPostconditionAcceptVCReturn(VContractPostcondition vContractCondition, VCReturnImpl vEntity) {
			return (!((VContractPostcondition) vContractCondition).isVCReturnIncluded());
		}



	public static void applyAddEntityRules(VContractCondition vContractCondition,
			VCEntity vEntity) {
		if (vContractCondition instanceof VContractPostcondition && vEntity instanceof VCReturnImpl)
			updateVContractPostconditionVCReturn((VContractPostcondition)vContractCondition,(VCReturnImpl) vEntity);
	}



	public static void applyDeleteVCEntityRules(
			VContractCondition vContractCondition, VCEntity vcEntity) {
		if(vcEntity instanceof VCReturnImpl)
			((VContractPostcondition)vContractCondition).setVCReturnIncluded(false);
		
	}
	

}
