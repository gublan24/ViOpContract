package com.abdulaziz.ms.ocv.visualContract.gef.command;

import org.eclipse.emf.common.util.EList;
import org.eclipse.gef.commands.Command;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Control;

import com.abdulaziz.ms.OCV.UMLVariable;
import com.abdulaziz.ms.OCV.VCInstance;
import com.abdulaziz.ms.view.wizard.AttributeWizard;
import com.abdulaziz.ms.view.wizard.AttributeWizardPage;

public class VCAttributeModifyCommand extends Command{
	/*
private VCAttribute vcAttribute;
private Control control;

	public void setVCAttribute(VCAttribute vcAttribute) {
		
		this.vcAttribute = vcAttribute;
		
	}
	@Override
	public void execute()
	{
		vcAttribute.setName("UPDATE ATTRIBUTE");
		EList<UMLVariable> am = vcAttribute.getVcContract().getUmlOperation().getOperationParameters();
			VCInstance sourceVCInstance = (VCInstance) vcAttribute.getIncomingLinks().get(0).getSource();
			
			
			
		
			//fix targetVCInstance
			AttributeWizard modifyAttributeWizard = new AttributeWizard(vcAttribute,sourceVCInstance,am);
			
			 WizardDialog wizardDialog = new WizardDialog(control.getShell(), modifyAttributeWizard);
			 wizardDialog.create();
			 wizardDialog.open();
			 
			 
			 
			 
		
		
		

	}
	@Override 
	public boolean canExecute()
	{
		return (vcAttribute.getIncomingLinks().size() == 1 && vcAttribute.getIncomingLinks().get(0).getSource() instanceof VCInstance);
	
	}

	public void setCompiste(Control control) {
	
		this.control = control;
	}
	
	*/

}
