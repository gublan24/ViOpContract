package com.abdulaziz.ms.ocv.visualContract.gef.action;

import java.util.List;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.ui.IWorkbenchPart;

import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity.VCInstanceEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity.VCLoopBoxEditPart;

public class UpdateVCLoopSelectionAction extends SelectionAction {

	public static final String REQ_UPDATE_VCLOOP = "UpdateLoop";
	public static final String UPDATE_VCLOOP = "Update Loop";
	 Request request;

	public UpdateVCLoopSelectionAction(IWorkbenchPart part) {
		super(part);
		setId(UPDATE_VCLOOP);
		setText(UPDATE_VCLOOP);
		request = new Request(UPDATE_VCLOOP);
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
            if(!(selectedObject instanceof VCLoopBoxEditPart))
                return false;
            
        }		return true;
	}

}
