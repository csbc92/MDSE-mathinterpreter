/**
 * generated by Xtext 2.21.0
 */
package dk.chcla15.mathinterpreter.mathAssignmentLanguage.impl;

import dk.chcla15.mathinterpreter.mathAssignmentLanguage.Exp;
import dk.chcla15.mathinterpreter.mathAssignmentLanguage.MathAssignmentLanguagePackage;
import dk.chcla15.mathinterpreter.mathAssignmentLanguage.MathExp;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Math Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.chcla15.mathinterpreter.mathAssignmentLanguage.impl.MathExpImpl#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MathExpImpl extends MinimalEObjectImpl.Container implements MathExp
{
  /**
   * The cached value of the '{@link #getExp() <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp()
   * @generated
   * @ordered
   */
  protected Exp exp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MathExpImpl()
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
    return MathAssignmentLanguagePackage.Literals.MATH_EXP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Exp getExp()
  {
    return exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExp(Exp newExp, NotificationChain msgs)
  {
    Exp oldExp = exp;
    exp = newExp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MathAssignmentLanguagePackage.MATH_EXP__EXP, oldExp, newExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExp(Exp newExp)
  {
    if (newExp != exp)
    {
      NotificationChain msgs = null;
      if (exp != null)
        msgs = ((InternalEObject)exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MathAssignmentLanguagePackage.MATH_EXP__EXP, null, msgs);
      if (newExp != null)
        msgs = ((InternalEObject)newExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MathAssignmentLanguagePackage.MATH_EXP__EXP, null, msgs);
      msgs = basicSetExp(newExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MathAssignmentLanguagePackage.MATH_EXP__EXP, newExp, newExp));
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
      case MathAssignmentLanguagePackage.MATH_EXP__EXP:
        return basicSetExp(null, msgs);
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
      case MathAssignmentLanguagePackage.MATH_EXP__EXP:
        return getExp();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MathAssignmentLanguagePackage.MATH_EXP__EXP:
        setExp((Exp)newValue);
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
      case MathAssignmentLanguagePackage.MATH_EXP__EXP:
        setExp((Exp)null);
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
      case MathAssignmentLanguagePackage.MATH_EXP__EXP:
        return exp != null;
    }
    return super.eIsSet(featureID);
  }

} //MathExpImpl
