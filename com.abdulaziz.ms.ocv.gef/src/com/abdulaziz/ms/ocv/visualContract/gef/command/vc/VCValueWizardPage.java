package com.abdulaziz.ms.ocv.visualContract.gef.command.vc;

import java.util.ArrayList;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import com.abdulaziz.ms.OCV.VCValue;
import com.abdulaziz.ms.OCV.VContractPostcondition;
import com.abdulaziz.ms.OCV.VContractPrecondition;
import com.abdulaziz.ms.ocv.visualContract.gef.util.VCPreconditionPostconditionInterpertation;

import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class VCValueWizardPage extends WizardPage {

	private VCValue vcValue;
	private Text valueText;
	private Text text;
	protected VCValueWizardPage(String pageName) {
		
		super(pageName);
		setTitle("Value Property");
		setDescription("To enter a specific value");
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		setControl(container);
		
		valueText = new Text(container, SWT.BORDER);
		valueText.setBounds(54, 10, 146, 21);
		if(vcValue.getValue() != null)
		{
			valueText.setText(vcValue.getValue());
		}
		
		Label lblNewLabel = new Label(container, SWT.NONE);
		lblNewLabel.setBounds(10, 10, 35, 15);
		lblNewLabel.setText("Value :");
		

		

	}

	public void setVCValue(VCValue vcValue) {
	
		this.vcValue = vcValue;
		
	}

	public void updateModel() {
		if(!valueText.getText().trim().equals(""))
		vcValue.setValue(valueText.getText());
		
	}
}
