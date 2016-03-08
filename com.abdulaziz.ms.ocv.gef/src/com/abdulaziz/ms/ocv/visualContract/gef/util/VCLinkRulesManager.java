package com.abdulaziz.ms.ocv.visualContract.gef.util;

import org.eclipse.ui.internal.progress.TaskInfo;

import com.abdulaziz.ms.OCV.VCAssociation;
import com.abdulaziz.ms.OCV.VCEntity;
import com.abdulaziz.ms.OCV.VCInstance;
import com.abdulaziz.ms.OCV.VCInstanceField;
import com.abdulaziz.ms.OCV.VCLink;
import com.abdulaziz.ms.OCV.VCLoop;
import com.abdulaziz.ms.OCV.impl.VCAlternativeBoxImpl;
import com.abdulaziz.ms.OCV.impl.VCAssociationDeletionImpl;
import com.abdulaziz.ms.OCV.impl.VCAssociationImpl;
import com.abdulaziz.ms.OCV.impl.VCCollectionBoxImpl;
import com.abdulaziz.ms.OCV.impl.VCEqualityImpl;
import com.abdulaziz.ms.OCV.impl.VCInstanceFieldImpl;
import com.abdulaziz.ms.OCV.impl.VCInstanceImpl;
import com.abdulaziz.ms.OCV.impl.VCLoopImpl;
import com.abdulaziz.ms.OCV.impl.VCParameterImpl;
import com.abdulaziz.ms.OCV.impl.VCValueImpl;

public class VCLinkRulesManager {
	final static String OPERATION_PARAMETER_ACCEPTED_SOURCES =" " + VCEqualityImpl.class.getSimpleName() +","
			+ VCInstanceFieldImpl.class.getSimpleName() + " , ";
	final static String EQAULITY_ACCEPTED_SOURCES = " "
			+ VCParameterImpl.class.getSimpleName() + ", "
			+ VCInstanceFieldImpl.class.getSimpleName();
	final static String OPERATION_RETURN_ACCEPTED_SOURCES = " "
			+ VCInstanceImpl.class.getSimpleName() + ", "
			+ VCValueImpl.class.getSimpleName() + " , "
			+ VCAlternativeBoxImpl.class.getSimpleName() + ", "
			+ VCParameterImpl.class.getSimpleName() + ", "
			+ VCInstanceFieldImpl.class.getSimpleName() + " , "
			+VCLoopImpl.class.getSimpleName() +" , "+
			VCCollectionBoxImpl.class.getSimpleName();
	final static String INSTANCE_FIELD_ACCEPTED_SOURCES = " "
			+ VCInstanceImpl.class.getSimpleName() + " , "
			+ VCEqualityImpl.class.getSimpleName();
	final static String INSTANCE_ACCEPTED_SOURCES = " "
			+ VCAssociationImpl.class.getSimpleName() + " , " + VCAssociationDeletionImpl.class.getSimpleName();
	final static String ASSOCIATION_ACCEPTED_SOURCES = " "
			+ VCInstanceImpl.class.getSimpleName();
	final static String ASSOCIATION_DELETION_ACCEPTED_SOURCES = " "
			+ VCInstanceImpl.class.getSimpleName();
	final static String VALUE_ACCEPTED_SOURCES = " "
			+ VCEqualityImpl.class.getSimpleName();


	
	public static boolean isTargetAcceptLink(VCEntity targetVCEntity)
	{		
		String targetClassName = targetVCEntity.getClass().getSimpleName();

		switch (targetClassName) {
		case "VCEqualityImpl":
		case "VCValueImpl":
		case "VCOperationBoxImpl":
		case "VCAlternativeBoxImpl": 
		case "VCCollectionBoxImpl":
		case "VCLoopImpl":
		case "VCParameterImpl":
			return true;
		case "VCReturnImpl":
			return targetVCEntity.getIncomingLinks().size()<1;
		case "VCInstanceFieldImpl":
			
			return true;//targetVCEntity.getIncomingLinks().size()<1;
		case "VCInstanceImpl":
			return true;
		case "VCAssociationImpl":
			return targetVCEntity.getIncomingLinks().size()<2;
		case "VCAssociationDeletionImpl":
			return targetVCEntity.getIncomingLinks().size()<2;

			
		default:
			return false;

		}
		
	}

	public static boolean isTargetAcceptSource(VCEntity sourceVCEntity,
			VCEntity targetVCEntity) {

		String targetClassName = targetVCEntity.getClass().getSimpleName();
		String sourceClassName = sourceVCEntity.getClass().getSimpleName();

		switch (targetClassName) {
		case "VCParameterImpl":
			return (OPERATION_PARAMETER_ACCEPTED_SOURCES.contains(sourceClassName));
		case "VCEqualityImpl":
		case "VCAlternativeBoxImpl":
		case "VCCollectionBoxImpl":
		case "VCLoopImpl":
			return (EQAULITY_ACCEPTED_SOURCES.contains(sourceClassName));
		case "VCValueImpl":
		case "VCOperationBoxImpl":
			return (VALUE_ACCEPTED_SOURCES.contains(sourceClassName));
		case "VCReturnImpl":
			return (OPERATION_RETURN_ACCEPTED_SOURCES.contains(sourceClassName));
		case "VCInstanceFieldImpl":
		if(sourceVCEntity instanceof VCInstance)
		{
			VCInstanceField instanceField = (VCInstanceField) targetVCEntity;
			for (VCLink vcLink :instanceField.getIncomingLinks())
				if (vcLink.getSource() instanceof VCInstance)
				return false;
				return true;
		}
			return (INSTANCE_FIELD_ACCEPTED_SOURCES.contains(sourceClassName));
		case "VCInstanceImpl":
			return (INSTANCE_ACCEPTED_SOURCES.contains(sourceClassName));
		case "VCAssociationImpl":
			return (ASSOCIATION_ACCEPTED_SOURCES.contains(sourceClassName));
		case "VCAssociationDeletionImpl" :
			return ASSOCIATION_DELETION_ACCEPTED_SOURCES.contains(sourceClassName);
		default:
			return false;

		}

	}

}
