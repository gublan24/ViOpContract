package com.abdulaziz.ms.ocv.visualContract.gef.command.vc;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

import com.abdulaziz.ms.OCV.VCEquality;
import com.abdulaziz.ms.ocv.visualContract.gef.command.vc.VCEqualityWizardPage.MySelectionListener;

public class EqaulityProperties {
	
	String meaning;
	String displayedText;
	Button button;
	
	public static final String EQUAL_DISPLAY = "=";
	public static final String EQUAL_MEANING = "equal";
	
	


	public EqaulityProperties( String meaning, String display, Button button) {
		displayedText = display;
		this.meaning = meaning;
		this.button = button;
	}
	public String getMeaning() {
		return meaning;
	}
	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
	public String getDisplayedText() {
		return displayedText;
	}
	public void setDisplayedText(String displayedText) {
		this.displayedText = displayedText;
	}
	
	public boolean equals(Object o)
	{
		if(o instanceof VCEquality)
		return displayedText.trim().equals(((VCEquality)o).getDisplyedText().trim());
		else 
			return displayedText.trim().equals(o);

	}
	public Button getButton() {
		return button;
	}
	public void setButton(Button button) {
		this.button = button;
	}
	
}