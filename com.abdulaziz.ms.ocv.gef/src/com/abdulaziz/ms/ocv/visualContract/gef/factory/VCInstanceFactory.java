package com.abdulaziz.ms.ocv.visualContract.gef.factory;

import org.eclipse.gef.requests.CreationFactory;

import com.abdulaziz.ms.OCV.OCVFactory;
import com.abdulaziz.ms.OCV.VCInstance;

public class VCInstanceFactory implements CreationFactory {

	@Override
	public Object getNewObject() {
		return OCVFactory.eINSTANCE.createVCInstance();
	}

	@Override
	public Object getObjectType() {
		return VCInstance.class;
	}

}
