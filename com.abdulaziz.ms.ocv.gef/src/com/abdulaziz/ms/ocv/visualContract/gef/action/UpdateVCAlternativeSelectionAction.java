package com.abdulaziz.ms.ocv.visualContract.gef.action;

import java.util.List;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.ui.IWorkbenchPart;

import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity.VCAlternativeBoxEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity.VCInstanceEditPart;

public class UpdateVCAlternativeSelectionAction extends SelectionAction {

	public static final String REQ_UPDATE_VCALTERNATIVE = "Update Alternative";
	public static final String UPDATE_VCALTERNATIVE = "Update Alternative";
	Request request;

	public UpdateVCAlternativeSelectionAction(IWorkbenchPart part) {
		super(part);
		setId(UPDATE_VCALTERNATIVE);
		setText(UPDATE_VCALTERNATIVE);
		request = new Request(REQ_UPDATE_VCALTERNATIVE);
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
            if(!(selectedObject instanceof VCAlternativeBoxEditPart))
                return false;
            
        }		return true;
	}

}
