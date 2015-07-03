package com.abdulaziz.ms.ocv.visualContract.gef.editor.policy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import com.abdulaziz.ms.OCV.UMLClass;
import com.abdulaziz.ms.OCV.VCContract;
import com.abdulaziz.ms.OCV.VCEntity;
import com.abdulaziz.ms.OCV.VContractCondition;
import com.abdulaziz.ms.ocv.uml.gef.editor.command.OCVClassDeleteCommand;
import com.abdulaziz.ms.ocv.visualContract.gef.command.VCEntityDeleteCommand;

public class VCEntityEditPolicy extends ComponentEditPolicy{
	
	@Override
	protected Command createDeleteCommand(GroupRequest deleteRequest)
	{
		
	VCEntityDeleteCommand command = new VCEntityDeleteCommand();
	VCEntity model = (VCEntity) getHost().getModel();
	command.setVCEntity(model);
	
	//TODO check this 
	command.setVContractCondition((VContractCondition) getHost().getParent().getModel());

		return command;
		
	}
	
}