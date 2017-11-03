/**
 */
package language.foundation.datatype;

import language.foundation.structure.StructurePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see language.foundation.datatype.DatatypeFactory
 * @model kind="package"
 * @generated
 */
public interface DatatypePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "datatype";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://zoe.tsekas.com/language/foundation/datatype";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "datatype";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatatypePackage eINSTANCE = language.foundation.datatype.impl.DatatypePackageImpl.init();

	/**
	 * The meta object id for the '{@link language.foundation.datatype.impl.MetaDataTypeImpl <em>Meta Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see language.foundation.datatype.impl.MetaDataTypeImpl
	 * @see language.foundation.datatype.impl.DatatypePackageImpl#getMetaDataType()
	 * @generated
	 */
	int META_DATA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA_TYPE__IDENTIFIER = StructurePackage.META_PACKAGEABLE_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA_TYPE__OWNER = StructurePackage.META_PACKAGEABLE_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA_TYPE__NAME = StructurePackage.META_PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Meta Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA_TYPE_FEATURE_COUNT = StructurePackage.META_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Meta Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA_TYPE_OPERATION_COUNT = StructurePackage.META_PACKAGEABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link language.foundation.datatype.impl.MetaTextImpl <em>Meta Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see language.foundation.datatype.impl.MetaTextImpl
	 * @see language.foundation.datatype.impl.DatatypePackageImpl#getMetaText()
	 * @generated
	 */
	int META_TEXT = 1;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TEXT__IDENTIFIER = META_DATA_TYPE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TEXT__OWNER = META_DATA_TYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TEXT__NAME = META_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TEXT__MIN_LENGTH = META_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TEXT__MAX_LENGTH = META_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TEXT__LENGTH = META_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TEXT__PATTERN = META_DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Meta Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TEXT_FEATURE_COUNT = META_DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Meta Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TEXT_OPERATION_COUNT = META_DATA_TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link language.foundation.datatype.MetaDataType <em>Meta Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Data Type</em>'.
	 * @see language.foundation.datatype.MetaDataType
	 * @generated
	 */
	EClass getMetaDataType();

	/**
	 * Returns the meta object for class '{@link language.foundation.datatype.MetaText <em>Meta Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Text</em>'.
	 * @see language.foundation.datatype.MetaText
	 * @generated
	 */
	EClass getMetaText();

	/**
	 * Returns the meta object for the attribute '{@link language.foundation.datatype.MetaText#getMinLength <em>Min Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Length</em>'.
	 * @see language.foundation.datatype.MetaText#getMinLength()
	 * @see #getMetaText()
	 * @generated
	 */
	EAttribute getMetaText_MinLength();

	/**
	 * Returns the meta object for the attribute '{@link language.foundation.datatype.MetaText#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see language.foundation.datatype.MetaText#getMaxLength()
	 * @see #getMetaText()
	 * @generated
	 */
	EAttribute getMetaText_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link language.foundation.datatype.MetaText#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see language.foundation.datatype.MetaText#getLength()
	 * @see #getMetaText()
	 * @generated
	 */
	EAttribute getMetaText_Length();

	/**
	 * Returns the meta object for the attribute '{@link language.foundation.datatype.MetaText#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see language.foundation.datatype.MetaText#getPattern()
	 * @see #getMetaText()
	 * @generated
	 */
	EAttribute getMetaText_Pattern();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatatypeFactory getDatatypeFactory();

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
		 * The meta object literal for the '{@link language.foundation.datatype.impl.MetaDataTypeImpl <em>Meta Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see language.foundation.datatype.impl.MetaDataTypeImpl
		 * @see language.foundation.datatype.impl.DatatypePackageImpl#getMetaDataType()
		 * @generated
		 */
		EClass META_DATA_TYPE = eINSTANCE.getMetaDataType();

		/**
		 * The meta object literal for the '{@link language.foundation.datatype.impl.MetaTextImpl <em>Meta Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see language.foundation.datatype.impl.MetaTextImpl
		 * @see language.foundation.datatype.impl.DatatypePackageImpl#getMetaText()
		 * @generated
		 */
		EClass META_TEXT = eINSTANCE.getMetaText();

		/**
		 * The meta object literal for the '<em><b>Min Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_TEXT__MIN_LENGTH = eINSTANCE.getMetaText_MinLength();

		/**
		 * The meta object literal for the '<em><b>Max Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_TEXT__MAX_LENGTH = eINSTANCE.getMetaText_MaxLength();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_TEXT__LENGTH = eINSTANCE.getMetaText_Length();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_TEXT__PATTERN = eINSTANCE.getMetaText_Pattern();

	}

} //DatatypePackage
