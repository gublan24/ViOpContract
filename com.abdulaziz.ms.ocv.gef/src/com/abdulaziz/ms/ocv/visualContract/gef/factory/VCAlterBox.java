package com.abdulaziz.ms.ocv.visualContract.gef.factory;

import org.eclipse.gef.requests.CreationFactory;

import com.abdulaziz.ms.OCV.OCVFactory;
import com.abdulaziz.ms.OCV.VCAlternativeBox;

public class VCAlterBox implements CreationFactory {

	@Override
	public Object getNewObject() {
		return OCVFactory.eINSTANCE.createVCAlternativeBox();
	}

	@Override
	public Object getObjectType() {
		return VCAlternativeBox.class;
	}

}
