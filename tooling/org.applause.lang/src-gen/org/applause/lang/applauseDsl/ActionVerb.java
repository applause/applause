/**
 */
package org.applause.lang.applauseDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Action Verb</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getActionVerb()
 * @model
 * @generated
 */
public enum ActionVerb implements Enumerator
{
  /**
   * The '<em><b>Edit</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EDIT_VALUE
   * @generated
   * @ordered
   */
  EDIT(0, "edit", "edit"),

  /**
   * The '<em><b>Display</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DISPLAY_VALUE
   * @generated
   * @ordered
   */
  DISPLAY(1, "display", "display"),

  /**
   * The '<em><b>Add</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ADD_VALUE
   * @generated
   * @ordered
   */
  ADD(2, "add", "add");

  /**
   * The '<em><b>Edit</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Edit</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EDIT
   * @model name="edit"
   * @generated
   * @ordered
   */
  public static final int EDIT_VALUE = 0;

  /**
   * The '<em><b>Display</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Display</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DISPLAY
   * @model name="display"
   * @generated
   * @ordered
   */
  public static final int DISPLAY_VALUE = 1;

  /**
   * The '<em><b>Add</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Add</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ADD
   * @model name="add"
   * @generated
   * @ordered
   */
  public static final int ADD_VALUE = 2;

  /**
   * An array of all the '<em><b>Action Verb</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ActionVerb[] VALUES_ARRAY =
    new ActionVerb[]
    {
      EDIT,
      DISPLAY,
      ADD,
    };

  /**
   * A public read-only list of all the '<em><b>Action Verb</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ActionVerb> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Action Verb</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ActionVerb get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ActionVerb result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Action Verb</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ActionVerb getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ActionVerb result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Action Verb</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ActionVerb get(int value)
  {
    switch (value)
    {
      case EDIT_VALUE: return EDIT;
      case DISPLAY_VALUE: return DISPLAY;
      case ADD_VALUE: return ADD;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private ActionVerb(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //ActionVerb
