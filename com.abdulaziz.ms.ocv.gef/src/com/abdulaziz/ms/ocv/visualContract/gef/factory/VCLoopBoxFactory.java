package com.abdulaziz.ms.ocv.visualContract.gef.factory;

import org.eclipse.gef.requests.CreationFactory;

import com.abdulaziz.ms.OCV.OCVFactory;
import com.abdulaziz.ms.OCV.VCLoop;

public class VCLoopBoxFactory implements CreationFactory {

	@Override
	public Object getNewObject() {
		return OCVFactory.eINSTANCE.createVCLoop();
	}

	@Override
	public Object getObjectType() {
		return VCLoop.class;
	}

}
