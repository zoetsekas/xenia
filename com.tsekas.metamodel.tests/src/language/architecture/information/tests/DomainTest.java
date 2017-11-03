/**
 */
package language.architecture.information.tests;

import junit.textui.TestRunner;

import language.architecture.information.Domain;
import language.architecture.information.InformationFactory;

import language.foundation.structure.tests.MetaModelTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainTest extends MetaModelTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DomainTest.class);
	}

	/**
	 * Constructs a new Domain test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Domain test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Domain getFixture() {
		return (Domain)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InformationFactory.eINSTANCE.createDomain());
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

} //DomainTest