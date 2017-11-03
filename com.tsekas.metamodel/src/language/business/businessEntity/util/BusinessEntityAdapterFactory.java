/**
 */
package language.business.businessEntity.util;

import language.architecture.information.Concept;
import language.architecture.information.Entity;

import language.business.businessEntity.*;

import language.foundation.structure.MetaClass;
import language.foundation.structure.MetaClassifier;
import language.foundation.structure.MetaElement;
import language.foundation.structure.MetaNamedElement;
import language.foundation.structure.MetaPackageableElement;
import language.foundation.structure.MetaTypedElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see language.business.businessEntity.BusinessEntityPackage
 * @generated
 */
public class BusinessEntityAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BusinessEntityPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessEntityAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BusinessEntityPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessEntitySwitch<Adapter> modelSwitch =
		new BusinessEntitySwitch<Adapter>() {
			@Override
			public Adapter caseBusinessEntity(BusinessEntity object) {
				return createBusinessEntityAdapter();
			}
			@Override
			public Adapter caseOrganisation(Organisation object) {
				return createOrganisationAdapter();
			}
			@Override
			public Adapter casePerson(Person object) {
				return createPersonAdapter();
			}
			@Override
			public Adapter caseMetaElement(MetaElement object) {
				return createMetaElementAdapter();
			}
			@Override
			public Adapter caseMetaNamedElement(MetaNamedElement object) {
				return createMetaNamedElementAdapter();
			}
			@Override
			public Adapter caseMetaPackageableElement(MetaPackageableElement object) {
				return createMetaPackageableElementAdapter();
			}
			@Override
			public Adapter caseMetaTypedElement(MetaTypedElement object) {
				return createMetaTypedElementAdapter();
			}
			@Override
			public Adapter caseMetaClassifier(MetaClassifier object) {
				return createMetaClassifierAdapter();
			}
			@Override
			public Adapter caseMetaClass(MetaClass object) {
				return createMetaClassAdapter();
			}
			@Override
			public Adapter caseConcept(Concept object) {
				return createConceptAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link language.business.businessEntity.BusinessEntity <em>Business Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see language.business.businessEntity.BusinessEntity
	 * @generated
	 */
	public Adapter createBusinessEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link language.business.businessEntity.Organisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see language.business.businessEntity.Organisation
	 * @generated
	 */
	public Adapter createOrganisationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link language.business.businessEntity.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see language.business.businessEntity.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link language.foundation.structure.MetaElement <em>Meta Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see language.foundation.structure.MetaElement
	 * @generated
	 */
	public Adapter createMetaElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link language.foundation.structure.MetaNamedElement <em>Meta Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see language.foundation.structure.MetaNamedElement
	 * @generated
	 */
	public Adapter createMetaNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link language.foundation.structure.MetaPackageableElement <em>Meta Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see language.foundation.structure.MetaPackageableElement
	 * @generated
	 */
	public Adapter createMetaPackageableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link language.foundation.structure.MetaTypedElement <em>Meta Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see language.foundation.structure.MetaTypedElement
	 * @generated
	 */
	public Adapter createMetaTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link language.foundation.structure.MetaClassifier <em>Meta Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see language.foundation.structure.MetaClassifier
	 * @generated
	 */
	public Adapter createMetaClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link language.foundation.structure.MetaClass <em>Meta Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see language.foundation.structure.MetaClass
	 * @generated
	 */
	public Adapter createMetaClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link language.architecture.information.Concept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see language.architecture.information.Concept
	 * @generated
	 */
	public Adapter createConceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link language.architecture.information.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see language.architecture.information.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BusinessEntityAdapterFactory
