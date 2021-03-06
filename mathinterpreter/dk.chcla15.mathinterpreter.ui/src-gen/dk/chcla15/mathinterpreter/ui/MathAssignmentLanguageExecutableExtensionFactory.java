/*
 * generated by Xtext 2.21.0
 */
package dk.chcla15.mathinterpreter.ui;

import com.google.inject.Injector;
import dk.chcla15.mathinterpreter.ui.internal.MathinterpreterActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MathAssignmentLanguageExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(MathinterpreterActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		MathinterpreterActivator activator = MathinterpreterActivator.getInstance();
		return activator != null ? activator.getInjector(MathinterpreterActivator.DK_CHCLA15_MATHINTERPRETER_MATHASSIGNMENTLANGUAGE) : null;
	}

}
