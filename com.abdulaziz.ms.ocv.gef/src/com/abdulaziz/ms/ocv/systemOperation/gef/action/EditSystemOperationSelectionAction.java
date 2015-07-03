package com.abdulaziz.ms.ocv.systemOperation.gef.action;

import java.io.InputStream;
import java.util.List;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.ui.IWorkbenchPart;

import com.abdulaziz.ms.ocv.systemOperation.gef.editor.part.VSystemOperationEditPart;
import com.abdulaziz.ms.ocv.uml.gef.util.AppUtility;
import com.abdulaziz.ms.ocv.visualContract.gef.action.VCAssociationUpdateSelectionAction;

public class EditSystemOperationSelectionAction extends SelectionAction {
	public final static String EDIT_SYSTEM_OPERATION = "Edit";
	public final static String REQ_EDIT_SYSTEM_OPERATION = "EditSystemOperationClass";
	
	Request request;

	public EditSystemOperationSelectionAction(IWorkbenchPart part) {
		super(part);
		setId(EDIT_SYSTEM_OPERATION);
		setText(EDIT_SYSTEM_OPERATION);
		request = new Request(REQ_EDIT_SYSTEM_OPERATION);
		try
		{
		setImageDescriptor(new ImageDescriptor() {

			@Override
			public ImageData getImageData() {
				return new ImageData(AppUtility.getSystemOperationMenuEditIcon());
			}
		});
		}
		catch(SWTException exception)
		{
			exception.printStackTrace();
		}
	}

	@Override
	public void run() {
		@SuppressWarnings("unchecked")
		List<EditPart> selectedObjectsEditPart = getSelectedObjects();
		CompoundCommand compoundCommand = new CompoundCommand();

		for (EditPart editPart : selectedObjectsEditPart) {
			compoundCommand.add(editPart.getCommand(request));
		}

		execute(compoundCommand);
	}

	@Override
	protected boolean calculateEnabled() {
		if (getSelectedObjects().isEmpty()) {
			return false;
		}
		for (Object selectedObject : getSelectedObjects()) {
			if (!(selectedObject instanceof VSystemOperationEditPart))
				return false;

		}
		return true;
	}
}