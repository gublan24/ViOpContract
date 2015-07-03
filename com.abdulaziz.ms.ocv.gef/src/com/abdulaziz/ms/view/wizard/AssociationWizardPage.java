package com.abdulaziz.ms.view.wizard;

import java.util.HashMap;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Group;

import com.abdulaziz.ms.OCV.UMLClass;
import com.abdulaziz.ms.OCV.UMLVariable;
import com.abdulaziz.ms.OCV.VCAssociation;
import com.abdulaziz.ms.OCV.VCInstance;

import org.eclipse.draw2d.Panel;
import org.eclipse.swt.widgets.Button;

public class AssociationWizardPage extends WizardPage {

	private Combo firstInstanceAttributesCombo;
	private Combo secondInstanceAttributesCombo;
	private VCAssociation vcAssociation;
	private UMLClass firstClass;
	private UMLClass secondClass;
	private HashMap<String, UMLVariable> firstUMLVariableHashMap;
	private HashMap<String, UMLVariable> secondClassUMLVariableHashMap;
	
	 
	/**
	 * Create the wizard.
	 */
	

	public AssociationWizardPage(VCAssociation vcAssociation) 
	{
		super("wizardPage");
		setTitle("Wizard Page title");
		setDescription("Wizard Page description");
		this.vcAssociation = vcAssociation;
		this.firstClass= ((VCInstance) vcAssociation.getIncomingLinks().get(0).getSource()).getUmlClass();
		this.secondClass= ((VCInstance) vcAssociation.getIncomingLinks().get(1).getSource()).getUmlClass();	
		
	}



	/**
	 * Create contents of the wizard.
	 * @param parent
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);

		setControl(container);
		
		createUserInterfaceDesign(container);
		firstUMLVariableHashMap = new HashMap<>();
		secondClassUMLVariableHashMap = new HashMap<>();
		fillData();
		
		
	}

	private void fillData() {
		
		
		
		for (UMLVariable umlVariable:firstClass.getClassAttributes())
		{
			firstUMLVariableHashMap.put( umlVariable.getVariableName(),umlVariable);
			firstInstanceAttributesCombo.add(umlVariable.getVariableName());
		}
		if(vcAssociation.getFirstInstanceVariable() != null)
		{
			int i = firstInstanceAttributesCombo.indexOf(vcAssociation.getFirstInstanceVariable().getVariableName());
			firstInstanceAttributesCombo.select(i);
		}
		for (UMLVariable umlVariable:secondClass.getClassAttributes())
		{
			secondClassUMLVariableHashMap.put( umlVariable.getVariableName(),umlVariable);
			secondInstanceAttributesCombo.add(umlVariable.getVariableName());
		}
		if(vcAssociation.getSecondInstanceVariable() != null)
		{
			int i = secondInstanceAttributesCombo.indexOf(vcAssociation.getSecondInstanceVariable().getVariableName());
			secondInstanceAttributesCombo.select(i);
		}
		
	}
	
	public UMLVariable getFirstSelectedUMLVariable()
	{
		
		return firstUMLVariableHashMap.get(firstInstanceAttributesCombo.getText());
	}
	
	public UMLVariable getSecondSelectedUMLVariable()
	{
		return secondClassUMLVariableHashMap.get(secondInstanceAttributesCombo.getText());
	}

	private void createUserInterfaceDesign(Composite container) {
		Label pageLabel = new Label(container, SWT.NONE);
		pageLabel.setBounds(10, 10, 333, 15);
		pageLabel.setText("Select the attributes on which the association will based  :");
		
		Group firstGroup = new Group(container, SWT.NONE);
		firstGroup.setText("First Instance");
		firstGroup.setBounds(10, 45, 302, 91);
		
		Label label_1_1 = new Label(firstGroup, SWT.NONE);
		label_1_1.setBounds(10, 24, 97, 15);
		label_1_1.setText("Instance Variable:");
		
		Label firstInstanceNameLabel = new Label(firstGroup, SWT.NONE);
		firstInstanceNameLabel.setBounds(111, 24, 131, 15);
		firstInstanceNameLabel.setText(firstClass.getClassName());
		
		Label label_1_2 = new Label(firstGroup, SWT.NONE);
		label_1_2.setText("Instance Attribute:");
		label_1_2.setBounds(10, 57, 108, 15);
		
	 firstInstanceAttributesCombo = new Combo(firstGroup, SWT.NONE);
		firstInstanceAttributesCombo.setBounds(124, 54, 131, 23);
		
		Group secondInstanceGroup = new Group(container, SWT.NONE);
		secondInstanceGroup.setText("Second Instance");
		secondInstanceGroup.setBounds(10, 148, 302, 91);
		
		Label label_2_1 = new Label(secondInstanceGroup, SWT.NONE);
		label_2_1.setText("Instance Variable:");
		label_2_1.setBounds(10, 24, 95, 15);
		
		Label secondInstanceNameLabel = new Label(secondInstanceGroup, SWT.NONE);
		secondInstanceNameLabel.setBounds(111, 24, 131, 15);
		secondInstanceNameLabel.setText(secondClass.getClassName());
		
		Label label_2_2 = new Label(secondInstanceGroup, SWT.NONE);
		label_2_2.setText("Instance Attribute:");
		label_2_2.setBounds(10, 57, 108, 15);
		
		secondInstanceAttributesCombo = new Combo(secondInstanceGroup, SWT.NONE);
		secondInstanceAttributesCombo.setBounds(124, 49, 131, 23);
		
	}
	
	public void execute()
	{
		
		UMLVariable wizardFirstUMLVariable = getFirstSelectedUMLVariable();
		UMLVariable wizardSecondUMLVariable = getSecondSelectedUMLVariable();
		if (wizardFirstUMLVariable != null && wizardSecondUMLVariable != null) {
			vcAssociation.setFirstInstanceVariable(wizardFirstUMLVariable);
			vcAssociation.setFirstInstance((VCInstance) vcAssociation
					.getIncomingLinks().get(0).getSource());
			vcAssociation.setSecondInstanceVariable(wizardSecondUMLVariable);
			vcAssociation.setSecondInstance((VCInstance) vcAssociation
					.getIncomingLinks().get(1).getSource());
		} else {

			vcAssociation.setFirstInstanceVariable(null);
			vcAssociation.setFirstInstance(null);
			vcAssociation.setSecondInstanceVariable(null);
			vcAssociation.setSecondInstance(null);

		}
		
		
	}
}
