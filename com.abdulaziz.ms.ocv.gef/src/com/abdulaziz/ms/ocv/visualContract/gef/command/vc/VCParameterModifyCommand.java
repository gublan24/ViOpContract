package com.abdulaziz.ms.ocv.visualContract.gef.command.vc;

import org.eclipse.gef.commands.Command;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Control;

import com.abdulaziz.ms.OCV.VCParameter;

public class VCParameterModifyCommand extends Command {
	private Control control;
	private VCParameter vcParameter;

	public boolean canExecute()
	{
		return 	vcParameter != null && vcParameter.getContractCondition().getPreConditon().getVcContract().getUmlOperation().getOperationParameters().size()>0;
	}
	
	public void execute() {
		Wizard mainWizard = new Wizard() {

			private VCParameterPage page;

			public void addPages() {
				page = new VCParameterPage("Update Instance");
				page.setVCParameter(vcParameter);
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

	public void setVCParameter(VCParameter model) {
		this.vcParameter = model;

	}

}
