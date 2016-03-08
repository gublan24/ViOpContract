package com.abdulaziz.ms.ocv.visualContract.gef.factory;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.requests.CreationFactory;

import com.abdulaziz.ms.OCV.OCVFactory;
import com.abdulaziz.ms.OCV.VCAssociation;
import com.abdulaziz.ms.OCV.VCAssociationDeletion;

public class VCAssociationDeletionFactory implements CreationFactory {

	@Override
	public Object getNewObject() {
		 VCAssociationDeletion deleteAssociationModel = OCVFactory.eINSTANCE.createVCAssociationDeletion();
		deleteAssociationModel.setConstraints(new Rectangle(10,10,35,35));
		return deleteAssociationModel;
	}

	@Override
	public Object getObjectType() {
		return VCAssociationDeletion.class;
	}

}
