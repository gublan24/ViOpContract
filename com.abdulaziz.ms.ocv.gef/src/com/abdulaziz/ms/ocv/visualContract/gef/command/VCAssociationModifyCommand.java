package com.abdulaziz.ms.ocv.visualContract.gef.command;

import org.eclipse.gef.commands.Command;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Control;

import com.abdulaziz.ms.OCV.VCAssociation;
import com.abdulaziz.ms.view.wizard.ModifyAssociationWizard;

public class VCAssociationModifyCommand extends Command {
	

	private VCAssociation vcAssociation;
	private Control control;
	
	
	public boolean canExecute(){
		
		return vcAssociation.getFirstInstance() != null && vcAssociation.getSecondInstance() != null;
		
	}
	
	
	
	public void execute()
	{
		ModifyAssociationWizard modifyAssociationWizard = new ModifyAssociationWizard(vcAssociation);
		WizardDialog wizardDialog = new WizardDialog(control.getShell(), modifyAssociationWizard);
		 wizardDialog.create();
		 wizardDialog.open();
	}

	public void setVCAssociation(VCAssociation model) {
	
		vcAssociation= model;
		
	}

	public void setControl(Control control) {
		this.control = control;
		
	}

}
