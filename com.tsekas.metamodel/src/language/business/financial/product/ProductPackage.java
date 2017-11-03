/**
 */
package language.business.financial.product;

import language.architecture.information.InformationPackage;

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
 * @see language.business.financial.product.ProductFactory
 * @model kind="package"
 * @generated
 */
public interface ProductPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "product";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://zoe.tsekas.com/language/business/financial/product";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "product";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProductPackage eINSTANCE = language.business.financial.product.impl.ProductPackageImpl.init();

	/**
	 * The meta object id for the '{@link language.business.financial.product.impl.FinancialProductImpl <em>Financial Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see language.business.financial.product.impl.FinancialProductImpl
	 * @see language.business.financial.product.impl.ProductPackageImpl#getFinancialProduct()
	 * @generated
	 */
	int FINANCIAL_PRODUCT = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_PRODUCT__IDENTIFIER = InformationPackage.ENTITY__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_PRODUCT__OWNER = InformationPackage.ENTITY__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_PRODUCT__NAME = InformationPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_PRODUCT__ABSTRACT = InformationPackage.ENTITY__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Owned Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_PRODUCT__OWNED_PROPERTIES = InformationPackage.ENTITY__OWNED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_PRODUCT__EXTENSION = InformationPackage.ENTITY__EXTENSION;

	/**
	 * The feature id for the '<em><b>Trade Legs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_PRODUCT__TRADE_LEGS = InformationPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_PRODUCT__OPTIONS = InformationPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_PRODUCT__TRIGGERS = InformationPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Financial Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_PRODUCT_FEATURE_COUNT = InformationPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Financial Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_PRODUCT_OPERATION_COUNT = InformationPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link language.business.financial.product.impl.TradeLegImpl <em>Trade Leg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see language.business.financial.product.impl.TradeLegImpl
	 * @see language.business.financial.product.impl.ProductPackageImpl#getTradeLeg()
	 * @generated
	 */
	int TRADE_LEG = 1;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_LEG__IDENTIFIER = InformationPackage.ENTITY__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_LEG__OWNER = InformationPackage.ENTITY__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_LEG__NAME = InformationPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_LEG__ABSTRACT = InformationPackage.ENTITY__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Owned Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_LEG__OWNED_PROPERTIES = InformationPackage.ENTITY__OWNED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_LEG__EXTENSION = InformationPackage.ENTITY__EXTENSION;

	/**
	 * The feature id for the '<em><b>Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_LEG__FLOWS = InformationPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trade Leg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_LEG_FEATURE_COUNT = InformationPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trade Leg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_LEG_OPERATION_COUNT = InformationPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link language.business.financial.product.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see language.business.financial.product.impl.OptionImpl
	 * @see language.business.financial.product.impl.ProductPackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 2;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__IDENTIFIER = InformationPackage.ENTITY__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__OWNER = InformationPackage.ENTITY__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__NAME = InformationPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__ABSTRACT = InformationPackage.ENTITY__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Owned Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__OWNED_PROPERTIES = InformationPackage.ENTITY__OWNED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__EXTENSION = InformationPackage.ENTITY__EXTENSION;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = InformationPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_OPERATION_COUNT = InformationPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link language.business.financial.product.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see language.business.financial.product.impl.TriggerImpl
	 * @see language.business.financial.product.impl.ProductPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__IDENTIFIER = InformationPackage.ENTITY__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__OWNER = InformationPackage.ENTITY__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__NAME = InformationPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__ABSTRACT = InformationPackage.ENTITY__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Owned Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__OWNED_PROPERTIES = InformationPackage.ENTITY__OWNED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__EXTENSION = InformationPackage.ENTITY__EXTENSION;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = InformationPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = InformationPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link language.business.financial.product.impl.FlowImpl <em>Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see language.business.financial.product.impl.FlowImpl
	 * @see language.business.financial.product.impl.ProductPackageImpl#getFlow()
	 * @generated
	 */
	int FLOW = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__IDENTIFIER = InformationPackage.ENTITY__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__OWNER = InformationPackage.ENTITY__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__NAME = InformationPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__ABSTRACT = InformationPackage.ENTITY__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Owned Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__OWNED_PROPERTIES = InformationPackage.ENTITY__OWNED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__EXTENSION = InformationPackage.ENTITY__EXTENSION;

	/**
	 * The number of structural features of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FEATURE_COUNT = InformationPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_OPERATION_COUNT = InformationPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link language.business.financial.product.impl.CashFlowImpl <em>Cash Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see language.business.financial.product.impl.CashFlowImpl
	 * @see language.business.financial.product.impl.ProductPackageImpl#getCashFlow()
	 * @generated
	 */
	int CASH_FLOW = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_FLOW__IDENTIFIER = FLOW__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_FLOW__OWNER = FLOW__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_FLOW__NAME = FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_FLOW__ABSTRACT = FLOW__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Owned Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_FLOW__OWNED_PROPERTIES = FLOW__OWNED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_FLOW__EXTENSION = FLOW__EXTENSION;

	/**
	 * The number of structural features of the '<em>Cash Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_FLOW_FEATURE_COUNT = FLOW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cash Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_FLOW_OPERATION_COUNT = FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link language.business.financial.product.impl.CommodityFlowImpl <em>Commodity Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see language.business.financial.product.impl.CommodityFlowImpl
	 * @see language.business.financial.product.impl.ProductPackageImpl#getCommodityFlow()
	 * @generated
	 */
	int COMMODITY_FLOW = 6;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMODITY_FLOW__IDENTIFIER = FLOW__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMODITY_FLOW__OWNER = FLOW__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMODITY_FLOW__NAME = FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMODITY_FLOW__ABSTRACT = FLOW__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Owned Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMODITY_FLOW__OWNED_PROPERTIES = FLOW__OWNED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMODITY_FLOW__EXTENSION = FLOW__EXTENSION;

	/**
	 * The number of structural features of the '<em>Commodity Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMODITY_FLOW_FEATURE_COUNT = FLOW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Commodity Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMODITY_FLOW_OPERATION_COUNT = FLOW_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link language.business.financial.product.impl.ProductModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see language.business.financial.product.impl.ProductModelImpl
	 * @see language.business.financial.product.impl.ProductPackageImpl#getProductModel()
	 * @generated
	 */
	int PRODUCT_MODEL = 7;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__IDENTIFIER = InformationPackage.DOMAIN__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__OWNER = InformationPackage.DOMAIN__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__NAME = InformationPackage.DOMAIN__NAME;

	/**
	 * The feature id for the '<em><b>Packaged Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__PACKAGED_ELEMENTS = InformationPackage.DOMAIN__PACKAGED_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL_FEATURE_COUNT = InformationPackage.DOMAIN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL_OPERATION_COUNT = InformationPackage.DOMAIN_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link language.business.financial.product.FinancialProduct <em>Financial Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Financial Product</em>'.
	 * @see language.business.financial.product.FinancialProduct
	 * @generated
	 */
	EClass getFinancialProduct();

	/**
	 * Returns the meta object for the containment reference list '{@link language.business.financial.product.FinancialProduct#getTradeLegs <em>Trade Legs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trade Legs</em>'.
	 * @see language.business.financial.product.FinancialProduct#getTradeLegs()
	 * @see #getFinancialProduct()
	 * @generated
	 */
	EReference getFinancialProduct_TradeLegs();

	/**
	 * Returns the meta object for the containment reference list '{@link language.business.financial.product.FinancialProduct#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see language.business.financial.product.FinancialProduct#getOptions()
	 * @see #getFinancialProduct()
	 * @generated
	 */
	EReference getFinancialProduct_Options();

	/**
	 * Returns the meta object for the containment reference list '{@link language.business.financial.product.FinancialProduct#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triggers</em>'.
	 * @see language.business.financial.product.FinancialProduct#getTriggers()
	 * @see #getFinancialProduct()
	 * @generated
	 */
	EReference getFinancialProduct_Triggers();

	/**
	 * Returns the meta object for class '{@link language.business.financial.product.TradeLeg <em>Trade Leg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trade Leg</em>'.
	 * @see language.business.financial.product.TradeLeg
	 * @generated
	 */
	EClass getTradeLeg();

	/**
	 * Returns the meta object for the containment reference list '{@link language.business.financial.product.TradeLeg#getFlows <em>Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flows</em>'.
	 * @see language.business.financial.product.TradeLeg#getFlows()
	 * @see #getTradeLeg()
	 * @generated
	 */
	EReference getTradeLeg_Flows();

	/**
	 * Returns the meta object for class '{@link language.business.financial.product.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see language.business.financial.product.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for class '{@link language.business.financial.product.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see language.business.financial.product.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for class '{@link language.business.financial.product.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow</em>'.
	 * @see language.business.financial.product.Flow
	 * @generated
	 */
	EClass getFlow();

	/**
	 * Returns the meta object for class '{@link language.business.financial.product.CashFlow <em>Cash Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cash Flow</em>'.
	 * @see language.business.financial.product.CashFlow
	 * @generated
	 */
	EClass getCashFlow();

	/**
	 * Returns the meta object for class '{@link language.business.financial.product.CommodityFlow <em>Commodity Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commodity Flow</em>'.
	 * @see language.business.financial.product.CommodityFlow
	 * @generated
	 */
	EClass getCommodityFlow();

	/**
	 * Returns the meta object for class '{@link language.business.financial.product.ProductModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see language.business.financial.product.ProductModel
	 * @generated
	 */
	EClass getProductModel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProductFactory getProductFactory();

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
		 * The meta object literal for the '{@link language.business.financial.product.impl.FinancialProductImpl <em>Financial Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see language.business.financial.product.impl.FinancialProductImpl
		 * @see language.business.financial.product.impl.ProductPackageImpl#getFinancialProduct()
		 * @generated
		 */
		EClass FINANCIAL_PRODUCT = eINSTANCE.getFinancialProduct();

		/**
		 * The meta object literal for the '<em><b>Trade Legs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINANCIAL_PRODUCT__TRADE_LEGS = eINSTANCE.getFinancialProduct_TradeLegs();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINANCIAL_PRODUCT__OPTIONS = eINSTANCE.getFinancialProduct_Options();

		/**
		 * The meta object literal for the '<em><b>Triggers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINANCIAL_PRODUCT__TRIGGERS = eINSTANCE.getFinancialProduct_Triggers();

		/**
		 * The meta object literal for the '{@link language.business.financial.product.impl.TradeLegImpl <em>Trade Leg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see language.business.financial.product.impl.TradeLegImpl
		 * @see language.business.financial.product.impl.ProductPackageImpl#getTradeLeg()
		 * @generated
		 */
		EClass TRADE_LEG = eINSTANCE.getTradeLeg();

		/**
		 * The meta object literal for the '<em><b>Flows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRADE_LEG__FLOWS = eINSTANCE.getTradeLeg_Flows();

		/**
		 * The meta object literal for the '{@link language.business.financial.product.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see language.business.financial.product.impl.OptionImpl
		 * @see language.business.financial.product.impl.ProductPackageImpl#getOption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '{@link language.business.financial.product.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see language.business.financial.product.impl.TriggerImpl
		 * @see language.business.financial.product.impl.ProductPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '{@link language.business.financial.product.impl.FlowImpl <em>Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see language.business.financial.product.impl.FlowImpl
		 * @see language.business.financial.product.impl.ProductPackageImpl#getFlow()
		 * @generated
		 */
		EClass FLOW = eINSTANCE.getFlow();

		/**
		 * The meta object literal for the '{@link language.business.financial.product.impl.CashFlowImpl <em>Cash Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see language.business.financial.product.impl.CashFlowImpl
		 * @see language.business.financial.product.impl.ProductPackageImpl#getCashFlow()
		 * @generated
		 */
		EClass CASH_FLOW = eINSTANCE.getCashFlow();

		/**
		 * The meta object literal for the '{@link language.business.financial.product.impl.CommodityFlowImpl <em>Commodity Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see language.business.financial.product.impl.CommodityFlowImpl
		 * @see language.business.financial.product.impl.ProductPackageImpl#getCommodityFlow()
		 * @generated
		 */
		EClass COMMODITY_FLOW = eINSTANCE.getCommodityFlow();

		/**
		 * The meta object literal for the '{@link language.business.financial.product.impl.ProductModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see language.business.financial.product.impl.ProductModelImpl
		 * @see language.business.financial.product.impl.ProductPackageImpl#getProductModel()
		 * @generated
		 */
		EClass PRODUCT_MODEL = eINSTANCE.getProductModel();

	}

} //ProductPackage
