package com.abdulaziz.ms.ocv.systemOperation.gef.editor.policy;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.ReconnectRequest;

import com.abdulaziz.ms.OCV.VSystemOperationDiagram;
import com.abdulaziz.ms.ocv.systemOperation.gef.action.EditSystemOperationSelectionAction;
import com.abdulaziz.ms.ocv.systemOperation.gef.command.EditSystemOperationCommand;

public class SystemOperationGraphicalNodeEditPolicy extends
		GraphicalNodeEditPolicy {

	@Override
	protected Command getConnectionCompleteCommand(
			CreateConnectionRequest request) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override 
	public Command getCommand(Request request)
	{
		if (request.getType().equals(EditSystemOperationSelectionAction.REQ_EDIT_SYSTEM_OPERATION) )
		{
			return getEditSystemOperationCommand();
			
		}
		
		return super.getCommand(request);
		
	}

	private Command getEditSystemOperationCommand() {
		EditSystemOperationCommand command = new EditSystemOperationCommand();
		command.setVSystemOperation((VSystemOperationDiagram)getHost().getModel());
		command.setControl(this.getHost().getViewer().getControl());
		
		return command;
	}

	@Override
	protected Command getConnectionCreateCommand(CreateConnectionRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Command getReconnectTargetCommand(ReconnectRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Command getReconnectSourceCommand(ReconnectRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
