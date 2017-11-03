/**
 */
package language.foundation.structure;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link language.foundation.structure.MetaModel#getPackagedElements <em>Packaged Elements</em>}</li>
 * </ul>
 *
 * @see language.foundation.structure.StructurePackage#getMetaModel()
 * @model abstract="true"
 * @generated
 */
public interface MetaModel extends MetaNamedElement {

	/**
	 * Returns the value of the '<em><b>Packaged Elements</b></em>' containment reference list.
	 * The list contents are of type {@link language.foundation.structure.MetaPackageableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packaged Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packaged Elements</em>' containment reference list.
	 * @see language.foundation.structure.StructurePackage#getMetaModel_PackagedElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetaPackageableElement> getPackagedElements();
} // MetaModel
