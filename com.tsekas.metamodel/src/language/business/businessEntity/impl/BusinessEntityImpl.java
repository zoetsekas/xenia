/**
 */
package language.business.businessEntity.impl;

import language.architecture.information.impl.ConceptImpl;

import language.business.businessEntity.BusinessEntity;
import language.business.businessEntity.BusinessEntityPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class BusinessEntityImpl extends ConceptImpl implements BusinessEntity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BusinessEntityPackage.Literals.BUSINESS_ENTITY;
	}

} //BusinessEntityImpl
