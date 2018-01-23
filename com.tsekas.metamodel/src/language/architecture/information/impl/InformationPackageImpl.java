/**
 */
package language.architecture.information.impl;

import language.architecture.information.Attribute;
import language.architecture.information.Concept;
import language.architecture.information.Domain;
import language.architecture.information.Entity;
import language.architecture.information.Extension;
import language.architecture.information.InformationFactory;
import language.architecture.information.InformationPackage;
import language.architecture.information.SubDomain;

import language.business.businessEntity.BusinessEntityPackage;
import language.business.businessEntity.impl.BusinessEntityPackageImpl;
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

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InformationPackageImpl extends EPackageImpl implements InformationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionEClass = null;

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
	 * @see language.architecture.information.InformationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InformationPackageImpl() {
		super(eNS_URI, InformationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InformationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InformationPackage init() {
		if (isInited) return (InformationPackage)EPackage.Registry.INSTANCE.getEPackage(InformationPackage.eNS_URI);

		// Obtain or create and register package
		InformationPackageImpl theInformationPackage = (InformationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InformationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InformationPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		StructurePackageImpl theStructurePackage = (StructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) instanceof StructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) : StructurePackage.eINSTANCE);
		RelationshipPackageImpl theRelationshipPackage = (RelationshipPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RelationshipPackage.eNS_URI) instanceof RelationshipPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RelationshipPackage.eNS_URI) : RelationshipPackage.eINSTANCE);
		DatatypePackageImpl theDatatypePackage = (DatatypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypePackage.eNS_URI) instanceof DatatypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypePackage.eNS_URI) : DatatypePackage.eINSTANCE);
		ProductPackageImpl theProductPackage = (ProductPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProductPackage.eNS_URI) instanceof ProductPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProductPackage.eNS_URI) : ProductPackage.eINSTANCE);
		BusinessEntityPackageImpl theBusinessEntityPackage = (BusinessEntityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BusinessEntityPackage.eNS_URI) instanceof BusinessEntityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BusinessEntityPackage.eNS_URI) : BusinessEntityPackage.eINSTANCE);

		// Create package meta-data objects
		theInformationPackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theRelationshipPackage.createPackageContents();
		theDatatypePackage.createPackageContents();
		theProductPackage.createPackageContents();
		theBusinessEntityPackage.createPackageContents();

		// Initialize created meta-data
		theInformationPackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theRelationshipPackage.initializePackageContents();
		theDatatypePackage.initializePackageContents();
		theProductPackage.initializePackageContents();
		theBusinessEntityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInformationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InformationPackage.eNS_URI, theInformationPackage);
		return theInformationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomain() {
		return domainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubDomain() {
		return subDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcept() {
		return conceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Extension() {
		return (EReference)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtension() {
		return extensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationFactory getInformationFactory() {
		return (InformationFactory)getEFactoryInstance();
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
		domainEClass = createEClass(DOMAIN);

		subDomainEClass = createEClass(SUB_DOMAIN);

		conceptEClass = createEClass(CONCEPT);

		entityEClass = createEClass(ENTITY);
		createEReference(entityEClass, ENTITY__EXTENSION);

		attributeEClass = createEClass(ATTRIBUTE);

		extensionEClass = createEClass(EXTENSION);
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
		StructurePackage theStructurePackage = (StructurePackage)EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI);
		RelationshipPackage theRelationshipPackage = (RelationshipPackage)EPackage.Registry.INSTANCE.getEPackage(RelationshipPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		domainEClass.getESuperTypes().add(theStructurePackage.getMetaModel());
		subDomainEClass.getESuperTypes().add(theStructurePackage.getMetaPackage());
		conceptEClass.getESuperTypes().add(theStructurePackage.getMetaClass());
		entityEClass.getESuperTypes().add(this.getConcept());
		attributeEClass.getESuperTypes().add(theStructurePackage.getMetaProperty());
		extensionEClass.getESuperTypes().add(theRelationshipPackage.getMetaInheritance());

		// Initialize classes, features, and operations; add parameters
		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subDomainEClass, SubDomain.class, "SubDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conceptEClass, Concept.class, "Concept", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntity_Extension(), this.getExtension(), null, "extension", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(extensionEClass, Extension.class, "Extension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //InformationPackageImpl
