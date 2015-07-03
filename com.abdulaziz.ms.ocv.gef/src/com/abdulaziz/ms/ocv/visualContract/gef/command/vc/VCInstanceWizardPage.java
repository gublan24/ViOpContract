package com.abdulaziz.ms.ocv.visualContract.gef.command.vc;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;

import com.abdulaziz.ms.OCV.VCInstance;
import com.abdulaziz.ms.OCV.VCInstanceField;
import com.abdulaziz.ms.ocv.visualContract.gef.util.VContractUtility;

import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.widgets.Group;

public class VCInstanceWizardPage extends WizardPage {

	private VCInstance instance;
	private Text text;
	private Button newRadioButton;
	private Button datastoreRadioButton;
	private Group dataStoreIdentifierGroup;
	private Button uniqueRadioButton;
	private Button allRadioButton;
	private Button notExistsRadioButton;
	private Text notesText;
	protected VCInstanceWizardPage(String pageName) {
		super(pageName);
		setTitle("Domain Instance Property");
		setDescription("To update a property of an instance");
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		setControl(container);
		
		Label instanceNameLabel = new Label(container, SWT.NONE);
		instanceNameLabel.setBounds(10, 31, 86, 17);
		instanceNameLabel.setText("Instance name :");
		
		Label typeLabel = new Label(container, SWT.NONE);
		typeLabel.setBounds(10, 57, 35, 17);
		typeLabel.setText("type :");
		
		Label classNameLabel = new Label(container, SWT.NONE);
		classNameLabel.setBounds(10, 10, 191, 17);
		classNameLabel.setText("UML Class : "+instance.getUmlClass().getClassName());
		
		text = new Text(container, SWT.BORDER);
		text.setBounds(102, 28, 147, 21);
		text.setText(instance.getInstanceName());
		
		newRadioButton = new Button(container, SWT.RADIO);
		newRadioButton.setBounds(102, 60, 90, 16);
		newRadioButton.setText(VContractUtility.VCINSTANCE_NEW);
		InnerRadioSelectionListener linstener = new InnerRadioSelectionListener();
		newRadioButton.addSelectionListener( linstener);
			
		Button currentRadioButton = new Button(container, SWT.RADIO);
		currentRadioButton.setBounds(102, 80, 90, 16);
		currentRadioButton.setText(VContractUtility.VCINSTANCE_CURRENT);
		currentRadioButton.addSelectionListener( linstener);

		datastoreRadioButton = new Button(container, SWT.RADIO);
		datastoreRadioButton.setBounds(102, 100, 90, 16);
		datastoreRadioButton.setText(VContractUtility.VCINSTANCE_DATASTORE);
		
		dataStoreIdentifierGroup = new Group(container, SWT.NONE);
		dataStoreIdentifierGroup.setText("Data Store Identifier");
		dataStoreIdentifierGroup.setBounds(10, 128, 302, 85);
		
		uniqueRadioButton = new Button(dataStoreIdentifierGroup, SWT.RADIO);
		uniqueRadioButton.setBounds(10, 22, 90, 16);
		uniqueRadioButton.setText("Unique");
		uniqueRadioButton.setData(VContractUtility.DATA_STORE_UNIQUE);
	
		allRadioButton = new Button(dataStoreIdentifierGroup, SWT.RADIO);
		allRadioButton.setBounds(10, 44, 139, 16);
		allRadioButton.setText("All (collection)");
		allRadioButton.setData(VContractUtility.DATA_STORE_ALL);
		
		notExistsRadioButton = new Button(dataStoreIdentifierGroup, SWT.RADIO);
		notExistsRadioButton.setBounds(10, 66, 90, 16);
		notExistsRadioButton.setText("Not exists ");
		notExistsRadioButton.setData(VContractUtility.DATA_STORE_NOT_EXISTS);
		
		dataStoreIdentifierGroup.setVisible(false);
		
		notesText = new Text(container, SWT.BORDER | SWT.V_SCROLL | SWT.MULTI);
		notesText.setBounds(57, 229, 419, 42);
		
		Label lblNotes = new Label(container, SWT.NONE);
		lblNotes.setBounds(10, 232, 43, 15);
		lblNotes.setText("Notes:");
		datastoreRadioButton.addSelectionListener( linstener);
		
		if(instance.getType().equals(VContractUtility.VCINSTANCE_NEW))
			newRadioButton.setSelection(true);
		if(instance.getType().equals(VContractUtility.VCINSTANCE_CURRENT))
			currentRadioButton.setSelection(true);
		if(instance.getType().equals(VContractUtility.VCINSTANCE_DATASTORE))
		{
			datastoreRadioButton.setSelection(true);
			dataStoreIdentifierGroup.setVisible(true);
			if(instance.getIdentifier() != null)
			{
				if (instance.getIdentifier().equals((String)uniqueRadioButton.getData()))
				uniqueRadioButton.setSelection(true);
				else if (instance.getIdentifier().equals((String)allRadioButton.getData()))
					allRadioButton.setSelection(true);
				else if (instance.getIdentifier().equals((String)notExistsRadioButton.getData()))
					notExistsRadioButton.setSelection(true);
			}
			
			
		}
		if(instance.getNotes() != null)
			notesText.setText(instance.getNotes());
		if (instance.getPrecondition()
				!= null)
			newRadioButton.setEnabled(false);
		



	}			
	
	private class  InnerRadioSelectionListener implements SelectionListener{

	
		@Override
		public void widgetSelected(SelectionEvent e) {
			instance.setType(((Button)e.getSource()).getText());
		if(((Button)e.getSource()).equals(datastoreRadioButton)){
			dataStoreIdentifierGroup.setVisible(true);
		}
		else
			dataStoreIdentifierGroup.setVisible(false);
			
			
		}

		@Override
		public void widgetDefaultSelected(SelectionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	public void updateModel()
	{
		if (dataStoreIdentifierGroup.isVisible()) {
			if (uniqueRadioButton.getSelection())
				instance.setIdentifier((String) uniqueRadioButton.getData());
			else if (allRadioButton.getSelection())
				instance.setIdentifier((String) allRadioButton.getData());
			else if (notExistsRadioButton.getSelection())
				instance.setIdentifier((String) notExistsRadioButton.getData());
		}
		else 
		{
		instance.setIdentifier(null);
		}
		//---
		instance.setNotes(notesText.getText());
		instance.setInstanceName(text.getText());
		
	}

	public void setVCInstance(VCInstance instance) {
		this.instance = instance;
	}
}
