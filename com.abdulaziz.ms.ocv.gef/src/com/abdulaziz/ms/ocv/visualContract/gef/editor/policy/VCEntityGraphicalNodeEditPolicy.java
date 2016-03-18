package com.abdulaziz.ms.ocv.visualContract.gef.editor.policy;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.ui.internal.actions.CommandAction;

import com.abdulaziz.ms.OCV.VCAlternativeBox;
import com.abdulaziz.ms.OCV.VCAssociation;
import com.abdulaziz.ms.OCV.VCAssociationDeletion;
import com.abdulaziz.ms.OCV.VCEntity;
import com.abdulaziz.ms.OCV.VCEquality;
import com.abdulaziz.ms.OCV.VCInstance;
import com.abdulaziz.ms.OCV.VCInstanceField;
import com.abdulaziz.ms.OCV.VCLink;
import com.abdulaziz.ms.OCV.VCParameter;
import com.abdulaziz.ms.OCV.VCValue;
import com.abdulaziz.ms.OCV.VContractCondition;
import com.abdulaziz.ms.ocv.visualContract.gef.action.UpdateVCValueSelectionAction;
import com.abdulaziz.ms.ocv.visualContract.gef.action.VCAssociationDeletionUpdateSelectionAction;
import com.abdulaziz.ms.ocv.visualContract.gef.action.VCAssociationUpdateSelectionAction;
import com.abdulaziz.ms.ocv.visualContract.gef.action.VCAttributeUpdateSelectionAction;
import com.abdulaziz.ms.ocv.visualContract.gef.action.UpdateEqualitySelectionAction;
import com.abdulaziz.ms.ocv.visualContract.gef.action.UpdateVCAlternativeSelectionAction;
import com.abdulaziz.ms.ocv.visualContract.gef.action.UpdateVCCollectionSelectionAction;
import com.abdulaziz.ms.ocv.visualContract.gef.action.UpdateVCInstanceFieldSelectionAction;
import com.abdulaziz.ms.ocv.visualContract.gef.action.UpdateVCInstanceSelectionAction;
import com.abdulaziz.ms.ocv.visualContract.gef.action.UpdateVCLoopSelectionAction;
import com.abdulaziz.ms.ocv.visualContract.gef.action.UpdateVCParameterSelectionAction;
import com.abdulaziz.ms.ocv.visualContract.gef.command.VCAssociationDeletionCommand;
import com.abdulaziz.ms.ocv.visualContract.gef.command.VCAssociationModifyCommand;
import com.abdulaziz.ms.ocv.visualContract.gef.command.VCAttributeModifyCommand;
import com.abdulaziz.ms.ocv.visualContract.gef.command.VCLinkCreateCommand;
import com.abdulaziz.ms.ocv.visualContract.gef.command.vc.VCAlternativeModifyCommand;
import com.abdulaziz.ms.ocv.visualContract.gef.command.vc.VCCollectionModifyCommand;
import com.abdulaziz.ms.ocv.visualContract.gef.command.vc.VCEqualityModifyCommand;
import com.abdulaziz.ms.ocv.visualContract.gef.command.vc.VCInstanceFieldModifyCommand;
import com.abdulaziz.ms.ocv.visualContract.gef.command.vc.VCInstanceModifyCommand;
import com.abdulaziz.ms.ocv.visualContract.gef.command.vc.VCLoopModifyCommand;
import com.abdulaziz.ms.ocv.visualContract.gef.command.vc.VCParameterModifyCommand;
import com.abdulaziz.ms.ocv.visualContract.gef.command.vc.VCValueModifyCommand;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcontractCondition.VContractConditionEditPart;

public class VCEntityGraphicalNodeEditPolicy extends GraphicalNodeEditPolicy  {


	
	@Override
	protected Command getConnectionCompleteCommand(
			CreateConnectionRequest request) {
		
		VCLinkCreateCommand command = (VCLinkCreateCommand) request.getStartCommand();
		command.setTarget((VCEntity) getHost().getModel());
		command.setTargetParentEditPart((VContractConditionEditPart) getHost().getParent());
		
		return command;
	}

