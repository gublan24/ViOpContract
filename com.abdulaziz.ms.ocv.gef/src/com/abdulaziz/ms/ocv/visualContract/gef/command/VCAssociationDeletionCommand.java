package com.abdulaziz.ms.ocv.visualContract.gef.command;

import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.gef.commands.Command;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Control;

import com.abdulaziz.ms.OCV.VCAssociation;
import com.abdulaziz.ms.OCV.VCAssociationDeletion;
import com.abdulaziz.ms.OCV.VCLink;
import com.abdulaziz.ms.view.wizard.ModifyAssociationWizard;

public class VCAssociationDeletionCommand extends Command {

	private Control control;
	private VCAssociationDeletion vcAssociationDeletion;
	public void setControl(Control control) {
		this.control = control;
		
	}
	public void setVCAssociationDeletion(VCAssociationDeletion model) {
		this.vcAssociationDeletion = model;		
	}
	public void execute()
	{
		
		vcAssociationDeletion.setDirectional(!vcAssociationDeletion.isDirectional());
		
		NotificationImpl notifyLinks = new NotificationImpl(0, vcAssociationDeletion, vcAssociationDeletion);
		for (VCLink asspciationFormationOutGoingLink:vcAssociationDeletion.getOutgoingLinks())
		{
			asspciationFormationOutGoingLink.eNotify(notifyLinks);
		}
		for (VCLink asspciationFormationIncomingLink:vcAssociationDeletion.getIncomingLinks())
		{
			asspciationFormationIncomingLink.eNotify(notifyLinks);
		}
	}
}