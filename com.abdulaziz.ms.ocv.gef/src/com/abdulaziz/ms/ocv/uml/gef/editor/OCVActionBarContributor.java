package com.abdulaziz.ms.ocv.uml.gef.editor;

import org.eclipse.gef.ui.actions.ActionBarContributor;
import org.eclipse.gef.ui.actions.DeleteRetargetAction;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.gef.ui.actions.RedoRetargetAction;
import org.eclipse.gef.ui.actions.UndoRetargetAction;
import org.eclipse.gef.ui.actions.ZoomComboContributionItem;
import org.eclipse.gef.ui.actions.ZoomInRetargetAction;
import org.eclipse.gef.ui.actions.ZoomOutRetargetAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.actions.ActionFactory;

public class OCVActionBarContributor extends ActionBarContributor {

	@Override
	protected void buildActions() {
		addRetargetAction(new UndoRetargetAction());
		addRetargetAction(new DeleteRetargetAction());
		addRetargetAction(new RedoRetargetAction());
	

	}
	
	public void contributeToMenu(IMenuManager menubar) {
	    super.contributeToMenu(menubar);
	    
	    MenuManager viewMenu = new MenuManager("&View");
	    viewMenu.add(getAction(GEFActionConstants.ZOOM_IN));
	    viewMenu.add(getAction(GEFActionConstants.ZOOM_OUT));
	    menubar.insertAfter(IWorkbenchActionConstants.M_EDIT, viewMenu);
	}

	@Override
	public void contributeToToolBar(IToolBarManager toolBarManager) {
		super.contributeToToolBar(toolBarManager);
		toolBarManager.add(getAction(ActionFactory.UNDO.getId()));
		toolBarManager.add(getAction(ActionFactory.REDO.getId()));
		toolBarManager.add(getAction(ActionFactory.DELETE.getId()));
		toolBarManager.add(new ZoomComboContributionItem(getPage()));
		
		
	}

	@Override
	protected void declareGlobalActionKeys() {
		
	}

}
