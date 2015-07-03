package com.abdulaziz.ms.ocv.visualContract.gef.factory;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.requests.CreationFactory;

import com.abdulaziz.ms.OCV.OCVFactory;
import com.abdulaziz.ms.OCV.VCEquality;
import com.abdulaziz.ms.ocv.visualContract.gef.command.vc.EqaulityProperties;

public class VCEqaulityFactory implements CreationFactory {

	@Override
	public Object getNewObject() {
		VCEquality newVCEquality = OCVFactory.eINSTANCE.createVCEquality();
		newVCEquality.setConstraints(new Rectangle(0,0,40,35));
		newVCEquality.setDisplyedText(EqaulityProperties.EQUAL_DISPLAY);
		newVCEquality.setMeaning(EqaulityProperties.EQUAL_MEANING);
		return newVCEquality;
	}

	@Override
	public Object getObjectType() {
		return VCEqaulityFactory.class;
	}

}
