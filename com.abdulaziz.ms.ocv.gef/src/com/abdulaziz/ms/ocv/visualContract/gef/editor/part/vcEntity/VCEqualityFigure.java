package com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;

import com.abdulaziz.ms.OCV.VCEquality;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.figure.VCEntityFigure;

public class VCEqualityFigure extends Figure implements VCEntityFigure {

	private ConnectionAnchor connectionAnchor;
	private VCEquality vcEquality;
	private Label figuerLabel;
	private boolean flag = true;
	
	public VCEqualityFigure()
	{
		setLayoutManager(new XYLayout());
		 figuerLabel = new Label();
		 figuerLabel.setBorder(new LineBorder(ColorConstants.buttonDarker,3));
		 figuerLabel.setText("=");
		add(figuerLabel);
		

		
	// 
	}
	
	@Override
	protected void paintFigure(Graphics graphics)
 {

		if (flag) { // just do it once ... 
			
			FontData[] fD = figuerLabel.getFont().getFontData();
			fD[0].setHeight(16);
			figuerLabel.setFont(new Font(getFont().getDevice(), fD[0]));
			flag = false;
		}
		if(vcEquality.getDisplyedText() != null)
		{
			figuerLabel.setText(vcEquality.getDisplyedText());
		}

		Rectangle r = getBounds().getCopy();
	    setConstraint(figuerLabel, new Rectangle(0,0,r.width, r.height));
	    
	}

	@Override
	public String getName() {
		return "" ;
	}

	@Override
	public void setName(String equalityValue) {
		
	}

	@Override
	public ConnectionAnchor getConnectionAnchor() {
		if(connectionAnchor ==null)
		{
			connectionAnchor = new ChopboxAnchor(this);
		}
		return connectionAnchor;
	}

	public void setVcEquality(VCEquality vcEquality) {
		this.vcEquality = vcEquality;
	}

}