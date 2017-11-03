/**
 */
package language.foundation.structure.provider;


import java.util.Collection;
import java.util.List;

import language.architecture.information.InformationFactory;

import language.business.businessEntity.BusinessEntityFactory;

import language.business.financial.product.ProductFactory;

import language.foundation.structure.MetaModel;
import language.foundation.structure.StructurePackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link language.foundation.structure.MetaModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MetaModelItemProvider extends MetaNamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaModelItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(StructurePackage.Literals.META_MODEL__PACKAGED_ELEMENTS);
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
		String label = ((MetaModel)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MetaModel_type") :
			getString("_UI_MetaModel_type") + " " + label;
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

		switch (notification.getFeatureID(MetaModel.class)) {
			case StructurePackage.META_MODEL__PACKAGED_ELEMENTS:
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
				(StructurePackage.Literals.META_MODEL__PACKAGED_ELEMENTS,
				 InformationFactory.eINSTANCE.createSubDomain()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.META_MODEL__PACKAGED_ELEMENTS,
				 InformationFactory.eINSTANCE.createConcept()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.META_MODEL__PACKAGED_ELEMENTS,
				 InformationFactory.eINSTANCE.createEntity()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.META_MODEL__PACKAGED_ELEMENTS,
				 InformationFactory.eINSTANCE.createExtension()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.META_MODEL__PACKAGED_ELEMENTS,
				 ProductFactory.eINSTANCE.createFinancialProduct()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.META_MODEL__PACKAGED_ELEMENTS,
				 ProductFactory.eINSTANCE.createTradeLeg()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.META_MODEL__PACKAGED_ELEMENTS,
				 ProductFactory.eINSTANCE.createOption()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.META_MODEL__PACKAGED_ELEMENTS,
				 ProductFactory.eINSTANCE.createTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.META_MODEL__PACKAGED_ELEMENTS,
				 ProductFactory.eINSTANCE.createCashFlow()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.META_MODEL__PACKAGED_ELEMENTS,
				 ProductFactory.eINSTANCE.createCommodityFlow()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.META_MODEL__PACKAGED_ELEMENTS,
				 ProductFactory.eINSTANCE.createProductSubDomain()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.META_MODEL__PACKAGED_ELEMENTS,
				 BusinessEntityFactory.eINSTANCE.createOrganisation()));

		newChildDescriptors.add
			(createChildParameter
				(StructurePackage.Literals.META_MODEL__PACKAGED_ELEMENTS,
				 BusinessEntityFactory.eINSTANCE.createPerson()));
	}

}
