package com.abdulaziz.ms.ocv.uml.ms.model;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;

import com.abdulaziz.ms.OCV.VOperation;

public class VOperationContractEditSupport extends EditingSupport {
	private CellEditor editor;
	private TableViewer tviewer;
	public VOperationContractEditSupport(TableViewer viewer) {
		super(viewer);
		tviewer = viewer;
		editor = new TextCellEditor(viewer.getTable());
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		return editor;
	}

	@Override
	protected boolean canEdit(Object element) {
		return true;
	}

	@Override
	protected Object getValue(Object element) {
		return ((VOperation)element).getOperationName();
	}

	@Override
	protected void setValue(Object element, Object value) {
		((VOperation)element).setOperationName(String.valueOf(value));
		((VOperation)element).getVSystem().setName(((VOperation)element).getVSystem().getName()); // to notify systemOpDiagram
		tviewer.update(element, null);

	}

}
