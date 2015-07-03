package com.abdulaziz.ms.view.wizard;

import java.util.HashMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import com.abdulaziz.ms.OCV.UMLVariable;
import com.abdulaziz.ms.OCV.VCInstance;

public class AttributeWizardPage extends WizardPage {
	private Text valueText;
	private VCInstance source;
	private Button valueRadioButton;
	private Button instanceAttributeRadioButton;
	private Combo newAttributeComboBox;
	private Combo attributeComboBox;
	private Combo newInstanceComboBox ;
	private UMLVariable selectedUMLVariable;
	private String selectedText;
	private HashMap<String, UMLVariable> sourceUMLVariableHashMap;
	private HashMap<String,UMLVariable> targetUMLVariableHashMap;
	private EList<UMLVariable> operationParameters;
	
	
	/**
	 * Create the wizard.
	 */
	public AttributeWizardPage(VCInstance sourceVCInstance, EList<UMLVariable> operationParameters) {
		super("wizardPage");
		setTitle("Modify Attribute Wizard");
		setDescription("To update an attribute of an instance variable");
		source = sourceVCInstance;
		this.operationParameters = operationParameters;
	}

	/**
	 * Create contents of the wizard.
	 * @param parent
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		setControl(container);
		
		valueRadioButton = new Button(container, SWT.RADIO);
		instanceAttributeRadioButton = new Button(container, SWT.RADIO);
		newAttributeComboBox = new Combo(container, SWT.NONE);
		newInstanceComboBox  = new Combo(container, SWT.NONE);
		attributeComboBox = new Combo(container, SWT.NONE);
		sourceUMLVariableHashMap =  new HashMap<>();
		targetUMLVariableHashMap = new HashMap<>();
		addLabelComposite(container);
		setTargetCombo(container);
		setValueRadioButton();
		setSourceCombo(container);
		
	
	}

	private void setValueRadioButton() {
		
		
		valueRadioButton.setSelection(true);
		valueRadioButton.setBounds(35, 80, 90, 16);
		valueRadioButton.setText("value");
		valueRadioButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				valueText.setEnabled(true);
				newInstanceComboBox.setEnabled(false);
				newAttributeComboBox.setEnabled(false);
				
			}
		});
		
	}

	private void setSourceCombo(Composite container) {
		
		Combo instanceComboBox = new Combo(container, SWT.NONE);
		instanceComboBox.setBounds(71, 40, 146, 23);
		instanceComboBox.add(source.getName());

		for (UMLVariable umlVariable : source.getUmlClass().getClassAttributes()) {
			sourceUMLVariableHashMap.put(umlVariable.getVariableName(),
					umlVariable);
			attributeComboBox.add(umlVariable.getVariableName());
		}
		attributeComboBox.setBounds(223, 40, 146, 23);
		
		
	}

	private void addLabelComposite(Composite container) {
		
		Label subTitlelabel = new Label(container, SWT.NONE);
		subTitlelabel.setBounds(10, 10, 342, 15);
		subTitlelabel.setText("Select the instance variable and its attribute that to be updated:");
		Label label = new Label(container, SWT.NONE);
		label.setBounds(375, 43, 8, 15);
		label.setText("=");
		
		valueText = new Text(container, SWT.BORDER);
		valueText.setBounds(393, 40, 146, 23);
		
	

		
	}

	private void setTargetCombo(Composite container) {
		
		newInstanceComboBox.setBounds(71, 153, 146, 23);
		for(UMLVariable m:operationParameters)
		{
			newInstanceComboBox.add(m.getVariableName());	

			
		}
		newAttributeComboBox.setBounds(223, 153, 146, 23);
		newAttributeComboBox.setEnabled(false);
		newInstanceComboBox.setEnabled(false);
		
		instanceAttributeRadioButton.setBounds(35, 112, 90, 16);
		instanceAttributeRadioButton.setText("attribute ");
		instanceAttributeRadioButton.setSelection(false);
		instanceAttributeRadioButton
				.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {

						valueText.setEnabled(false);
						newInstanceComboBox.setEnabled(true);
						newAttributeComboBox.setEnabled(true);

					}
				});
		
		
		for(UMLVariable m:operationParameters)
		{
			targetUMLVariableHashMap.put( m.getVariableName(),m);
			newAttributeComboBox.add(m.getVariableType());

			
		}
		
	}

	protected boolean valueSelection() {
		if (valueRadioButton.getSelection()) {
			selectedText = valueText.getText();
			return true;
		} else if (instanceAttributeRadioButton.getSelection()) {

			selectedUMLVariable = targetUMLVariableHashMap.get(newAttributeComboBox.getText());

		}
		return false;

	}

	public UMLVariable getSelectedTargetUMLVariable() {
		return selectedUMLVariable;
	}

	public String getSelectedText() {
		return selectedText;
	}

	public UMLVariable getSelectedSourceUMLVariable() {
		return sourceUMLVariableHashMap.get(attributeComboBox.getText());
	}
}
