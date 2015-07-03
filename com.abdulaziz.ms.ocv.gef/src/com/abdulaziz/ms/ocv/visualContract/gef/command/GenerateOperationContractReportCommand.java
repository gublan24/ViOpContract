package com.abdulaziz.ms.ocv.visualContract.gef.command;

import org.eclipse.gef.commands.Command;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.widgets.Control;

import com.abdulaziz.ms.OCV.VContractCondition;
import com.abdulaziz.ms.OCV.VContractPrecondition;
import com.abdulaziz.ms.ocv.visualContract.gef.command.vc.VCValueWizardPage;

public class GenerateOperationContractReportCommand extends Command {

	private VContractCondition vPostCondition;
	private VContractCondition vPreCondition;
	private Control control;


	public boolean CanExecute()
	{
		return vPostCondition != null && vPreCondition !=null;
	}
	
	public void execute()
	{
		Wizard mainWizard = new Wizard() {

			private VCOperationReportPage page;

			public void addPages() {
				page = new VCOperationReportPage("Operation Report Page");
				page.setVCPrCondition(vPreCondition);
				page.setVCPostConition(vPostCondition);
				addPage(page);

			}

			@Override
			public boolean performFinish() {
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

	
	public void settModel(VContractCondition model) {
		
		this.vPreCondition = model.getPreConditon();
		this.vPostCondition = model.getPostConditon();
	}
	


}
