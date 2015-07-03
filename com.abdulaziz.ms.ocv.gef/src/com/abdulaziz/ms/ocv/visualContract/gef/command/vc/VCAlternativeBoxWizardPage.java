package com.abdulaziz.ms.ocv.visualContract.gef.command.vc;

import java.util.ListIterator;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;

import com.abdulaziz.ms.OCV.ConditionOption;
import com.abdulaziz.ms.OCV.OCVFactory;
import com.abdulaziz.ms.OCV.VCAlternativeBox;
import com.abdulaziz.ms.OCV.VCEntity;
import com.abdulaziz.ms.OCV.VCInstance;
import com.abdulaziz.ms.OCV.VCInstanceField;
import com.abdulaziz.ms.OCV.VCLink;
import com.abdulaziz.ms.OCV.VCParameter;
import com.abdulaziz.ms.OCV.VContractAlternativeBox;

import org.eclipse.swt.widgets.Tree;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

public class VCAlternativeBoxWizardPage extends WizardPage {
	
	
	
	private static class TreeContentProvider implements ITreeContentProvider {
		Object input ;
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			input = newInput;
		}
		public void dispose() {
		}
		
		public Object[] getElements(Object inputElement) {
			return getChildren(inputElement);
		}
		public Object[] getChildren(Object parentElement) {
		
			return ((VCAlternativeBox)parentElement).getConditinOptions().toArray();
		}
		public Object getParent(Object element) {
			return ((VCAlternativeBox)input).getClass().toString();
		}
		public boolean hasChildren(Object element) {
			
			if(element instanceof VCAlternativeBox)
			{
				return ((VCAlternativeBox)element).getConditinOptions().size()>0;
			}
			
			return false;
		}
	}

	private VCAlternativeBox vcAlternativeBox;

	protected VCAlternativeBoxWizardPage(String pageName) {
		super(pageName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		setControl(container);
		
		final TreeViewer alterOprtionsTreeViewer = new TreeViewer(container, SWT.BORDER);
		Tree tree = alterOprtionsTreeViewer.getTree();
		tree.setBounds(10, 46, 284, 205);
		tree.setHeaderVisible(true);
		tree.setLinesVisible(true);
		tree.setBounds(10, 30, 212, 205);
		final TreeColumn columnName = new TreeColumn(tree, SWT.NONE);
		columnName.setWidth(208);
		columnName.setText("Conditon Options");
		
		Menu menu = new Menu(tree);
		tree.setMenu(menu);
		
		MenuItem addOption = new MenuItem(menu, SWT.NONE);
		addOption.setText("add ");
		addOption.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				// add new operation 
				ConditionOption conditionOption = OCVFactory.eINSTANCE.createConditionOption();
				ListIterator<VCLink> i = vcAlternativeBox.getIncomingLinks().listIterator();
				if(i.hasNext())
				{
				VCEntity sourceVCEntity = i.next().getSource();
				String sourceCondtiOnption = sourceVCEntity.getName();
				if (sourceVCEntity instanceof VCInstance)
				{
					sourceCondtiOnption = ((VCInstance) sourceVCEntity).getInstanceName();
				}
				else if  (sourceVCEntity instanceof VCInstanceField)
				{
					sourceCondtiOnption = ((VCInstanceField) sourceVCEntity).getUmlClassField().getVariableName();
				} else if (sourceVCEntity instanceof VCParameter)
					{
						sourceCondtiOnption = ((VCParameter) sourceVCEntity).getOperationParameter().getVariableName();
					}
				
				
				conditionOption.setName(sourceCondtiOnption);

				}
				else 
				{
				conditionOption.setName("--");
				}
				VContractAlternativeBox rootVContractAlternativeBox = OCVFactory.eINSTANCE.createVContractAlternativeBox();
				conditionOption.setVcContractAlternativeBox(rootVContractAlternativeBox);
				rootVContractAlternativeBox.setConditionOption(conditionOption);
				ListIterator<ConditionOption> i2 = vcAlternativeBox.getConditinOptions().listIterator();
				Object[] array = vcAlternativeBox.getConditinOptions().toArray();
			
				Rectangle r;
				if(i2.hasNext())
				{
					ConditionOption con = (ConditionOption)array[array.length-1];
					r = con.getVcContractAlternativeBox().getConstaint();
					//r = i2.next().getVcContractAlternativeBox().getConstaint();
					r = r.getCopy();
					r.setY(r.getBottom().y +1);
					
					rootVContractAlternativeBox.setConstaint(r);
				}
				
				
				vcAlternativeBox.getConditinOptions().add(conditionOption);
				conditionOption.setVcAlternativeBox(vcAlternativeBox);
				alterOprtionsTreeViewer.refresh();
				
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		alterOprtionsTreeViewer.setContentProvider(new TreeContentProvider());
		alterOprtionsTreeViewer.setInput(vcAlternativeBox);
		
		
		 alterOprtionsTreeViewer.setColumnProperties(new String[]{"col1"});
		 alterOprtionsTreeViewer.setCellEditors(new CellEditor[]{new TextCellEditor(alterOprtionsTreeViewer.getTree())});
		 alterOprtionsTreeViewer.setCellModifier(new ICellModifier() {

		     @Override
		     public void modify(Object element, String property, Object value) {
		         if (element instanceof TreeItem )
		         {
		             TreeItem treeItem = (TreeItem)element;
		             
		             if (treeItem.getData() instanceof String)
		             {
			             String data = (String)treeItem.getData();
		             if (vcAlternativeBox.getConditinOptions().contains(data))
		             {
		  /*
		            	 treeItem.setText((String)value);
		            	 vcAlternativeBox.getOptions().set( vcAlternativeBox.getOptions().indexOf(data), (String) value);
		            	 */
		            	 
		             }
		             
		              
		          
		             
		     		
		     	
		             
		             
		        
		             }
		
		         }
		     }

		     @Override
		     public Object getValue(Object element, String property) {
		            return element.toString();
		     	
		      

		     }

		     @Override
		     public boolean canModify(Object element, String property) {
		         return true;
		     }
		 });
		
	}

	public void setVCAlternativeBox(VCAlternativeBox vcAlternativeBox) {
		this.vcAlternativeBox = vcAlternativeBox;
		
	}

	public void updateModel() {
		
		
	}
}
