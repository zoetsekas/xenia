/**
 */
package language.foundation.structure.util;

import language.foundation.structure.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see language.foundation.structure.StructurePackage
 * @generated
 */
public class StructureAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StructurePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StructurePackage.eINSTANCE;
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
	protected StructureSwitch<Adapter> modelSwitch =
		new StructureSwitch<Adapter>() {
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
			public Adapter caseMetaPackage(MetaPackage object) {
				return createMetaPackageAdapter();
			}
			@Override
			public Adapter caseMetaTypedElement(MetaTypedElement object) {
				return createMetaTypedElementAdapter();
			}
			@Override
			public Adapter caseMetaModel(MetaModel object) {
				return createMetaModelAdapter();
			}
			@Override
			public Adapter caseMetaProperty(MetaProperty object) {
				return createMetaPropertyAdapter();
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
	 * Creates a new adapter for an object of class '{@link language.foundation.structure.MetaPackage <em>Meta Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see language.foundation.structure.MetaPackage
	 * @generated
	 */
	public Adapter createMetaPackageAdapter() {
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
	 * Creates a new adapter for an object of class '{@link language.foundation.structure.MetaModel <em>Meta Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see language.foundation.structure.MetaModel
	 * @generated
	 */
	public Adapter createMetaModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link language.foundation.structure.MetaProperty <em>Meta Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see language.foundation.structure.MetaProperty
	 * @generated
	 */
	public Adapter createMetaPropertyAdapter() {
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

} //StructureAdapterFactory
