package com.abdulaziz.ms.ocv.visualContract.gef.action;

import java.util.List;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.ui.IWorkbenchPart;

import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity.VCInstanceEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity.VCInstanceFieldEditPart;

public class UpdateVCInstanceFieldSelectionAction extends SelectionAction {

	public static final String REQ_UPDATE_VCINSTANCE_FIELD = "UpdateInstanceField";
	public static final String UPDATE_VCINSTANCE_FIELD = "Update Instance Field";
	Request request;

	public UpdateVCInstanceFieldSelectionAction(IWorkbenchPart part) {
		super(part);
		setId(UPDATE_VCINSTANCE_FIELD);
		setText(UPDATE_VCINSTANCE_FIELD);
		request = new Request(REQ_UPDATE_VCINSTANCE_FIELD);
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
            if(!(selectedObject instanceof VCInstanceFieldEditPart))
                return false;
            
        }		return true;
	}

}
