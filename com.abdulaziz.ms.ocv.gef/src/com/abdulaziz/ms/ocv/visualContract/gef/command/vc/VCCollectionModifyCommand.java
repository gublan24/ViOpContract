package com.abdulaziz.ms.ocv.visualContract.gef.command.vc;

import org.eclipse.gef.commands.Command;
import org.eclipse.swt.widgets.Control;

public class VCCollectionModifyCommand extends Command {
	private Control control;
	public void setControl(Control control) {
		this.control = control;
		
	}

}
