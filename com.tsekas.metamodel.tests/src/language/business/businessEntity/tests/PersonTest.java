/**
 */
package language.business.businessEntity.tests;

import junit.textui.TestRunner;

import language.business.businessEntity.BusinessEntityFactory;
import language.business.businessEntity.Person;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PersonTest extends BusinessEntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PersonTest.class);
	}

	/**
	 * Constructs a new Person test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Person test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Person getFixture() {
		return (Person)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BusinessEntityFactory.eINSTANCE.createPerson());
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

} //PersonTest
