/**
 */
package language.foundation.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link language.foundation.structure.MetaClass#getOwnedProperties <em>Owned Properties</em>}</li>
 * </ul>
 *
 * @see language.foundation.structure.StructurePackage#getMetaClass()
 * @model abstract="true"
 * @generated
 */
public interface MetaClass extends MetaClassifier {
	/**
	 * Returns the value of the '<em><b>Owned Properties</b></em>' containment reference list.
	 * The list contents are of type {@link language.foundation.structure.MetaProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Properties</em>' containment reference list.
	 * @see language.foundation.structure.StructurePackage#getMetaClass_OwnedProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetaProperty> getOwnedProperties();

} // MetaClass
