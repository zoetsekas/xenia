/**
 */
package language.business.financial.financialProduct;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see language.business.financial.financialProduct.ProductPackage
 * @generated
 */
public interface ProductFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProductFactory eINSTANCE = language.business.financial.financialProduct.impl.ProductFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Financial Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Financial Product</em>'.
	 * @generated
	 */
	FinancialProduct createFinancialProduct();

	/**
	 * Returns a new object of class '<em>Trade Leg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trade Leg</em>'.
	 * @generated
	 */
	TradeLeg createTradeLeg();

	/**
	 * Returns a new object of class '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Option</em>'.
	 * @generated
	 */
	Option createOption();

	/**
	 * Returns a new object of class '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger</em>'.
	 * @generated
	 */
	Trigger createTrigger();

	/**
	 * Returns a new object of class '<em>Cash Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cash Flow</em>'.
	 * @generated
	 */
	CashFlow createCashFlow();

	/**
	 * Returns a new object of class '<em>Commodity Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Commodity Flow</em>'.
	 * @generated
	 */
	CommodityFlow createCommodityFlow();

	/**
	 * Returns a new object of class '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain</em>'.
	 * @generated
	 */
	ProductDomain createProductDomain();

	/**
	 * Returns a new object of class '<em>Sub Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Domain</em>'.
	 * @generated
	 */
	ProductSubDomain createProductSubDomain();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProductPackage getProductPackage();

} //ProductFactory
