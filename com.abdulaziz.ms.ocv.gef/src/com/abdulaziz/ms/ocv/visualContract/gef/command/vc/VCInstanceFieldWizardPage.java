package com.abdulaziz.ms.ocv.visualContract.gef.command.vc;

import java.util.HashMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import com.abdulaziz.ms.OCV.UMLVariable;
import com.abdulaziz.ms.OCV.VCInstance;
import com.abdulaziz.ms.OCV.VCInstanceField;

import org.eclipse.swt.widgets.Combo;

public class VCInstanceFieldWizardPage extends WizardPage {



	protected VCInstanceFieldWizardPage(String pageName) {
		super(pageName);
		setTitle("Instance Field Selection");
		setDescription("To select a specific field of an instance");
	}


	private VCInstance instance;
	private EList<UMLVariable> list;
	private Combo combo;
	private VCInstanceField instanceField;
	HashMap<String, UMLVariable> m ;

	

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		setControl(container);
		
		Label instanceNameLabel = new Label(container, SWT.NONE);
		instanceNameLabel.setBounds(10, 31, 86, 17);
		instanceNameLabel.setText("Instance name : "+instance.getInstanceName());
		
		list = instance.getUmlClass().getClassAttributes();
		
		Label classNameLabel = new Label(container, SWT.NONE);
		classNameLabel.setBounds(10, 10, 191, 17);
		classNameLabel.setText("UML Class : "+instance.getUmlClass().getClassName());
		
		combo = new Combo(container, SWT.NONE);
		combo.setBounds(51, 52, 191, 23);
		m = new HashMap<>();
		for (UMLVariable element : list) {
			combo.add(element.getVariableName());
			m.put(element.getVariableName(), element);
			
		}

		Label lblField = new Label(container, SWT.NONE);
		lblField.setBounds(10, 54, 34, 15);
		lblField.setText("Field : ");
		
	
	
	
		
	}
	public void updateModel()
	{
		if(combo.getText() != null && combo.getText().trim() != "")
		instanceField.setUmlClassField(m.get(combo.getText()));
		
	}

	public void setVCInstance(VCInstance instance) {
		this.instance = instance;
	}
	public void setVCInstanceField(VCInstanceField instanceField) {
		this.instanceField = instanceField;
		
	}
}
