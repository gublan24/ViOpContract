package com.abdulaziz.ms.ocv.visualContract.gef.command.vc;

import org.eclipse.gef.commands.Command;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import com.abdulaziz.ms.OCV.VCInstance;
import com.abdulaziz.ms.view.wizard.AssociationWizardPage;

public class VCInstanceModifyCommand extends Command {

	private Control control;
	private VCInstance instance;

	public boolean canExecute()
	{
		return (instance.getUmlClass() != null);
	}
	public void execute() {
		Wizard mainWizard = new Wizard() {

			private VCInstanceWizardPage page;

			public void addPages() {
				page = new VCInstanceWizardPage("Update Instance");
				page.setVCInstance(instance);
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

	public void setVCInstance(VCInstance model) {
		this.instance = model;

	}

}
