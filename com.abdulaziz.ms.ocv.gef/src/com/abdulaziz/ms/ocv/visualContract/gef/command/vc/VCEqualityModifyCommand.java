package com.abdulaziz.ms.ocv.visualContract.gef.command.vc;

import org.eclipse.gef.commands.Command;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Control;

import com.abdulaziz.ms.OCV.VCEquality;

public class VCEqualityModifyCommand extends Command {
	private Control control;
	private VCEquality vcEqaulity;
	

	public boolean canExecute()
	{
		return vcEqaulity != null;
		
	}

	public void execute() {
		Wizard mainWizard = new Wizard() {

			private VCEqualityWizardPage page;

			public void addPages() {
				page = new VCEqualityWizardPage("Update Eqaulity");
				page.setVCValue(vcEqaulity);
				addPage(page);

			}

			@Override
			public boolean performFinish() {
				page.updateModel();
				return true;
			}
		};
		WizardDialog wizardDialog = new WizardDialog(control.getShell(),
				mainWizard);
		wizardDialog.create();
		wizardDialog.open();
	}
	public void setControl(Control control) {
		this.control = control;
		
	}
	public void setVCEquality(VCEquality model) {
this.vcEqaulity = model;		
	}

}
