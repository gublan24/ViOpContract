package com.abdulaziz.ms.ocv.visualContract.gef.command.vc;

import org.eclipse.gef.commands.Command;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Control;

import com.abdulaziz.ms.OCV.VCInstance;
import com.abdulaziz.ms.OCV.VCInstanceField;
import com.abdulaziz.ms.OCV.VCLink;
import com.abdulaziz.ms.ocv.visualContract.gef.command.VCLinkDeleteCommand;

public class VCInstanceFieldModifyCommand extends Command {

	private Control control;
	VCInstance instance;
	VCInstanceField instanceField;

	public void setControl(Control control) {
		this.control = control;
		

	}
	
	public boolean canExecute() {
		
		for (VCLink vcLink :instanceField.getIncomingLinks())
		{
			if (vcLink.getSource() instanceof VCInstance)
			{
				instance = (VCInstance) vcLink.getSource();
				instanceField.setVCInstance(instance);
				return true;
			}
		}
		
		return false;
	}
	
	

	public void execute() {
		instance = (VCInstance) instanceField.getIncomingLinks().get(0).getSource();
		
		Wizard mainWizard = new Wizard() {
			private VCInstanceFieldWizardPage page;
			public void addPages() {
				page = new VCInstanceFieldWizardPage("Update Instance");
				page.setVCInstance(instance);
				page.setVCInstanceField(instanceField);
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

	public void setInstanceField(VCInstanceField instanceField) {
		this.instanceField = instanceField;
	}

	

}
