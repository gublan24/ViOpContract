package com.abdulaziz.ms.ocv.uml.gef.editor.policy;



import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.ReconnectRequest;

import com.abdulaziz.ms.OCV.UMLClass;
import com.abdulaziz.ms.OCV.UMLLink;
import com.abdulaziz.ms.ocv.uml.gef.action.UMLClassEditSelectionAction;
import com.abdulaziz.ms.ocv.uml.gef.editor.command.OCVLinkCreateCommand;
import com.abdulaziz.ms.ocv.uml.gef.editor.command.OCVUMLDiagramEditCommand;
import com.abdulaziz.ms.ocv.visualContract.gef.action.VCAttributeUpdateSelectionAction;

public class OCVClassGraphicalNodeEditPolicy extends GraphicalNodeEditPolicy {

	@Override
	protected Command getConnectionCompleteCommand(CreateConnectionRequest request) {
		OCVLinkCreateCommand command = (OCVLinkCreateCommand)request.getStartCommand();
		command.setTargetClass((UMLClass) getHost().getModel());
		
		return command;
	}

	@Override
	protected Command getConnectionCreateCommand(CreateConnectionRequest request) {
		OCVLinkCreateCommand command = new OCVLinkCreateCommand();
		command.setSourceClass((UMLClass) getHost().getModel());
		command.setUmlLink((UMLLink) request.getNewObject());
		command.setParentUMLClassDiagram(((UMLClass) getHost().getModel()).getUmlDiagram() );
		request.setStartCommand(command);
		return command;
	}
	
	@Override 
	 public Command getCommand(Request request) {
        if(request.getType().equals(UMLClassEditSelectionAction.REQ_EDIT_UML_CLASS))
        		{
            return getOCVUMLDiagramEditCommand();
        }
        return super.getCommand(request);

		
	}

	private Command getOCVUMLDiagramEditCommand() {
		OCVUMLDiagramEditCommand command = new OCVUMLDiagramEditCommand() ;
		command.setControl(getHost().getViewer().getControl());
		command.setUMLClass((UMLClass) getHost().getModel());
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

}
