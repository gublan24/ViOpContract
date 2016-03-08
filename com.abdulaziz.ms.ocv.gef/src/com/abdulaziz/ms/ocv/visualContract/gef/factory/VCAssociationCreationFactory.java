package com.abdulaziz.ms.ocv.visualContract.gef.factory;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.requests.CreationFactory;

import com.abdulaziz.ms.OCV.OCVFactory;
import com.abdulaziz.ms.OCV.VCAssociation;

public class VCAssociationCreationFactory implements CreationFactory {

	@Override
	public Object getNewObject() {
		VCAssociation associationModel = OCVFactory.eINSTANCE.createVCAssociation();
		associationModel.setConstraints(new Rectangle(10,10,35,35));
		return associationModel;
	}

	@Override
	public Object getObjectType() {
		return VCAssociation.class;
	}

}
