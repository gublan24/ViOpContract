package com.abdulaziz.ms.ocv.uml.gef.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import com.abdulaziz.ms.OCV.OCVFactory;
import com.abdulaziz.ms.OCV.UMLClass;
import com.abdulaziz.ms.OCV.UMLVariable;

public class UMLClassFactory implements CreationFactory {

	@Override
	public Object getNewObject() {
		
		UMLClass umlClass = OCVFactory.eINSTANCE.createUMLClass();
		
		return umlClass;
	}

	@Override
	public Object getObjectType() {
		return UMLClass.class;
	}

}
