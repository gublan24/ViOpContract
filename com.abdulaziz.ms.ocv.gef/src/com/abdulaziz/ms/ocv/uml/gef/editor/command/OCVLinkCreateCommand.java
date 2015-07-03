package com.abdulaziz.ms.ocv.uml.gef.editor.command;

import org.eclipse.emf.common.util.EList;
import org.eclipse.gef.commands.Command;

import com.abdulaziz.ms.OCV.UMLClass;
import com.abdulaziz.ms.OCV.UMLClassDiagram;
import com.abdulaziz.ms.OCV.UMLLink;
import com.abdulaziz.ms.OCV.VCEntity;
import com.abdulaziz.ms.OCV.VCInstance;

public class OCVLinkCreateCommand extends Command {
	
	private UMLClass sourceClass;
	private UMLClass targetClass;
	private UMLClassDiagram parentUMLClassDiagram;
	private UMLLink  umlLink;
	
	@Override
	  public boolean canExecute() {
		
	    return sourceClass != null && targetClass != null && umlLink != null;
	  }

	
	@Override
	public void execute()
	{
		
		umlLink.setSource(sourceClass);
		umlLink.setTarget(targetClass);
		umlLink.setUmlDiagram(parentUMLClassDiagram);
		
		//TODO
		
		
	
		
	}
	@Override
	public void undo()
	{
	    umlLink.getSource().getOutgoingLinks().remove(umlLink);
		umlLink.setSource(null);
	    umlLink.getTarget().getIncomingLinks().remove(umlLink);
		umlLink.setTarget(null);
		umlLink.setUmlDiagram(null);
	}
	public void setSourceClass(UMLClass sourceClass) {
		this.sourceClass = sourceClass;
	}
	public void setTargetClass(UMLClass targetClass) {
		this.targetClass = targetClass;
	}
	public void setParentUMLClassDiagram(UMLClassDiagram parentUMLClassDiagram) {
		this.parentUMLClassDiagram = parentUMLClassDiagram;
	}
	public void setUmlLink(UMLLink umlLink) {
		this.umlLink = umlLink;
	}
	

}
