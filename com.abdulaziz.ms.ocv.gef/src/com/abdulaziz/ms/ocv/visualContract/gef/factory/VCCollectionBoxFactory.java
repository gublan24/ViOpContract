package com.abdulaziz.ms.ocv.visualContract.gef.factory;

import org.eclipse.gef.requests.CreationFactory;

import com.abdulaziz.ms.OCV.OCVFactory;
import com.abdulaziz.ms.OCV.VCCollectionBox;

public class VCCollectionBoxFactory implements CreationFactory {

	@Override
	public Object getNewObject() {
		return OCVFactory.eINSTANCE.createVCCollectionBox();
	}

	@Override
	public Object getObjectType() {
		return VCCollectionBox.class;
	}

}
