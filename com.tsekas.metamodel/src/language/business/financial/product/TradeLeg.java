/**
 */
package language.business.financial.product;

import language.architecture.information.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trade Leg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link language.business.financial.product.TradeLeg#getFlows <em>Flows</em>}</li>
 * </ul>
 *
 * @see language.business.financial.product.ProductPackage#getTradeLeg()
 * @model
 * @generated
 */
public interface TradeLeg extends Entity {
	/**
	 * Returns the value of the '<em><b>Flows</b></em>' containment reference list.
	 * The list contents are of type {@link language.business.financial.product.Flow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flows</em>' containment reference list.
	 * @see language.business.financial.product.ProductPackage#getTradeLeg_Flows()
	 * @model containment="true"
	 * @generated
	 */
	EList<Flow> getFlows();

} // TradeLeg
