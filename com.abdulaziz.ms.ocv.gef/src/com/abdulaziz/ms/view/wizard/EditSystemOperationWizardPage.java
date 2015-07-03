package com.abdulaziz.ms.view.wizard;


import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.internal.image.GIFFileFormat;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;

import com.abdulaziz.ms.OCV.OCVFactory;
import com.abdulaziz.ms.OCV.UMLVariable;
import com.abdulaziz.ms.OCV.VCContract;
import com.abdulaziz.ms.OCV.VContractCondition;
import com.abdulaziz.ms.OCV.VOperation;
import com.abdulaziz.ms.OCV.VSystemOperationDiagram;
import com.abdulaziz.ms.ocv.multiPageEditor.OCVMutiPageEditor;
import com.abdulaziz.ms.ocv.uml.gef.util.AppUtility;
import com.abdulaziz.ms.ocv.uml.ms.model.UMLVaraibleEditColumn;
import com.abdulaziz.ms.ocv.uml.ms.model.UMLVariableContentProvider;
import com.abdulaziz.ms.ocv.uml.ms.model.UMLVariableTableLabelProvider;
import com.abdulaziz.ms.ocv.uml.ms.model.VOperationContractContentProvider;
import com.abdulaziz.ms.ocv.uml.ms.model.VOperationContractLabelProvider;
import com.abdulaziz.ms.ocv.visualContract.gef.util.VContractUtility;

import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.PlatformUI;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Table;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.events.SelectionAdapter;

public class EditSystemOperationWizardPage extends WizardPage {

	private VSystemOperationDiagram vSystemOperation;
	private OCVMutiPageEditor editor;
	private Table table;
	private  VOperation operation;


	protected EditSystemOperationWizardPage(String pageName, VSystemOperationDiagram vSystemOperation) {
		super(pageName);
		setTitle("System Operation Properties ");
		setDescription("Please use right click to show proper menu for operations and parameters.");
		this.vSystemOperation = vSystemOperation;

	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		setControl(container);

		
		 Group grpSystemOperationList = new Group(container, SWT.NONE);
		    grpSystemOperationList.setText("System Operation");
		    grpSystemOperationList.setBounds(10, 10, 554, 245);
		    
		    
		    //// -----------------------------
			 final TableViewer tableViewer = new TableViewer(grpSystemOperationList, SWT.BORDER | SWT.FULL_SELECTION);
				table = tableViewer.getTable();
				table.setLinesVisible(true);
				table.setHeaderVisible(true);
				table.setBounds(228, 30, 323, 158);
				
				TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.LEFT);
				TableColumn tableColumn = tableViewerColumn.getColumn();
				tableColumn.setWidth(139);
				tableColumn.setText("Parameter Name");
				tableViewerColumn.setEditingSupport(new UMLVaraibleEditColumn(tableViewer,"VariableName"));
				
				TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(tableViewer, SWT.CENTER);
				TableColumn tableColumn_1 = tableViewerColumn_1.getColumn();
				tableColumn_1.setWidth(180);
				tableColumn_1.setText("Parameter Type");
				tableViewerColumn_1.setEditingSupport(new UMLVaraibleEditColumn(tableViewer,"VariableType"));
				
			
				// ---- tableViewer Data binding
				tableViewer.setContentProvider(new UMLVariableContentProvider());
				tableViewer.setLabelProvider(new UMLVariableTableLabelProvider());
			
						 
			 Menu menu = new Menu(table);
			 table.setMenu(menu);
			 
		MenuItem addAttributeMenuItem = new MenuItem(menu, SWT.NONE);
		addAttributeMenuItem.setText("Add Parameter");
		addAttributeMenuItem.setImage(AppUtility.ADD_ATTRIBUTE_ICON_IMAGE);
		addAttributeMenuItem.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (operation != null) {
					 UMLVariable newUMLParameter = OCVFactory.eINSTANCE.createUMLVariable();
              	   newUMLParameter.setVariableName("newParameter"+(operation.getOperationParameters().size()+1));
              	   newUMLParameter.setVariableType("Int");
              	   newUMLParameter.setVOperation(operation);
              	   operation.getOperationParameters().add(newUMLParameter); 
              	               
              	   notifyVcontract(operation.getVcContract()); //notify the vcontract
              	 
              		   
					tableViewer.refresh();

				}

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});
			 
			 MenuItem deleteMenuItem = new MenuItem(menu, SWT.NONE);
			deleteMenuItem.setImage(AppUtility.DELETE_ICON_IMAGE);

			 deleteMenuItem.setText("Delete");
			 
			 deleteMenuItem.addListener(SWT.Selection, new Listener() {
			      @Override
				public void handleEvent(Event event) {		        
					int[] indices = table.getSelectionIndices();
					for (int i : indices) {
						UMLVariable v = (UMLVariable) tableViewer
								.getElementAt(i);
						if (operation.getOperationParameters().contains(v))
						{
							operation.getOperationParameters().remove(v);
							notifyVcontract(operation.getVcContract()); //notify the vcontract

						}
					}
					table.remove(indices);

			      }
			    });
		
		// ---^^^
		    
		    
		    
		    
		    
			 
		    
		    final TreeViewer treeViewer = new TreeViewer(grpSystemOperationList, SWT.BORDER);
		    treeViewer.setColumnProperties(new String[] {"col1"});
		    Tree tree = treeViewer.getTree();
		    tree.setHeaderVisible(true);
		    tree.setLinesVisible(true);
		    tree.setBounds(10, 30, 212, 205);
		    final TreeColumn columnName = new TreeColumn(tree, SWT.NONE);
		    columnName.setWidth(208);
			columnName.setText("System Operation");
		    
		    
		    treeViewer.setLabelProvider(new VOperationContractLabelProvider());
		    treeViewer.setContentProvider(new VOperationContractContentProvider());
		    treeViewer.setInput(vSystemOperation);
		    
		    treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					  IStructuredSelection selection = (IStructuredSelection) treeViewer.getSelection();
				if (!selection.isEmpty()) {
					TreeItem item = treeViewer.getTree().getSelection()[0];
					Object selectedObject = item.getData();
					if (selectedObject instanceof VOperation) {
						operation = ((VOperation) selectedObject);
						tableViewer.setInput(operation);
						treeViewer.refresh();
						tableViewer.refresh();
					}
					else 
					{
					tableViewer.setInput(null);
					operation = null;
					}
					
				}
				}
			});
		    
		//------------------------------ Operation Menu   ------------------------------------------------------------------

	
		Menu systemOperationTableMenu = new Menu(parent);
		treeViewer.getControl().setMenu(systemOperationTableMenu);
		final MenuItem addOperationMenuItem = new MenuItem(systemOperationTableMenu, SWT.PUSH);
		addOperationMenuItem.setText("Add Operation");
		addOperationMenuItem.setImage(AppUtility.ADD_OPERATION_ICON_IMAGE);

		// add operation 
		addOperationMenuItem.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
					VOperation vOperation = OCVFactory.eINSTANCE.createVOperation();
					vOperation.setOperationName("operation"+(vSystemOperation.getClassOperations().size()+1));
					vSystemOperation.getClassOperations().add(vOperation);
					vOperation.setVSystem(vSystemOperation);
					treeViewer.refresh();

					 
					// update vSystemOperation 
					notifyVSystemOperation();
					
			      	
	            	    
					

				
				
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			
				
			}
		});
		
