package com.abdulaziz.ms.ocv.uml.ms.model;

import javax.swing.event.ListDataListener;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;

import com.abdulaziz.ms.OCV.UMLClass;
import com.abdulaziz.ms.OCV.UMLClassDiagram;

/**
 * @author Abdulaziz
 *
 */
public class UMLDiagramContentProvider implements ITreeContentProvider {
	
	private UMLClassDiagram umlClassDiagram;
	private Viewer contentProviderViewer;
	private UMLClassAdapter umlClassAdapter; 
	
	
	public UMLDiagramContentProvider() {
		super();
		umlClassAdapter = new UMLClassAdapter();
		
	}

	@Override
	public void dispose() {

	
	}

	
	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		
		if (newInput instanceof UMLClassDiagram) {
			this.contentProviderViewer = viewer;
			umlClassDiagram = ((UMLClassDiagram) newInput);
			for (UMLClass umlClass : umlClassDiagram.getClasses()) {
				if (!(umlClass.eAdapters().contains(umlClassAdapter))) {
					umlClass.eAdapters().add(umlClassAdapter);
				}

			}

		}
	

	}

	@Override
	public Object[] getElements(Object inputElement) {
		/*
		Object[] x = new Object[1];
		x[0]= inputElement;
		return x;
		*/
		
		return getChildren(inputElement);
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		
		if (parentElement instanceof UMLClassDiagram)
		{
			
			UMLClassDiagram uml = (UMLClassDiagram)parentElement;
			return uml.getClasses().toArray();
		}
		if (parentElement instanceof UMLClass)
		{
			
			return ((UMLClass) parentElement).getClassAttributes().toArray();
		}
		else 
		return null;
	}
	
	/*
	protected Object[] concat(Object[] object, Object[] more, Object[] more2) {
		Object[] both = new Object[object.length + more.length + more2.length];
		System.arraycopy(object, 0, both, 0, object.length);
		System.arraycopy(more, 0, both, object.length, more.length);
		System.arraycopy(more2, 0, both, object.length + more.length, more2.length);		
		return both;
	}*/

	@Override
	public Object getParent(Object element) {
		
		if (element instanceof UMLClass) {
			return ((UMLClass) element).getUmlDiagram();
		}
		
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		if(getChildren(element) == null)
			return false ;
		return  getChildren(element).length > 0;
	}

	

	/**
	 * @author Abdulaziz
	 * 
	 */
	private class UMLClassAdapter extends AdapterImpl{
		/* (non-Javadoc)
		 * @see org.eclipse.emf.common.notify.impl.AdapterImpl#notifyChanged(org.eclipse.emf.common.notify.Notification)
		 * 
		 * Update the viewer associated with the content provider when the class instance variables are updated, [but not the attributes and the operations]
		 * 
		 */ 
		public void notifyChanged(Notification notification) {
			contentProviderViewer.refresh(); 
		}
		
	}
	
	

}
