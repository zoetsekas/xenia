/**
 */
package language.foundation.structure.util;

import language.foundation.structure.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see language.foundation.structure.StructurePackage
 * @generated
 */
public class StructureSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StructurePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureSwitch() {
		if (modelPackage == null) {
			modelPackage = StructurePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case StructurePackage.META_ELEMENT: {
				MetaElement metaElement = (MetaElement)theEObject;
				T result = caseMetaElement(metaElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.META_NAMED_ELEMENT: {
				MetaNamedElement metaNamedElement = (MetaNamedElement)theEObject;
				T result = caseMetaNamedElement(metaNamedElement);
				if (result == null) result = caseMetaElement(metaNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.META_PACKAGEABLE_ELEMENT: {
				MetaPackageableElement metaPackageableElement = (MetaPackageableElement)theEObject;
				T result = caseMetaPackageableElement(metaPackageableElement);
				if (result == null) result = caseMetaNamedElement(metaPackageableElement);
				if (result == null) result = caseMetaElement(metaPackageableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.META_PACKAGE: {
				MetaPackage metaPackage = (MetaPackage)theEObject;
				T result = caseMetaPackage(metaPackage);
				if (result == null) result = caseMetaModel(metaPackage);
				if (result == null) result = caseMetaPackageableElement(metaPackage);
				if (result == null) result = caseMetaNamedElement(metaPackage);
				if (result == null) result = caseMetaElement(metaPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.META_TYPED_ELEMENT: {
				MetaTypedElement metaTypedElement = (MetaTypedElement)theEObject;
				T result = caseMetaTypedElement(metaTypedElement);
				if (result == null) result = caseMetaPackageableElement(metaTypedElement);
				if (result == null) result = caseMetaNamedElement(metaTypedElement);
				if (result == null) result = caseMetaElement(metaTypedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.META_MODEL: {
				MetaModel metaModel = (MetaModel)theEObject;
				T result = caseMetaModel(metaModel);
				if (result == null) result = caseMetaNamedElement(metaModel);
				if (result == null) result = caseMetaElement(metaModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.META_PROPERTY: {
				MetaProperty metaProperty = (MetaProperty)theEObject;
				T result = caseMetaProperty(metaProperty);
				if (result == null) result = caseMetaNamedElement(metaProperty);
				if (result == null) result = caseMetaElement(metaProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.META_CLASSIFIER: {
				MetaClassifier metaClassifier = (MetaClassifier)theEObject;
				T result = caseMetaClassifier(metaClassifier);
				if (result == null) result = caseMetaTypedElement(metaClassifier);
				if (result == null) result = caseMetaPackageableElement(metaClassifier);
				if (result == null) result = caseMetaNamedElement(metaClassifier);
				if (result == null) result = caseMetaElement(metaClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.META_CLASS: {
				MetaClass metaClass = (MetaClass)theEObject;
				T result = caseMetaClass(metaClass);
				if (result == null) result = caseMetaClassifier(metaClass);
				if (result == null) result = caseMetaTypedElement(metaClass);
				if (result == null) result = caseMetaPackageableElement(metaClass);
				if (result == null) result = caseMetaNamedElement(metaClass);
				if (result == null) result = caseMetaElement(metaClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaElement(MetaElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaNamedElement(MetaNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Packageable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Packageable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaPackageableElement(MetaPackageableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaPackage(MetaPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaTypedElement(MetaTypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaModel(MetaModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaProperty(MetaProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaClassifier(MetaClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaClass(MetaClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //StructureSwitch
