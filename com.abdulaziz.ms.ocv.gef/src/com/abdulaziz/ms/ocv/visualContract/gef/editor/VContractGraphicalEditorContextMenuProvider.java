package com.abdulaziz.ms.ocv.visualContract.gef.editor;

import java.io.InputStream;

import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.ui.actions.ActionFactory;

import com.abdulaziz.ms.ocv.uml.gef.editor.figure.UMLClassFigure;
import com.abdulaziz.ms.ocv.visualContract.gef.action.GenerateOperationContractAction;
import com.abdulaziz.ms.ocv.visualContract.gef.action.UpdateEqualitySelectionAction;
import com.abdulaziz.ms.ocv.visualContract.gef.action.UpdateVCAlternativeSelectionAction;
import com.abdulaziz.ms.ocv.visualContract.gef.action.UpdateVCCollectionSelectionAction;
import com.abdulaziz.ms.ocv.visualContract.gef.action.UpdateVCInstanceFieldSelectionAction;
import com.abdulaziz.ms.ocv.visualContract.gef.action.UpdateVCLoopSelectionAction;
import com.abdulaziz.ms.ocv.visualContract.gef.action.UpdateVCParameterSelectionAction;
import com.abdulaziz.ms.ocv.visualContract.gef.action.UpdateVCValueSelectionAction;
import com.abdulaziz.ms.ocv.visualContract.gef.action.VCAssociationUpdateSelectionAction;
import com.abdulaziz.ms.ocv.visualContract.gef.action.VCAttributeUpdateSelectionAction;
import com.abdulaziz.ms.ocv.visualContract.gef.action.UpdateVCInstanceSelectionAction;

public class VContractGraphicalEditorContextMenuProvider extends ContextMenuProvider{

	private ActionRegistry actionRegistry ;
	public VContractGraphicalEditorContextMenuProvider(EditPartViewer viewer, final ActionRegistry actionRegistry) {
		super(viewer);
		this.setActionRegistry(actionRegistry);
	}

	@Override
	public void buildContextMenu(IMenuManager menu) {
		GEFActionConstants.addStandardActionGroups(menu);
		
		IAction action;
		action = actionRegistry.getAction(ActionFactory.UNDO.getId());
		
		menu.appendToGroup(GEFActionConstants.GROUP_UNDO, action);
		action = actionRegistry.getAction(ActionFactory.REDO.getId());
		menu.appendToGroup(GEFActionConstants.GROUP_UNDO, action);
		
		action = actionRegistry.getAction(ActionFactory.DELETE.getId());
		menu.appendToGroup(GEFActionConstants.GROUP_UNDO, action);
		
				
		action = getActionRegistry().getAction(VCAttributeUpdateSelectionAction.UPDATE_VC_ATTRIBUTE);
		menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);
		    
		 action = getActionRegistry().getAction(VCAssociationUpdateSelectionAction.UPDATE_VC_ASSOCIATION);	
		 menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);
		 
		 action = getActionRegistry().getAction(UpdateVCInstanceSelectionAction.UPDATE_VCINSTANCE);	
		 menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);

		action = getActionRegistry().getAction(
				UpdateEqualitySelectionAction.UPDATE_VCEQUALITY);
		menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);
		
		action = getActionRegistry().getAction(
				UpdateVCAlternativeSelectionAction.UPDATE_VCALTERNATIVE);
		menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);
		
		action = getActionRegistry().getAction(UpdateVCCollectionSelectionAction.UPDATE_VCCOLLECTION);
		menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);
		
		action = getActionRegistry().getAction(UpdateVCInstanceFieldSelectionAction.UPDATE_VCINSTANCE_FIELD);
		menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);
		
		
		action = getActionRegistry().getAction(UpdateVCLoopSelectionAction.UPDATE_VCLOOP);
		menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);
		
		action = getActionRegistry().getAction(UpdateVCParameterSelectionAction.UPDATE_VC);
		menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);
		
		action = getActionRegistry().getAction(UpdateVCValueSelectionAction.UPDATE_VCVALUE);
		menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);
		
		action = getActionRegistry().getAction(GenerateOperationContractAction.GENERATE_OPERATION_CONTRACT);
		menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);
		
		menu.appendToGroup(GEFActionConstants.GROUP_VIEW,getActionRegistry().getAction(GEFActionConstants.ZOOM_IN));
		menu.appendToGroup(GEFActionConstants.GROUP_VIEW,getActionRegistry().getAction(GEFActionConstants.ZOOM_OUT));
		
	}

	public ActionRegistry getActionRegistry() {
		return actionRegistry;
	}
	
	
		
		
	

	public void setActionRegistry(final ActionRegistry actionRegistry) {
		this.actionRegistry = actionRegistry;
	}

}
