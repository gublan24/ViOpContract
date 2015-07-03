package com.abdulaziz.ms.ocv.uml.gef.editor.policy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ConnectionEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import com.abdulaziz.ms.OCV.UMLLink;
import com.abdulaziz.ms.ocv.uml.gef.editor.command.OCVLinkDeleteCommand;

public class OCVLinkConnectionEditPolicy extends ConnectionEditPolicy {

	@Override
	protected Command getDeleteCommand(GroupRequest request) {
		OCVLinkDeleteCommand command = new OCVLinkDeleteCommand();
		command.setLink((UMLLink)getHost().getModel());
		return command;
	}

}
