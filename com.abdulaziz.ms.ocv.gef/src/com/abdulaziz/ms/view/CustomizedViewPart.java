package com.abdulaziz.ms.view;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import com.abdulaziz.ms.OCV.OCVFactory;
import com.abdulaziz.ms.OCV.UMLClass;
import com.abdulaziz.ms.OCV.UMLClassDiagram;
import com.abdulaziz.ms.OCV.UMLVariable;
import com.abdulaziz.ms.OCV.VCContract;
import com.abdulaziz.ms.OCV.VOperation;
import com.abdulaziz.ms.OCV.VCContract;
import com.abdulaziz.ms.OCV.VSystemOperationDiagram;
import com.abdulaziz.ms.OCV.impl.OCVFactoryImpl;
import com.abdulaziz.ms.ocv.multiPageEditor.OCVMutiPageEditor;
import com.abdulaziz.ms.ocv.systemOperation.gef.editor.part.VSystemOperationEditPart;
import com.abdulaziz.ms.ocv.uml.gef.editor.part.OCVClassEditPart;
import com.abdulaziz.ms.ocv.uml.ms.model.UMLVaraibleEditColumn;
import com.abdulaziz.ms.ocv.uml.ms.model.UMLVariableContentProvider;
import com.abdulaziz.ms.ocv.uml.ms.model.UMLVariableTableLabelProvider;

import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.jface.viewers.TreeViewer;

public class CustomizedViewPart extends ViewPart implements ISelectionListener {
	private Label lable;
	private Button updateButton;
	private UMLClass selectedUMLClass;
	private TreeViewer treeViewer;
	private OCVMutiPageEditor editor;
	private Table table;
	private TableViewer umlAttributesTableViewer;
	private Label attributesLabel;
	//private TableViewer systemOperationTableViewer;
	private UMLClassDiagram classDiagram;
	

	public CustomizedViewPart() {
	}

	

