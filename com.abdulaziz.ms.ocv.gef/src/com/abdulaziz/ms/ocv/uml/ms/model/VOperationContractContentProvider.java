package com.abdulaziz.ms.ocv.uml.ms.model;

import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import com.abdulaziz.ms.OCV.VOperation;
import com.abdulaziz.ms.OCV.VSystemOperationDiagram;

public  class VOperationContractContentProvider implements ITreeContentProvider, IStructuredContentProvider {
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}
	public void dispose() {
	}
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}
	public Object[] getChildren(Object parentElement) {
		
		if(parentElement instanceof VSystemOperationDiagram)
		{
		return  ((VSystemOperationDiagram)parentElement).getClassOperations().toArray();
		}
		else if (parentElement instanceof VOperation)
		{
			Object[] object = new Object[1];
			if ((((VOperation) parentElement).getVcContract()) == null)
			return null;
			object[0]= ((VOperation)parentElement).getVcContract();
			
			return object;
		}
		return null;

	}
	public Object getParent(Object element) {
		if (element instanceof VOperation)
		{
			return ((VOperation) element).getVSystem();
		}
		return null;
	}
	public boolean hasChildren(Object element) {
		if(getChildren(element) != null)
		return getChildren(element).length > 0;
		return false;
	}
}
