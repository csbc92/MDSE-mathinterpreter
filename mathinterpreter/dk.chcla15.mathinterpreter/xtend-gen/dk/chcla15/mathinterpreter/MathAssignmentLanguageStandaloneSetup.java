/**
 * generated by Xtext 2.21.0
 */
package dk.chcla15.mathinterpreter;

import dk.chcla15.mathinterpreter.MathAssignmentLanguageStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class MathAssignmentLanguageStandaloneSetup extends MathAssignmentLanguageStandaloneSetupGenerated {
  public static void doSetup() {
    new MathAssignmentLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
