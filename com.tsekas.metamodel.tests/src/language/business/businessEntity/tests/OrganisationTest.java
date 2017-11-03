/**
 */
package language.business.businessEntity.tests;

import junit.textui.TestRunner;

import language.business.businessEntity.BusinessEntityFactory;
import language.business.businessEntity.Organisation;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Organisation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrganisationTest extends BusinessEntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OrganisationTest.class);
	}

	/**
	 * Constructs a new Organisation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganisationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Organisation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Organisation getFixture() {
		return (Organisation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BusinessEntityFactory.eINSTANCE.createOrganisation());
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

} //OrganisationTest
