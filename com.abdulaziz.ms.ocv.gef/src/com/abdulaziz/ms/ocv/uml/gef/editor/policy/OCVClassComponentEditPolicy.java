package com.abdulaziz.ms.ocv.uml.gef.editor.policy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import com.abdulaziz.ms.OCV.UMLClass;
import com.abdulaziz.ms.ocv.uml.gef.editor.command.OCVClassDeleteCommand;

public class OCVClassComponentEditPolicy extends ComponentEditPolicy {
	
	@Override
	protected Command createDeleteCommand(GroupRequest deleteRequest)
	{
	OCVClassDeleteCommand command = new OCVClassDeleteCommand();
	command.setUmlClass((UMLClass) getHost().getModel());
		return command;
		
	}

}
