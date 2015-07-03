package com.abdulaziz.ms.ocv.uml.gef.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import com.abdulaziz.ms.OCV.OCVFactory;
import com.abdulaziz.ms.OCV.UMLLink;

public class UMLLinkFactory implements CreationFactory {

	public static final String ASSOCIATION_LINK = "association";
	public static final String INHERITANCE_LINK = "inheritance";
	public static final String AGGREGATION_LINK = "aggregation";
	private String type;
	public UMLLinkFactory()
	{
	
	}
	
	public UMLLinkFactory(String type)
	{
		if (type == null)
		{
			this.type = ASSOCIATION_LINK;
		}
		else 
			this.type = type;
		
		
			
		
	}
	@Override
	public Object getNewObject() {
	
		UMLLink newObject = OCVFactory.eINSTANCE.createUMLLink();
		if(type != null)
		{
			newObject.setType(type);
		}
		return newObject;
	}

	@Override
	public Object getObjectType() {
		return UMLLink.class;
	}

}
