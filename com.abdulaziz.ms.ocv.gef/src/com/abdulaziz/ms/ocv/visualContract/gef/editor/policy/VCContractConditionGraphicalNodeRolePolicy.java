package com.abdulaziz.ms.ocv.visualContract.gef.editor.policy;

import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.ReconnectRequest;

import com.abdulaziz.ms.OCV.VContractCondition;
import com.abdulaziz.ms.ocv.visualContract.gef.action.GenerateOperationContractAction;
import com.abdulaziz.ms.ocv.visualContract.gef.command.GenerateOperationContractReportCommand;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcontractCondition.VPostConditionEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcontractCondition.VPreconditionEditPart;

public class VCContractConditionGraphicalNodeRolePolicy extends
		GraphicalNodeEditPolicy {

	@Override
	protected Command getConnectionCompleteCommand(
			CreateConnectionRequest request) {
		// TODO Auto-generated method stub
		return null;
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
	
	@Override
    public Command getCommand(Request request) {
		request.getClass();
		if (request.getType().equals(GenerateOperationContractAction.REQ_GENERATE_OPERATION_CONTRACT))
			
			return generateOperationContractReport();
		
		return null;
	
	}

	private Command generateOperationContractReport() {
		GenerateOperationContractReportCommand command= new GenerateOperationContractReportCommand();
		command.settModel((VContractCondition)getHost().getModel());
		command.setControl(getHost().getViewer().getControl());

		return command;
		
	}

}
