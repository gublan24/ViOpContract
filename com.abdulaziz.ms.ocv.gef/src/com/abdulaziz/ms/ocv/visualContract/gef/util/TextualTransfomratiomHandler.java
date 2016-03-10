package com.abdulaziz.ms.ocv.visualContract.gef.util;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;

import com.abdulaziz.ms.OCV.VCContract;
import com.abdulaziz.ms.OCV.VCEntity;
import com.abdulaziz.ms.OCV.VCInstance;
import com.abdulaziz.ms.OCV.VContractCondition;
import com.abdulaziz.ms.OCV.VContractPostcondition;
import com.abdulaziz.ms.OCV.VContractPrecondition;

public class TextualTransfomratiomHandler {
	
	
	private VContractCondition contractLayer ;
	private BaseContractConditionText abcd;

	public TextualTransfomratiomHandler(VContractPrecondition contractLayer) {
		this.contractLayer = contractLayer;
		abcd = new PreconditonText();	
		}
	public TextualTransfomratiomHandler(VContractPostcondition contractLayer) {
		this.contractLayer = contractLayer;			
		abcd = new PreconditonText();		
	}
	
	public ArrayList<VCInstance> getVCInstances()
	{
		ArrayList<VCInstance> classInstances =  new ArrayList<>();
		for (VCEntity vcEntity : contractLayer.getVcEntities()) {
			if (vcEntity instanceof VCInstance)
				classInstances.add((VCInstance) vcEntity);
		}
		return (ArrayList<VCInstance>) classInstances;
		
	}
	
	public ArrayList<String> getInterpertation()
	{
		
		ArrayList<String> text = new ArrayList<String>();
		for (VCInstance vcInstance : getVCInstances())
		{
			text.add(abcd.interpert(vcInstance));
		}
		
		return text;
		
	}
	
	

}
