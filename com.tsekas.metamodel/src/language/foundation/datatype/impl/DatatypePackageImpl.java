/**
 */
package language.foundation.datatype.impl;

import language.architecture.information.InformationPackage;

import language.architecture.information.impl.InformationPackageImpl;

import language.business.businessEntity.BusinessEntityPackage;
import language.business.businessEntity.impl.BusinessEntityPackageImpl;
import language.business.financial.product.ProductPackage;
import language.business.financial.product.impl.ProductPackageImpl;
import language.foundation.datatype.DatatypeFactory;
import language.foundation.datatype.DatatypePackage;
import language.foundation.datatype.MetaDataType;
import language.foundation.datatype.MetaText;

import language.foundation.relationship.RelationshipPackage;

import language.foundation.relationship.impl.RelationshipPackageImpl;

import language.foundation.structure.StructurePackage;

import language.foundation.structure.impl.StructurePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatatypePackageImpl extends EPackageImpl implements DatatypePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaTextEClass = null;

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
	 * @see language.foundation.datatype.DatatypePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatatypePackageImpl() {
		super(eNS_URI, DatatypeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DatatypePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DatatypePackage init() {
		if (isInited) return (DatatypePackage)EPackage.Registry.INSTANCE.getEPackage(DatatypePackage.eNS_URI);

		// Obtain or create and register package
		DatatypePackageImpl theDatatypePackage = (DatatypePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DatatypePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DatatypePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		StructurePackageImpl theStructurePackage = (StructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) instanceof StructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) : StructurePackage.eINSTANCE);
		RelationshipPackageImpl theRelationshipPackage = (RelationshipPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RelationshipPackage.eNS_URI) instanceof RelationshipPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RelationshipPackage.eNS_URI) : RelationshipPackage.eINSTANCE);
		InformationPackageImpl theInformationPackage = (InformationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InformationPackage.eNS_URI) instanceof InformationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InformationPackage.eNS_URI) : InformationPackage.eINSTANCE);
		ProductPackageImpl theProductPackage = (ProductPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProductPackage.eNS_URI) instanceof ProductPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProductPackage.eNS_URI) : ProductPackage.eINSTANCE);
		BusinessEntityPackageImpl theBusinessEntityPackage = (BusinessEntityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BusinessEntityPackage.eNS_URI) instanceof BusinessEntityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BusinessEntityPackage.eNS_URI) : BusinessEntityPackage.eINSTANCE);

		// Create package meta-data objects
		theDatatypePackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theRelationshipPackage.createPackageContents();
		theInformationPackage.createPackageContents();
		theProductPackage.createPackageContents();
		theBusinessEntityPackage.createPackageContents();

		// Initialize created meta-data
		theDatatypePackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theRelationshipPackage.initializePackageContents();
		theInformationPackage.initializePackageContents();
		theProductPackage.initializePackageContents();
		theBusinessEntityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatatypePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DatatypePackage.eNS_URI, theDatatypePackage);
		return theDatatypePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaDataType() {
		return metaDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaText() {
		return metaTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaText_MinLength() {
		return (EAttribute)metaTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaText_MaxLength() {
		return (EAttribute)metaTextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaText_Length() {
		return (EAttribute)metaTextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaText_Pattern() {
		return (EAttribute)metaTextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeFactory getDatatypeFactory() {
		return (DatatypeFactory)getEFactoryInstance();
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
		metaDataTypeEClass = createEClass(META_DATA_TYPE);

		metaTextEClass = createEClass(META_TEXT);
		createEAttribute(metaTextEClass, META_TEXT__MIN_LENGTH);
		createEAttribute(metaTextEClass, META_TEXT__MAX_LENGTH);
		createEAttribute(metaTextEClass, META_TEXT__LENGTH);
		createEAttribute(metaTextEClass, META_TEXT__PATTERN);
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
		metaDataTypeEClass.getESuperTypes().add(theStructurePackage.getMetaPackageableElement());
		metaTextEClass.getESuperTypes().add(this.getMetaDataType());

		// Initialize classes, features, and operations; add parameters
		initEClass(metaDataTypeEClass, MetaDataType.class, "MetaDataType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(metaTextEClass, MetaText.class, "MetaText", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetaText_MinLength(), ecorePackage.getEInt(), "minLength", null, 0, 1, MetaText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetaText_MaxLength(), ecorePackage.getEInt(), "maxLength", null, 0, 1, MetaText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetaText_Length(), ecorePackage.getEInt(), "length", null, 0, 1, MetaText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetaText_Pattern(), ecorePackage.getEString(), "pattern", null, 0, 1, MetaText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DatatypePackageImpl
