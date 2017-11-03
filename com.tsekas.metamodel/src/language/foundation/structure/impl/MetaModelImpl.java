/**
 */
package language.foundation.structure.impl;

import java.util.Collection;
import language.foundation.structure.MetaModel;
import language.foundation.structure.MetaPackageableElement;
import language.foundation.structure.StructurePackage;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meta Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link language.foundation.structure.impl.MetaModelImpl#getPackagedElements <em>Packaged Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MetaModelImpl extends MetaNamedElementImpl implements MetaModel {
	/**
	 * The cached value of the '{@link #getPackagedElements() <em>Packaged Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<MetaPackageableElement> packagedElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.META_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetaPackageableElement> getPackagedElements() {
		if (packagedElements == null) {
			packagedElements = new EObjectContainmentEList<MetaPackageableElement>(MetaPackageableElement.class, this, StructurePackage.META_MODEL__PACKAGED_ELEMENTS);
		}
		return packagedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.META_MODEL__PACKAGED_ELEMENTS:
				return ((InternalEList<?>)getPackagedElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructurePackage.META_MODEL__PACKAGED_ELEMENTS:
				return getPackagedElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StructurePackage.META_MODEL__PACKAGED_ELEMENTS:
				getPackagedElements().clear();
				getPackagedElements().addAll((Collection<? extends MetaPackageableElement>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StructurePackage.META_MODEL__PACKAGED_ELEMENTS:
				getPackagedElements().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StructurePackage.META_MODEL__PACKAGED_ELEMENTS:
				return packagedElements != null && !packagedElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MetaModelImpl
