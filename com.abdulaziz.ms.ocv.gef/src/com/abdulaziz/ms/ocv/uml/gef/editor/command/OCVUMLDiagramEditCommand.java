package com.abdulaziz.ms.ocv.uml.gef.editor.command;

import org.eclipse.gef.commands.Command;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Control;

import com.abdulaziz.ms.OCV.UMLClass;
import com.abdulaziz.ms.view.wizard.UMLClassEditWizard;
import com.abdulaziz.ms.view.wizard.UMLClassWizardPage;

public class OCVUMLDiagramEditCommand extends Command {

	private Control control;
	private UMLClass umlClass;
	
	
	
	@Override 
	public void execute()
	{
		
		UMLClassEditWizard wizard = new UMLClassEditWizard(umlClass);
		WizardDialog wizardDialog = new WizardDialog(control.getShell(), wizard);
		 wizardDialog.create();
		 wizardDialog.open();		
		
		
	}
	
	
	public void setControl(Control control) {
		this.control = control;
		
	}


	public void setUMLClass(UMLClass model) {
		this.umlClass = model;
	}
	
	

}
