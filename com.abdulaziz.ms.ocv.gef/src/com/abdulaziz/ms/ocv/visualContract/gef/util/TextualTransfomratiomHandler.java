package com.abdulaziz.ms.ocv.visualContract.gef.util;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;

import com.abdulaziz.ms.OCV.VCAlternativeBox;
import com.abdulaziz.ms.OCV.VCAssociation;
import com.abdulaziz.ms.OCV.VCAssociationDeletion;
import com.abdulaziz.ms.OCV.VCContract;
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

public class TextualTransfomratiomHandler {
	
	
	private VContractCondition contractLayer ;
	private VisualToTextualRepresentationHandler visualToTextualhandler;
	private ArrayList<VCInstance> classInstancesList;
	private ArrayList<VCInstanceField> instanceFieldsList;
	private ArrayList<VCEquality> vcEqualitiesList;
	private ArrayList <VCAlternativeBox> alternativeBoxsList;
	private ArrayList<VCAssociation> vcAssociationList;
	private ArrayList<VCAssociationDeletion> vcDeleteAssociationList;
	
	public TextualTransfomratiomHandler(VContractCondition contractLayer,  PreconditonVisualToTextual s) {
		this.contractLayer = contractLayer;
		visualToTextualhandler = s;	
		}
	public TextualTransfomratiomHandler(VContractCondition contractLayer,  PostconditonVisualToTextual s) {
		this.contractLayer = contractLayer;
		visualToTextualhandler = s;	
		}

	public TextualTransfomratiomHandler(VContractPrecondition contractLayer) {
		this.contractLayer = contractLayer;
		visualToTextualhandler = new PreconditonVisualToTextual();	
		}
	public TextualTransfomratiomHandler(VContractPostcondition contractLayer) {
		this.contractLayer = contractLayer;			
		visualToTextualhandler = new PostconditonVisualToTextual();		
	}
	
	public void initializeVariables()
	{
		 classInstancesList =  new ArrayList<>();
		 instanceFieldsList =  new ArrayList<>();
		 vcEqualitiesList =  new ArrayList<>();
		 alternativeBoxsList = new ArrayList<>();
		 vcAssociationList = new ArrayList<VCAssociation>();
		 vcDeleteAssociationList = new ArrayList<>();


		for (VCEntity vcEntity : contractLayer.getVcEntities()) {
			if (vcEntity instanceof VCInstance)
				classInstancesList.add((VCInstance) vcEntity);
			if(vcEntity instanceof VCEquality)
				vcEqualitiesList.add((VCEquality)vcEntity);
			if(vcEntity instanceof VCInstanceField)
				instanceFieldsList.add((VCInstanceField) vcEntity);
			if (vcEntity instanceof VCAlternativeBox)
				alternativeBoxsList.add((VCAlternativeBox) vcEntity);
			if (vcEntity instanceof VCAssociation)
				vcAssociationList.add((VCAssociation) vcEntity);
			if(vcEntity instanceof VCAssociationDeletion)
				vcDeleteAssociationList.add((VCAssociationDeletion) vcEntity);
		}
		
		
		
	}
	
	public ArrayList<String> getInterpertation()
	{
		// ---
		this.initializeVariables();
		// ---
		
		// instance  
		ArrayList<String> text = new ArrayList<String>();
		for (VCInstance vcInstance : classInstancesList)
		{
			text.add(visualToTextualhandler.interpert(vcInstance));
		}
		
		//  assignments  
		for (VCInstanceField vcInstanceField : instanceFieldsList) {
			for (VCLink link :vcInstanceField.getOutgoingLinks())
			{
				if (((link.getTarget() instanceof VCValue) | link.getTarget() instanceof VCParameter ) | link.getTarget() instanceof VCInstanceField) 
					text.add(visualToTextualhandler.interpertAssignment(vcInstanceField,(VCEntity)link.getTarget() ));

			}
		}
		// comparators 
		for (VCEquality vcEquality :vcEqualitiesList)
		{
			
			text.add(visualToTextualhandler.inerpertEquality(vcEquality));
			
		}
		
		// associations
		
		for (VCAssociation vsAssociation : vcAssociationList) {
			
			text.add(visualToTextualhandler.interpertAssociationFormation(vsAssociation));
		}
		
		// delete associations
		
		for (VCAssociationDeletion vcAssociation : vcDeleteAssociationList) {
					
			text.add(visualToTextualhandler.interpertDirectionalAssociationDeletion(vcAssociation));
		}
		
		// alternativeBoxes
		for (VCAlternativeBox alternative:alternativeBoxsList)
		{
			text.add(visualToTextualhandler.interpertAlternativeBox(alternative));
		}
	
		
		return text;
		
	}
	
	

}
