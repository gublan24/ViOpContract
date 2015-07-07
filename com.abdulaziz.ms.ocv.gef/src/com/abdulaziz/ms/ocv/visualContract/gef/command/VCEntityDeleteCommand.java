package com.abdulaziz.ms.ocv.visualContract.gef.command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

import org.eclipse.gef.commands.Command;
import org.eclipse.swt.widgets.List;

import com.abdulaziz.ms.OCV.UMLClass;
import com.abdulaziz.ms.OCV.VCContract;
import com.abdulaziz.ms.OCV.VCEntity;
import com.abdulaziz.ms.OCV.VCInstance;
import com.abdulaziz.ms.OCV.VCLink;
import com.abdulaziz.ms.OCV.VContractCondition;
import com.abdulaziz.ms.OCV.provider.VCEntityItemProvider;
import com.abdulaziz.ms.ocv.visualContract.gef.util.VCEntitiesRulesManager;

public class VCEntityDeleteCommand extends Command  {
	
	private VCEntity vcEntity;
	private VContractCondition vContractCondition;
	private UMLClass vcInstanceUmlClass;
	private HashMap<VCLink, VCEntity> incomingLinks;
	private HashMap<VCLink, VCEntity> outgoingLinks;

	public VCEntityDeleteCommand()
	{
		super();
		
	}

	public void execute() {

		
		incomingLinks = new HashMap<>();
		outgoingLinks = new HashMap<>();

		for (VCLink vcLink : vcEntity.getIncomingLinks()) {
			incomingLinks.put(vcLink,vcLink.getSource());
			vcLink.getSource().getOutgoingLinks().remove(vcLink);
			vcLink.setSource(null);
			vcLink.setTarget(null);
		}

		for (VCLink vcLink : vcEntity.getOutgoingLinks()) {

			outgoingLinks.put(vcLink, vcLink.getTarget());
			vcLink.getTarget().getIncomingLinks().remove(vcLink);
			vcLink.setSource(null);
			vcLink.setTarget(null);

		}
		
		if (vcEntity instanceof VCInstance)
		{
			if(((VCInstance) vcEntity).getUmlClass() != null)
			{
				((VCInstance) vcEntity).getUmlClass().getVCInstances().remove(vcEntity);
			}
			
		}
		
		vContractCondition.getVcEntities().remove(vcEntity); 
		VCEntitiesRulesManager.applyDeleteVCEntityRules(vContractCondition, vcEntity);

		vcEntity = null;
		
		


	}
	
	public void undo()
	{
	
		/*
		for (VCLink linkElement : incomingLinks.keySet()) {
			linkElement.setTarget(vcEntity);
			incomingLinks.get(linkElement).getOutgoingLinks().add(linkElement);
			vcEntity.getIncomingLinks().add(linkElement);
			//TODO 
			
		}
		for (VCLink linkElement : outgoingLinks.keySet()) {
			linkElement.setSource(vcEntity);
			outgoingLinks.get(linkElement).getIncomingLinks().add(linkElement);
			vcEntity.getOutgoingLinks().add(linkElement);


			
		}
		if (vcEntity instanceof VCInstance && vcInstanceUmlClass != null)
		{
	
			vcInstanceUmlClass.getVCInstances().add((VCInstance)vcEntity);
		}
	//	vcEntity.setVcContract(vcContract);
	 * 
	 * 
	 */
	}



	public void setVCEntity(VCEntity model) {
		vcEntity= model;
		
	}

	public void setVContractCondition(VContractCondition model) {
		vContractCondition = model;
		
	}




}
