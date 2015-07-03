package com.abdulaziz.ms.ocv.visualContract.gef.action;

import java.util.List;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.ui.IWorkbenchPart;

import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity.VCInstanceEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity.VCParameterEditPart;

public class UpdateVCParameterSelectionAction extends SelectionAction {

	public static final String REQ_UPDATE_VCPARAMETER = "UpdateParameter";
	public static final String UPDATE_VC = "Update Parameter";
	 Request request;

	public UpdateVCParameterSelectionAction(IWorkbenchPart part) {
		super(part);
		setId(UPDATE_VC);
		setText(UPDATE_VC);
		request = new Request(REQ_UPDATE_VCPARAMETER);
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
            if(!(selectedObject instanceof VCParameterEditPart))
                return false;
            
        }		return true;
	}

}
