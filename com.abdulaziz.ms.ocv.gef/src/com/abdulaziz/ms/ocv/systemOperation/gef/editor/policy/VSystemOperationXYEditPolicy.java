package com.abdulaziz.ms.ocv.systemOperation.gef.editor.policy;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;

import com.abdulaziz.ms.OCV.VCContract;
import com.abdulaziz.ms.OCV.VCEntity;
import com.abdulaziz.ms.OCV.VCInstance;
import com.abdulaziz.ms.OCV.VSystemOperationDiagram;
import com.abdulaziz.ms.ocv.systemOperation.gef.command.VSystemOperationDiagramChangeConstraintsCommand;
import com.abdulaziz.ms.ocv.visualContract.gef.command.VCEntityChangeConstraintsCommand;
import com.abdulaziz.ms.ocv.visualContract.gef.command.VCEntityCreateCommand;

public class VSystemOperationXYEditPolicy extends XYLayoutEditPolicy {
	
	
	@Override
	protected Command createChangeConstraintCommand(EditPart child, Object constraint)
	{
		VSystemOperationDiagramChangeConstraintsCommand command = new VSystemOperationDiagramChangeConstraintsCommand();
		command.setModel((VSystemOperationDiagram) child.getModel());
		command.setNewConstraints((Rectangle) constraint);
		
		return command;
		
	}

	@Override
	protected Command getCreateCommand(CreateRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