	@Override
	protected Command getConnectionCreateCommand(CreateConnectionRequest request) {
		VCLinkCreateCommand command = new VCLinkCreateCommand();
		command.setSource((VCEntity) getHost().getModel());
		command.setSourceParentEditPart((VContractConditionEditPart) getHost().getParent());
		command.setVcContract(((VCEntity) getHost().getModel()).getVcContract());
		command.setVCLink((VCLink) request.getNewObject());
		command.setVcContract(((VCEntity) getHost().getModel()).getVcContract());
		request.setStartCommand(command);

		return command;
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
        if(request.getType().equals(VCAttributeUpdateSelectionAction.REQ_UPDATE_VC_ATTRIBUTE)) {
            return updateAttributeCommand();
        }
        else if (request.getType().equals(VCAssociationUpdateSelectionAction.REQ_UPDATE_VC_ASSOCIATION))
        {
        	return updateAssociationCommand();
        }
        else if (request.getType().equals(UpdateVCInstanceSelectionAction.REQ_UPDATE_VCINSTANCE))
        {
        	return updateInstanceCommand();
        }
        else if (request.getType().equals(UpdateVCInstanceFieldSelectionAction.REQ_UPDATE_VCINSTANCE_FIELD))
        {
        	return updateInstanceFieldCommand();
        }
        else if (request.getType().equals(UpdateVCParameterSelectionAction.REQ_UPDATE_VCPARAMETER))
        {
        	return updateParameterCommand();
        }
        else if (request.getType().equals(UpdateEqualitySelectionAction.REQ_UPDATE_VCEQUALITY))
        {
        	return updateEqualityCommand();
        }
        else if (request.getType().equals(UpdateVCValueSelectionAction.REQ_UPDATE_VCVALUE))
        {
        	return updateValueCommand();
        }
        else if (request.getType().equals(UpdateVCLoopSelectionAction.REQ_UPDATE_VCLOOP))
        {
        	return updateLoopCommand();
        	
        } else if (request.getType().equals(UpdateVCCollectionSelectionAction.REQ_UPDATE_VCCOLLECTION))
        {
        	return updateCollectionCommand();
        	
        } else if (request.getType().equals(UpdateVCAlternativeSelectionAction.REQ_UPDATE_VCALTERNATIVE))
        {
        	return updateAlternativeCommand();
        }
        else if (request.getType().equals(VCAssociationDeletionUpdateSelectionAction.REQ_UPDATE_VC_ASSOCIATION_DELETION))
        {
        	return updateAssociationDeletion();
        }
        return super.getCommand(request);

}

	private Command updateAssociationDeletion() {
		VCAssociationDeletionCommand command = new VCAssociationDeletionCommand();
		command.setVCAssociationDeletion((VCAssociationDeletion)getHost().getModel());
		command.setControl(getHost().getViewer().getControl());
		return command;
	}

	private Command updateLoopCommand() {
		VCLoopModifyCommand command = new VCLoopModifyCommand();
		//command.setVCI((VCAssociation)getHost().getModel());
		command.setControl(getHost().getViewer().getControl());
		return command;
	}

	private Command updateCollectionCommand() {
		VCCollectionModifyCommand command = new VCCollectionModifyCommand();
		//command.setVCI((VCAssociation)getHost().getModel());
		command.setControl(getHost().getViewer().getControl());
		return command;
	}

	private Command updateAlternativeCommand() {
		VCAlternativeModifyCommand command = new VCAlternativeModifyCommand();
		command.setVCAlternativeBox((VCAlternativeBox)getHost().getModel());
		command.setControl(getHost().getViewer().getControl());
		return command;
	}

	private Command updateValueCommand() {
		VCValueModifyCommand command = new VCValueModifyCommand();
		command.setVCValue((VCValue)getHost().getModel());
		command.setControl(getHost().getViewer().getControl());
		return command;
	}

	private Command updateEqualityCommand() {
		VCEqualityModifyCommand command = new VCEqualityModifyCommand();
		command.setVCEquality((VCEquality)getHost().getModel());
		command.setControl(getHost().getViewer().getControl());
		return command;
	}

	private Command updateParameterCommand() {
		VCParameterModifyCommand command = new VCParameterModifyCommand();
		command.setVCParameter((VCParameter)getHost().getModel());
		command.setControl(getHost().getViewer().getControl());
		return command;
	}

	private Command updateInstanceFieldCommand() {
		VCInstanceFieldModifyCommand command = new VCInstanceFieldModifyCommand();
		command.setInstanceField((VCInstanceField) getHost().getModel());
		command.setControl(getHost().getViewer().getControl());
		return command;
	}

	private Command updateInstanceCommand() {
		VCInstanceModifyCommand command = new VCInstanceModifyCommand();
		command.setVCInstance((VCInstance)getHost().getModel());
		command.setControl(getHost().getViewer().getControl());
		return command;
	}

	private Command updateAssociationCommand() {
		VCAssociationModifyCommand command = new VCAssociationModifyCommand();
		command.setVCAssociation((VCAssociation)getHost().getModel());
		command.setControl(getHost().getViewer().getControl());
		return command;
	}

	private Command updateAttributeCommand() {
		return null;
		/*
		VCAttributeModifyCommand  vcAttributeModifyCommand = new VCAttributeModifyCommand();
		VCAttribute selectedVCAttribute = (VCAttribute) getHost().getModel();
		vcAttributeModifyCommand.setCompiste(getHost().getViewer().getControl());
		vcAttributeModifyCommand.setVCAttribute(selectedVCAttribute);
		
		return vcAttributeModifyCommand;
		
		*/
	}
}