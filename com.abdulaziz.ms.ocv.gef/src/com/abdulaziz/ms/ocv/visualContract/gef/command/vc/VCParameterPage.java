package com.abdulaziz.ms.ocv.visualContract.gef.command.vc;

import java.util.HashMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import com.abdulaziz.ms.OCV.UMLVariable;
import com.abdulaziz.ms.OCV.VCParameter;

public class VCParameterPage extends WizardPage {

	private VCParameter vcParameter;
	private Combo combo;
	private HashMap<String, UMLVariable> m;

	protected VCParameterPage(String pageName) {
		
		super(pageName);
		setTitle("Opration Parameter Selection");
		setDescription("To attach a specific operation parameter");
	}
	EList<UMLVariable> list;
	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		setControl(container);	
		combo = new Combo(container, SWT.NONE);
		combo.setBounds(297, 7, 191, 23);
		m = new HashMap<>();
		for (UMLVariable element : vcParameter.getContractCondition().getPreConditon().getVcContract().getUmlOperation().getOperationParameters()) {
			combo.add(element.getVariableName());
			m.put(element.getVariableName(), element);
			
		}
		
		if(vcParameter.getOperationParameter() != null)
		{
			combo.setText(vcParameter.getOperationParameter().getVariableName());
		}
		Label lblChooseAParameter = new Label(container, SWT.NONE);
		lblChooseAParameter.setBounds(10, 10, 292, 23);
		lblChooseAParameter.setText("Choose a parameter from the following parameters :");
		
	
	}

	public void setVCParameter(VCParameter vcParameter) {
		this.vcParameter = vcParameter;
		
	}

	public void updateModel() {
		if(combo.getText() != null && combo.getText().trim() != "")
		vcParameter.setOperationParameter(m.get(combo.getText()));
		
	}
}
