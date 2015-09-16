package com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

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
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.swt.SWT;

import com.abdulaziz.ms.OCV.OCVFactory;
import com.abdulaziz.ms.OCV.VCCollectionBox;
import com.abdulaziz.ms.OCV.VCEntity;
import com.abdulaziz.ms.OCV.VContractAlternativeBox;
import com.abdulaziz.ms.OCV.VContractCollectionBox;
import com.abdulaziz.ms.OCV.VContractCondition;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.figure.VCEntityFigure;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.VCEntityEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcontractCondition.VContractConditionEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.policy.VContractXYEditPolicy;
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
		VCCollectionBox vcCollectionBox = (VCCollectionBox) getModel();
		VContractConditionEditPart vContractEditPart = (VContractConditionEditPart) getParent();
		Rectangle constraint = vcCollectionBox.getConstraints().getCopy();
		vContractEditPart.setLayoutConstraint(this, figure, constraint);
		// ---
		VContractCollectionBox vContractCollectionBox = vcCollectionBox.getVContractCollectionBox();
		
		if(vContractCollectionBox == null)
		{
			vContractCollectionBox  = OCVFactory.eINSTANCE.createVContractCollectionBox();
			vcCollectionBox.setVContractCollectionBox(vContractCollectionBox);
			vContractCollectionBox.setVcCollectionBox(vcCollectionBox);
			EditPart childEditPart = this.createChild(vContractCollectionBox);
			this.addChild(childEditPart, 0);
						
		}
		for (Object element : this.getChildren()) {
			((EditPart) element).refresh();
			
		}
		
		
	
		
		


	}
	@Override
	public List<Object> getModelChildren()
	{
		VCCollectionBox vcCollectionBox = (VCCollectionBox) getModel();
		List<Object> list = new ArrayList<>();
		list.add(vcCollectionBox.getVContractCollectionBox());
		return list;
		
	
	}
	
}