/**
 */
package language.business.financial.product.tests;

import junit.textui.TestRunner;

import language.business.financial.product.CashFlow;
import language.business.financial.product.ProductFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cash Flow</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CashFlowTest extends FlowTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CashFlowTest.class);
	}

	/**
	 * Constructs a new Cash Flow test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CashFlowTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Cash Flow test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CashFlow getFixture() {
		return (CashFlow)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ProductFactory.eINSTANCE.createCashFlow());
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

} //CashFlowTest
