package com.abdulaziz.ms.ocv.visualContract.gef.factory;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.requests.CreationFactory;

import com.abdulaziz.ms.OCV.OCVFactory;
import com.abdulaziz.ms.OCV.VCValue;

public class VCValueFactory implements CreationFactory {

	@Override
	public Object getNewObject() {
		VCValue vcValue = OCVFactory.eINSTANCE.createVCValue();
		vcValue.setConstraints(new Rectangle(10,10, 80, 35));
		return vcValue;
	}

	@Override
	public Object getObjectType() {
		
		return VCValue.class;
	}

}
