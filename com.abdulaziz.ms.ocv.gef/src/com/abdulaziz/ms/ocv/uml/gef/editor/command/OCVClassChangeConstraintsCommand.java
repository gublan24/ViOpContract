package com.abdulaziz.ms.ocv.uml.gef.editor.command;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import com.abdulaziz.ms.OCV.UMLClass;

public class OCVClassChangeConstraintsCommand extends Command {
	
	private Rectangle newConstraint;
	private Rectangle oldConstraint;
	private UMLClass umlClass;
	
	@Override 
	public void execute()
	
	{
		oldConstraint = umlClass.getConstraints();
		if(newConstraint !=null)
		{
			umlClass.setConstraints(newConstraint);
		}
		
		
	}
	
	@Override
	public void undo()
	{
		if(oldConstraint != null)
		umlClass.setConstraints(oldConstraint);
	}

	public void setNewConstraints(Rectangle newConstraint) {
		this.newConstraint = newConstraint;
	}

	public void setUmlClass(UMLClass umlClass) {
		this.umlClass = umlClass;
	}

	

}
