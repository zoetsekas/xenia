/**
 */
package language.architecture.information;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link language.architecture.information.Entity#getExtension <em>Extension</em>}</li>
 * </ul>
 *
 * @see language.architecture.information.InformationPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends Concept {

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' containment reference.
	 * @see #setExtension(Extension)
	 * @see language.architecture.information.InformationPackage#getEntity_Extension()
	 * @model containment="true"
	 * @generated
	 */
	Extension getExtension();

	/**
	 * Sets the value of the '{@link language.architecture.information.Entity#getExtension <em>Extension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' containment reference.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(Extension value);
} // Entity
