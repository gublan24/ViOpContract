package com.abdulaziz.ms.ocv.uml.gef.editor.command;

import org.eclipse.gef.commands.Command;

import com.abdulaziz.ms.OCV.UMLClass;
import com.abdulaziz.ms.OCV.UMLClassDiagram;
import com.abdulaziz.ms.OCV.UMLLink;

public class OCVLinkDeleteCommand extends Command {
	
	
	private UMLLink link;
	private UMLClassDiagram classDiagram;
	private UMLClass source;
	private UMLClass target;
	
	@Override
	public boolean canExecute(){
		return link != null;
	}
	@Override
	public void execute()
	{
		source = link.getSource();
		target = link.getTarget();
		classDiagram = link.getUmlDiagram();
		
		link.setSource(null);
		link.setTarget(null);
		link.setUmlDiagram(null);
		
		
	}
	
	@Override
	public void undo()
	{
		link.setSource(source);
		link.setTarget(target);
		link.setUmlDiagram(classDiagram);
	}


	public void setLink(UMLLink link) {
		this.link = link;
		
	}



	

}
