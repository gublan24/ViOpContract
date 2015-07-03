package com.abdulaziz.ms.ocv.visualContract.gef.factory;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.requests.CreationFactory;

import com.abdulaziz.ms.OCV.OCVFactory;
import com.abdulaziz.ms.OCV.VCParameter;

public class VCParameterFactory implements CreationFactory {

	@Override
	public Object getNewObject() {
		VCParameter newVCParameter = OCVFactory.eINSTANCE.createVCParameter();
		newVCParameter.setConstraints(new Rectangle(10,10, 180, 35));
		return newVCParameter;
	}

	@Override
	public Object getObjectType() {
		return VCParameter.class;
	}

}