	@Override
	public void createPartControl(Composite parent) {

		TabFolder tabFolder = new TabFolder(parent, SWT.BORDER);

		TabItem classTab = new TabItem(tabFolder, SWT.NULL);
		classTab.setText("Class Tab ");
		// ----------
		TabItem attributeTabItem = new TabItem(tabFolder, SWT.NONE);
		attributeTabItem.setText("Attributes");

		Composite composite = new Composite(tabFolder, SWT.NONE);
		attributeTabItem.setControl(composite);

		 umlAttributesTableViewer = new TableViewer(composite, SWT.BORDER
				| SWT.FULL_SELECTION |  SWT.H_SCROLL
			      | SWT.V_SCROLL
			      );
		table = umlAttributesTableViewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		table.setBounds(10, 36, 264, 158);

		
	
		TableViewerColumn tableViewerColumn = new TableViewerColumn(
				umlAttributesTableViewer, SWT.LEFT);
		TableColumn variableNameColumn = tableViewerColumn.getColumn();
		variableNameColumn.setWidth(130);
		variableNameColumn.setText("Variable Name");
		tableViewerColumn.setEditingSupport(new UMLVaraibleEditColumn(umlAttributesTableViewer,"VariableName"));


		TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(
				umlAttributesTableViewer, SWT.LEFT);
		TableColumn variableTypeColumn = tableViewerColumn_1.getColumn();
		variableTypeColumn.setWidth(130);
		variableTypeColumn.setText("Variable Type");
		tableViewerColumn_1.setEditingSupport(new UMLVaraibleEditColumn(umlAttributesTableViewer,"VariableType"));

		umlAttributesTableViewer.setContentProvider(new UMLVariableContentProvider());
		umlAttributesTableViewer.setLabelProvider(new UMLVariableTableLabelProvider());
	

		attributesLabel = new Label(composite, SWT.NONE);
		attributesLabel.setBounds(10, 10, 130, 25);
		attributesLabel.setText("Attributes of ");
		

		// ----



		/// ^^^^####################################### Attribute Menu ##############################################
		
		Menu attributeTableMenu = new Menu(parent);
		MenuItem addAttributeMenuItem = new MenuItem(attributeTableMenu, SWT.PUSH);
		addAttributeMenuItem.setText("Add new attribute");
		addAttributeMenuItem.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (selectedUMLClass != null) {
					UMLVariable umlVariable = OCVFactory.eINSTANCE.createUMLVariable();
					umlVariable.setVariableName("Attribute"+(selectedUMLClass.getClassAttributes().size()+1));
					selectedUMLClass.getClassAttributes().add(umlVariable);
					umlAttributesTableViewer.setInput(selectedUMLClass);
					
				}
				
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			
			}
		});
		table.setMenu(attributeTableMenu);

		MenuItem deleteMenuItem = new MenuItem(attributeTableMenu, SWT.PUSH);		
		deleteMenuItem.setText("Delete");
		deleteMenuItem.addListener(SWT.Selection, new Listener() {
		      @Override
			public void handleEvent(Event event) {		        
				int[] indices = table.getSelectionIndices();
				for (int i : indices) {
					UMLVariable v = (UMLVariable) umlAttributesTableViewer
							.getElementAt(i);
					selectedUMLClass.getClassAttributes().remove(v);
				}
				table.remove(indices);

		      }
		    });
	
		
		
		
		/// ^^END^^#####################################################################################
		
		
		
		
		// --- operation tab
	
		TabItem operationTab = new TabItem(tabFolder, SWT.NULL);
		operationTab.setText("Operations ");

		Composite composite_1 = new Composite(tabFolder, SWT.V_SCROLL);
		operationTab.setControl(composite_1);

		treeViewer = new TreeViewer(composite_1, SWT.NONE);
		Tree tree = treeViewer.getTree();
		tree.setBounds(10, 36, 333, 144);

		/*
		treeViewer.setLabelProvider(new VCContraLabelProvider());

		treeViewer.setContentProvider(new ());
		*/
		// -END- operation tab

		TabItem operationContractTab = new TabItem(tabFolder, SWT.NULL);
		operationContractTab.setText("Operation Contracts ");

		
		Group classTabGroup = new Group(tabFolder, SWT.NONE);
		classTabGroup.setLayout(null);

		lable = new Label(classTabGroup, SWT.NONE);
		lable.setBounds(10, 20, 126, 25);
		lable.setText("Hello");
		updateButton = new Button(classTabGroup, SWT.CENTER);
		updateButton.setBounds(10, 60, 115, 25);
		updateButton.setText("Add new VContract");

		Button updateButton2 = new Button(classTabGroup, SWT.CENTER);
		updateButton2.setBounds(10, 91, 115, 25);
		updateButton2.setText("Delete VContract");

		operationContractTab.setControl(classTabGroup);

		
		//------------------------------ Operation Menu   ------------------------------------------------------------------

	
		Menu systemOperationTableMenu = new Menu(parent);
		
		final MenuItem addOperationMenuItem = new MenuItem(systemOperationTableMenu, SWT.PUSH);
		addOperationMenuItem.setText("Add New Operation");
		addOperationMenuItem.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (classDiagram != null) {
					VOperation vOperation = OCVFactory.eINSTANCE.createVOperation();
					vOperation.setOperationName("operation"+(classDiagram.getSystemOperation().getClassOperations().size()+1));
					classDiagram.getSystemOperation().getClassOperations().add(vOperation);
					vOperation.setVSystem(classDiagram.getSystemOperation());

				//	systemOperationTableViewer.setInput(classDiagram.getSystemOperation());
					treeViewer.setInput(classDiagram.getSystemOperation());

				}
				
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			
				
			}
		});
		//systemOperationTableViewer.getTable().setMenu(systemOperationTableMenu);
		treeViewer.getControl().setMenu(systemOperationTableMenu);
