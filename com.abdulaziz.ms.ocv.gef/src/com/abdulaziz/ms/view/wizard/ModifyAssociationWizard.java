package com.abdulaziz.ms.view.wizard;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;

import com.abdulaziz.ms.OCV.UMLClass;
import com.abdulaziz.ms.OCV.UMLVariable;
import com.abdulaziz.ms.OCV.VCAssociation;
import com.abdulaziz.ms.OCV.VCInstance;

public class ModifyAssociationWizard extends Wizard {

	private VCAssociation vcAssociation;
	private AssociationWizardPage page;


	public ModifyAssociationWizard(VCAssociation vcAssociation) {
		super();
		
		this.vcAssociation = vcAssociation;
	}
	
	@Override
	public void addPages() {
		
		  page = new AssociationWizardPage(vcAssociation);
		addPage(page );
	}
	

	@Override
	public boolean performFinish() {
		page.execute();
	
		return true;
	}

}
