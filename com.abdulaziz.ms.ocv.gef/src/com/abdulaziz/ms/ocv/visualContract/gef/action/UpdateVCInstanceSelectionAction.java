package com.abdulaziz.ms.ocv.visualContract.gef.action;

import java.util.List;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.swt.internal.win32.UDACCEL;
import org.eclipse.ui.IWorkbenchPart;

import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity.VCAssociationEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity.VCInstanceEditPart;

public class UpdateVCInstanceSelectionAction extends SelectionAction {
	
	private Request request;
	public static final String UPDATE_VCINSTANCE ="update Instance";
	public static final String REQ_UPDATE_VCINSTANCE ="updateVCInstance";


	public UpdateVCInstanceSelectionAction(IWorkbenchPart part) {
		super(part);
		setId(UPDATE_VCINSTANCE);
		setText(UPDATE_VCINSTANCE);
		request = new Request(REQ_UPDATE_VCINSTANCE);
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
            if(!(selectedObject instanceof VCInstanceEditPart))
                return false;
            
        }		return true;
	}

}
