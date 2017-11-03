/**
 */
package language.foundation.relationship;

import language.foundation.structure.MetaClassifier;
import language.foundation.structure.MetaPackageableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link language.foundation.relationship.MetaRelationship#getSource <em>Source</em>}</li>
 *   <li>{@link language.foundation.relationship.MetaRelationship#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see language.foundation.relationship.RelationshipPackage#getMetaRelationship()
 * @model abstract="true"
 * @generated
 */
public interface MetaRelationship extends MetaPackageableElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(MetaClassifier)
	 * @see language.foundation.relationship.RelationshipPackage#getMetaRelationship_Source()
	 * @model required="true"
	 * @generated
	 */
	MetaClassifier getSource();

	/**
	 * Sets the value of the '{@link language.foundation.relationship.MetaRelationship#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(MetaClassifier value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(MetaClassifier)
	 * @see language.foundation.relationship.RelationshipPackage#getMetaRelationship_Target()
	 * @model required="true"
	 * @generated
	 */
	MetaClassifier getTarget();

	/**
	 * Sets the value of the '{@link language.foundation.relationship.MetaRelationship#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(MetaClassifier value);

} // MetaRelationship
