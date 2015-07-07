package com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcontractCondition;

import org.eclipse.draw2d.LabeledContainer;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;

public class VContractConditionFigure extends LabeledContainer {

	public VContractConditionFigure() {
		XYLayout layout = new XYLayout();
		setLayoutManager(layout);
		
		setOpaque(true);
	}

	public void setLayout(Rectangle rect) {
		getParent().setConstraint(this, rect);
	}
	
}
