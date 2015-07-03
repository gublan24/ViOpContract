package com.abdulaziz.ms.ocv.visualContract.gef.editor.figure;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;

public interface VCEntityFigure extends IFigure {
	
	public String getName();
	public void setName(String string);
	public ConnectionAnchor getConnectionAnchor();
	

}
