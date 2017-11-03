/**
 */
package language.business.financial.product.tests;

import junit.textui.TestRunner;

import language.business.financial.product.CommodityFlow;
import language.business.financial.product.ProductFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Commodity Flow</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommodityFlowTest extends FlowTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CommodityFlowTest.class);
	}

	/**
	 * Constructs a new Commodity Flow test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommodityFlowTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Commodity Flow test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CommodityFlow getFixture() {
		return (CommodityFlow)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ProductFactory.eINSTANCE.createCommodityFlow());
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

} //CommodityFlowTest
