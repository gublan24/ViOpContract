package com.abdulaziz.ms.view.wizard;

import java.util.HashMap;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Group;

import com.abdulaziz.ms.OCV.UMLClass;
import com.abdulaziz.ms.OCV.UMLVariable;
import com.abdulaziz.ms.OCV.VCAssociation;
import com.abdulaziz.ms.OCV.VCInstance;
import com.abdulaziz.ms.OCV.VCLink;

import org.eclipse.draw2d.Panel;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.swt.widgets.Button;

public class AssociationWizardPage extends WizardPage {

	private Combo firstInstanceAttributesCombo;
	private Combo secondInstanceAttributesCombo;
	private VCAssociation vcAssociation;
	private UMLClass firstClass;
	private UMLClass secondClass;
	private HashMap<String, UMLVariable> firstUMLVariableHashMap;
	private HashMap<String, UMLVariable> secondClassUMLVariableHashMap;
	private Button unidirectionalAssociationCheckBox;
	private Group group;
	
	 
	/**
	 * Create the wizard.
	 */
	

	public AssociationWizardPage(VCAssociation vcAssociation) 
	{
		super("wizardPage");
		setTitle("Wizard Page title");
		setDescription("Wizard Page description");
		this.vcAssociation = vcAssociation;
		this.firstClass= vcAssociation.getFirstInstance().getUmlClass();
		this.secondClass= vcAssociation.getSecondInstance().getUmlClass();
	}



	/**
	 * Create contents of the wizard.
	 * @param parent
	 */

	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);

		setControl(container);
		
		createUserInterfaceDesign(container);
		
		unidirectionalAssociationCheckBox = new Button(container, SWT.CHECK);
		unidirectionalAssociationCheckBox.setBounds(10, 10, 214, 16);
		unidirectionalAssociationCheckBox.setText("unidirectional association ");
		unidirectionalAssociationCheckBox.setSelection(!this.vcAssociation.isDirectional());
		unidirectionalAssociationCheckBox.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(((Button)e.getSource()).getSelection())
					group.setVisible(false);
				else 
					group.setVisible(true);
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		group = new Group(container, SWT.NONE);
		group.setBounds(20, 55, 529, 216);
		Label pageLabel = new Label(group, SWT.NONE);
		pageLabel.setSize(389, 15);
		pageLabel.setText("Select the attribute of the target on which the association will based  :");
		
		Group secondInstanceGroup = new Group(group, SWT.NONE);
		secondInstanceGroup.setLocation(89, 23);
		secondInstanceGroup.setSize(302, 91);
		
		secondInstanceGroup.setText("Second Instance");
		
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
		
		Group firstGroup = new Group(group, SWT.NONE);
		firstGroup.setLocation(26, 115);
		firstGroup.setSize(302, 91);
		firstGroup.setText("First Instance");
		
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
		firstUMLVariableHashMap = new HashMap<>();
		secondClassUMLVariableHashMap = new HashMap<>();
		fillData();
		
		group.setVisible(vcAssociation.isDirectional());

		
		
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
		
	}
	
	public void execute()
	{
		
		vcAssociation.setDirectional(!unidirectionalAssociationCheckBox.getSelection());
		
		if (unidirectionalAssociationCheckBox.getSelection())
		{
			/*
			vcAssociation.setFirstInstanceVariable(null);
			vcAssociation.setFirstInstance(null);
			vcAssociation.setSecondInstanceVariable(null);
			vcAssociation.setSecondInstance(null);
			*/
		}
		else 
		{
			
		UMLVariable wizardFirstUMLVariable = getFirstSelectedUMLVariable();
		UMLVariable wizardSecondUMLVariable = getSecondSelectedUMLVariable();
		if (wizardFirstUMLVariable != null )
						vcAssociation.setFirstInstanceVariable(wizardFirstUMLVariable);

		if (wizardSecondUMLVariable != null) {
			vcAssociation.setSecondInstanceVariable(wizardSecondUMLVariable);
		
		}
		}
		
		NotificationImpl x = new NotificationImpl(INFORMATION, vcAssociation, vcAssociation);
		for (VCLink asspciationFormationOutGoingLink:vcAssociation.getOutgoingLinks())
		{
			asspciationFormationOutGoingLink.eNotify(x);
		}
		for (VCLink asspciationFormationIncomingLink:vcAssociation.getIncomingLinks())
		{
			asspciationFormationIncomingLink.eNotify(x);
		}

		
	}
}
