/**
 */
package language.foundation.structure;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see language.foundation.structure.StructureFactory
 * @model kind="package"
 * @generated
 */
public interface StructurePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "structure";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://zoe.tsekas.com/language/foundation/structure";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "structure";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StructurePackage eINSTANCE = language.foundation.structure.impl.StructurePackageImpl.init();

	/**
	 * The meta object id for the '{@link language.foundation.structure.impl.MetaElementImpl <em>Meta Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see language.foundation.structure.impl.MetaElementImpl
	 * @see language.foundation.structure.impl.StructurePackageImpl#getMetaElement()
	 * @generated
	 */
	int META_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_ELEMENT__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_ELEMENT__OWNER = 1;

	/**
	 * The number of structural features of the '<em>Meta Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Meta Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link language.foundation.structure.impl.MetaNamedElementImpl <em>Meta Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see language.foundation.structure.impl.MetaNamedElementImpl
	 * @see language.foundation.structure.impl.StructurePackageImpl#getMetaNamedElement()
	 * @generated
	 */
	int META_NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_NAMED_ELEMENT__IDENTIFIER = META_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_NAMED_ELEMENT__OWNER = META_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_NAMED_ELEMENT__NAME = META_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Meta Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_NAMED_ELEMENT_FEATURE_COUNT = META_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Meta Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_NAMED_ELEMENT_OPERATION_COUNT = META_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link language.foundation.structure.impl.MetaPackageableElementImpl <em>Meta Packageable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see language.foundation.structure.impl.MetaPackageableElementImpl
	 * @see language.foundation.structure.impl.StructurePackageImpl#getMetaPackageableElement()
	 * @generated
	 */
	int META_PACKAGEABLE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_PACKAGEABLE_ELEMENT__IDENTIFIER = META_NAMED_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_PACKAGEABLE_ELEMENT__OWNER = META_NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_PACKAGEABLE_ELEMENT__NAME = META_NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Meta Packageable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_PACKAGEABLE_ELEMENT_FEATURE_COUNT = META_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Meta Packageable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_PACKAGEABLE_ELEMENT_OPERATION_COUNT = META_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link language.foundation.structure.impl.MetaPackageImpl <em>Meta Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see language.foundation.structure.impl.MetaPackageImpl
	 * @see language.foundation.structure.impl.StructurePackageImpl#getMetaPackage()
	 * @generated
	 */
	int META_PACKAGE = 3;

	/**
	 * The meta object id for the '{@link language.foundation.structure.impl.MetaTypedElementImpl <em>Meta Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see language.foundation.structure.impl.MetaTypedElementImpl
	 * @see language.foundation.structure.impl.StructurePackageImpl#getMetaTypedElement()
	 * @generated
	 */
	int META_TYPED_ELEMENT = 4;

	/**
	 * The meta object id for the '{@link language.foundation.structure.impl.MetaModelImpl <em>Meta Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see language.foundation.structure.impl.MetaModelImpl
	 * @see language.foundation.structure.impl.StructurePackageImpl#getMetaModel()
	 * @generated
	 */
	int META_MODEL = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL__IDENTIFIER = META_NAMED_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL__OWNER = META_NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL__NAME = META_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Packaged Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL__PACKAGED_ELEMENTS = META_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Meta Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_FEATURE_COUNT = META_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Meta Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_OPERATION_COUNT = META_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_PACKAGE__IDENTIFIER = META_MODEL__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_PACKAGE__OWNER = META_MODEL__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_PACKAGE__NAME = META_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Packaged Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_PACKAGE__PACKAGED_ELEMENTS = META_MODEL__PACKAGED_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Meta Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_PACKAGE_FEATURE_COUNT = META_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Meta Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_PACKAGE_OPERATION_COUNT = META_MODEL_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TYPED_ELEMENT__IDENTIFIER = META_PACKAGEABLE_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TYPED_ELEMENT__OWNER = META_PACKAGEABLE_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TYPED_ELEMENT__NAME = META_PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Meta Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TYPED_ELEMENT_FEATURE_COUNT = META_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Meta Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TYPED_ELEMENT_OPERATION_COUNT = META_PACKAGEABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link language.foundation.structure.impl.MetaPropertyImpl <em>Meta Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see language.foundation.structure.impl.MetaPropertyImpl
	 * @see language.foundation.structure.impl.StructurePackageImpl#getMetaProperty()
	 * @generated
	 */
	int META_PROPERTY = 6;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_PROPERTY__IDENTIFIER = META_NAMED_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_PROPERTY__OWNER = META_NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_PROPERTY__NAME = META_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_PROPERTY__TYPE = META_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_PROPERTY__LOWER_BOUND = META_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_PROPERTY__UPPER_BOUND = META_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Meta Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_PROPERTY_FEATURE_COUNT = META_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Meta Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_PROPERTY_OPERATION_COUNT = META_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link language.foundation.structure.impl.MetaClassifierImpl <em>Meta Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see language.foundation.structure.impl.MetaClassifierImpl
	 * @see language.foundation.structure.impl.StructurePackageImpl#getMetaClassifier()
	 * @generated
	 */
	int META_CLASSIFIER = 7;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_CLASSIFIER__IDENTIFIER = META_TYPED_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_CLASSIFIER__OWNER = META_TYPED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_CLASSIFIER__NAME = META_TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_CLASSIFIER__ABSTRACT = META_TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Meta Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_CLASSIFIER_FEATURE_COUNT = META_TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Meta Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_CLASSIFIER_OPERATION_COUNT = META_TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link language.foundation.structure.impl.MetaClassImpl <em>Meta Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see language.foundation.structure.impl.MetaClassImpl
	 * @see language.foundation.structure.impl.StructurePackageImpl#getMetaClass()
	 * @generated
	 */
	int META_CLASS = 8;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_CLASS__IDENTIFIER = META_CLASSIFIER__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_CLASS__OWNER = META_CLASSIFIER__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_CLASS__NAME = META_CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_CLASS__ABSTRACT = META_CLASSIFIER__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Owned Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_CLASS__OWNED_PROPERTIES = META_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Meta Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_CLASS_FEATURE_COUNT = META_CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Meta Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_CLASS_OPERATION_COUNT = META_CLASSIFIER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link language.foundation.structure.MetaElement <em>Meta Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Element</em>'.
	 * @see language.foundation.structure.MetaElement
	 * @generated
	 */
	EClass getMetaElement();

	/**
	 * Returns the meta object for the attribute '{@link language.foundation.structure.MetaElement#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see language.foundation.structure.MetaElement#getIdentifier()
	 * @see #getMetaElement()
	 * @generated
	 */
	EAttribute getMetaElement_Identifier();

	/**
	 * Returns the meta object for the reference '{@link language.foundation.structure.MetaElement#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see language.foundation.structure.MetaElement#getOwner()
	 * @see #getMetaElement()
	 * @generated
	 */
	EReference getMetaElement_Owner();

	/**
	 * Returns the meta object for class '{@link language.foundation.structure.MetaNamedElement <em>Meta Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Named Element</em>'.
	 * @see language.foundation.structure.MetaNamedElement
	 * @generated
	 */
	EClass getMetaNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link language.foundation.structure.MetaNamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see language.foundation.structure.MetaNamedElement#getName()
	 * @see #getMetaNamedElement()
	 * @generated
	 */
	EAttribute getMetaNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link language.foundation.structure.MetaPackageableElement <em>Meta Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Packageable Element</em>'.
	 * @see language.foundation.structure.MetaPackageableElement
	 * @generated
	 */
	EClass getMetaPackageableElement();

	/**
	 * Returns the meta object for class '{@link language.foundation.structure.MetaPackage <em>Meta Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Package</em>'.
	 * @see language.foundation.structure.MetaPackage
	 * @generated
	 */
	EClass getMetaPackage();

	/**
	 * Returns the meta object for class '{@link language.foundation.structure.MetaTypedElement <em>Meta Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Typed Element</em>'.
	 * @see language.foundation.structure.MetaTypedElement
	 * @generated
	 */
	EClass getMetaTypedElement();

	/**
	 * Returns the meta object for class '{@link language.foundation.structure.MetaModel <em>Meta Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Model</em>'.
	 * @see language.foundation.structure.MetaModel
	 * @generated
	 */
	EClass getMetaModel();

	/**
	 * Returns the meta object for the containment reference list '{@link language.foundation.structure.MetaModel#getPackagedElements <em>Packaged Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packaged Elements</em>'.
	 * @see language.foundation.structure.MetaModel#getPackagedElements()
	 * @see #getMetaModel()
	 * @generated
	 */
	EReference getMetaModel_PackagedElements();

	/**
	 * Returns the meta object for class '{@link language.foundation.structure.MetaProperty <em>Meta Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Property</em>'.
	 * @see language.foundation.structure.MetaProperty
	 * @generated
	 */
	EClass getMetaProperty();

	/**
	 * Returns the meta object for the reference '{@link language.foundation.structure.MetaProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see language.foundation.structure.MetaProperty#getType()
	 * @see #getMetaProperty()
	 * @generated
	 */
	EReference getMetaProperty_Type();

	/**
	 * Returns the meta object for the attribute '{@link language.foundation.structure.MetaProperty#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see language.foundation.structure.MetaProperty#getLowerBound()
	 * @see #getMetaProperty()
	 * @generated
	 */
	EAttribute getMetaProperty_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link language.foundation.structure.MetaProperty#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see language.foundation.structure.MetaProperty#getUpperBound()
	 * @see #getMetaProperty()
	 * @generated
	 */
	EAttribute getMetaProperty_UpperBound();

	/**
	 * Returns the meta object for class '{@link language.foundation.structure.MetaClassifier <em>Meta Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Classifier</em>'.
	 * @see language.foundation.structure.MetaClassifier
	 * @generated
	 */
	EClass getMetaClassifier();

	/**
	 * Returns the meta object for the attribute '{@link language.foundation.structure.MetaClassifier#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see language.foundation.structure.MetaClassifier#isAbstract()
	 * @see #getMetaClassifier()
	 * @generated
	 */
	EAttribute getMetaClassifier_Abstract();

	/**
	 * Returns the meta object for class '{@link language.foundation.structure.MetaClass <em>Meta Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Class</em>'.
	 * @see language.foundation.structure.MetaClass
	 * @generated
	 */
	EClass getMetaClass();

	/**
	 * Returns the meta object for the containment reference list '{@link language.foundation.structure.MetaClass#getOwnedProperties <em>Owned Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Properties</em>'.
	 * @see language.foundation.structure.MetaClass#getOwnedProperties()
	 * @see #getMetaClass()
	 * @generated
	 */
	EReference getMetaClass_OwnedProperties();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StructureFactory getStructureFactory();

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
		 * The meta object literal for the '{@link language.foundation.structure.impl.MetaElementImpl <em>Meta Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see language.foundation.structure.impl.MetaElementImpl
		 * @see language.foundation.structure.impl.StructurePackageImpl#getMetaElement()
		 * @generated
		 */
		EClass META_ELEMENT = eINSTANCE.getMetaElement();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_ELEMENT__IDENTIFIER = eINSTANCE.getMetaElement_Identifier();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_ELEMENT__OWNER = eINSTANCE.getMetaElement_Owner();

		/**
		 * The meta object literal for the '{@link language.foundation.structure.impl.MetaNamedElementImpl <em>Meta Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see language.foundation.structure.impl.MetaNamedElementImpl
		 * @see language.foundation.structure.impl.StructurePackageImpl#getMetaNamedElement()
		 * @generated
		 */
		EClass META_NAMED_ELEMENT = eINSTANCE.getMetaNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_NAMED_ELEMENT__NAME = eINSTANCE.getMetaNamedElement_Name();

		/**
		 * The meta object literal for the '{@link language.foundation.structure.impl.MetaPackageableElementImpl <em>Meta Packageable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see language.foundation.structure.impl.MetaPackageableElementImpl
		 * @see language.foundation.structure.impl.StructurePackageImpl#getMetaPackageableElement()
		 * @generated
		 */
		EClass META_PACKAGEABLE_ELEMENT = eINSTANCE.getMetaPackageableElement();

		/**
		 * The meta object literal for the '{@link language.foundation.structure.impl.MetaPackageImpl <em>Meta Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see language.foundation.structure.impl.MetaPackageImpl
		 * @see language.foundation.structure.impl.StructurePackageImpl#getMetaPackage()
		 * @generated
		 */
		EClass META_PACKAGE = eINSTANCE.getMetaPackage();

		/**
		 * The meta object literal for the '{@link language.foundation.structure.impl.MetaTypedElementImpl <em>Meta Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see language.foundation.structure.impl.MetaTypedElementImpl
		 * @see language.foundation.structure.impl.StructurePackageImpl#getMetaTypedElement()
		 * @generated
		 */
		EClass META_TYPED_ELEMENT = eINSTANCE.getMetaTypedElement();

		/**
		 * The meta object literal for the '{@link language.foundation.structure.impl.MetaModelImpl <em>Meta Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see language.foundation.structure.impl.MetaModelImpl
		 * @see language.foundation.structure.impl.StructurePackageImpl#getMetaModel()
		 * @generated
		 */
		EClass META_MODEL = eINSTANCE.getMetaModel();

		/**
		 * The meta object literal for the '<em><b>Packaged Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_MODEL__PACKAGED_ELEMENTS = eINSTANCE.getMetaModel_PackagedElements();

		/**
		 * The meta object literal for the '{@link language.foundation.structure.impl.MetaPropertyImpl <em>Meta Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see language.foundation.structure.impl.MetaPropertyImpl
		 * @see language.foundation.structure.impl.StructurePackageImpl#getMetaProperty()
		 * @generated
		 */
		EClass META_PROPERTY = eINSTANCE.getMetaProperty();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_PROPERTY__TYPE = eINSTANCE.getMetaProperty_Type();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_PROPERTY__LOWER_BOUND = eINSTANCE.getMetaProperty_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_PROPERTY__UPPER_BOUND = eINSTANCE.getMetaProperty_UpperBound();

		/**
		 * The meta object literal for the '{@link language.foundation.structure.impl.MetaClassifierImpl <em>Meta Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see language.foundation.structure.impl.MetaClassifierImpl
		 * @see language.foundation.structure.impl.StructurePackageImpl#getMetaClassifier()
		 * @generated
		 */
		EClass META_CLASSIFIER = eINSTANCE.getMetaClassifier();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_CLASSIFIER__ABSTRACT = eINSTANCE.getMetaClassifier_Abstract();

		/**
		 * The meta object literal for the '{@link language.foundation.structure.impl.MetaClassImpl <em>Meta Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see language.foundation.structure.impl.MetaClassImpl
		 * @see language.foundation.structure.impl.StructurePackageImpl#getMetaClass()
		 * @generated
		 */
		EClass META_CLASS = eINSTANCE.getMetaClass();

		/**
		 * The meta object literal for the '<em><b>Owned Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_CLASS__OWNED_PROPERTIES = eINSTANCE.getMetaClass_OwnedProperties();

	}

} //StructurePackage
