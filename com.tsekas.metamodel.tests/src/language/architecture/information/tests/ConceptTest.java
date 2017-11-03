/**
 */
package language.architecture.information.tests;

import junit.textui.TestRunner;

import language.architecture.information.Concept;
import language.architecture.information.InformationFactory;

import language.foundation.structure.tests.MetaClassTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Concept</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConceptTest extends MetaClassTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConceptTest.class);
	}

	/**
	 * Constructs a new Concept test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Concept test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Concept getFixture() {
		return (Concept)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InformationFactory.eINSTANCE.createConcept());
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

} //ConceptTest
