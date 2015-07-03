package com.abdulaziz.ms.ocv.uml.gef.editor.policy;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;

import com.abdulaziz.ms.OCV.OCVFactory;
import com.abdulaziz.ms.OCV.UMLClass;
import com.abdulaziz.ms.OCV.UMLClassDiagram;
import com.abdulaziz.ms.ocv.uml.gef.editor.command.OCVClassChangeConstraintsCommand;
import com.abdulaziz.ms.ocv.uml.gef.editor.command.OCVClassCreateCommand;

public class UMLClassXYLayoutPolicy extends XYLayoutEditPolicy {

	
	@Override 
	protected Command createChangeConstraintCommand(EditPart child,Object constraint)
	{
		OCVClassChangeConstraintsCommand command = new OCVClassChangeConstraintsCommand();
		command.setUmlClass((UMLClass) child.getModel());
		command.setNewConstraints((Rectangle)constraint);	
		return command;
		
	}
	
	
	@Override
	protected Command getCreateCommand(CreateRequest request) {
		Command retCommand = null;
		
		if (request.getNewObject() instanceof UMLClass)
		{
			
			OCVClassCreateCommand command = new OCVClassCreateCommand();
			command = new OCVClassCreateCommand();
			command.setUMLClass(((UMLClass) request.getNewObject()));
			command.setLocation(request.getLocation());
			command.setParent((UMLClassDiagram) getHost().getModel());
			command.setClassName("Class");
			
			retCommand =command ;
		}
		
 		return retCommand;
	}

}
