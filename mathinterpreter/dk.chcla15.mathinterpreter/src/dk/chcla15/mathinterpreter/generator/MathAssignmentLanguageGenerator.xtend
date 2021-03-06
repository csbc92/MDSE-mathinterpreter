/*
 * generated by Xtext 2.21.0
 */
package dk.chcla15.mathinterpreter.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import javax.swing.JOptionPane
import dk.chcla15.mathinterpreter.mathAssignmentLanguage.MathExp
import dk.chcla15.mathinterpreter.mathAssignmentLanguage.Plus
import dk.chcla15.mathinterpreter.mathAssignmentLanguage.Exp
import dk.chcla15.mathinterpreter.mathAssignmentLanguage.Minus
import dk.chcla15.mathinterpreter.mathAssignmentLanguage.Mult
import dk.chcla15.mathinterpreter.mathAssignmentLanguage.Div
import dk.chcla15.mathinterpreter.mathAssignmentLanguage.Parenthesis
import dk.chcla15.mathinterpreter.mathAssignmentLanguage.Number

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MathAssignmentLanguageGenerator extends AbstractGenerator {

override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val math = resource.allContents.filter(MathExp).next
		val result = math.compute
		System.out.println("Math expression = "+math.display)
		// For +1 score, replace with hovering, see Bettini Chapter 8
		JOptionPane.showMessageDialog(null, "result = "+result,"Math Language", JOptionPane.INFORMATION_MESSAGE)
	}
	
	//
	// Compute function: computes value of expression
	// Note: written according to illegal left-recursive grammar, requires fix
	//
	
	def double compute(MathExp math) { 
		math.exp.computeExp
	}
	
	def dispatch double computeExp(Exp exp) {			
		val left = exp.left.computeExp
		switch exp.operator {
			Plus: left+exp.right.computeExp
			Minus: left-exp.right.computeExp
			Mult: left*exp.right.computeExp
			Div: left/exp.right.computeExp
			default: left
		}
	}
	
	def dispatch double computeExp(Number n) {
		n.value
	}
	
	def dispatch double computeExp(Parenthesis n) {
		n.exp.computeExp
	}

	//
	// Display function: show complete syntax tree
	// Note: written according to illegal left-recursive grammar, requires fix
	//

	def CharSequence display(MathExp math){
		'''Math[«math.exp.displayExp»]'''
	}
	
	def dispatch CharSequence displayExp(Exp exp) {
		'''Exp[«exp.left.displayExp»,«exp.operator?.displayOp»,«exp.right?.displayExp»]'''
	}
	
	def dispatch CharSequence displayExp(Number n) {
		n.value.toString
	}
	
	def dispatch CharSequence displayExp(Parenthesis p) {
		p.exp.displayExp
	}
	
	def dispatch String displayOp(Plus op)  {
		"+" 
	}
	def dispatch String displayOp(Minus op) {
		"-"
	}
	def dispatch String displayOp(Mult op)  {
		"*" 
	}
	def dispatch String displayOp(Div op)  {
		"/" 
	}
}