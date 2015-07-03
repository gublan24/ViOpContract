package com.abdulaziz.ms.ocv.visualContract.gef.editor.policy;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.BendpointEditPolicy;
import org.eclipse.gef.requests.BendpointRequest;

import com.abdulaziz.ms.OCV.VCLink;
import com.abdulaziz.ms.ocv.visualContract.gef.command.VCinkCreateBendpointCommand;
import com.abdulaziz.ms.ocv.visualContract.gef.command.VCinkDeleteBendpointCommand;
import com.abdulaziz.ms.ocv.visualContract.gef.command.VCinkMoveBendpointCommand;

public class VCLinkConnectionBendPointPolicy extends BendpointEditPolicy {

	@Override
	protected Command getCreateBendpointCommand(BendpointRequest request) {
		VCinkCreateBendpointCommand command = new VCinkCreateBendpointCommand();
	    command.setVCLink((VCLink) request.getSource().getModel());
	    command.setLocation(request.getLocation());
	    command.setIndex(request.getIndex());
		return command;
	}

	@Override
	protected Command getDeleteBendpointCommand(BendpointRequest request) {
		VCinkDeleteBendpointCommand command = new VCinkDeleteBendpointCommand();
	    command.setVCLink((VCLink) request.getSource().getModel());
	    command.setIndex(request.getIndex());
		return command;
	}

	@Override
	protected Command getMoveBendpointCommand(BendpointRequest request) {
		VCinkMoveBendpointCommand command = new VCinkMoveBendpointCommand();
	    command.setVCLink((VCLink) request.getSource().getModel());
	    command.setLocation(request.getLocation());

	    command.setIndex(request.getIndex());
		
		return command;
	}

}
