package com.abdulaziz.ms.ocv.uml.gef.editor.part;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

import com.abdulaziz.ms.OCV.UMLLink;
import com.abdulaziz.ms.OCV.UMLClass;
import com.abdulaziz.ms.OCV.UMLClassDiagram;
import com.abdulaziz.ms.ocv.uml.gef.editor.factory.UMLLinkFactory;
import com.abdulaziz.ms.ocv.uml.gef.editor.part.link.OCVAggregationLinkEditPart;
import com.abdulaziz.ms.ocv.uml.gef.editor.part.link.OCVInheritanceLinkEditPart;
import com.abdulaziz.ms.ocv.uml.gef.editor.part.link.OCVLinkEditPart;

public class OCVEditPartFactory implements EditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		EditPart editPart = null;
		
		if(model instanceof UMLClassDiagram)
		{
			editPart = new OCVClassDiagramEditPart();
		}
		else if (model instanceof UMLClass)
		{
			editPart = new OCVClassEditPart();
		}
		else if (model instanceof UMLLink)
		{
			String linkType = ((UMLLink)model).getType();
			if(linkType.equalsIgnoreCase(UMLLinkFactory.AGGREGATION_LINK))
			{
				editPart  = new OCVAggregationLinkEditPart();
				
			}
			else if(linkType.equalsIgnoreCase(UMLLinkFactory.INHERITANCE_LINK))
			{
				editPart = new OCVInheritanceLinkEditPart();
			}
			else
				{
				editPart = new OCVLinkEditPart();
				}
		}
		
		if(editPart != null)
		{
			editPart.setModel(model);
		}
		return editPart;
	}

}
