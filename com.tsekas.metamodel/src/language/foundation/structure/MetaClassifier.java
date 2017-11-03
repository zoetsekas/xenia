/**
 */
package language.foundation.structure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link language.foundation.structure.MetaClassifier#isAbstract <em>Abstract</em>}</li>
 * </ul>
 *
 * @see language.foundation.structure.StructurePackage#getMetaClassifier()
 * @model abstract="true"
 * @generated
 */
public interface MetaClassifier extends MetaTypedElement {
	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see language.foundation.structure.StructurePackage#getMetaClassifier_Abstract()
	 * @model
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link language.foundation.structure.MetaClassifier#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

} // MetaClassifier
