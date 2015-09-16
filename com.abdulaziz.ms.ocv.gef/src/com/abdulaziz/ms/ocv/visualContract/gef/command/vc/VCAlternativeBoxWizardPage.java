package com.abdulaziz.ms.ocv.visualContract.gef.command.vc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
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
import com.abdulaziz.ms.OCV.VContractCollectionBox;
import com.abdulaziz.ms.ocv.multiPageEditor.MyMultiPageEditorActionBarContributor;

import org.eclipse.swt.widgets.Tree;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.events.SelectionAdapter;

public class VCAlternativeBoxWizardPage extends WizardPage {
	
	private String conditionStatement;	private String meaningOfConditionStatement;
	private VCEntity selectedVCEntity;
	private VCAlternativeBox vcAlternativeBox;
	private Text valueText;
	private ConditionOption selectedConditionOption;
	private HashMap<String, VCEntity> compoHashMap;
	private HashMap<Button, EqaulityProperties> buttonEqaulityPropertiesHashMap;

	private static class TreeContentProvider implements ITreeContentProvider {
		Object input;

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			input = newInput;
		}

		public void dispose() {
		}

		public Object[] getElements(Object inputElement) {

			return getChildren(inputElement);

		}

		public Object[] getChildren(Object parentElement) {

			return ((VCAlternativeBox) parentElement).getConditinOptions().toArray();
		}

		public Object getParent(Object element) {
			if (element instanceof ConditionOption)
			return ((ConditionOption) element).getVcAlternativeBox();
			else 
				return element;
		}

