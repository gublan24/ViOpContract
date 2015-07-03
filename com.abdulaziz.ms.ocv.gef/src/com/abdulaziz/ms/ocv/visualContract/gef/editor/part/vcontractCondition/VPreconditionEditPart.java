package com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcontractCondition;

import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LabeledContainer;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.AccessibleEditPart;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartListener;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.dnd.TemplateTransferDropTargetListener;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gef.requests.CreationFactory;
import org.eclipse.gef.ui.parts.ScrollingGraphicalViewer;
import org.eclipse.swt.dnd.DropTargetEvent;

import com.abdulaziz.ms.OCV.OCVFactory;
import com.abdulaziz.ms.OCV.UMLClass;
import com.abdulaziz.ms.OCV.VCContract;
import com.abdulaziz.ms.OCV.VCInstance;
import com.abdulaziz.ms.OCV.VContractCondition;
import com.abdulaziz.ms.OCV.VContractPrecondition;
import com.abdulaziz.ms.ocv.visualContract.gef.action.VCAssociationUpdateSelectionAction;
import com.abdulaziz.ms.ocv.visualContract.gef.command.VCEntityCreateCommand;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.VCTemplateTransferDropTargetListener;

public class VPreconditionEditPart extends VContractConditionEditPart {

	
	

	public VPreconditionEditPart() {

		super();
		

	}
	
	

	@Override
	protected IFigure createFigure() {

		LabeledContainer figure = new LabeledContainer();
		
		figure.setOpaque(true);
		figure.setLayoutManager(new FreeformLayout());
		
		//getViewer().addDropTargetListener(new VCTemplateTransferDropTargetListener(getViewer(),this));
	


		return figure;

	}
	
	

}
