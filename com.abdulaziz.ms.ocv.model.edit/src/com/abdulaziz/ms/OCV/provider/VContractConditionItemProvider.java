/**
 */
package com.abdulaziz.ms.OCV.provider;


import com.abdulaziz.ms.OCV.OCVFactory;
import com.abdulaziz.ms.OCV.OCVPackage;
import com.abdulaziz.ms.OCV.VContractCondition;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.abdulaziz.ms.OCV.VContractCondition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VContractConditionItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VContractConditionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addTypePropertyDescriptor(object);
			addConstaintPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VContractCondition_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VContractCondition_type_feature", "_UI_VContractCondition_type"),
				 OCVPackage.Literals.VCONTRACT_CONDITION__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constaint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstaintPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VContractCondition_constaint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VContractCondition_constaint_feature", "_UI_VContractCondition_type"),
				 OCVPackage.Literals.VCONTRACT_CONDITION__CONSTAINT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(OCVPackage.Literals.VCONTRACT_CONDITION__VC_ENTITIES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((VContractCondition)object).getType();
		return label == null || label.length() == 0 ?
			getString("_UI_VContractCondition_type") :
			getString("_UI_VContractCondition_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(VContractCondition.class)) {
			case OCVPackage.VCONTRACT_CONDITION__TYPE:
			case OCVPackage.VCONTRACT_CONDITION__CONSTAINT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OCVPackage.VCONTRACT_CONDITION__VC_ENTITIES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(OCVPackage.Literals.VCONTRACT_CONDITION__VC_ENTITIES,
				 OCVFactory.eINSTANCE.createVCValue()));

		newChildDescriptors.add
			(createChildParameter
				(OCVPackage.Literals.VCONTRACT_CONDITION__VC_ENTITIES,
				 OCVFactory.eINSTANCE.createVCEquality()));

		newChildDescriptors.add
			(createChildParameter
				(OCVPackage.Literals.VCONTRACT_CONDITION__VC_ENTITIES,
				 OCVFactory.eINSTANCE.createVCInstance()));

		newChildDescriptors.add
			(createChildParameter
				(OCVPackage.Literals.VCONTRACT_CONDITION__VC_ENTITIES,
				 OCVFactory.eINSTANCE.createVCInstanceField()));

		newChildDescriptors.add
			(createChildParameter
				(OCVPackage.Literals.VCONTRACT_CONDITION__VC_ENTITIES,
				 OCVFactory.eINSTANCE.createVCAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(OCVPackage.Literals.VCONTRACT_CONDITION__VC_ENTITIES,
				 OCVFactory.eINSTANCE.createVCParameter()));

		newChildDescriptors.add
			(createChildParameter
				(OCVPackage.Literals.VCONTRACT_CONDITION__VC_ENTITIES,
				 OCVFactory.eINSTANCE.createVCOperationBox()));

		newChildDescriptors.add
			(createChildParameter
				(OCVPackage.Literals.VCONTRACT_CONDITION__VC_ENTITIES,
				 OCVFactory.eINSTANCE.createVCReturn()));

		newChildDescriptors.add
			(createChildParameter
				(OCVPackage.Literals.VCONTRACT_CONDITION__VC_ENTITIES,
				 OCVFactory.eINSTANCE.createVCAlternativeBox()));

		newChildDescriptors.add
			(createChildParameter
				(OCVPackage.Literals.VCONTRACT_CONDITION__VC_ENTITIES,
				 OCVFactory.eINSTANCE.createVCCollectionBox()));

		newChildDescriptors.add
			(createChildParameter
				(OCVPackage.Literals.VCONTRACT_CONDITION__VC_ENTITIES,
				 OCVFactory.eINSTANCE.createVCLoop()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ModelEditPlugin.INSTANCE;
	}

}
