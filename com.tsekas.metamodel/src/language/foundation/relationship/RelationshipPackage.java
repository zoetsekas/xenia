/**
 */
package language.foundation.relationship;

import language.foundation.structure.StructurePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see language.foundation.relationship.RelationshipFactory
 * @model kind="package"
 * @generated
 */
public interface RelationshipPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "relationship";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://zoe.tsekas.com/language/foundation/relationship";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "relationship";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RelationshipPackage eINSTANCE = language.foundation.relationship.impl.RelationshipPackageImpl.init();

	/**
	 * The meta object id for the '{@link language.foundation.relationship.impl.MetaRelationshipImpl <em>Meta Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see language.foundation.relationship.impl.MetaRelationshipImpl
	 * @see language.foundation.relationship.impl.RelationshipPackageImpl#getMetaRelationship()
	 * @generated
	 */
	int META_RELATIONSHIP = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_RELATIONSHIP__IDENTIFIER = StructurePackage.META_PACKAGEABLE_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_RELATIONSHIP__OWNER = StructurePackage.META_PACKAGEABLE_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_RELATIONSHIP__NAME = StructurePackage.META_PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_RELATIONSHIP__SOURCE = StructurePackage.META_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_RELATIONSHIP__TARGET = StructurePackage.META_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Meta Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_RELATIONSHIP_FEATURE_COUNT = StructurePackage.META_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Meta Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_RELATIONSHIP_OPERATION_COUNT = StructurePackage.META_PACKAGEABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link language.foundation.relationship.impl.MetaInheritanceImpl <em>Meta Inheritance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see language.foundation.relationship.impl.MetaInheritanceImpl
	 * @see language.foundation.relationship.impl.RelationshipPackageImpl#getMetaInheritance()
	 * @generated
	 */
	int META_INHERITANCE = 1;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INHERITANCE__IDENTIFIER = META_RELATIONSHIP__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INHERITANCE__OWNER = META_RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INHERITANCE__NAME = META_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INHERITANCE__SOURCE = META_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INHERITANCE__TARGET = META_RELATIONSHIP__TARGET;

	/**
	 * The number of structural features of the '<em>Meta Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INHERITANCE_FEATURE_COUNT = META_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Meta Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INHERITANCE_OPERATION_COUNT = META_RELATIONSHIP_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link language.foundation.relationship.MetaRelationship <em>Meta Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Relationship</em>'.
	 * @see language.foundation.relationship.MetaRelationship
	 * @generated
	 */
	EClass getMetaRelationship();

	/**
	 * Returns the meta object for the reference '{@link language.foundation.relationship.MetaRelationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see language.foundation.relationship.MetaRelationship#getSource()
	 * @see #getMetaRelationship()
	 * @generated
	 */
	EReference getMetaRelationship_Source();

	/**
	 * Returns the meta object for the reference '{@link language.foundation.relationship.MetaRelationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see language.foundation.relationship.MetaRelationship#getTarget()
	 * @see #getMetaRelationship()
	 * @generated
	 */
	EReference getMetaRelationship_Target();

	/**
	 * Returns the meta object for class '{@link language.foundation.relationship.MetaInheritance <em>Meta Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Inheritance</em>'.
	 * @see language.foundation.relationship.MetaInheritance
	 * @generated
	 */
	EClass getMetaInheritance();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RelationshipFactory getRelationshipFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link language.foundation.relationship.impl.MetaRelationshipImpl <em>Meta Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see language.foundation.relationship.impl.MetaRelationshipImpl
		 * @see language.foundation.relationship.impl.RelationshipPackageImpl#getMetaRelationship()
		 * @generated
		 */
		EClass META_RELATIONSHIP = eINSTANCE.getMetaRelationship();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_RELATIONSHIP__SOURCE = eINSTANCE.getMetaRelationship_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_RELATIONSHIP__TARGET = eINSTANCE.getMetaRelationship_Target();

		/**
		 * The meta object literal for the '{@link language.foundation.relationship.impl.MetaInheritanceImpl <em>Meta Inheritance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see language.foundation.relationship.impl.MetaInheritanceImpl
		 * @see language.foundation.relationship.impl.RelationshipPackageImpl#getMetaInheritance()
		 * @generated
		 */
		EClass META_INHERITANCE = eINSTANCE.getMetaInheritance();

	}

} //RelationshipPackage
