package com.abdulaziz.ms.ocv.visualContract.gef.factory;

import org.eclipse.gef.requests.CreationFactory;

import com.abdulaziz.ms.OCV.OCVFactory;
import com.abdulaziz.ms.OCV.VCCollectionBox;
import com.abdulaziz.ms.OCV.VContractCollectionBox;

public class VCCollectionBoxFactory implements CreationFactory {

	@Override
	public Object getNewObject() {
		VCCollectionBox vcCollectionBox = OCVFactory.eINSTANCE.createVCCollectionBox();
		return vcCollectionBox;
		
	}

	@Override
	public Object getObjectType() {
		return VCCollectionBox.class;
	}

}
