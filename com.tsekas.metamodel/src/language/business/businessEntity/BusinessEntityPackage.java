/**
 */
package language.business.businessEntity;

import language.architecture.information.InformationPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see language.business.businessEntity.BusinessEntityFactory
 * @model kind="package"
 * @generated
 */
public interface BusinessEntityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "businessEntity";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://zoe.tsekas.com/language/business/entity";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "businessEntity";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BusinessEntityPackage eINSTANCE = language.business.businessEntity.impl.BusinessEntityPackageImpl.init();

	/**
	 * The meta object id for the '{@link language.business.businessEntity.impl.BusinessEntityImpl <em>Business Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see language.business.businessEntity.impl.BusinessEntityImpl
	 * @see language.business.businessEntity.impl.BusinessEntityPackageImpl#getBusinessEntity()
	 * @generated
	 */
	int BUSINESS_ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ENTITY__IDENTIFIER = InformationPackage.CONCEPT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ENTITY__OWNER = InformationPackage.CONCEPT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ENTITY__NAME = InformationPackage.CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ENTITY__ABSTRACT = InformationPackage.CONCEPT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Owned Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ENTITY__OWNED_PROPERTIES = InformationPackage.CONCEPT__OWNED_PROPERTIES;

	/**
	 * The number of structural features of the '<em>Business Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ENTITY_FEATURE_COUNT = InformationPackage.CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Business Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ENTITY_OPERATION_COUNT = InformationPackage.CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link language.business.businessEntity.impl.OrganisationImpl <em>Organisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see language.business.businessEntity.impl.OrganisationImpl
	 * @see language.business.businessEntity.impl.BusinessEntityPackageImpl#getOrganisation()
	 * @generated
	 */
	int ORGANISATION = 1;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__IDENTIFIER = BUSINESS_ENTITY__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__OWNER = BUSINESS_ENTITY__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__NAME = BUSINESS_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__ABSTRACT = BUSINESS_ENTITY__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Owned Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__OWNED_PROPERTIES = BUSINESS_ENTITY__OWNED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__EXTENSION = BUSINESS_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Organisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_FEATURE_COUNT = BUSINESS_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Organisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_OPERATION_COUNT = BUSINESS_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link language.business.businessEntity.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see language.business.businessEntity.impl.PersonImpl
	 * @see language.business.businessEntity.impl.BusinessEntityPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 2;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__IDENTIFIER = BUSINESS_ENTITY__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__OWNER = BUSINESS_ENTITY__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = BUSINESS_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ABSTRACT = BUSINESS_ENTITY__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Owned Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__OWNED_PROPERTIES = BUSINESS_ENTITY__OWNED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EXTENSION = BUSINESS_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = BUSINESS_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = BUSINESS_ENTITY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link language.business.businessEntity.BusinessEntity <em>Business Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Entity</em>'.
	 * @see language.business.businessEntity.BusinessEntity
	 * @generated
	 */
	EClass getBusinessEntity();

	/**
	 * Returns the meta object for class '{@link language.business.businessEntity.Organisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organisation</em>'.
	 * @see language.business.businessEntity.Organisation
	 * @generated
	 */
	EClass getOrganisation();

	/**
	 * Returns the meta object for class '{@link language.business.businessEntity.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see language.business.businessEntity.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BusinessEntityFactory getBusinessEntityFactory();

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
		 * The meta object literal for the '{@link language.business.businessEntity.impl.BusinessEntityImpl <em>Business Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see language.business.businessEntity.impl.BusinessEntityImpl
		 * @see language.business.businessEntity.impl.BusinessEntityPackageImpl#getBusinessEntity()
		 * @generated
		 */
		EClass BUSINESS_ENTITY = eINSTANCE.getBusinessEntity();

		/**
		 * The meta object literal for the '{@link language.business.businessEntity.impl.OrganisationImpl <em>Organisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see language.business.businessEntity.impl.OrganisationImpl
		 * @see language.business.businessEntity.impl.BusinessEntityPackageImpl#getOrganisation()
		 * @generated
		 */
		EClass ORGANISATION = eINSTANCE.getOrganisation();

		/**
		 * The meta object literal for the '{@link language.business.businessEntity.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see language.business.businessEntity.impl.PersonImpl
		 * @see language.business.businessEntity.impl.BusinessEntityPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

	}

} //BusinessEntityPackage
