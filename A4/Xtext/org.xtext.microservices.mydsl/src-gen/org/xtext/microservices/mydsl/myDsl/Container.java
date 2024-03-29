/**
 * generated by Xtext 2.25.0
 */
package org.xtext.microservices.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.microservices.mydsl.myDsl.Container#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.microservices.mydsl.myDsl.Container#getId <em>Id</em>}</li>
 *   <li>{@link org.xtext.microservices.mydsl.myDsl.Container#getPort <em>Port</em>}</li>
 *   <li>{@link org.xtext.microservices.mydsl.myDsl.Container#getMicroservice <em>Microservice</em>}</li>
 * </ul>
 *
 * @see org.xtext.microservices.mydsl.myDsl.MyDslPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.microservices.mydsl.myDsl.MyDslPackage#getContainer_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.microservices.mydsl.myDsl.Container#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.xtext.microservices.mydsl.myDsl.MyDslPackage#getContainer_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.xtext.microservices.mydsl.myDsl.Container#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Port</em>' attribute.
   * @see #setPort(int)
   * @see org.xtext.microservices.mydsl.myDsl.MyDslPackage#getContainer_Port()
   * @model
   * @generated
   */
  int getPort();

  /**
   * Sets the value of the '{@link org.xtext.microservices.mydsl.myDsl.Container#getPort <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Port</em>' attribute.
   * @see #getPort()
   * @generated
   */
  void setPort(int value);

  /**
   * Returns the value of the '<em><b>Microservice</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Microservice</em>' containment reference.
   * @see #setMicroservice(Microservice)
   * @see org.xtext.microservices.mydsl.myDsl.MyDslPackage#getContainer_Microservice()
   * @model containment="true"
   * @generated
   */
  Microservice getMicroservice();

  /**
   * Sets the value of the '{@link org.xtext.microservices.mydsl.myDsl.Container#getMicroservice <em>Microservice</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Microservice</em>' containment reference.
   * @see #getMicroservice()
   * @generated
   */
  void setMicroservice(Microservice value);

} // Container
