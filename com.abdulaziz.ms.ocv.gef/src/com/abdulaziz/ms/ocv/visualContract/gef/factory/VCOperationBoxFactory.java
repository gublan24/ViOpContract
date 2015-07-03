package com.abdulaziz.ms.ocv.visualContract.gef.factory;

import org.eclipse.gef.requests.CreationFactory;

import com.abdulaziz.ms.OCV.OCVFactory;
import com.abdulaziz.ms.OCV.VCOperationBox;

public class VCOperationBoxFactory implements CreationFactory {

	@Override
	public Object getNewObject() {
		return OCVFactory.eINSTANCE.createVCOperationBox();
	}

	@Override
	public Object getObjectType() {
		return VCOperationBox.class;
	}

}
