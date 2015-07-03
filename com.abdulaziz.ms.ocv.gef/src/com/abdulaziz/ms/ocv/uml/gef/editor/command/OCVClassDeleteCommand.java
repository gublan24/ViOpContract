package com.abdulaziz.ms.ocv.uml.gef.editor.command;

import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.gef.commands.Command;

import com.abdulaziz.ms.OCV.UMLClass;
import com.abdulaziz.ms.OCV.UMLClassDiagram;
import com.abdulaziz.ms.OCV.UMLLink;
import com.abdulaziz.ms.OCV.VCContract;
import com.abdulaziz.ms.OCV.VCEntity;
import com.abdulaziz.ms.OCV.VCInstance;

public class OCVClassDeleteCommand extends Command {
	
	UMLClass umlClass ;
	UMLClassDiagram umlClassDiagram;
	private HashMap<Integer, UMLClass> ingoingLinkHashMap;
	private HashMap<Integer, UMLClass> outgoingLinkHashMap;
	
	public OCVClassDeleteCommand()
	{
		super();
		
	}
	@Override
	public void execute()
	{
		/*
		 
		// Does not remove the links from the container umlClassDiagram
		 
		umlClass.getOutgoingLinks().clear();
		umlClass.getIncomingLinks().clear();
		*/
		


		ingoingLinkHashMap = new HashMap<>();
		outgoingLinkHashMap = new HashMap<>();
		// remove outgoing links
		for (UMLLink inLink : umlClass.getIncomingLinks()) {
			ingoingLinkHashMap.put(inLink.hashCode(), inLink.getSource());// store the incoming links' references for UNDO usage
			inLink.getSource().getOutgoingLinks().remove(inLink);
			inLink.setSource(null);
			inLink.setUmlDiagram(null);	
			}
		
		// remove incoming links
		for (UMLLink outLink : umlClass.getOutgoingLinks()) {
			outgoingLinkHashMap.put(outLink.hashCode(), outLink.getTarget()); 	// store the outgoing links' references for UNDO usage
			outLink.getTarget().getIncomingLinks().remove(outLink);
			outLink.setTarget(null);
			outLink.setUmlDiagram(null);
		}
		
		
		/* shows error 
		for (VCInstance vcInstance : umlClass.getVCInstances()) { 
			vcInstance.setUmlClass(null);
		}*/
		umlClass.getVCInstances().clear();
		// remove the class
		umlClass.setUmlDiagram(null);
		
		//umlClass = null;
		
		
		
	}
	
	@Override
	public void undo()
	{
		for (UMLLink inLink : umlClass.getIncomingLinks()) {
			if(ingoingLinkHashMap.containsKey(inLink.hashCode()))
			{
				inLink.setSource(
				ingoingLinkHashMap.get(inLink.hashCode())
				);
				inLink.setUmlDiagram(umlClassDiagram);
			}
			
			
		}
		for (UMLLink outLink : umlClass.getOutgoingLinks()) {
			if(outgoingLinkHashMap.containsKey(outLink.hashCode()))
			{
				outLink.setTarget(
						outgoingLinkHashMap.get(outLink.hashCode())
				);
				outLink.setUmlDiagram(umlClassDiagram);
			}
		}
		umlClass.setUmlDiagram(umlClassDiagram);
	}
	

	public void setUmlClass(UMLClass umlClass) {
		this.umlClass = umlClass;
		umlClassDiagram = umlClass.getUmlDiagram();
	}

	public void setUmlClassDiagram(UMLClassDiagram umlClassDiagram) {
		this.umlClassDiagram = umlClassDiagram;
	}

}
