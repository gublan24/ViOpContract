package com.abdulaziz.ms.ocv.visualContract.gef.factory;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.requests.CreationFactory;

import com.abdulaziz.ms.OCV.OCVFactory;
import com.abdulaziz.ms.OCV.VCInstanceField;

public class VCInstanceFieldFactory implements CreationFactory {

	@Override
	public Object getNewObject() {
		VCInstanceField a = OCVFactory.eINSTANCE.createVCInstanceField();
		a.setConstraints(new Rectangle(10,10, 100, 35));
		return a;
	}

	@Override
	public Object getObjectType() {
		return VCInstanceFieldFactory.class;
	}

}
