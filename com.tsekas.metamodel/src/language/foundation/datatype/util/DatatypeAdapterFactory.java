/**
 */
package language.foundation.datatype.util;

import language.foundation.datatype.*;

import language.foundation.structure.MetaElement;
import language.foundation.structure.MetaNamedElement;
import language.foundation.structure.MetaPackageableElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see language.foundation.datatype.DatatypePackage
 * @generated
 */
public class DatatypeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DatatypePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DatatypePackage.eINSTANCE;
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
	protected DatatypeSwitch<Adapter> modelSwitch =
		new DatatypeSwitch<Adapter>() {
			@Override
			public Adapter caseMetaDataType(MetaDataType object) {
				return createMetaDataTypeAdapter();
			}
			@Override
			public Adapter caseMetaText(MetaText object) {
				return createMetaTextAdapter();
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
	 * Creates a new adapter for an object of class '{@link language.foundation.datatype.MetaDataType <em>Meta Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see language.foundation.datatype.MetaDataType
	 * @generated
	 */
	public Adapter createMetaDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link language.foundation.datatype.MetaText <em>Meta Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see language.foundation.datatype.MetaText
	 * @generated
	 */
	public Adapter createMetaTextAdapter() {
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

} //DatatypeAdapterFactory
