/**
 */
package language.business.financial.product.impl;

import language.architecture.information.InformationPackage;

import language.architecture.information.impl.InformationPackageImpl;

import language.business.businessEntity.BusinessEntityPackage;

import language.business.businessEntity.impl.BusinessEntityPackageImpl;

import language.business.financial.product.CashFlow;
import language.business.financial.product.CommodityFlow;
import language.business.financial.product.FinancialProduct;
import language.business.financial.product.Flow;
import language.business.financial.product.Option;
import language.business.financial.product.ProductFactory;
import language.business.financial.product.ProductModel;
import language.business.financial.product.ProductPackage;
import language.business.financial.product.TradeLeg;
import language.business.financial.product.Trigger;

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
public class ProductPackageImpl extends EPackageImpl implements ProductPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass financialProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tradeLegEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cashFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commodityFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productModelEClass = null;

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
	 * @see language.business.financial.product.ProductPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProductPackageImpl() {
		super(eNS_URI, ProductFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ProductPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProductPackage init() {
		if (isInited) return (ProductPackage)EPackage.Registry.INSTANCE.getEPackage(ProductPackage.eNS_URI);

		// Obtain or create and register package
		ProductPackageImpl theProductPackage = (ProductPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProductPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProductPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		StructurePackageImpl theStructurePackage = (StructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) instanceof StructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) : StructurePackage.eINSTANCE);
		RelationshipPackageImpl theRelationshipPackage = (RelationshipPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RelationshipPackage.eNS_URI) instanceof RelationshipPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RelationshipPackage.eNS_URI) : RelationshipPackage.eINSTANCE);
		DatatypePackageImpl theDatatypePackage = (DatatypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypePackage.eNS_URI) instanceof DatatypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypePackage.eNS_URI) : DatatypePackage.eINSTANCE);
		InformationPackageImpl theInformationPackage = (InformationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InformationPackage.eNS_URI) instanceof InformationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InformationPackage.eNS_URI) : InformationPackage.eINSTANCE);
		BusinessEntityPackageImpl theBusinessEntityPackage = (BusinessEntityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BusinessEntityPackage.eNS_URI) instanceof BusinessEntityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BusinessEntityPackage.eNS_URI) : BusinessEntityPackage.eINSTANCE);

		// Create package meta-data objects
		theProductPackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theRelationshipPackage.createPackageContents();
		theDatatypePackage.createPackageContents();
		theInformationPackage.createPackageContents();
		theBusinessEntityPackage.createPackageContents();

		// Initialize created meta-data
		theProductPackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theRelationshipPackage.initializePackageContents();
		theDatatypePackage.initializePackageContents();
		theInformationPackage.initializePackageContents();
		theBusinessEntityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProductPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProductPackage.eNS_URI, theProductPackage);
		return theProductPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinancialProduct() {
		return financialProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFinancialProduct_TradeLegs() {
		return (EReference)financialProductEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFinancialProduct_Options() {
		return (EReference)financialProductEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFinancialProduct_Triggers() {
		return (EReference)financialProductEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTradeLeg() {
		return tradeLegEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTradeLeg_Flows() {
		return (EReference)tradeLegEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOption() {
		return optionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrigger() {
		return triggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlow() {
		return flowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCashFlow() {
		return cashFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommodityFlow() {
		return commodityFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductModel() {
		return productModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductFactory getProductFactory() {
		return (ProductFactory)getEFactoryInstance();
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
		financialProductEClass = createEClass(FINANCIAL_PRODUCT);
		createEReference(financialProductEClass, FINANCIAL_PRODUCT__TRADE_LEGS);
		createEReference(financialProductEClass, FINANCIAL_PRODUCT__OPTIONS);
		createEReference(financialProductEClass, FINANCIAL_PRODUCT__TRIGGERS);

		tradeLegEClass = createEClass(TRADE_LEG);
		createEReference(tradeLegEClass, TRADE_LEG__FLOWS);

		optionEClass = createEClass(OPTION);

		triggerEClass = createEClass(TRIGGER);

		flowEClass = createEClass(FLOW);

		cashFlowEClass = createEClass(CASH_FLOW);

		commodityFlowEClass = createEClass(COMMODITY_FLOW);

		productModelEClass = createEClass(PRODUCT_MODEL);
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
		financialProductEClass.getESuperTypes().add(theInformationPackage.getEntity());
		tradeLegEClass.getESuperTypes().add(theInformationPackage.getEntity());
		optionEClass.getESuperTypes().add(theInformationPackage.getEntity());
		triggerEClass.getESuperTypes().add(theInformationPackage.getEntity());
		flowEClass.getESuperTypes().add(theInformationPackage.getEntity());
		cashFlowEClass.getESuperTypes().add(this.getFlow());
		commodityFlowEClass.getESuperTypes().add(this.getFlow());
		productModelEClass.getESuperTypes().add(theInformationPackage.getDomain());

		// Initialize classes, features, and operations; add parameters
		initEClass(financialProductEClass, FinancialProduct.class, "FinancialProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFinancialProduct_TradeLegs(), this.getTradeLeg(), null, "tradeLegs", null, 0, -1, FinancialProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFinancialProduct_Options(), this.getOption(), null, "options", null, 0, -1, FinancialProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFinancialProduct_Triggers(), this.getTrigger(), null, "triggers", null, 0, -1, FinancialProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tradeLegEClass, TradeLeg.class, "TradeLeg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTradeLeg_Flows(), this.getFlow(), null, "flows", null, 0, -1, TradeLeg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionEClass, Option.class, "Option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(triggerEClass, Trigger.class, "Trigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(flowEClass, Flow.class, "Flow", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cashFlowEClass, CashFlow.class, "CashFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(commodityFlowEClass, CommodityFlow.class, "CommodityFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(productModelEClass, ProductModel.class, "ProductModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ProductPackageImpl
