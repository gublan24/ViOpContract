package com.abdulaziz.ms.ocv.visualContract.gef.command.vc;

import java.awt.Component;
import java.awt.Container;
import java.util.HashMap;

import javax.print.attribute.standard.MediaSize.Other;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import com.abdulaziz.ms.OCV.VCEquality;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Group;

public class VCEqualityWizardPage extends WizardPage {

	private VCEquality vcEqaulity;
	private Text vcTextMeaning;
	private Text vcTextDisplay;
	private MySelectionListener listener;
	private Button btnOther;
	HashMap<Button , EqaulityProperties> buttonEqaulityPropertiesHashMap;
	
	public void setEnable(boolean flag)
	{
		vcTextDisplay.setEnabled(flag);
		vcTextMeaning.setEnabled(flag);
		btnOther.setSelection(flag);
		if(!flag)
		{
		vcTextDisplay.setText("");
		vcTextMeaning.setText("");
		}
		
	}

	class MySelectionListener implements SelectionListener {

		@Override
		public void widgetSelected(SelectionEvent e) {
			Button selectedRadio = (Button)e.getSource();
			
			if(selectedRadio.equals(btnOther))
			{
				setEnable(true);
				
		
				
			}
			else 
			{
				setEnable(false);
				vcEqaulity.setDisplyedText(buttonEqaulityPropertiesHashMap.get(selectedRadio).getDisplayedText());
				vcEqaulity.setMeaning(buttonEqaulityPropertiesHashMap.get(selectedRadio).getMeaning());
				
			}
			
			
		}

		@Override
		public void widgetDefaultSelected(SelectionEvent e) {
			
		}}
	
	protected VCEqualityWizardPage(String pageName) {
		super(pageName);
		setTitle("Equality Property");
		setDescription("To update a property of an equality");
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		setControl(container);
	
		buttonEqaulityPropertiesHashMap = new HashMap<>();
		listener = new MySelectionListener();
		
		Label lblNewLabel = new Label(container, SWT.NONE);
		lblNewLabel.setText("Select an equality, or a comparison : ");
		lblNewLabel.setBounds(10, 10, 208, 15);
		
		Button btnEqual = new Button(container, SWT.RADIO);
		btnEqual.setBounds(224, 10, 95, 16);
		btnEqual.setText("=  Equal");
		buttonEqaulityPropertiesHashMap.put(btnEqual, new EqaulityProperties(EqaulityProperties.EQUAL_MEANING,EqaulityProperties.EQUAL_DISPLAY,btnEqual));
		btnEqual.addSelectionListener(listener);
		
		Button btnGTThan = new Button(container, SWT.RADIO);
		btnGTThan.setBounds(224, 70, 126, 16);
		btnGTThan.setText("> Greater than");
		buttonEqaulityPropertiesHashMap.put(btnGTThan, new EqaulityProperties("greater than",">",btnGTThan));
		btnGTThan.addSelectionListener(listener);
		
		Button btnLessThan = new Button(container, SWT.RADIO);
		btnLessThan.setBounds(224, 50, 126, 16);
		btnLessThan.setText("< Less than");
		buttonEqaulityPropertiesHashMap.put(btnLessThan, new EqaulityProperties("less than","<",btnLessThan));
		btnLessThan.addSelectionListener(listener);
		
		Button btnNotEqual = new Button(container, SWT.RADIO);
		btnNotEqual.setBounds(224, 30, 126, 16);
		btnNotEqual.setText("<> Not equal");
		buttonEqaulityPropertiesHashMap.put(btnNotEqual, new EqaulityProperties("Not equal","<>",btnNotEqual));
		btnNotEqual.addSelectionListener(listener);
		
		btnOther = new Button(container, SWT.RADIO);
		btnOther.setBounds(224, 90, 90, 16);
		btnOther.setText("Other :");		
		btnOther.addSelectionListener(listener);
		
		Label lblMeaning = new Label(container, SWT.NONE);
		lblMeaning.setBounds(253, 142, 72, 15);
		lblMeaning.setText("Meaning :");
		
		vcTextMeaning = new Text(container, SWT.BORDER);
		vcTextMeaning.setBounds(330, 139, 128, 21);
		
		vcTextDisplay = new Text(container, SWT.BORDER);
		vcTextDisplay.setBounds(330, 112, 128, 21);
		setEnable(false);

		
		Label lblDisplayInThe = new Label(container, SWT.NONE);
		lblDisplayInThe.setBounds(253, 115, 72, 15);
		lblDisplayInThe.setText("Displayed as : ");
		
		if(vcEqaulity.getDisplyedText() != null)
		{
			setEnable(true);
				for (EqaulityProperties element : buttonEqaulityPropertiesHashMap.values()) {
					if (element.equals(vcEqaulity))
					{
						element.getButton().setSelection(true);
						setEnable(false);
						break;
					}
			if(btnOther.getSelection())
			{
				vcTextDisplay.setText(vcEqaulity.getDisplyedText());
				vcTextMeaning.setText(vcEqaulity.getMeaning());
				
			}
					
				}
			

				
		}
		
		
	
		
	}

	public void setVCValue(VCEquality vcEqaulity) {
		this.vcEqaulity = vcEqaulity;
		
	}

	public void updateModel() {
		
		if(btnOther.getSelection() && !vcTextMeaning.getText().trim().equals("")
				&& ! vcTextDisplay.getText().trim().equals(""))
		{
			vcEqaulity.setMeaning(vcTextMeaning.getText());
			vcEqaulity.setDisplyedText(vcTextDisplay.getText());
		}
		
	}
}
