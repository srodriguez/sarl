/**
 */
package io.sarl.lang.sarl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.sarl.lang.sarl.Agent#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link io.sarl.lang.sarl.Agent#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.sarl.lang.sarl.SarlPackage#getAgent()
 * @model
 * @generated
 */
public interface Agent extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(Agent)
   * @see io.sarl.lang.sarl.SarlPackage#getAgent_SuperType()
   * @model
   * @generated
   */
  Agent getSuperType();

  /**
   * Sets the value of the '{@link io.sarl.lang.sarl.Agent#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(Agent value);

  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link io.sarl.lang.sarl.AgentFeature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see io.sarl.lang.sarl.SarlPackage#getAgent_Features()
   * @model containment="true"
   * @generated
   */
  EList<AgentFeature> getFeatures();

} // Agent