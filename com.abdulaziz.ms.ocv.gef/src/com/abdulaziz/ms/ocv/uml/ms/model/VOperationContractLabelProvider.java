package com.abdulaziz.ms.ocv.uml.ms.model;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import com.abdulaziz.ms.OCV.VCContract;
import com.abdulaziz.ms.OCV.VOperation;

public  class VOperationContractLabelProvider extends LabelProvider {
	public Image getImage(Object element) {
		return super.getImage(element);
	}
	public String getText(Object element) {
		if (element instanceof VOperation)
		{
		return ((VOperation)element).getOperationName();
		}
		if (element instanceof VCContract)
		{
		return ((VCContract)element).getName();
		}
		return null;
	}
}
