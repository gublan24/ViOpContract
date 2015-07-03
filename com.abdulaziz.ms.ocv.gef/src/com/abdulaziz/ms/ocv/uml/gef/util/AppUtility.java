package com.abdulaziz.ms.ocv.uml.gef.util;

import java.io.InputStream;

import org.eclipse.swt.graphics.Image;

public class AppUtility {
	
	public final static InputStream UMLCLASS_MENU_EDIT_ICON = AppUtility.class.getResourceAsStream("edit_list.png");
	public static InputStream SYSTEM_OPERATION_MENU_EDIT_ICON = null;
	public final static InputStream DELETE_ICON = AppUtility.class.getResourceAsStream("delete.png");
	public final static InputStream ADD_OPERATION_ICON = AppUtility.class.getResourceAsStream("add_operation.png");
	public final static InputStream ADD_OPERATION_CONRACT_ICON =  AppUtility.class.getResourceAsStream("add_contract.png");
	public final static InputStream ADD_ATTRIBUTE_ICON = AppUtility.class.getResourceAsStream("documentAttribute.png");
	
	public final static Image ADD_ATTRIBUTE_ICON_IMAGE = new Image(null, AppUtility.ADD_ATTRIBUTE_ICON);
	public final static Image DELETE_ICON_IMAGE = new Image(null, AppUtility.DELETE_ICON);	
	public final static Image ADD_PARAMETER_ICON_IMAGE = ADD_ATTRIBUTE_ICON_IMAGE;
	public final static Image ADD_OPERATION_ICON_IMAGE = new Image(null, AppUtility.ADD_OPERATION_ICON);
	public final static Image ADD_OPERATION_CONRACT_ICON_IMAGE = new Image(null, AppUtility.ADD_OPERATION_CONRACT_ICON);
	public static InputStream getUmlclassMenuEditIcon() {
		return UMLCLASS_MENU_EDIT_ICON;
	}
	public static InputStream getSystemOperationMenuEditIcon() {
		if(SYSTEM_OPERATION_MENU_EDIT_ICON == null)
		 SYSTEM_OPERATION_MENU_EDIT_ICON = AppUtility.class.getResourceAsStream("edit_list.png");
		return SYSTEM_OPERATION_MENU_EDIT_ICON;
	}
	public static InputStream getDeleteIcon() {
		return DELETE_ICON;
	}
	public static InputStream getAddOperationIcon() {
		return ADD_OPERATION_ICON;
	}
	public static InputStream getAddOperationConractIcon() {
		return ADD_OPERATION_CONRACT_ICON;
	}
	public static InputStream getAddAttributeIcon() {
		return ADD_ATTRIBUTE_ICON;
	}
	public static Image getAddAttributeIconImage() {
		return ADD_ATTRIBUTE_ICON_IMAGE;
	}
	public static Image getDeleteIconImage() {
		return DELETE_ICON_IMAGE;
	}
	public static Image getAddParameterIconImage() {
		return ADD_PARAMETER_ICON_IMAGE;
	}
	public static Image getAddOperationIconImage() {
		return ADD_OPERATION_ICON_IMAGE;
	}
	public static Image getAddOperationConractIconImage() {
		return ADD_OPERATION_CONRACT_ICON_IMAGE;
	}


	;
	


}
