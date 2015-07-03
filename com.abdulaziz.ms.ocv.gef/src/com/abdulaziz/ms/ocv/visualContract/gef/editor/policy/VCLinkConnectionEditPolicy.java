package com.abdulaziz.ms.ocv.visualContract.gef.editor.policy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ConnectionEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import com.abdulaziz.ms.OCV.UMLLink;
import com.abdulaziz.ms.OCV.VCLink;
import com.abdulaziz.ms.ocv.uml.gef.editor.command.OCVLinkDeleteCommand;
import com.abdulaziz.ms.ocv.visualContract.gef.command.VCLinkDeleteCommand;

public class VCLinkConnectionEditPolicy extends ConnectionEditPolicy {

	@Override
	protected Command getDeleteCommand(GroupRequest request) {
		VCLinkDeleteCommand command = new VCLinkDeleteCommand();
		command.setLink((VCLink)getHost().getModel());
		return command;
	}

}
