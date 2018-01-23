/**
 */
package language.business.financial.financialProduct.impl;

import java.util.Collection;

import language.architecture.information.impl.EntityImpl;

import language.business.financial.financialProduct.FinancialProduct;
import language.business.financial.financialProduct.Option;
import language.business.financial.financialProduct.ProductPackage;
import language.business.financial.financialProduct.TradeLeg;
import language.business.financial.financialProduct.Trigger;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Financial Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link language.business.financial.financialProduct.impl.FinancialProductImpl#getTradeLegs <em>Trade Legs</em>}</li>
 *   <li>{@link language.business.financial.financialProduct.impl.FinancialProductImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link language.business.financial.financialProduct.impl.FinancialProductImpl#getTriggers <em>Triggers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FinancialProductImpl extends EntityImpl implements FinancialProduct {
	/**
	 * The cached value of the '{@link #getTradeLegs() <em>Trade Legs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTradeLegs()
	 * @generated
	 * @ordered
	 */
	protected EList<TradeLeg> tradeLegs;

	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Option> options;

	/**
	 * The cached value of the '{@link #getTriggers() <em>Triggers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggers()
	 * @generated
	 * @ordered
	 */
	protected EList<Trigger> triggers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinancialProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.FINANCIAL_PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TradeLeg> getTradeLegs() {
		if (tradeLegs == null) {
			tradeLegs = new EObjectContainmentEList<TradeLeg>(TradeLeg.class, this, ProductPackage.FINANCIAL_PRODUCT__TRADE_LEGS);
		}
		return tradeLegs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Option> getOptions() {
		if (options == null) {
			options = new EObjectContainmentEList<Option>(Option.class, this, ProductPackage.FINANCIAL_PRODUCT__OPTIONS);
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trigger> getTriggers() {
		if (triggers == null) {
			triggers = new EObjectContainmentEList<Trigger>(Trigger.class, this, ProductPackage.FINANCIAL_PRODUCT__TRIGGERS);
		}
		return triggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductPackage.FINANCIAL_PRODUCT__TRADE_LEGS:
				return ((InternalEList<?>)getTradeLegs()).basicRemove(otherEnd, msgs);
			case ProductPackage.FINANCIAL_PRODUCT__OPTIONS:
				return ((InternalEList<?>)getOptions()).basicRemove(otherEnd, msgs);
			case ProductPackage.FINANCIAL_PRODUCT__TRIGGERS:
				return ((InternalEList<?>)getTriggers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductPackage.FINANCIAL_PRODUCT__TRADE_LEGS:
				return getTradeLegs();
			case ProductPackage.FINANCIAL_PRODUCT__OPTIONS:
				return getOptions();
			case ProductPackage.FINANCIAL_PRODUCT__TRIGGERS:
				return getTriggers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProductPackage.FINANCIAL_PRODUCT__TRADE_LEGS:
				getTradeLegs().clear();
				getTradeLegs().addAll((Collection<? extends TradeLeg>)newValue);
				return;
			case ProductPackage.FINANCIAL_PRODUCT__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends Option>)newValue);
				return;
			case ProductPackage.FINANCIAL_PRODUCT__TRIGGERS:
				getTriggers().clear();
				getTriggers().addAll((Collection<? extends Trigger>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProductPackage.FINANCIAL_PRODUCT__TRADE_LEGS:
				getTradeLegs().clear();
				return;
			case ProductPackage.FINANCIAL_PRODUCT__OPTIONS:
				getOptions().clear();
				return;
			case ProductPackage.FINANCIAL_PRODUCT__TRIGGERS:
				getTriggers().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProductPackage.FINANCIAL_PRODUCT__TRADE_LEGS:
				return tradeLegs != null && !tradeLegs.isEmpty();
			case ProductPackage.FINANCIAL_PRODUCT__OPTIONS:
				return options != null && !options.isEmpty();
			case ProductPackage.FINANCIAL_PRODUCT__TRIGGERS:
				return triggers != null && !triggers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FinancialProductImpl
