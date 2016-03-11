package com.abdulaziz.ms.ocv.visualContract.gef.command;

import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import com.abdulaziz.ms.OCV.VContractCondition;
import com.abdulaziz.ms.OCV.VContractPostcondition;
import com.abdulaziz.ms.OCV.VContractPrecondition;
import com.abdulaziz.ms.ocv.visualContract.gef.util.TextualTransfomratiomHandler;
import com.abdulaziz.ms.ocv.visualContract.gef.util.VCPreconditionPostconditionInterpertation;

public class VCOperationReportPage extends WizardPage {
	
	private VContractPostcondition vPostCondition;
	private VContractPrecondition vPreCondition;
	private StyledText text;
	
	protected VCOperationReportPage(String pageName) {
		super(pageName);
		setTitle("Operation Contract Generation");
		setDescription("Press 'Generate' button to generate operation contracts in the format of Larman's Operation Contract");
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		setControl(container);
	
		text = new StyledText(container, SWT.BORDER | SWT.WRAP | SWT.V_SCROLL | SWT.MULTI);
		text.setBounds(10, 38, 552, 202);	
		
	
		
		
		
		Button btnGenerate = new Button(container, SWT.NONE);
		btnGenerate.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				/*
				 Operation: enterItem(itemID : ItemID, quantity : integer)
				 */
				VCPreconditionPostconditionInterpertation wrapper = new VCPreconditionPostconditionInterpertation(vPreCondition,vPostCondition);	
				String newLineSeperator ="\r\n";
				String operationContractReportText = "Precondition : " +newLineSeperator;
				int number = 1;
				for (String preconditionStringLine : wrapper
						.getPerConditionTextualInterpretation()) {

					operationContractReportText = operationContractReportText +number + ") "+preconditionStringLine+"." + newLineSeperator;
					number++;

				}
				text.setText(operationContractReportText);
				int postconditionLineIndex = text.getLineCount();
				operationContractReportText = operationContractReportText+"Postcondition :" + newLineSeperator;
			

				number=1; //reset number to 1 .
				for (String postConditionStringLine : wrapper
						.getPostConditionTextualInterpretation()) {

					operationContractReportText = operationContractReportText+number + ") " + postConditionStringLine +"." + newLineSeperator;
					number++;
				}
				
				TextualTransfomratiomHandler preconditonTextOperationContract = new TextualTransfomratiomHandler(vPreCondition);
				TextualTransfomratiomHandler postconditionTextOperationContract = new TextualTransfomratiomHandler(vPostCondition);

				ArrayList<String> pre = preconditonTextOperationContract.getInterpertation();
				ArrayList<String> post = postconditionTextOperationContract.getInterpertation();

				operationContractReportText += newLineSeperator+" **** UPDATED **** "+newLineSeperator+"Preconditon"+newLineSeperator 
						;
				
				for(String line :pre)
				{
					operationContractReportText += line +newLineSeperator; 
				}
				operationContractReportText += newLineSeperator+"Postconditon"+newLineSeperator;

				for(String line :post)
				{
					operationContractReportText += line +newLineSeperator; 
				}
				text.setText(operationContractReportText);
				/*
				text.setLineAlignment(0, text.getLineCount() -1, SWT.CENTER);
				text.setLineAlignment(0, 1, SWT.LEFT);
				text.setLineAlignment(postconditionLineIndex-1, 1, SWT.LEFT);
				*/
				text.setLineSpacing(2);


			

			}
			
		});
		btnGenerate.setBounds(420, 256, 113, 25);
		btnGenerate.setText("Generate Report");
		
		Label lblNewLabel = new Label(container, SWT.NONE);
		lblNewLabel.setBounds(10, 10, 166, 15);
		lblNewLabel.setText("Operation Contract Report: ");
		

		

	}

	public void setVCPrCondition(VContractPrecondition vPreCondition) {
this.vPreCondition = vPreCondition;		
	}

	public void setVCPostConition(VContractPostcondition vPostCondition) {
this.vPostCondition = vPostCondition;		
	}

	
	

	
}
