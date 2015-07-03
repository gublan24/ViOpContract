package com.abdulaziz.ms.ocv.uml.gef.util;

import com.abdulaziz.ms.OCV.OCVFactory;
import com.abdulaziz.ms.OCV.UMLClass;
import com.abdulaziz.ms.OCV.UMLClassDiagram;
import com.abdulaziz.ms.OCV.UMLVariable;



public enum OCVModelUtility {
	INSTANCE;
	
	private OCVFactory ocvFactory = OCVFactory.eINSTANCE;
	
	public UMLClassDiagram createModel()
	{
		UMLClassDiagram umlClassDiagram = ocvFactory.createUMLClassDiagram();
	
		// create dummy class 
		UMLClass umlclass1 = ocvFactory.createUMLClass();
		umlclass1.setClassName("Class A");
		UMLVariable attribute1 = ocvFactory.createUMLVariable();
		attribute1.setVariableName("ID");
		attribute1.setVariableType("INT");
		umlclass1.getClassAttributes().add(attribute1);
		/*
		UMLOperation operation1 = ocvFactory.createUMLOperation();
		
		operation1.setOperationName("getLastItem");
		operation1.setOperationType("Return Object");

		
		UMLClass umlclass2 = ocvFactory.createUMLClass();
		umlclass2.setClassName("Class B");
		UMLVariable attribute2 = ocvFactory.createUMLVariable();
		attribute2.setVariableName("ID a a a a a a a a ");
		attribute1.setVariableType("INT");
		umlclass2.getClassAttributes().add(attribute2);
		
		UMLOperation operation2 = ocvFactory.createUMLOperation();
		operation2.setOperationName("getLastItem");
		operation2.setOperationType("Return Object");
		umlClassDiagram.getClasses().add(umlclass2);
		*/
		// 
		return umlClassDiagram;
		
	}

}
