package com.abdulaziz.ms.ocv.systemOperation.gef.editor;

import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;

import com.abdulaziz.ms.ocv.multiPageEditor.action.ExportAsImageAction;
import com.abdulaziz.ms.ocv.systemOperation.gef.action.EditSystemOperationSelectionAction;

public class SystemOperationContextMenuProvider extends ContextMenuProvider {


	private ActionRegistry actionRegistry;

	public SystemOperationContextMenuProvider(EditPartViewer viewer, final ActionRegistry actionRegistry){
		super(viewer);
		this.setActionRegistry(actionRegistry);
	}

	@Override
	public void buildContextMenu(IMenuManager menu) {
		GEFActionConstants.addStandardActionGroups(menu);
		
		IAction action;
		
		action = actionRegistry.getAction(EditSystemOperationSelectionAction.EDIT_SYSTEM_OPERATION);
		 menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);
		 menu.appendToGroup(GEFActionConstants.GROUP_SAVE,getActionRegistry().getAction(ExportAsImageAction.ID));
	}
	
	public ActionRegistry getActionRegistry() {
		return actionRegistry;
	}
	
	
		
		
	

	public void setActionRegistry(final ActionRegistry actionRegistry) {
		this.actionRegistry = actionRegistry;
	}


}
