package com.abdulaziz.ms.view.wizard;

import java.io.InputStream;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Group;

import com.abdulaziz.ms.OCV.OCVFactory;
import com.abdulaziz.ms.OCV.UMLClass;
import com.abdulaziz.ms.OCV.UMLVariable;
import com.abdulaziz.ms.ocv.uml.gef.util.AppUtility;
import com.abdulaziz.ms.ocv.uml.ms.model.UMLVaraibleEditColumn;
import com.abdulaziz.ms.ocv.uml.ms.model.UMLVariableContentProvider;
import com.abdulaziz.ms.ocv.uml.ms.model.UMLVariableTableLabelProvider;

public class UMLClassWizardPage extends WizardPage {
	private Table table;
	private Text classNameTextbox;
	

	private UMLClass umlClass;
	protected UMLClassWizardPage(String pageName, UMLClass umlClass) {
		super(pageName);
		setTitle("Class Properties");
		setDescription("Use right click in Attribute Table to show Add Atribute and Delete Attribute menu.");
		this.umlClass = umlClass;
		
	}

	
	@Override
	public void createControl(Composite parent) {

		Composite container = new Composite(parent, SWT.NULL);
		setControl(container);
		
		classNameTextbox = new Text(container, SWT.BORDER);
		classNameTextbox.setBounds(91, 7, 148, 21);
		classNameTextbox.setText(umlClass.getClassName());
		
		Label lblClassName = new Label(container, SWT.NONE);
		lblClassName.setBounds(10, 10, 75, 15);
		lblClassName.setText("Class Name :");
		
		Group grpAttributes = new Group(container, SWT.NONE);
		grpAttributes.setText("Attributes");
		grpAttributes.setBounds(10, 40, 377, 197);
		
		final TableViewer tableViewer = new TableViewer(grpAttributes, SWT.BORDER | SWT.FULL_SELECTION);
		table = tableViewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		table.setBounds(26, 27, 323, 158);
		
		TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.LEFT);
		TableColumn tableColumn = tableViewerColumn.getColumn();
		tableColumn.setWidth(139);
		tableColumn.setText("Variable Name");
		tableViewerColumn.setEditingSupport(new UMLVaraibleEditColumn(tableViewer,"VariableName"));
		
		TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(tableViewer, SWT.CENTER);
		TableColumn tableColumn_1 = tableViewerColumn_1.getColumn();
		tableColumn_1.setWidth(180);
		tableColumn_1.setText("Variable Type");
		tableViewerColumn_1.setEditingSupport(new UMLVaraibleEditColumn(tableViewer,"VariableType"));
		
	
		// ---- tableViewer Data binding
		tableViewer.setContentProvider(new UMLVariableContentProvider());
		tableViewer.setLabelProvider(new UMLVariableTableLabelProvider());
		tableViewer.setInput(umlClass);
		// ---- END
		
		
		// ******* Menu
		Menu attributeTableMenu = new Menu(parent);
		MenuItem addAttributeMenuItem = new MenuItem(attributeTableMenu, SWT.PUSH);
		addAttributeMenuItem.setText("Add Attribute");
		//TODO
		addAttributeMenuItem.setImage(AppUtility.ADD_ATTRIBUTE_ICON_IMAGE);

		addAttributeMenuItem.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (umlClass != null) {
					UMLVariable umlVariable = OCVFactory.eINSTANCE.createUMLVariable();
					umlVariable.setVariableName("Attribute"+(umlClass.getClassAttributes().size()+1));
					umlClass.getClassAttributes().add(umlVariable);
					tableViewer.setInput(umlClass);
				}
				
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			
			}
		});
		table.setMenu(attributeTableMenu);

		MenuItem deleteMenuItem = new MenuItem(attributeTableMenu, SWT.PUSH);		
		deleteMenuItem.setText("Delete");
		deleteMenuItem.setImage(AppUtility.DELETE_ICON_IMAGE);
		deleteMenuItem.addListener(SWT.Selection, new Listener() {
		      @Override
			public void handleEvent(Event event) {		        
				int[] indices = table.getSelectionIndices();
				for (int i : indices) {
					UMLVariable v = (UMLVariable) tableViewer.getElementAt(i);
					umlClass.getClassAttributes().remove(v);
				}
				table.remove(indices);

		      }
		    });
	
		
		
		table.setMenu(attributeTableMenu);
		
		
		// ******* END Menu

	}
	
	public String getClassNameTextbox() {
		return classNameTextbox.getText();
	}

}
