/**
 */
package language.business.financial.product;

import language.architecture.information.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Financial Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link language.business.financial.product.FinancialProduct#getTradeLegs <em>Trade Legs</em>}</li>
 *   <li>{@link language.business.financial.product.FinancialProduct#getOptions <em>Options</em>}</li>
 *   <li>{@link language.business.financial.product.FinancialProduct#getTriggers <em>Triggers</em>}</li>
 * </ul>
 *
 * @see language.business.financial.product.ProductPackage#getFinancialProduct()
 * @model
 * @generated
 */
public interface FinancialProduct extends Entity {
	/**
	 * Returns the value of the '<em><b>Trade Legs</b></em>' containment reference list.
	 * The list contents are of type {@link language.business.financial.product.TradeLeg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trade Legs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trade Legs</em>' containment reference list.
	 * @see language.business.financial.product.ProductPackage#getFinancialProduct_TradeLegs()
	 * @model containment="true"
	 * @generated
	 */
	EList<TradeLeg> getTradeLegs();

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link language.business.financial.product.Option}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see language.business.financial.product.ProductPackage#getFinancialProduct_Options()
	 * @model containment="true"
	 * @generated
	 */
	EList<Option> getOptions();

	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' containment reference list.
	 * The list contents are of type {@link language.business.financial.product.Trigger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' containment reference list.
	 * @see language.business.financial.product.ProductPackage#getFinancialProduct_Triggers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Trigger> getTriggers();

} // FinancialProduct
