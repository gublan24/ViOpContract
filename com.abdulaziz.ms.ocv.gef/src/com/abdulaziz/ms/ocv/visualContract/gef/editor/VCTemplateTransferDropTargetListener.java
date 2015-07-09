package com.abdulaziz.ms.ocv.visualContract.gef.editor;

import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.dnd.TemplateTransferDropTargetListener;
import org.eclipse.gef.requests.CreationFactory;

import com.abdulaziz.ms.OCV.OCVFactory;
import com.abdulaziz.ms.OCV.UMLClass;
import com.abdulaziz.ms.OCV.VCInstance;

public class VCTemplateTransferDropTargetListener extends TemplateTransferDropTargetListener {  

	public VCTemplateTransferDropTargetListener(EditPartViewer viewer) {
		super(viewer);
	}
	
	@Override
	protected CreationFactory getFactory(final Object template) {
		if (template instanceof UMLClass) {
			return new CreationFactory() {
				@Override
				public Object getObjectType() {
					return VCInstance.class;
				}
				@Override
				public Object getNewObject() {
					UMLClass draggedUMLClass = (UMLClass) template;
					final VCInstance newInstance = OCVFactory.eINSTANCE.createVCInstance();
					newInstance.setUmlClass(draggedUMLClass);
					newInstance.setInstanceName("newInstance");
					newInstance.setType(draggedUMLClass.getClassName());
					draggedUMLClass.getVCInstances().add(newInstance);
					return newInstance;
				}
			};
		}
		return super.getFactory(template);
	}

}