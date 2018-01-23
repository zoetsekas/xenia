/**
 */
package language.business.businessEntity.impl;

import language.architecture.information.InformationPackage;

import language.architecture.information.impl.InformationPackageImpl;

import language.business.businessEntity.BusinessEntity;
import language.business.businessEntity.BusinessEntityFactory;
import language.business.businessEntity.BusinessEntityPackage;
import language.business.businessEntity.Organisation;
import language.business.businessEntity.Person;
import language.business.financial.financialProduct.ProductPackage;
import language.business.financial.financialProduct.impl.ProductPackageImpl;
import language.foundation.datatype.DatatypePackage;

import language.foundation.datatype.impl.DatatypePackageImpl;

import language.foundation.relationship.RelationshipPackage;

import language.foundation.relationship.impl.RelationshipPackageImpl;

import language.foundation.structure.StructurePackage;

import language.foundation.structure.impl.StructurePackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BusinessEntityPackageImpl extends EPackageImpl implements BusinessEntityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organisationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see language.business.businessEntity.BusinessEntityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BusinessEntityPackageImpl() {
		super(eNS_URI, BusinessEntityFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BusinessEntityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BusinessEntityPackage init() {
		if (isInited) return (BusinessEntityPackage)EPackage.Registry.INSTANCE.getEPackage(BusinessEntityPackage.eNS_URI);

		// Obtain or create and register package
		BusinessEntityPackageImpl theBusinessEntityPackage = (BusinessEntityPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BusinessEntityPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BusinessEntityPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		StructurePackageImpl theStructurePackage = (StructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) instanceof StructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) : StructurePackage.eINSTANCE);
		RelationshipPackageImpl theRelationshipPackage = (RelationshipPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RelationshipPackage.eNS_URI) instanceof RelationshipPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RelationshipPackage.eNS_URI) : RelationshipPackage.eINSTANCE);
		DatatypePackageImpl theDatatypePackage = (DatatypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypePackage.eNS_URI) instanceof DatatypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypePackage.eNS_URI) : DatatypePackage.eINSTANCE);
		InformationPackageImpl theInformationPackage = (InformationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InformationPackage.eNS_URI) instanceof InformationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InformationPackage.eNS_URI) : InformationPackage.eINSTANCE);
		ProductPackageImpl theProductPackage = (ProductPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProductPackage.eNS_URI) instanceof ProductPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProductPackage.eNS_URI) : ProductPackage.eINSTANCE);

		// Create package meta-data objects
		theBusinessEntityPackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theRelationshipPackage.createPackageContents();
		theDatatypePackage.createPackageContents();
		theInformationPackage.createPackageContents();
		theProductPackage.createPackageContents();

		// Initialize created meta-data
		theBusinessEntityPackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theRelationshipPackage.initializePackageContents();
		theDatatypePackage.initializePackageContents();
		theInformationPackage.initializePackageContents();
		theProductPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBusinessEntityPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BusinessEntityPackage.eNS_URI, theBusinessEntityPackage);
		return theBusinessEntityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessEntity() {
		return businessEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganisation() {
		return organisationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessEntityFactory getBusinessEntityFactory() {
		return (BusinessEntityFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		businessEntityEClass = createEClass(BUSINESS_ENTITY);

		organisationEClass = createEClass(ORGANISATION);

		personEClass = createEClass(PERSON);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		InformationPackage theInformationPackage = (InformationPackage)EPackage.Registry.INSTANCE.getEPackage(InformationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		businessEntityEClass.getESuperTypes().add(theInformationPackage.getConcept());
		organisationEClass.getESuperTypes().add(this.getBusinessEntity());
		organisationEClass.getESuperTypes().add(theInformationPackage.getEntity());
		personEClass.getESuperTypes().add(this.getBusinessEntity());
		personEClass.getESuperTypes().add(theInformationPackage.getEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(businessEntityEClass, BusinessEntity.class, "BusinessEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(organisationEClass, Organisation.class, "Organisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //BusinessEntityPackageImpl
