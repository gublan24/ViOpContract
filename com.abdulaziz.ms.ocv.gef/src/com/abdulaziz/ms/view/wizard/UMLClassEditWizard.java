package com.abdulaziz.ms.view.wizard;

import org.eclipse.jface.wizard.Wizard;

import com.abdulaziz.ms.OCV.UMLClass;

public class UMLClassEditWizard extends Wizard {
	private UMLClass umlClass;
	
	public UMLClassEditWizard(UMLClass umlClass) {
		super();
		this.umlClass = umlClass;
		
		
	}



	public UMLClass getUmlClass() {
		return umlClass;
	}

	
UMLClassWizardPage page1;
	@Override 
	public void addPages()
	{
	page1 = new UMLClassWizardPage("page1", umlClass);
		addPage(page1);
		
	}

	@Override
	public boolean performFinish() {
		if(page1.getClassNameTextbox().equals("") )
		{
			return false;
		}
		else 
			umlClass.setClassName(page1.getClassNameTextbox());
			
		
		return true;
	}

}
