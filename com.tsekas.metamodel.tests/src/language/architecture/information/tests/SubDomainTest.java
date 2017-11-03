/**
 */
package language.architecture.information.tests;

import junit.textui.TestRunner;

import language.architecture.information.InformationFactory;
import language.architecture.information.SubDomain;

import language.foundation.structure.tests.MetaPackageTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sub Domain</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubDomainTest extends MetaPackageTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SubDomainTest.class);
	}

	/**
	 * Constructs a new Sub Domain test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubDomainTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sub Domain test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SubDomain getFixture() {
		return (SubDomain)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InformationFactory.eINSTANCE.createSubDomain());
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

} //SubDomainTest
