package com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity;

import org.eclipse.draw2d.IFigure;

import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.VCEntityEditPart;

public class VCReturnEditPart extends VCEntityEditPart {

	@Override
	protected IFigure createFigure() {
		return new VCReturnFigure();
	}

}
