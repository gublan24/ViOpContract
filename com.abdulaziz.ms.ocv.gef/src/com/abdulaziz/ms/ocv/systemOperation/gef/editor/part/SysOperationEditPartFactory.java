package com.abdulaziz.ms.ocv.systemOperation.gef.editor.part;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

import com.abdulaziz.ms.OCV.UMLLink;
import com.abdulaziz.ms.OCV.UMLClass;
import com.abdulaziz.ms.OCV.UMLClassDiagram;
import com.abdulaziz.ms.OCV.VSystemOperationDiagram;
import com.abdulaziz.ms.ocv.uml.gef.editor.factory.UMLLinkFactory;
import com.abdulaziz.ms.ocv.uml.gef.editor.part.link.OCVAggregationLinkEditPart;
import com.abdulaziz.ms.ocv.uml.gef.editor.part.link.OCVInheritanceLinkEditPart;
import com.abdulaziz.ms.ocv.uml.gef.editor.part.link.OCVLinkEditPart;

public class SysOperationEditPartFactory implements EditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		EditPart editPart = null;
		
		if(model instanceof UMLClassDiagram)
		{
			editPart = new RootSysOperationClassDiagramEditPart();
		}
		else if (model instanceof VSystemOperationDiagram)
		{
			editPart = new VSystemOperationEditPart();
		}
		
		
		if(editPart != null)
		{
			editPart.setModel(model);
		}
		return editPart;
	}

}
