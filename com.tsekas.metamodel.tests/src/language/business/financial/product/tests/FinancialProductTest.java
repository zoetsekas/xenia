/**
 */
package language.business.financial.product.tests;

import junit.textui.TestRunner;

import language.architecture.information.tests.EntityTest;

import language.business.financial.product.FinancialProduct;
import language.business.financial.product.ProductFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Financial Product</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FinancialProductTest extends EntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FinancialProductTest.class);
	}

	/**
	 * Constructs a new Financial Product test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinancialProductTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Financial Product test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FinancialProduct getFixture() {
		return (FinancialProduct)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ProductFactory.eINSTANCE.createFinancialProduct());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //FinancialProductTest
