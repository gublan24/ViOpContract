package com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import com.abdulaziz.ms.OCV.OCVFactory;
import com.abdulaziz.ms.OCV.VCLoop;
import com.abdulaziz.ms.OCV.VContractCollectionBox;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.VCContractEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.VCEntityEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcontractCondition.VContractConditionEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.policy.VCContractConditionGraphicalNodeRolePolicy;

public class VCLoopBoxEditPart extends VCEntityEditPart {

	@Override
	protected IFigure createFigure() {
		return new VCLoopBoxFigure();
	}
	
	@Override
	protected  void refreshVisuals()
	{
		VCLoopBoxFigure figure = (VCLoopBoxFigure) getFigure();
		VCLoop vcLoop = (VCLoop) getModel();
		VContractConditionEditPart vContractEditPart = (VContractConditionEditPart) getParent();
		Rectangle constraint = vcLoop.getConstraints().getCopy();
		vContractEditPart.setLayoutConstraint(this, figure, constraint);
		// ---
		VContractCollectionBox vContractCollectionBox = vcLoop.getVcContractCollectionBox();
		
		
		if(vContractCollectionBox == null)
		{
			vContractCollectionBox  = OCVFactory.eINSTANCE.createVContractCollectionBox();
		
			vcLoop.setVcContractCollectionBox(vContractCollectionBox);

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
		VCLoop vcCollectionBox = (VCLoop) getModel();
		List<Object> list = new ArrayList<>();
		list.add(vcCollectionBox.getVcContractCollectionBox());
		return list;
		
	
	}
	

	
}
