package com.abdulaziz.ms.view.wizard;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Text;

import com.abdulaziz.ms.OCV.UMLVariable;
import com.abdulaziz.ms.OCV.VCInstance;

public class AttributeWizard extends Wizard {

	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		return false;
	}
    /*
	private VCInstance source;
	private AttributeWizardPage page;
	private VCAttribute vcAttribute;
	private EList<UMLVariable> operationParameters; 

	public AttributeWizard(VCAttribute vcAttribute, VCInstance sourceVCInstance, EList<UMLVariable> operationParameters) {
		source = sourceVCInstance;
		this.operationParameters=operationParameters;
		this.vcAttribute = vcAttribute;
	}
    public void addPages() {
    	
    	 page = new AttributeWizardPage(source, operationParameters);
    	
             addPage(page);
             
    }
    
    public boolean performFinish() {
    	
    	vcAttribute.setSourceUMLVariable(page.getSelectedSourceUMLVariable());
    	
    	if(page.valueSelection())
    	{
    		vcAttribute.setValueTargetSelection(true);
    		vcAttribute.setTargetObject(page.getSelectedText());
    	}
    	else 
    	{
    		vcAttribute.setValueTargetSelection(false);
    		vcAttribute.setTargetObject(page.getSelectedTargetUMLVariable());
    		
    	}
    	
    	
             return true;
    }
    */
}