		public boolean hasChildren(Object element) {

			if (element instanceof VCAlternativeBox) {
				return ((VCAlternativeBox) element).getConditinOptions().size() > 0;
			}

			return false;
		}
	}


	private SelectionListener listener = new SelectionListener() {

		@Override
		public void widgetSelected(SelectionEvent e) {
			Button button = (Button)e.getSource();
			conditionStatement = buttonEqaulityPropertiesHashMap.get(button).displayedText;
			meaningOfConditionStatement = buttonEqaulityPropertiesHashMap.get(button).getMeaning();

		}

		@Override
		public void widgetDefaultSelected(SelectionEvent e) {
			// TODO Auto-generated method stub

		}
	};
	private Combo inputVCEntityCombo;

	protected VCAlternativeBoxWizardPage(String pageName) {
		super(pageName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		setControl(container);
		inputVCEntityCombo = new Combo(container, SWT.NONE);
		compoHashMap = new HashMap<>();
		inputVCEntityCombo.setBounds(224, 34, 155, 23);
		ListIterator<VCLink> iterator = vcAlternativeBox.getIncomingLinks()
				.listIterator();
		while (iterator.hasNext()) {
			VCEntity sourceEntity = iterator.next().getSource();
			inputVCEntityCombo.add(sourceEntity.getName());
			compoHashMap.put(sourceEntity.getName(), sourceEntity);
		}

		buttonEqaulityPropertiesHashMap = new HashMap<>();
		container.setLayout(null);

		Button btnEqual = new Button(container, SWT.RADIO);
		btnEqual.setBounds(398, 38, 95, 16);
		btnEqual.setText("=  Equal");
		buttonEqaulityPropertiesHashMap.put(btnEqual, new EqaulityProperties(EqaulityProperties.EQUAL_MEANING,EqaulityProperties.EQUAL_DISPLAY, btnEqual));
		btnEqual.addSelectionListener(listener);

		Button btnGTThan = new Button(container, SWT.RADIO);
		btnGTThan.setBounds(398, 60, 126, 16);
		btnGTThan.setText("> Greater than");
		buttonEqaulityPropertiesHashMap.put(btnGTThan, new EqaulityProperties(
				"greater than", ">", btnGTThan));
		btnGTThan.addSelectionListener(listener);

		Button btnLessThan = new Button(container, SWT.RADIO);
		btnLessThan.setBounds(398, 82, 126, 16);
		btnLessThan.setText("< Less than");
		buttonEqaulityPropertiesHashMap.put(btnLessThan, new EqaulityProperties("less than", "<", btnLessThan));
		btnLessThan.addSelectionListener(listener);

		Button btnNotEqual = new Button(container, SWT.RADIO);
		btnNotEqual.setBounds(398, 104, 126, 16);
		btnNotEqual.setText("<> Not equal");
		buttonEqaulityPropertiesHashMap.put(btnNotEqual,
				new EqaulityProperties("Not equal", "<>", btnNotEqual));
		btnNotEqual.addSelectionListener(listener);

		final TreeViewer alterOprtionsTreeViewer = new TreeViewer(container,
				SWT.BORDER);
		Tree tree = alterOprtionsTreeViewer.getTree();
		tree.setBounds(6, 31, 212, 205);
		tree.setHeaderVisible(true);
		tree.setLinesVisible(true);
		TreeColumn columnName = new TreeColumn(tree, SWT.NONE);
		columnName.setWidth(208);
		columnName.setText("Conditon Options");
		alterOprtionsTreeViewer	.addSelectionChangedListener(new ISelectionChangedListener() {

					@Override
					public void selectionChanged(SelectionChangedEvent event) {

						IStructuredSelection selection = (IStructuredSelection) alterOprtionsTreeViewer.getSelection();
						if (!selection.isEmpty()) {
							TreeItem item = alterOprtionsTreeViewer.getTree()
									.getSelection()[0];
							Object selectedObject = item.getData();
							if (selectedObject instanceof ConditionOption) {
								selectedConditionOption = (ConditionOption) selectedObject;
								if( selectedConditionOption.getConditionValue() !=null )
								{
									inputVCEntityCombo.select(inputVCEntityCombo.indexOf(selectedConditionOption.getVcEntityReference().getName()));
									valueText.setText(selectedConditionOption.getConditionValue());
									
									for (EqaulityProperties element : buttonEqaulityPropertiesHashMap.values()) {
										element.getButton().setSelection(false);
										if (element.displayedText.trim().equals(selectedConditionOption.getDisplayedConditionStatement().trim()))
										{
											element.getButton().setSelection(true);
										}
									}
								}
								else 
								{
									
									valueText.setText("");
								}
								
								
								
							}
						}
						


					}
				});

		Menu menu = new Menu(tree);
		tree.setMenu(menu);
		// Delete -----------------------------------------------------------------------------------------------------------------------

		MenuItem deleteOption = new MenuItem(menu, SWT.NONE);
		deleteOption.setText("Delete selected option");
		deleteOption.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(! vcAlternativeBox.getConditinOptions().contains(selectedConditionOption))
					return;
				vcAlternativeBox.getConditinOptions().remove(selectedConditionOption);
				selectedConditionOption.setVcAlternativeBox(null);
				selectedConditionOption = null;
				alterOprtionsTreeViewer.refresh();

				
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});

		// add -----------------------------------------------------------------------------------------------------------------------
		MenuItem addOption = new MenuItem(menu, SWT.NONE);
		addOption.setText("add new option");
		addOption.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//

				// create new inner alternative option
				ConditionOption conditionOption = OCVFactory.eINSTANCE.createConditionOption();
				conditionOption.setName("new alterative option"+(vcAlternativeBox.getConditinOptions().size()+1));
				// create Contract alternative box layer for the inner option

				VContractAlternativeBox rootVContractAlternativeBox = OCVFactory.eINSTANCE.createVContractAlternativeBox();
				
				conditionOption.setVcContractAlternativeBox(rootVContractAlternativeBox);
				
				rootVContractAlternativeBox.setConditionOption(conditionOption);

				// display the new all condition options inside alternative box
				ListIterator<ConditionOption> i2 = vcAlternativeBox.getConditinOptions().listIterator();
				
				Object[] array = vcAlternativeBox.getConditinOptions().toArray();
				Rectangle r;
				if (i2.hasNext()) {
					ConditionOption con = (ConditionOption) array[array.length - 1];
					r = con.getVcContractAlternativeBox().getConstaint().getCopy();
					r.setY(r.getBottom().y + 1);
					rootVContractAlternativeBox.setConstaint(r);
				}else 
				{
					r= new Rectangle(0,20,vcAlternativeBox.getConstraints().width-10,vcAlternativeBox.getConstraints().height/2);
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

		alterOprtionsTreeViewer.setColumnProperties(new String[] { "col1" });
		alterOprtionsTreeViewer
				.setCellEditors(new CellEditor[] { new TextCellEditor(
						alterOprtionsTreeViewer.getTree()) });
		alterOprtionsTreeViewer.setCellModifier(new ICellModifier() {

			@Override
			public void modify(Object element, String property, Object value) {
				if (element instanceof TreeItem) {
					TreeItem treeItem = (TreeItem) element;

					if (treeItem.getData() instanceof ConditionOption) {
						ConditionOption selectedCondition = (ConditionOption) treeItem
								.getData();

						treeItem.setText((String) value);
						//selectedCondition.setName((String) value);

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

		valueText = new Text(container, SWT.BORDER);
		valueText.setBounds(500, 37, 116, 21);

		// save modification
		// TODO
		Button btnSaveModification = new Button(container, SWT.NONE);
		btnSaveModification.addSelectionListener(new SelectionAdapter() {
		


			@Override
			public void widgetSelected(SelectionEvent e) {

				
				selectedVCEntity = compoHashMap.get(inputVCEntityCombo.getItem(inputVCEntityCombo.getSelectionIndex()));

				selectedConditionOption.setConditionValue(valueText.getText());
				selectedConditionOption.setDisplayedConditionStatement(conditionStatement);
				selectedConditionOption.setMeaningOfConditionStatement(meaningOfConditionStatement);
				selectedConditionOption.setVcEntityReference(selectedVCEntity);
				
				selectedConditionOption.setName(selectedVCEntity.getName() +" "+ conditionStatement + valueText.getText());

			}
		});
		btnSaveModification.setBounds(235, 167, 106, 25);
		btnSaveModification.setText("save modification");

	}

	public void setVCAlternativeBox(VCAlternativeBox vcAlternativeBox) {
		this.vcAlternativeBox = vcAlternativeBox;

	}

	public void updateModel() {

	}
}
