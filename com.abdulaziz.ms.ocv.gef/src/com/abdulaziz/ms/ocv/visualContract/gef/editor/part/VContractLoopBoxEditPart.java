package com.abdulaziz.ms.ocv.visualContract.gef.editor.part;


import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LabeledContainer;
import org.eclipse.draw2d.Layer;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.swt.internal.C;
import org.w3c.dom.css.Rect;

import com.abdulaziz.ms.OCV.OCVFactory;
import com.abdulaziz.ms.OCV.VCAlternativeBox;
import com.abdulaziz.ms.OCV.VCCollectionBox;
import com.abdulaziz.ms.OCV.VCInstance;
import com.abdulaziz.ms.OCV.VCLoop;
import com.abdulaziz.ms.OCV.VContractAlternativeBox;
import com.abdulaziz.ms.OCV.VContractCollectionBox;
import com.abdulaziz.ms.OCV.VContractCondition;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity.VCAlternativeBoxEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity.VCAlternativeBoxFigure;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity.VCCollectionBoxEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity.VCLoopBoxEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcontractCondition.VContractConditionEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcontractCondition.VContractConditionFigure;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.policy.VContractXYEditPolicy;
import com.abdulaziz.ms.ocv.visualContract.gef.util.VContractUtility;

public class VContractLoopBoxEditPart extends VContractConditionEditPart {

	@Override 
	protected void refreshVisuals()
	{
		getFigure().setBorder(null);		
		VCLoopBoxEditPart parentEditPart = (VCLoopBoxEditPart) getParent();	
		Dimension size = ((VCLoop)parentEditPart.getModel()).getConstraints().getSize().getCopy();
		size.shrink(5, 20);
		Point location = new Point(5,20);
		Rectangle constraint = new Rectangle(location, size);
		parentEditPart.setLayoutConstraint(this, getFigure(), constraint);	
		
	}
	
	
	

}
