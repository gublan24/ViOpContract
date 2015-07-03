package com.abdulaziz.ms.ocv.visualContract.gef.command.vc;

import org.eclipse.gef.commands.Command;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Control;

import com.abdulaziz.ms.OCV.VCInstance;
import com.abdulaziz.ms.OCV.VCValue;

public class VCValueModifyCommand extends Command {
	private Control control;
	private VCValue vcValue;
	
	
	public boolean canExecute()
	{
		return vcValue != null;
		
	}

	public void execute() {
		Wizard mainWizard = new Wizard() {

			private VCValueWizardPage page;

			public void addPages() {
				page = new VCValueWizardPage("Update Value");
				page.setVCValue(vcValue);
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

	public void setVCValue(VCValue model) {
		this.vcValue = model;
		
	}
}


