package com.abdulaziz.ms.ocv.multiPageEditor;

import org.eclipse.gef.ui.actions.DeleteRetargetAction;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.gef.ui.actions.RedoRetargetAction;
import org.eclipse.gef.ui.actions.UndoRetargetAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.part.MultiPageEditorActionBarContributor;

public class MyMultiPageEditorActionBarContributor extends
		MultiPageEditorActionBarContributor {

	@Override
	public void setActivePage(IEditorPart activeEditor) {
		
	}
	
	public void contributeToMenu(IMenuManager menubar) {
		
		
	    super.contributeToMenu(menubar);
	   
	}


}