// )))))))))))
		
		final MenuItem addOperationParameter = new MenuItem(systemOperationTableMenu, SWT.PUSH);
		addOperationParameter.setText("Add Operation Parameter");
		addOperationParameter.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				  IStructuredSelection selection = (IStructuredSelection) treeViewer.getSelection();
		          if (! selection.isEmpty()) {
		                           TreeItem item = treeViewer.getTree().getSelection()[0];
		                           Object selectedObject = item.getData();
		                           if (selectedObject instanceof VOperation)
		                           {
		                        	   UMLVariable newUMLParameter = OCVFactory.eINSTANCE.createUMLVariable();
		                        	   newUMLParameter.setVariableName("newParameter");
		                        	   newUMLParameter.setVariableType("Int");
		                           ((VOperation) selectedObject).getOperationParameters().add(newUMLParameter);
		                           }
			}
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			
				
			}
		});
		
		
		// )))))))))))))))))))))))
		
		
		final MenuItem deleteOperationMenuItem = new MenuItem(systemOperationTableMenu, SWT.PUSH);		
		deleteOperationMenuItem.setText("Delete Operation");
		deleteOperationMenuItem.addListener(SWT.Selection, new Listener() {
		      @Override
			public void handleEvent(Event event) {		    
		    	 
		    	  IStructuredSelection selection = (IStructuredSelection) treeViewer.getSelection();
		          if (selection.isEmpty()) {
		            return;
		          } else {
		                           TreeItem[] items = treeViewer.getTree().getSelection();
		                               for (TreeItem treeItem : items)
		                                         {
		                            		classDiagram.getSystemOperation().getClassOperations().remove(treeItem.getData());
		                                         }
		                                            treeViewer.refresh();
		                          }
		    	 

		      }
		    });
		
		final MenuItem addOperationContractMenuItem = new MenuItem(systemOperationTableMenu, SWT.PUSH);		
		addOperationContractMenuItem.setText("Add New Operation Contract");
		addOperationContractMenuItem.addListener(SWT.Selection, new Listener() {
		      @Override
			public void handleEvent(Event event) {		    
		    	 
		    	  IStructuredSelection selection = (IStructuredSelection) treeViewer.getSelection();
		          if (! selection.isEmpty()) {
		                           TreeItem item = treeViewer.getTree().getSelection()[0];
		                           Object selectedObject = item.getData();
		                           if (selectedObject instanceof VOperation)
		                           {
		                        	   if(((VOperation) selectedObject).getVcContract() == null) // does not already have VContract 
		                        	   {
		                        		   /*
		                        	   VCContract operationContract = OCVFactory.eINSTANCE.createVCContract();
		                       
		                        	   
		                        	   ((VOperation)selectedObject).setOperationContracts(operationContract);
		                        	   operationContract.setName(operationContract.getUmlOperation().getOperationName()+"Contract");
		                        	   operationContract.setUmlOperation((VOperation)selectedObject);
		                        	   treeViewer.refresh();
		                        
		                        	   
		                        	   updateMultiPageEditor();
		                        	    VCContract vcContract = OCVFactory.eINSTANCE.createVCContract();
		                        	    vcContract.setName(operationContract.getName());
		                        	    vcContract.setVCContract(operationContract);
		                        	   operationContract.setVcContract(vcContract);
		                        	   //TODO
		                        	  
		                        	   editor.createVContractPage(vcContract);*/
		                        	   }
		                        	   else
		              					 setStatusBarMessage("There is already an operation contract associated with "+(((VOperation) selectedObject).getOperationName()));

		                        	   
		                           }
		                           
		                             
		                                            
		                          }
		    	 

		      }
		    });
		
		final MenuItem deleteOperationContractMenuItem = new MenuItem(systemOperationTableMenu, SWT.PUSH);		
		deleteOperationContractMenuItem.setText("Delete Operation Contract");
		deleteOperationContractMenuItem.addListener(SWT.Selection, new Listener() {
		      @Override
			public void handleEvent(Event event) {		    
		    	 
		    	  IStructuredSelection selection = (IStructuredSelection) treeViewer.getSelection();
		          if (!selection.isEmpty()) {
		                           TreeItem item = treeViewer.getTree().getSelection()[0];
		                           Object selectedObject = item.getData();
		                           if (selectedObject instanceof VCContract)
		                           {
		                        	   
		                        		//  VSystemOperationDiagram vSystemDiagram = ((VCContract) selectedObject).getUmlOperation().getVSystem();
		                        	  ((VCContract) selectedObject).getUmlOperation().setVcContract(null);
		                        	   if (((VCContract) selectedObject) != null )
		                        	   editor.removePage(((VCContract) selectedObject).getPageIndex());
		                     
		                        	   treeViewer.refresh();
		                        	   deleteOperationContractMenuItem.setEnabled(false);
		                        	 
		                           }
		                           
		                                            
		                          }

		      }
		    });
		
		
		
		deleteOperationMenuItem.setEnabled(false);
		addOperationContractMenuItem.setEnabled(false);
		deleteOperationContractMenuItem.setEnabled(false);
		
	treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				Object selection =((TreeSelection) event.getSelection()).getFirstElement();
				if (selection instanceof VOperation)
				{
					addOperationMenuItem.setEnabled(true);
					deleteOperationMenuItem.setEnabled(true);
					addOperationContractMenuItem.setEnabled(true);
					deleteOperationContractMenuItem.setEnabled(false);
					
				}
				else if (selection instanceof VCContract)
				{
					addOperationMenuItem.setEnabled(false);
					deleteOperationMenuItem.setEnabled(false);
					addOperationContractMenuItem.setEnabled(false);
					deleteOperationContractMenuItem.setEnabled(true);
					
					
					
				}
				


				
			}
		});
	
	treeViewer.addDoubleClickListener(new IDoubleClickListener() {
		
		@Override
		public void doubleClick(DoubleClickEvent event) {
			
			Object selection =((TreeSelection) event.getSelection()).getFirstElement();
			 if (selection instanceof VCContract)
			{
				 try {
				 int index =  ((VCContract) selection).getPageIndex();
				 editor.setCurrentActivePage(index);
				 }
				 catch (NullPointerException e)
				 {
					//   bars.getStatusLineManager().setMessage(e.getMessage());
					 setStatusBarMessage("There is no page to display : "+e.toString());
				 }
			}

			
		}
	});


		//-END- ---------------------------- Operation Menu   ------------------------------------------------------------------

	// ---^^^
	 treeViewer.setColumnProperties(new String[]{"col1"});
	 treeViewer.setCellEditors(new CellEditor[]{new TextCellEditor(treeViewer.getTree())});
	    treeViewer.setCellModifier(new ICellModifier() {

	        @Override
	        public void modify(Object element, String property, Object value) {
	            if (element instanceof TreeItem )
	            {
	                //update element and tree model
	                TreeItem treeItem = (TreeItem)element;
	                if (treeItem.getData() instanceof VOperation)
	                {
	                VOperation data = (VOperation)treeItem.getData();
	                data.setOperationName((String)value); 
	                treeItem.setText(data.getOperationName());
	                
	        		((VOperation)data).getVSystem().setName(((VOperation)data).getVSystem().getName()); // to notify systemOpDiagram

	                }
	                else if  (treeItem.getData() instanceof VCContract)
	                {
	                	VCContract data = (VCContract)treeItem.getData();
	                data.setName((String)value); 
	                treeItem.setText(data.getName());
	                editor.setPageTitle(data.getPageIndex(),(String)value );
	                


	                }
	            }
	        }

	        @Override
	        public Object getValue(Object element, String property) {
	        	if (element instanceof VOperation)
	            return ((VOperation) element).getOperationName();
	        	else if (element instanceof VCContract)
		            return ((VCContract) element).getName();
	        	else 
		            return element.toString();
	        	
	        	//TODO 

	        }

	        @Override
	        public boolean canModify(Object element, String property) {
	            return true;
	        }
	    });
	    
	    Label operationTopLabel = new Label(composite_1, SWT.NONE);
	    operationTopLabel.setBounds(10, 10, 129, 20);
	    operationTopLabel.setText("System Operation List: ");
	
	// ---^^^
	
	
		getViewSite().getPage().addSelectionListener(this);
	}
	
	private void setStatusBarMessage(String message)
	{
		 getViewSite().getActionBars().getStatusLineManager().setErrorMessage(message);

		
	}

	@Override
	public void setFocus() {
	

	}

	