// )))))))))))
		
		/*
		final MenuItem addOperationParameter = new MenuItem(systemOperationTableMenu, SWT.PUSH);
		addOperationParameter.setText("Add Operation Parameter");
		// add parameter 
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
		                        	   newUMLParameter.setOperationParameters((VOperation) selectedObject);
		                           ((VOperation) selectedObject).getOperationParameters().add(newUMLParameter);
		                           treeViewer.refresh();
		   						tableViewer.refresh();

		                           }
			}
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			
				
			}
		});
		
		*/
		// )))))))))))))))))))))))
		
		
		final MenuItem deleteOperationMenuItem = new MenuItem(systemOperationTableMenu, SWT.PUSH);		
		deleteOperationMenuItem.setText("Delete Operation");
		deleteOperationMenuItem.setImage(AppUtility.DELETE_ICON_IMAGE);

		// delete operation
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
		                            	   vSystemOperation.getClassOperations().remove(treeItem.getData());
		                                         }
		                                            treeViewer.refresh();
		                    						tableViewer.setInput(null);

		                          }
		    	 

		      }
		    });
		
		final MenuItem addOperationContractMenuItem = new MenuItem(systemOperationTableMenu, SWT.PUSH);		
		addOperationContractMenuItem.setText("Add Operation Contract");
		addOperationContractMenuItem.setImage(AppUtility.ADD_OPERATION_CONRACT_ICON_IMAGE);
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
		                        		   updateMultiPageEditor();
		                        		   VContractUtility.createPrePostCondition((VOperation) selectedObject, editor);
		                        		   treeViewer.refresh();
		                        	   }
		                        	   else
		              					 setErrorMessage("There is already an operation contract associated with "+(((VOperation) selectedObject).getOperationName()));

		                        	   
		                           }
		                           
		                             
		                                            
		                          }
		    	 

		      }
		    });
		
		final MenuItem deleteOperationContractMenuItem = new MenuItem(systemOperationTableMenu, SWT.PUSH);		
		deleteOperationContractMenuItem.setText("Delete Operation Contract");
		deleteOperationContractMenuItem.setImage(AppUtility.DELETE_ICON_IMAGE);

		deleteOperationContractMenuItem.addListener(SWT.Selection, new Listener() {
		      @Override
			public void handleEvent(Event event) {		    
		    	 
		    	  IStructuredSelection selection = (IStructuredSelection) treeViewer.getSelection();
		          if (!selection.isEmpty()) {
		                           TreeItem item = treeViewer.getTree().getSelection()[0];
		                           Object selectedObject = item.getData();
		                           if (selectedObject instanceof VCContract)
		                           {
		                        	   VCContract visualContrct = ((VCContract) selectedObject);
		                        	   if ( visualContrct != null && visualContrct.getPageIndex() >-1)
		                        	   editor.removePage(((VCContract) selectedObject).getPageIndex());
		                     		   ((VCContract) selectedObject).getUmlOperation().setVcContract(null);
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
	/*
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
					 setErrorMessage("There is no page to display : "+e.toString());
				 }
			}

			
		}
	});
	*/
	
	
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
		             
		             notifyVSystemOperation(); // to notify systemOpDiagram
		     		
		     	
		             
		             
		        
		             }
		             else if  (treeItem.getData() instanceof VCContract)
 {
		            	 VCContract data = (VCContract) treeItem.getData();
						data.setName((String) value);
						treeItem.setText(data.getName());
						editor.setPageTitle(data.getPageIndex(),(String) value);
						
						if(data != null)
						{
						notifyVcontract(data);
						}		             


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
		     	
		      

		     }

		     @Override
		     public boolean canModify(Object element, String property) {
		         return true;
		     }
		 });
		 
	
		 
		 
		 
		

	}
	

	protected void notifyVSystemOperation() {
			vSystemOperation.setUmlDiagram(vSystemOperation.getUmlDiagram());
			
	}

	protected void   notifyVcontract(VCContract vcContract) {
		  if(vcContract != null)
     	   {     		  
			  vcContract.setUmlOperation(vcContract.getUmlOperation()); 
			
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
