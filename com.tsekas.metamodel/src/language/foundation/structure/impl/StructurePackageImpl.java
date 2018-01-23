/**
 */
package language.foundation.structure.impl;

import language.architecture.information.InformationPackage;

import language.architecture.information.impl.InformationPackageImpl;

import language.business.businessEntity.BusinessEntityPackage;
import language.business.businessEntity.impl.BusinessEntityPackageImpl;
import language.business.financial.financialProduct.ProductPackage;
import language.business.financial.financialProduct.impl.ProductPackageImpl;
import language.foundation.datatype.DatatypePackage;

import language.foundation.datatype.impl.DatatypePackageImpl;

import language.foundation.relationship.RelationshipPackage;

import language.foundation.relationship.impl.RelationshipPackageImpl;

import language.foundation.structure.MetaClass;
import language.foundation.structure.MetaClassifier;
import language.foundation.structure.MetaElement;
import language.foundation.structure.MetaModel;
import language.foundation.structure.MetaNamedElement;
import language.foundation.structure.MetaPackage;
import language.foundation.structure.MetaPackageableElement;
import language.foundation.structure.MetaProperty;
import language.foundation.structure.MetaTypedElement;
import language.foundation.structure.StructureFactory;
import language.foundation.structure.StructurePackage;

import org.eclipse.emf.ecore.EAttribute;
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
public class StructurePackageImpl extends EPackageImpl implements StructurePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaPackageableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaTypedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaClassEClass = null;

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
	 * @see language.foundation.structure.StructurePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StructurePackageImpl() {
		super(eNS_URI, StructureFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StructurePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StructurePackage init() {
		if (isInited) return (StructurePackage)EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI);

		// Obtain or create and register package
		StructurePackageImpl theStructurePackage = (StructurePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StructurePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StructurePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		RelationshipPackageImpl theRelationshipPackage = (RelationshipPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RelationshipPackage.eNS_URI) instanceof RelationshipPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RelationshipPackage.eNS_URI) : RelationshipPackage.eINSTANCE);
		DatatypePackageImpl theDatatypePackage = (DatatypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypePackage.eNS_URI) instanceof DatatypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypePackage.eNS_URI) : DatatypePackage.eINSTANCE);
		InformationPackageImpl theInformationPackage = (InformationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InformationPackage.eNS_URI) instanceof InformationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InformationPackage.eNS_URI) : InformationPackage.eINSTANCE);
		ProductPackageImpl theProductPackage = (ProductPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProductPackage.eNS_URI) instanceof ProductPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProductPackage.eNS_URI) : ProductPackage.eINSTANCE);
		BusinessEntityPackageImpl theBusinessEntityPackage = (BusinessEntityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BusinessEntityPackage.eNS_URI) instanceof BusinessEntityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BusinessEntityPackage.eNS_URI) : BusinessEntityPackage.eINSTANCE);

		// Create package meta-data objects
		theStructurePackage.createPackageContents();
		theRelationshipPackage.createPackageContents();
		theDatatypePackage.createPackageContents();
		theInformationPackage.createPackageContents();
		theProductPackage.createPackageContents();
		theBusinessEntityPackage.createPackageContents();

		// Initialize created meta-data
		theStructurePackage.initializePackageContents();
		theRelationshipPackage.initializePackageContents();
		theDatatypePackage.initializePackageContents();
		theInformationPackage.initializePackageContents();
		theProductPackage.initializePackageContents();
		theBusinessEntityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStructurePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StructurePackage.eNS_URI, theStructurePackage);
		return theStructurePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaElement() {
		return metaElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaElement_Identifier() {
		return (EAttribute)metaElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaElement_Owner() {
		return (EReference)metaElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaNamedElement() {
		return metaNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaNamedElement_Name() {
		return (EAttribute)metaNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaPackageableElement() {
		return metaPackageableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaPackage() {
		return metaPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaTypedElement() {
		return metaTypedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaModel() {
		return metaModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaModel_PackagedElements() {
		return (EReference)metaModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaProperty() {
		return metaPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaProperty_Type() {
		return (EReference)metaPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaProperty_LowerBound() {
		return (EAttribute)metaPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaProperty_UpperBound() {
		return (EAttribute)metaPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaClassifier() {
		return metaClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaClassifier_Abstract() {
		return (EAttribute)metaClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaClass() {
		return metaClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaClass_OwnedProperties() {
		return (EReference)metaClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureFactory getStructureFactory() {
		return (StructureFactory)getEFactoryInstance();
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
		metaElementEClass = createEClass(META_ELEMENT);
		createEAttribute(metaElementEClass, META_ELEMENT__IDENTIFIER);
		createEReference(metaElementEClass, META_ELEMENT__OWNER);

		metaNamedElementEClass = createEClass(META_NAMED_ELEMENT);
		createEAttribute(metaNamedElementEClass, META_NAMED_ELEMENT__NAME);

		metaPackageableElementEClass = createEClass(META_PACKAGEABLE_ELEMENT);

		metaPackageEClass = createEClass(META_PACKAGE);

		metaTypedElementEClass = createEClass(META_TYPED_ELEMENT);

		metaModelEClass = createEClass(META_MODEL);
		createEReference(metaModelEClass, META_MODEL__PACKAGED_ELEMENTS);

		metaPropertyEClass = createEClass(META_PROPERTY);
		createEReference(metaPropertyEClass, META_PROPERTY__TYPE);
		createEAttribute(metaPropertyEClass, META_PROPERTY__LOWER_BOUND);
		createEAttribute(metaPropertyEClass, META_PROPERTY__UPPER_BOUND);

		metaClassifierEClass = createEClass(META_CLASSIFIER);
		createEAttribute(metaClassifierEClass, META_CLASSIFIER__ABSTRACT);

		metaClassEClass = createEClass(META_CLASS);
		createEReference(metaClassEClass, META_CLASS__OWNED_PROPERTIES);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		metaNamedElementEClass.getESuperTypes().add(this.getMetaElement());
		metaPackageableElementEClass.getESuperTypes().add(this.getMetaNamedElement());
		metaPackageEClass.getESuperTypes().add(this.getMetaModel());
		metaPackageEClass.getESuperTypes().add(this.getMetaPackageableElement());
		metaTypedElementEClass.getESuperTypes().add(this.getMetaPackageableElement());
		metaModelEClass.getESuperTypes().add(this.getMetaNamedElement());
		metaPropertyEClass.getESuperTypes().add(this.getMetaNamedElement());
		metaClassifierEClass.getESuperTypes().add(this.getMetaTypedElement());
		metaClassEClass.getESuperTypes().add(this.getMetaClassifier());

		// Initialize classes, features, and operations; add parameters
		initEClass(metaElementEClass, MetaElement.class, "MetaElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetaElement_Identifier(), ecorePackage.getEString(), "identifier", null, 1, 1, MetaElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetaElement_Owner(), this.getMetaElement(), null, "owner", null, 0, 1, MetaElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metaNamedElementEClass, MetaNamedElement.class, "MetaNamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetaNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, MetaNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metaPackageableElementEClass, MetaPackageableElement.class, "MetaPackageableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(metaPackageEClass, MetaPackage.class, "MetaPackage", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(metaTypedElementEClass, MetaTypedElement.class, "MetaTypedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(metaModelEClass, MetaModel.class, "MetaModel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetaModel_PackagedElements(), this.getMetaPackageableElement(), null, "packagedElements", null, 0, -1, MetaModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metaPropertyEClass, MetaProperty.class, "MetaProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetaProperty_Type(), this.getMetaTypedElement(), null, "type", null, 1, 1, MetaProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetaProperty_LowerBound(), ecorePackage.getEInt(), "lowerBound", "0", 1, 1, MetaProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetaProperty_UpperBound(), ecorePackage.getEInt(), "upperBound", "1", 1, 1, MetaProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metaClassifierEClass, MetaClassifier.class, "MetaClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetaClassifier_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, MetaClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metaClassEClass, MetaClass.class, "MetaClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetaClass_OwnedProperties(), this.getMetaProperty(), null, "ownedProperties", null, 0, -1, MetaClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //StructurePackageImpl
