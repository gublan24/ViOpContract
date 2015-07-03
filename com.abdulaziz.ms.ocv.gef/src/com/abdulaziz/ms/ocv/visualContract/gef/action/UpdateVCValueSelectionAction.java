package com.abdulaziz.ms.ocv.visualContract.gef.action;

import java.util.List;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.ui.IWorkbenchPart;

import com.abdulaziz.ms.OCV.VCValue;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity.VCInstanceEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity.VCValueEditPart;

public class UpdateVCValueSelectionAction extends SelectionAction {

	public static final String REQ_UPDATE_VCVALUE = "UpdateValue";
	public static final String UPDATE_VCVALUE = "Update Value";
	 Request request;

	public UpdateVCValueSelectionAction(IWorkbenchPart part) {
		super(part);
		setId(UPDATE_VCVALUE);
		setText(UPDATE_VCVALUE);
		request = new Request(REQ_UPDATE_VCVALUE);
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
            if(!(selectedObject instanceof VCValueEditPart))
                return false;
            
        }		return true;
	}

}
