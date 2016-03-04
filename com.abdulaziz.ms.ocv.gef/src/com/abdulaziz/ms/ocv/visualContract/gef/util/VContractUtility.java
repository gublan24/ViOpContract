package com.abdulaziz.ms.ocv.visualContract.gef.util;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;

import com.abdulaziz.ms.OCV.OCVFactory;
import com.abdulaziz.ms.OCV.VCContract;
import com.abdulaziz.ms.OCV.VCEntity;
import com.abdulaziz.ms.OCV.VContractCondition;
import com.abdulaziz.ms.OCV.VContractPostcondition;
import com.abdulaziz.ms.OCV.VContractPrecondition;
import com.abdulaziz.ms.OCV.VOperation;
import com.abdulaziz.ms.ocv.multiPageEditor.OCVMutiPageEditor;

public class VContractUtility {
	
    public static final int ALT_INDINTATION_BOX = 30;

	
	public static final String POSTCONDITON ="postcondition";
	public static final int PRE_POST_CINDITION_SPACE = 20;
	public static final int PRECINDITON_TOPLEFT_X = 20;
	
	public static final int PRECINDITON_TOPLEFT_Y = 20;
	public static final String PRECONDITON ="precondition";

	public static final String VCEnity_DEFAULT_LABEL = "<...>";
	public static final Dimension VCEntity_DEFAULT_SIZE = new Dimension(100, 80);
	
	public static final int CONTRACT_CONDITION_HIEGHT = 200;
	public static final int CONTRACT_CONDITION_WIDTH = 800;


	public static final String VCINSTANCE_NEW = "new";
	public static final String VCINSTANCE_CURRENT = "existing";
	public static final String VCINSTANCE_DATASTORE = "retrieved";
	public static final String VCINSTANCE_PARAMETER = "parameter";
	public static final String VCINSTANCE_TEMPORARY = "temporary";

	
	public static final String DATA_STORE_UNIQUE = "Unique";
	public static final String DATA_STORE_ALL = "All";
	public static final String DATA_STORE_NOT_EXISTS = "Not Exists";
	
	
	public static void  createPrePostCondition(VOperation vOperation, OCVMutiPageEditor editor)
	{
		VCContract vcContract = OCVFactory.eINSTANCE.createVCContract();
		vcContract.setName(vOperation.getOperationName()+"Contract");
  	    vcContract.setUmlOperation(vOperation);
  	    
  	    
  	  VContractPrecondition preconditon = OCVFactory.eINSTANCE.createVContractPrecondition();
		preconditon.setType(PRECONDITON);
		preconditon.setVcContract(vcContract);
		vcContract.setPrecondition(preconditon);

		VContractPostcondition postconditon = OCVFactory.eINSTANCE.createVContractPostcondition();
		postconditon.setType(POSTCONDITON);
		postconditon.setVcContract(vcContract);
		vcContract.setPostcondition(postconditon);
	

		preconditon.setConstaint(new Rectangle(PRECINDITON_TOPLEFT_X, PRECINDITON_TOPLEFT_Y, CONTRACT_CONDITION_WIDTH, CONTRACT_CONDITION_HIEGHT));
		postconditon.setConstaint(new Rectangle(PRECINDITON_TOPLEFT_X, PRECINDITON_TOPLEFT_Y + PRE_POST_CINDITION_SPACE + CONTRACT_CONDITION_HIEGHT, CONTRACT_CONDITION_WIDTH, CONTRACT_CONDITION_HIEGHT+100));
		
		//add new page 
		
		vOperation.getVcContract().add(vcContract);
		//**
		//**
		editor.createVContractPage(vcContract);
		
	}
	
	
	
	public static boolean isPostconditon(VContractCondition vContractCondition)
	{
		boolean checkResult = false;
		
			if (vContractCondition.getType().equals(POSTCONDITON)) {
				checkResult = true;
			}
		return checkResult;
		
	}


	public static boolean isPreconditon(VContractCondition vContractCondition)
	{
		boolean checkResult = false;
		
			if (vContractCondition.getType().equals(PRECONDITON)) {
				checkResult = true;
			}
		return checkResult;
		
	}
	public static void setContractCondition(
			VContractCondition vContractCondition, Object object) {
		if (object instanceof VCEntity) {
			if (isPreconditon(vContractCondition)) {
				((VCEntity) object).setPrecondition(vContractCondition);

			} else if (isPostconditon(vContractCondition)) {
				((VCEntity) object).setPostcondition(vContractCondition);

			}
		}

	}

}
