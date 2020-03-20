/**
 * generated by Xtext 2.21.0
 */
package dk.chcla15.mathinterpreter.mathAssignmentLanguage.util;

import dk.chcla15.mathinterpreter.mathAssignmentLanguage.Div;
import dk.chcla15.mathinterpreter.mathAssignmentLanguage.Exp;
import dk.chcla15.mathinterpreter.mathAssignmentLanguage.ExpOp;
import dk.chcla15.mathinterpreter.mathAssignmentLanguage.MathAssignmentLanguagePackage;
import dk.chcla15.mathinterpreter.mathAssignmentLanguage.MathExp;
import dk.chcla15.mathinterpreter.mathAssignmentLanguage.Minus;
import dk.chcla15.mathinterpreter.mathAssignmentLanguage.Mult;
import dk.chcla15.mathinterpreter.mathAssignmentLanguage.Parenthesis;
import dk.chcla15.mathinterpreter.mathAssignmentLanguage.Plus;
import dk.chcla15.mathinterpreter.mathAssignmentLanguage.Primary;

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
 * @see dk.chcla15.mathinterpreter.mathAssignmentLanguage.MathAssignmentLanguagePackage
 * @generated
 */
public class MathAssignmentLanguageSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MathAssignmentLanguagePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MathAssignmentLanguageSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MathAssignmentLanguagePackage.eINSTANCE;
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
  protected boolean isSwitchFor(EPackage ePackage)
  {
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
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MathAssignmentLanguagePackage.MATH_EXP:
      {
        MathExp mathExp = (MathExp)theEObject;
        T result = caseMathExp(mathExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MathAssignmentLanguagePackage.EXP:
      {
        Exp exp = (Exp)theEObject;
        T result = caseExp(exp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MathAssignmentLanguagePackage.EXP_OP:
      {
        ExpOp expOp = (ExpOp)theEObject;
        T result = caseExpOp(expOp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MathAssignmentLanguagePackage.PRIMARY:
      {
        Primary primary = (Primary)theEObject;
        T result = casePrimary(primary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MathAssignmentLanguagePackage.PARENTHESIS:
      {
        Parenthesis parenthesis = (Parenthesis)theEObject;
        T result = caseParenthesis(parenthesis);
        if (result == null) result = casePrimary(parenthesis);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MathAssignmentLanguagePackage.NUMBER:
      {
        dk.chcla15.mathinterpreter.mathAssignmentLanguage.Number number = (dk.chcla15.mathinterpreter.mathAssignmentLanguage.Number)theEObject;
        T result = caseNumber(number);
        if (result == null) result = casePrimary(number);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MathAssignmentLanguagePackage.PLUS:
      {
        Plus plus = (Plus)theEObject;
        T result = casePlus(plus);
        if (result == null) result = caseExpOp(plus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MathAssignmentLanguagePackage.MINUS:
      {
        Minus minus = (Minus)theEObject;
        T result = caseMinus(minus);
        if (result == null) result = caseExpOp(minus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MathAssignmentLanguagePackage.MULT:
      {
        Mult mult = (Mult)theEObject;
        T result = caseMult(mult);
        if (result == null) result = caseExpOp(mult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MathAssignmentLanguagePackage.DIV:
      {
        Div div = (Div)theEObject;
        T result = caseDiv(div);
        if (result == null) result = caseExpOp(div);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Math Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Math Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMathExp(MathExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExp(Exp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exp Op</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exp Op</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpOp(ExpOp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primary</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primary</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimary(Primary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parenthesis</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parenthesis</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParenthesis(Parenthesis object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumber(dk.chcla15.mathinterpreter.mathAssignmentLanguage.Number object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlus(Plus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Minus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Minus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMinus(Minus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mult</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mult</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMult(Mult object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Div</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Div</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDiv(Div object)
  {
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
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MathAssignmentLanguageSwitch