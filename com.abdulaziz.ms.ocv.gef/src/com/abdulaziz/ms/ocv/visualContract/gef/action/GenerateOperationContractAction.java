package com.abdulaziz.ms.ocv.visualContract.gef.action;

import java.util.List;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.ui.IWorkbenchPart;

import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity.VCEqualityEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcontractCondition.VContractConditionEditPart;

public class GenerateOperationContractAction extends SelectionAction {

	public static final String GENERATE_OPERATION_CONTRACT = "Generate Operation Contract";
	public static final String REQ_GENERATE_OPERATION_CONTRACT = "GenerateOperationContract";
	Request request;
	
	public GenerateOperationContractAction(IWorkbenchPart part) {
		super(part);
		setId(GENERATE_OPERATION_CONTRACT);
		setText(GENERATE_OPERATION_CONTRACT);
		request = new Request(REQ_GENERATE_OPERATION_CONTRACT);

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
            if(!(selectedObject instanceof VContractConditionEditPart))
                return false;
            
        }		return true;
	}

}