//	private Table table_1;
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		selectedUMLClass = null;
		lable.setText("");
		StructuredSelection structredSelection = (StructuredSelection) selection;
		Object firstElement = structredSelection.getFirstElement();

		if (firstElement instanceof OCVClassEditPart) { // works when a class
														// has been selected
			 selectedUMLClass = (UMLClass) ((OCVClassEditPart) firstElement).getModel();

			String m = "";
			for (UMLVariable umlVariable : selectedUMLClass.getClassAttributes()) {
				m = m + ":::" + umlVariable.getVariableName() + ","
						+ umlVariable.getVariableType();

			}
			lable.setText(selectedUMLClass.getClassName() + "    " + m);
						
			/// attributes display on tabelViewer
			if (selectedUMLClass != null) {
				umlAttributesTableViewer.setInput(selectedUMLClass);
				attributesLabel.setText("Attributes of "+selectedUMLClass.getClassName() +" :");
			}
			
			///

		}
		if (firstElement instanceof VSystemOperationEditPart) 
		{
		
			if(((VSystemOperationEditPart) firstElement).getModel() != null)
			{
				 VSystemOperationDiagram vSystemOperation = (VSystemOperationDiagram) ((VSystemOperationEditPart) firstElement).getModel();
				 treeViewer.setInput(vSystemOperation);
				// systemOperationTableViewer.setInput(vSystemOperation);
				 classDiagram = vSystemOperation.getUmlDiagram();
			
			}

			
		}


		
	}
	
	
	public void updateMultiPageEditor()
	{
		if (editor == null) {
			
			// -- 1.2 get all editors
			IEditorReference[] viewReferences = PlatformUI
					.getWorkbench().getActiveWorkbenchWindow()
					.getActivePage().getEditorReferences();

			for (int i = 0; i < viewReferences.length; i++) {
				if (viewReferences[i].getEditor(false) instanceof OCVMutiPageEditor) {
					editor = ((OCVMutiPageEditor) viewReferences[i]
							.getEditor(false));
				}
			}

			// --End 1.2
		}
	}
}

