package com.abdulaziz.ms.ocv.visualContract.gef.factory;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.requests.CreationFactory;

import com.abdulaziz.ms.OCV.OCVFactory;
import com.abdulaziz.ms.OCV.VCReturn;

public class VCReturnFactory implements CreationFactory {

	@Override
	public Object getNewObject() {
		VCReturn vCreturn = OCVFactory.eINSTANCE.createVCReturn();
		vCreturn.setConstraints(new Rectangle(0,0,45,45));
		return vCreturn;
	}

	@Override
	public Object getObjectType() {
		return VCReturn.class;
	}

}
