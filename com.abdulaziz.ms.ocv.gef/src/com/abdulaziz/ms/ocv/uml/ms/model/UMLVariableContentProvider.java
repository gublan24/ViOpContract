package com.abdulaziz.ms.ocv.uml.ms.model;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

import com.abdulaziz.ms.OCV.UMLClass;
import com.abdulaziz.ms.OCV.VOperation;
import com.abdulaziz.ms.OCV.VSystemOperationDiagram;

public class UMLVariableContentProvider implements IStructuredContentProvider {
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof UMLClass) {

			return ((UMLClass) inputElement).getClassAttributes().toArray();
		} else if(inputElement instanceof VOperation)
		{
			return ((VOperation) inputElement).getOperationParameters().toArray();
		}
		else
			return new Object[0];
	}

	public void dispose() {
	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}
}