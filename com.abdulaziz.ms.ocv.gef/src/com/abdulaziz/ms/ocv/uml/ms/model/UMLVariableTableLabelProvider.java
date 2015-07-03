package com.abdulaziz.ms.ocv.uml.ms.model;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import com.abdulaziz.ms.OCV.UMLVariable;

public class UMLVariableTableLabelProvider extends LabelProvider implements
		ITableLabelProvider {
	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		return null;
	}

	@Override
	public String getColumnText(Object element, int columnIndex) {
		if (element instanceof UMLVariable) {
			UMLVariable umlVar = (UMLVariable) element;
			switch (columnIndex) {
			case 0:
				return umlVar.getVariableName();
			case 1:
				return umlVar.getVariableType();
			}
		}
		return element.toString();
	}

}