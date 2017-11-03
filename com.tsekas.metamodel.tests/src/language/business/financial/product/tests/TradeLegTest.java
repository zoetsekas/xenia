/**
 */
package language.business.financial.product.tests;

import junit.textui.TestRunner;

import language.architecture.information.tests.EntityTest;

import language.business.financial.product.ProductFactory;
import language.business.financial.product.TradeLeg;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Trade Leg</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TradeLegTest extends EntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TradeLegTest.class);
	}

	/**
	 * Constructs a new Trade Leg test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TradeLegTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Trade Leg test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TradeLeg getFixture() {
		return (TradeLeg)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ProductFactory.eINSTANCE.createTradeLeg());
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

} //TradeLegTest
