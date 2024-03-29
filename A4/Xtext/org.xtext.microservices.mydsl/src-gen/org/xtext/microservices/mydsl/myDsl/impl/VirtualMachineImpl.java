/**
 * generated by Xtext 2.25.0
 */
package org.xtext.microservices.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.microservices.mydsl.myDsl.MyDslPackage;
import org.xtext.microservices.mydsl.myDsl.VMType;
import org.xtext.microservices.mydsl.myDsl.VirtualMachine;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.microservices.mydsl.myDsl.impl.VirtualMachineImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.microservices.mydsl.myDsl.impl.VirtualMachineImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.xtext.microservices.mydsl.myDsl.impl.VirtualMachineImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.microservices.mydsl.myDsl.impl.VirtualMachineImpl#getDockers <em>Dockers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VirtualMachineImpl extends MinimalEObjectImpl.Container implements VirtualMachine
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final VMType TYPE_EDEFAULT = VMType.LINUX;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected VMType type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getDockers() <em>Dockers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDockers()
   * @generated
   * @ordered
   */
  protected EList<org.xtext.microservices.mydsl.myDsl.Container> dockers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VirtualMachineImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.VIRTUAL_MACHINE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.VIRTUAL_MACHINE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.VIRTUAL_MACHINE__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VMType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(VMType newType)
  {
    VMType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.VIRTUAL_MACHINE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<org.xtext.microservices.mydsl.myDsl.Container> getDockers()
  {
    if (dockers == null)
    {
      dockers = new EObjectContainmentEList<org.xtext.microservices.mydsl.myDsl.Container>(org.xtext.microservices.mydsl.myDsl.Container.class, this, MyDslPackage.VIRTUAL_MACHINE__DOCKERS);
    }
    return dockers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.VIRTUAL_MACHINE__DOCKERS:
        return ((InternalEList<?>)getDockers()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.VIRTUAL_MACHINE__NAME:
        return getName();
      case MyDslPackage.VIRTUAL_MACHINE__ID:
        return getId();
      case MyDslPackage.VIRTUAL_MACHINE__TYPE:
        return getType();
      case MyDslPackage.VIRTUAL_MACHINE__DOCKERS:
        return getDockers();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.VIRTUAL_MACHINE__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.VIRTUAL_MACHINE__ID:
        setId((String)newValue);
        return;
      case MyDslPackage.VIRTUAL_MACHINE__TYPE:
        setType((VMType)newValue);
        return;
      case MyDslPackage.VIRTUAL_MACHINE__DOCKERS:
        getDockers().clear();
        getDockers().addAll((Collection<? extends org.xtext.microservices.mydsl.myDsl.Container>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.VIRTUAL_MACHINE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.VIRTUAL_MACHINE__ID:
        setId(ID_EDEFAULT);
        return;
      case MyDslPackage.VIRTUAL_MACHINE__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case MyDslPackage.VIRTUAL_MACHINE__DOCKERS:
        getDockers().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.VIRTUAL_MACHINE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.VIRTUAL_MACHINE__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case MyDslPackage.VIRTUAL_MACHINE__TYPE:
        return type != TYPE_EDEFAULT;
      case MyDslPackage.VIRTUAL_MACHINE__DOCKERS:
        return dockers != null && !dockers.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", id: ");
    result.append(id);
    result.append(", Type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //VirtualMachineImpl
