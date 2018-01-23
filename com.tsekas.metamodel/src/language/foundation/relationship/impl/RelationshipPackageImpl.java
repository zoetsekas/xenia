/**
 */
package language.foundation.relationship.impl;

import language.architecture.information.InformationPackage;

import language.architecture.information.impl.InformationPackageImpl;

import language.business.businessEntity.BusinessEntityPackage;
import language.business.businessEntity.impl.BusinessEntityPackageImpl;
import language.business.financial.financialProduct.ProductPackage;
import language.business.financial.financialProduct.impl.ProductPackageImpl;
import language.foundation.datatype.DatatypePackage;

import language.foundation.datatype.impl.DatatypePackageImpl;

import language.foundation.relationship.MetaInheritance;
import language.foundation.relationship.MetaRelationship;
import language.foundation.relationship.RelationshipFactory;
import language.foundation.relationship.RelationshipPackage;

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
public class RelationshipPackageImpl extends EPackageImpl implements RelationshipPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaInheritanceEClass = null;

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
	 * @see language.foundation.relationship.RelationshipPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RelationshipPackageImpl() {
		super(eNS_URI, RelationshipFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RelationshipPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RelationshipPackage init() {
		if (isInited) return (RelationshipPackage)EPackage.Registry.INSTANCE.getEPackage(RelationshipPackage.eNS_URI);

		// Obtain or create and register package
		RelationshipPackageImpl theRelationshipPackage = (RelationshipPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RelationshipPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RelationshipPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		StructurePackageImpl theStructurePackage = (StructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) instanceof StructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) : StructurePackage.eINSTANCE);
		DatatypePackageImpl theDatatypePackage = (DatatypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypePackage.eNS_URI) instanceof DatatypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypePackage.eNS_URI) : DatatypePackage.eINSTANCE);
		InformationPackageImpl theInformationPackage = (InformationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InformationPackage.eNS_URI) instanceof InformationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InformationPackage.eNS_URI) : InformationPackage.eINSTANCE);
		ProductPackageImpl theProductPackage = (ProductPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProductPackage.eNS_URI) instanceof ProductPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProductPackage.eNS_URI) : ProductPackage.eINSTANCE);
		BusinessEntityPackageImpl theBusinessEntityPackage = (BusinessEntityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BusinessEntityPackage.eNS_URI) instanceof BusinessEntityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BusinessEntityPackage.eNS_URI) : BusinessEntityPackage.eINSTANCE);

		// Create package meta-data objects
		theRelationshipPackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theDatatypePackage.createPackageContents();
		theInformationPackage.createPackageContents();
		theProductPackage.createPackageContents();
		theBusinessEntityPackage.createPackageContents();

		// Initialize created meta-data
		theRelationshipPackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theDatatypePackage.initializePackageContents();
		theInformationPackage.initializePackageContents();
		theProductPackage.initializePackageContents();
		theBusinessEntityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRelationshipPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RelationshipPackage.eNS_URI, theRelationshipPackage);
		return theRelationshipPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaRelationship() {
		return metaRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaRelationship_Source() {
		return (EReference)metaRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaRelationship_Target() {
		return (EReference)metaRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaInheritance() {
		return metaInheritanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipFactory getRelationshipFactory() {
		return (RelationshipFactory)getEFactoryInstance();
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
		metaRelationshipEClass = createEClass(META_RELATIONSHIP);
		createEReference(metaRelationshipEClass, META_RELATIONSHIP__SOURCE);
		createEReference(metaRelationshipEClass, META_RELATIONSHIP__TARGET);

		metaInheritanceEClass = createEClass(META_INHERITANCE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		metaRelationshipEClass.getESuperTypes().add(theStructurePackage.getMetaPackageableElement());
		metaInheritanceEClass.getESuperTypes().add(this.getMetaRelationship());

		// Initialize classes, features, and operations; add parameters
		initEClass(metaRelationshipEClass, MetaRelationship.class, "MetaRelationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetaRelationship_Source(), theStructurePackage.getMetaClassifier(), null, "source", null, 1, 1, MetaRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetaRelationship_Target(), theStructurePackage.getMetaClassifier(), null, "target", null, 1, 1, MetaRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metaInheritanceEClass, MetaInheritance.class, "MetaInheritance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //RelationshipPackageImpl
