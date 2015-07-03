package com.abdulaziz.ms.view.wizard;

import org.eclipse.jface.wizard.Wizard;

import com.abdulaziz.ms.OCV.VSystemOperationDiagram;

public class EditSystemOperationWizard extends Wizard {

	private VSystemOperationDiagram vSystemOperation;

	public EditSystemOperationWizard(VSystemOperationDiagram vSystemOperation) {
		this.vSystemOperation = vSystemOperation;
	}
	
	public void addPages()
	{
		EditSystemOperationWizardPage page = new EditSystemOperationWizardPage("",vSystemOperation);
		addPage(page);
		
	}

	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		return true;
	}

}
