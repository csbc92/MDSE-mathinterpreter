/**
 * generated by Xtext 2.21.0
 */
package dk.chcla15.mathinterpreter.mathAssignmentLanguage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dk.chcla15.mathinterpreter.mathAssignmentLanguage.MathAssignmentLanguagePackage
 * @generated
 */
public interface MathAssignmentLanguageFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MathAssignmentLanguageFactory eINSTANCE = dk.chcla15.mathinterpreter.mathAssignmentLanguage.impl.MathAssignmentLanguageFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Math Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Math Exp</em>'.
   * @generated
   */
  MathExp createMathExp();

  /**
   * Returns a new object of class '<em>Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exp</em>'.
   * @generated
   */
  Exp createExp();

  /**
   * Returns a new object of class '<em>Exp Op</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exp Op</em>'.
   * @generated
   */
  ExpOp createExpOp();

  /**
   * Returns a new object of class '<em>Plus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plus</em>'.
   * @generated
   */
  Plus createPlus();

  /**
   * Returns a new object of class '<em>Minus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Minus</em>'.
   * @generated
   */
  Minus createMinus();

  /**
   * Returns a new object of class '<em>Mult</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mult</em>'.
   * @generated
   */
  Mult createMult();

  /**
   * Returns a new object of class '<em>Div</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Div</em>'.
   * @generated
   */
  Div createDiv();

  /**
   * Returns a new object of class '<em>Number</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number</em>'.
   * @generated
   */
  Number createNumber();

  /**
   * Returns a new object of class '<em>Parenthesis</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parenthesis</em>'.
   * @generated
   */
  Parenthesis createParenthesis();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MathAssignmentLanguagePackage getMathAssignmentLanguagePackage();

} //MathAssignmentLanguageFactory
