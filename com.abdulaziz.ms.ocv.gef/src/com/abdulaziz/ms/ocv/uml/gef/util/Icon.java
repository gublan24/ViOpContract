package com.abdulaziz.ms.ocv.uml.gef.util;

import java.io.InputStream;
import java.net.URL;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.ImageData;

public class Icon extends ImageDescriptor {
	 private InputStream inputStream;

	public Icon(InputStream inputStream2){
		this.inputStream = inputStream2;
	}
	
	//C:\\Users\\Abdulaziz\\eclipse modeling workspace\\com.abdulaziz.ms.ocv.gef\\bin\\com\\abdulaziz\\ms\\ocv\\uml\\gef\\editor\\ocls_class.png
	
	
	public Icon(URL resource) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ImageData getImageData() {
		return new ImageData(inputStream);
	}

}