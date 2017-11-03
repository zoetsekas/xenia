/**
 */
package language.business.financial.product.util;

import language.architecture.information.Concept;
import language.architecture.information.Domain;
import language.architecture.information.Entity;

import language.business.financial.product.*;

import language.foundation.structure.MetaClass;
import language.foundation.structure.MetaClassifier;
import language.foundation.structure.MetaElement;
import language.foundation.structure.MetaModel;
import language.foundation.structure.MetaNamedElement;
import language.foundation.structure.MetaPackageableElement;
import language.foundation.structure.MetaTypedElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see language.business.financial.product.ProductPackage
 * @generated
 */
public class ProductAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProductPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ProductPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductSwitch<Adapter> modelSwitch =
		new ProductSwitch<Adapter>() {
			@Override
			public Adapter caseFinancialProduct(FinancialProduct object) {
				return createFinancialProductAdapter();
			}
			@Override
			public Adapter caseTradeLeg(TradeLeg object) {
				return createTradeLegAdapter();
			}
			@Override
			public Adapter caseOption(Option object) {
				return createOptionAdapter();
			}
			@Override
			public Adapter caseTrigger(Trigger object) {
				return createTriggerAdapter();
			}
			@Override
			public Adapter caseFlow(Flow object) {
				return createFlowAdapter();
			}
			@Override
			public Adapter caseCashFlow(CashFlow object) {
				return createCashFlowAdapter();
			}
			@Override
			public Adapter caseCommodityFlow(CommodityFlow object) {
				return createCommodityFlowAdapter();
			}
			@Override
			public Adapter caseProductModel(ProductModel object) {
				return createProductModelAdapter();
			}
			@Override
			public Adapter caseMetaElement(MetaElement object) {
				return createMetaElementAdapter();
			}
			@Override
			public Adapter caseMetaNamedElement(MetaNamedElement object) {
				return createMetaNamedElementAdapter();
			}
			@Override
			public Adapter caseMetaPackageableElement(MetaPackageableElement object) {
				return createMetaPackageableElementAdapter();
			}
			@Override
			public Adapter caseMetaTypedElement(MetaTypedElement object) {
				return createMetaTypedElementAdapter();
			}
			@Override
			public Adapter caseMetaClassifier(MetaClassifier object) {
				return createMetaClassifierAdapter();
			}
			@Override
			public Adapter caseMetaClass(MetaClass object) {
				return createMetaClassAdapter();
			}
			@Override
			public Adapter caseConcept(Concept object) {
				return createConceptAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseMetaModel(MetaModel object) {
				return createMetaModelAdapter();
			}
			@Override
			public Adapter caseDomain(Domain object) {
				return createDomainAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link language.business.financial.product.FinancialProduct <em>Financial Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see language.business.financial.product.FinancialProduct
	 * @generated
	 */
	public Adapter createFinancialProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link language.business.financial.product.TradeLeg <em>Trade Leg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see language.business.financial.product.TradeLeg
	 * @generated
	 */
	public Adapter createTradeLegAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link language.business.financial.product.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see language.business.financial.product.Option
	 * @generated
	 */
	public Adapter createOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link language.business.financial.product.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see language.business.financial.product.Trigger
	 * @generated
	 */
	public Adapter createTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link language.business.financial.product.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see language.business.financial.product.Flow
	 * @generated
	 */
	public Adapter createFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link language.business.financial.product.CashFlow <em>Cash Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see language.business.financial.product.CashFlow
	 * @generated
	 */
	public Adapter createCashFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link language.business.financial.product.CommodityFlow <em>Commodity Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see language.business.financial.product.CommodityFlow
	 * @generated
	 */
	public Adapter createCommodityFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link language.business.financial.product.ProductModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see language.business.financial.product.ProductModel
	 * @generated
	 */
	public Adapter createProductModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link language.foundation.structure.MetaElement <em>Meta Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see language.foundation.structure.MetaElement
	 * @generated
	 */
	public Adapter createMetaElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link language.foundation.structure.MetaNamedElement <em>Meta Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see language.foundation.structure.MetaNamedElement
	 * @generated
	 */
	public Adapter createMetaNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link language.foundation.structure.MetaPackageableElement <em>Meta Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see language.foundation.structure.MetaPackageableElement
	 * @generated
	 */
	public Adapter createMetaPackageableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link language.foundation.structure.MetaTypedElement <em>Meta Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see language.foundation.structure.MetaTypedElement
	 * @generated
	 */
	public Adapter createMetaTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link language.foundation.structure.MetaClassifier <em>Meta Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see language.foundation.structure.MetaClassifier
	 * @generated
	 */
	public Adapter createMetaClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link language.foundation.structure.MetaClass <em>Meta Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see language.foundation.structure.MetaClass
	 * @generated
	 */
	public Adapter createMetaClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link language.architecture.information.Concept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see language.architecture.information.Concept
	 * @generated
	 */
	public Adapter createConceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link language.architecture.information.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see language.architecture.information.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link language.foundation.structure.MetaModel <em>Meta Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see language.foundation.structure.MetaModel
	 * @generated
	 */
	public Adapter createMetaModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link language.architecture.information.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see language.architecture.information.Domain
	 * @generated
	 */
	public Adapter createDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ProductAdapterFactory
