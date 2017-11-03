/**
 */
package language.business.financial.product.util;

import language.architecture.information.Concept;
import language.architecture.information.Domain;
import language.architecture.information.Entity;

import language.architecture.information.SubDomain;
import language.business.financial.product.*;

import language.foundation.structure.MetaClass;
import language.foundation.structure.MetaClassifier;
import language.foundation.structure.MetaElement;
import language.foundation.structure.MetaModel;
import language.foundation.structure.MetaNamedElement;
import language.foundation.structure.MetaPackage;
import language.foundation.structure.MetaPackageableElement;
import language.foundation.structure.MetaTypedElement;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see language.business.financial.product.ProductPackage
 * @generated
 */
public class ProductSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProductPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductSwitch() {
		if (modelPackage == null) {
			modelPackage = ProductPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ProductPackage.FINANCIAL_PRODUCT: {
				FinancialProduct financialProduct = (FinancialProduct)theEObject;
				T result = caseFinancialProduct(financialProduct);
				if (result == null) result = caseEntity(financialProduct);
				if (result == null) result = caseConcept(financialProduct);
				if (result == null) result = caseMetaClass(financialProduct);
				if (result == null) result = caseMetaClassifier(financialProduct);
				if (result == null) result = caseMetaTypedElement(financialProduct);
				if (result == null) result = caseMetaPackageableElement(financialProduct);
				if (result == null) result = caseMetaNamedElement(financialProduct);
				if (result == null) result = caseMetaElement(financialProduct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductPackage.TRADE_LEG: {
				TradeLeg tradeLeg = (TradeLeg)theEObject;
				T result = caseTradeLeg(tradeLeg);
				if (result == null) result = caseEntity(tradeLeg);
				if (result == null) result = caseConcept(tradeLeg);
				if (result == null) result = caseMetaClass(tradeLeg);
				if (result == null) result = caseMetaClassifier(tradeLeg);
				if (result == null) result = caseMetaTypedElement(tradeLeg);
				if (result == null) result = caseMetaPackageableElement(tradeLeg);
				if (result == null) result = caseMetaNamedElement(tradeLeg);
				if (result == null) result = caseMetaElement(tradeLeg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductPackage.OPTION: {
				Option option = (Option)theEObject;
				T result = caseOption(option);
				if (result == null) result = caseEntity(option);
				if (result == null) result = caseConcept(option);
				if (result == null) result = caseMetaClass(option);
				if (result == null) result = caseMetaClassifier(option);
				if (result == null) result = caseMetaTypedElement(option);
				if (result == null) result = caseMetaPackageableElement(option);
				if (result == null) result = caseMetaNamedElement(option);
				if (result == null) result = caseMetaElement(option);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductPackage.TRIGGER: {
				Trigger trigger = (Trigger)theEObject;
				T result = caseTrigger(trigger);
				if (result == null) result = caseEntity(trigger);
				if (result == null) result = caseConcept(trigger);
				if (result == null) result = caseMetaClass(trigger);
				if (result == null) result = caseMetaClassifier(trigger);
				if (result == null) result = caseMetaTypedElement(trigger);
				if (result == null) result = caseMetaPackageableElement(trigger);
				if (result == null) result = caseMetaNamedElement(trigger);
				if (result == null) result = caseMetaElement(trigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductPackage.FLOW: {
				Flow flow = (Flow)theEObject;
				T result = caseFlow(flow);
				if (result == null) result = caseEntity(flow);
				if (result == null) result = caseConcept(flow);
				if (result == null) result = caseMetaClass(flow);
				if (result == null) result = caseMetaClassifier(flow);
				if (result == null) result = caseMetaTypedElement(flow);
				if (result == null) result = caseMetaPackageableElement(flow);
				if (result == null) result = caseMetaNamedElement(flow);
				if (result == null) result = caseMetaElement(flow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductPackage.CASH_FLOW: {
				CashFlow cashFlow = (CashFlow)theEObject;
				T result = caseCashFlow(cashFlow);
				if (result == null) result = caseFlow(cashFlow);
				if (result == null) result = caseEntity(cashFlow);
				if (result == null) result = caseConcept(cashFlow);
				if (result == null) result = caseMetaClass(cashFlow);
				if (result == null) result = caseMetaClassifier(cashFlow);
				if (result == null) result = caseMetaTypedElement(cashFlow);
				if (result == null) result = caseMetaPackageableElement(cashFlow);
				if (result == null) result = caseMetaNamedElement(cashFlow);
				if (result == null) result = caseMetaElement(cashFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductPackage.COMMODITY_FLOW: {
				CommodityFlow commodityFlow = (CommodityFlow)theEObject;
				T result = caseCommodityFlow(commodityFlow);
				if (result == null) result = caseFlow(commodityFlow);
				if (result == null) result = caseEntity(commodityFlow);
				if (result == null) result = caseConcept(commodityFlow);
				if (result == null) result = caseMetaClass(commodityFlow);
				if (result == null) result = caseMetaClassifier(commodityFlow);
				if (result == null) result = caseMetaTypedElement(commodityFlow);
				if (result == null) result = caseMetaPackageableElement(commodityFlow);
				if (result == null) result = caseMetaNamedElement(commodityFlow);
				if (result == null) result = caseMetaElement(commodityFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductPackage.PRODUCT_DOMAIN: {
				ProductDomain productDomain = (ProductDomain)theEObject;
				T result = caseProductDomain(productDomain);
				if (result == null) result = caseDomain(productDomain);
				if (result == null) result = caseMetaModel(productDomain);
				if (result == null) result = caseMetaNamedElement(productDomain);
				if (result == null) result = caseMetaElement(productDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductPackage.PRODUCT_SUB_DOMAIN: {
				ProductSubDomain productSubDomain = (ProductSubDomain)theEObject;
				T result = caseProductSubDomain(productSubDomain);
				if (result == null) result = caseSubDomain(productSubDomain);
				if (result == null) result = caseMetaPackage(productSubDomain);
				if (result == null) result = caseMetaModel(productSubDomain);
				if (result == null) result = caseMetaPackageableElement(productSubDomain);
				if (result == null) result = caseMetaNamedElement(productSubDomain);
				if (result == null) result = caseMetaElement(productSubDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Financial Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Financial Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinancialProduct(FinancialProduct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trade Leg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trade Leg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTradeLeg(TradeLeg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOption(Option object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrigger(Trigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlow(Flow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cash Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cash Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCashFlow(CashFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Commodity Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Commodity Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommodityFlow(CommodityFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductDomain(ProductDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductSubDomain(ProductSubDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaElement(MetaElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaNamedElement(MetaNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Packageable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Packageable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaPackageableElement(MetaPackageableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaTypedElement(MetaTypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaClassifier(MetaClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaClass(MetaClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcept(Concept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaModel(MetaModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomain(Domain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaPackage(MetaPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubDomain(SubDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ProductSwitch
