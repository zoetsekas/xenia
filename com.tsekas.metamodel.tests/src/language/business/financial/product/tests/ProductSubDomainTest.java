/**
 */
package language.business.financial.product.tests;

import junit.textui.TestRunner;

import language.architecture.information.tests.SubDomainTest;

import language.business.financial.product.ProductFactory;
import language.business.financial.product.ProductSubDomain;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sub Domain</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProductSubDomainTest extends SubDomainTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProductSubDomainTest.class);
	}

	/**
	 * Constructs a new Sub Domain test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductSubDomainTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sub Domain test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProductSubDomain getFixture() {
		return (ProductSubDomain)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ProductFactory.eINSTANCE.createProductSubDomain());
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

} //ProductSubDomainTest
