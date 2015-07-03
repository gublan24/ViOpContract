package com.abdulaziz.ms.ocv.uml.ms.model;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;

import com.abdulaziz.ms.OCV.UMLClass;
import com.abdulaziz.ms.OCV.UMLClassDiagram;
import com.abdulaziz.ms.OCV.UMLVariable;
import com.abdulaziz.ms.view.ClassListTreeView;

public class UMLDiagramLabelProvider extends LabelProvider {
	
	protected Image icon;

	private Display display ;
	public UMLDiagramLabelProvider()
	{
		
	}
	public UMLDiagramLabelProvider(Display display)
	{
		this.display = display;
		
	}
	public String getText(Object element) {
		if (element instanceof UMLClassDiagram) {
			
			
			return "Classes";
			/*
			if (((UMLClassDiagram) element).getName() == null) {
				return "Classes";
			} else {
				return ((UMLClassDiagram) element).getName();
			}
			*/
		} else if (element instanceof UMLClass) {
			return ((UMLClass) element).getClassName();
		}
		else if (element instanceof UMLVariable) {
			return ((UMLVariable) element).getVariableName();
		}
		return null;

	}
	
	
	public Image getImage(Object element) {
	
		if(element instanceof UMLClass && display != null)
		{
			if (icon == null)
			icon = new Image(display,  new ImageData(ClassListTreeView.class.getResourceAsStream("instance.png")));
			return icon;
		}
	
		return null;
	
		
	}

}
