package com.abdulaziz.ms.ocv.uml.ms.model;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;

import com.abdulaziz.ms.OCV.UMLVariable;

public class UMLVaraibleEditColumn extends EditingSupport {
	private CellEditor editor;
	private String column;
	private TableViewer tviewer;

	public UMLVaraibleEditColumn(TableViewer viewer) {
		super(viewer);
		tviewer = viewer;
		editor = new TextCellEditor(viewer.getTable());
	}

	public UMLVaraibleEditColumn(TableViewer viewer, String column) {
		super(viewer);
		tviewer = viewer;
		editor = new TextCellEditor(viewer.getTable());
		this.column = column;
	}

	@Override
	protected void setValue(Object element, Object value) {

		UMLVariable umlvariable = (UMLVariable) element;
		if (column.equals("VariableType"))
			umlvariable.setVariableType(String.valueOf(value));
		else
			umlvariable.setVariableName(String.valueOf(value));
		if(umlvariable.getUmlClass() != null)
		umlvariable.getUmlClass().setUmlDiagram(
				umlvariable.getUmlClass().getUmlDiagram());
	
		tviewer.update(element, null);
		
		 if(umlvariable.getVOperation() != null && umlvariable.getVOperation().getVcContract()!=null)
   	   {     		  
			 //notify 
			 umlvariable.getVOperation().getVcContract().setUmlOperation(umlvariable.getVOperation());  
   	   }
	
}

@Override
protected Object getValue(Object element) {
	if(column.equals("VariableType"))
	return ((UMLVariable)element).getVariableType();
	else		
		return ((UMLVariable)element).getVariableName();

}

@Override
protected CellEditor getCellEditor(Object element) {
	return editor;
}

@Override
protected boolean canEdit(Object element) {
	return true;
}



}