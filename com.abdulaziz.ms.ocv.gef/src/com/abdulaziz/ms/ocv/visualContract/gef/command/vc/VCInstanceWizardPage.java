package com.abdulaziz.ms.ocv.visualContract.gef.command.vc;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;

import com.abdulaziz.ms.OCV.UMLVariable;
import com.abdulaziz.ms.OCV.VCInstance;
import com.abdulaziz.ms.OCV.VCInstanceField;
import com.abdulaziz.ms.OCV.VOperation;
import com.abdulaziz.ms.ocv.visualContract.gef.util.VContractUtility;

import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.List;

public class VCInstanceWizardPage extends WizardPage {

	private VCInstance instance;
	private Text instanceNametext;
	private Button newRadioButton;
	private Button datastoreRadioButton;
	private Group dataStoreIdentifierGroup;
	private Button uniqueRadioButton;
	private Button allRadioButton;
	private Button notExistsRadioButton;
	private Text notesText;
	private Button parameterRadioButton;
	private Group parameterGroup;
	private List list;
	private Button collectionCheckButton;
	private Button deletedInstanceCheckButton;
	
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
		
		instanceNametext = new Text(container, SWT.BORDER);
		instanceNametext.setBounds(102, 28, 147, 21);
		instanceNametext.setText(instance.getInstanceName());
		
		newRadioButton = new Button(container, SWT.RADIO);
		newRadioButton.setBounds(102, 60, 58, 16);
		newRadioButton.setText(VContractUtility.VCINSTANCE_NEW);
		InnerRadioSelectionListener listener = new InnerRadioSelectionListener();
		newRadioButton.addSelectionListener( listener);
			
		Button currentRadioButton = new Button(container, SWT.RADIO);
		currentRadioButton.setBounds(102, 80, 66, 16);
		currentRadioButton.setText(VContractUtility.VCINSTANCE_EXISTING);
		currentRadioButton.addSelectionListener( listener);

		datastoreRadioButton = new Button(container, SWT.RADIO);
		datastoreRadioButton.setBounds(102, 100, 90, 16);
		datastoreRadioButton.setText(VContractUtility.VCINSTANCE_RETRIEVED);
		
		notesText = new Text(container, SWT.BORDER | SWT.V_SCROLL | SWT.MULTI);
		notesText.setBounds(57, 256, 419, 42);
		
		Label lblNotes = new Label(container, SWT.NONE);
		lblNotes.setBounds(10, 259, 43, 15);
		lblNotes.setText("Notes:");
		
		parameterRadioButton = new Button(container, SWT.RADIO);
		parameterRadioButton.setBounds(102, 122, 90, 16);
		parameterRadioButton.setText(VContractUtility.VCINSTANCE_PARAMETER);
		parameterRadioButton.addSelectionListener(listener);
		EObject vOperationEContainer = instance.eContainer();
		parameterRadioButton.setEnabled(false);
		
		parameterGroup = new Group(container, SWT.NONE);
		parameterGroup.setBounds(161, 144, 487, 100);
		parameterGroup.setVisible(false);
		parameterGroup.setText("Available parameters: ");
		
		collectionCheckButton = new Button(container, SWT.CHECK);
		collectionCheckButton.setBounds(10, 154, 93, 16);
		collectionCheckButton.setText("Collection");
		collectionCheckButton.setSelection(instance.isCollection());
		
		deletedInstanceCheckButton = new Button(container, SWT.CHECK);
		deletedInstanceCheckButton.setBounds(10, 178, 130, 16);
		deletedInstanceCheckButton.setText("Delete Instance ");
		deletedInstanceCheckButton.setSelection(instance.isDeleted());
		
		dataStoreIdentifierGroup = new Group(container, SWT.NONE);
		dataStoreIdentifierGroup.setBounds(135, 144, 302, 100);
		dataStoreIdentifierGroup.setText("Data Store Identifier");
		
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

		list = new List(dataStoreIdentifierGroup, SWT.BORDER);
		list.setBounds(165, 19, 224, 70);
		
		Button temporaryRadioButton = new Button(container, SWT.RADIO);
		temporaryRadioButton.setBounds(174, 60, 90, 16);
		temporaryRadioButton.setText("temporary");
		temporaryRadioButton.setData(VContractUtility.VCINSTANCE_TEMPORARY);
		temporaryRadioButton.addSelectionListener( listener);

		

		if(instance.getType().equals(VContractUtility.VCINSTANCE_PARAMETER))
		{
			parameterRadioButton.setSelection(true);
			instanceNametext.setEnabled(false);
			parameterGroup.setVisible(true);

		}
		
		while (!(vOperationEContainer instanceof VOperation) && vOperationEContainer !=null )
		{
			vOperationEContainer  = vOperationEContainer.eContainer();
			
		}
		if 
		(((VOperation)vOperationEContainer).getOperationParameters().size() > 0)
		{
			for (Iterator<UMLVariable> iterator = ((VOperation)vOperationEContainer).getOperationParameters().iterator(); iterator.hasNext();) {
				String instanceRefClassName = instance.getUmlClass().getClassName();
				UMLVariable umlVariable = iterator.next();
				 if(umlVariable.getVariableType().equalsIgnoreCase(instanceRefClassName))
				 {					 
					 parameterRadioButton.setEnabled(true);
					 list.add(umlVariable.getVariableName());
				 }
				 if(instance.getName() != null)
				 {
					 String[] items = {instance.getName()};
					list.setSelection(items );
				 }
				
			}
		}
		
		datastoreRadioButton.addSelectionListener( listener);
		if(instance.getType().equals(VContractUtility.VCINSTANCE_NEW))
			newRadioButton.setSelection(true);
		if(instance.getType().equals(VContractUtility.VCINSTANCE_EXISTING))
			currentRadioButton.setSelection(true);
		if(instance.getType().equals(VContractUtility.VCINSTANCE_TEMPORARY))
		temporaryRadioButton.setSelection(true);
		if(instance.getType().equals(VContractUtility.VCINSTANCE_RETRIEVED))
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
			
			instanceNametext.setEnabled(true);
			parameterGroup.setVisible(false);			
			dataStoreIdentifierGroup.setVisible(false);	



		instance.setType(((Button)e.getSource()).getText());
			
		if(((Button)e.getSource()).equals(datastoreRadioButton)){
			dataStoreIdentifierGroup.setVisible(true);
		}
		
		
		if(((Button)e.getSource()).equals(parameterRadioButton)){
		
				parameterGroup.setVisible(true);
				instanceNametext.setEnabled(false);
				
		
		}
		
		
		}
		
		
		

		@Override
		public void widgetDefaultSelected(SelectionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	public void updateModel()
	{
	
		instance.setCollection(collectionCheckButton.getSelection());
		instance.setDeleted(deletedInstanceCheckButton.getSelection());
		
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
		
		if (parameterRadioButton.getSelection())
		{
			if(list.getSelection().length >0)
			instanceNametext.setText(list.getSelection()[0]);
		}
		
		//---
		instance.setNotes(notesText.getText());
		instance.setInstanceName(instanceNametext.getText());
		
	}

	public void setVCInstance(VCInstance instance) {
		this.instance = instance;
	}
}
