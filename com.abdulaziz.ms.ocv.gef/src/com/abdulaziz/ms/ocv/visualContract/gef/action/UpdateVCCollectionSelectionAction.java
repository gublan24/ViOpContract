package com.abdulaziz.ms.ocv.visualContract.gef.action;

import java.util.List;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.ui.IWorkbenchPart;

import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity.VCCollectionBoxEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity.VCInstanceEditPart;

public class UpdateVCCollectionSelectionAction extends SelectionAction {

	public static final String REQ_UPDATE_VCCOLLECTION = "UpdateCollection";
	public static final String UPDATE_VCCOLLECTION = "Update Collection";
	Request request;

	public UpdateVCCollectionSelectionAction(IWorkbenchPart part) {
		super(part);
		setId(UPDATE_VCCOLLECTION);
		setText(UPDATE_VCCOLLECTION);
		request = new Request(REQ_UPDATE_VCCOLLECTION);
	}


	@Override
	public void run()
	{
		@SuppressWarnings("unchecked")
		List <EditPart> selectedObjectsEditPart = getSelectedObjects();
		CompoundCommand compoundCommand = new CompoundCommand();
		
		for(EditPart editPart: selectedObjectsEditPart)
		{
			compoundCommand.add(editPart.getCommand(request));
		}
		
		execute(compoundCommand);
	}

	@Override
	protected boolean calculateEnabled() {
		if(getSelectedObjects().isEmpty()) {
            return false;
        }
        for(Object selectedObject : getSelectedObjects()) {
            if(!(selectedObject instanceof VCCollectionBoxEditPart))
                return false;
            
        }		return true;
	}


}
