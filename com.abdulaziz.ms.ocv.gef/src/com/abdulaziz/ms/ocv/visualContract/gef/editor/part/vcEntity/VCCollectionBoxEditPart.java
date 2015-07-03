package com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.swt.SWT;

import com.abdulaziz.ms.OCV.VCCollectionBox;
import com.abdulaziz.ms.OCV.VCEntity;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.figure.VCEntityFigure;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.VCEntityEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcontractCondition.VContractConditionEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.util.VContractUtility;

public class VCCollectionBoxEditPart extends VCEntityEditPart 
{

	@Override
	protected IFigure createFigure() {
		return new VCCollectionBoxFigure();
	}
	
	@Override
	protected  void refreshVisuals()
	{
		VCCollectionBoxFigure figure = (VCCollectionBoxFigure) getFigure();
		VCEntity vcEntity = (VCCollectionBox) getModel();		
		VContractConditionEditPart vContractEditPart = (VContractConditionEditPart) getParent();
		Rectangle layout = vcEntity.getConstraints();
		vContractEditPart.setLayoutConstraint(this, figure, layout);


	}

	
}