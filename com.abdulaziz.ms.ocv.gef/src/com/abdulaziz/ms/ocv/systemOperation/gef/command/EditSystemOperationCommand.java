package com.abdulaziz.ms.ocv.systemOperation.gef.command;

import org.eclipse.gef.commands.Command;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Control;

import com.abdulaziz.ms.OCV.VSystemOperationDiagram;
import com.abdulaziz.ms.view.wizard.EditSystemOperationWizard;

public class EditSystemOperationCommand extends Command {
	
	private VSystemOperationDiagram vSystemOperation;
	private Control control;

	public void execute()
	{
		IWizard newWizard = new EditSystemOperationWizard(vSystemOperation);
		WizardDialog wDialog = new WizardDialog(control.getShell(), newWizard );
		wDialog.create();
		wDialog.open();
		
	}

	public void setControl(Control control) {
		this.control = control;
		
	}

	public void setVSystemOperation(VSystemOperationDiagram model) {
		vSystemOperation = model;
	}

}
