package com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.VCEntityEditPart;

public class VCLoopBoxEditPart extends VCEntityEditPart {

	@Override
	protected IFigure createFigure() {
		return new VCLoopBoxFigure();
	}

	
}
