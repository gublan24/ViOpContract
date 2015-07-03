package com.abdulaziz.ms.ocv.visualContract.gef.command.vc;

import org.eclipse.gef.commands.Command;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Control;

import com.abdulaziz.ms.OCV.VCAlternativeBox;

public class VCAlternativeModifyCommand extends Command {
	private Control control;
	private VCAlternativeBox vcAlternativeBox;
	
	public void setControl(Control control) {
		this.control = control;
		
	}
	public void execute() {
		Wizard mainWizard = new Wizard() {

			private VCAlternativeBoxWizardPage page;

			public void addPages() {
				page = new VCAlternativeBoxWizardPage("Update Value");
				page.setVCAlternativeBox(vcAlternativeBox);
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
	public void setVCAlternativeBox(VCAlternativeBox vcAlternativeBox) {
		this.vcAlternativeBox = vcAlternativeBox;
		
	}

}
