package com.abdulaziz.ms.ocv.uml.gef.properties;

import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.ui.properties.UndoablePropertySheetPage;
import org.eclipse.jface.action.IAction;

public class OCVUndoablePropertySheet extends UndoablePropertySheetPage {

	public OCVUndoablePropertySheet(CommandStack commandStack,
			IAction undoAction, IAction redoAction) {
		super(commandStack, undoAction, redoAction);
	}

}
