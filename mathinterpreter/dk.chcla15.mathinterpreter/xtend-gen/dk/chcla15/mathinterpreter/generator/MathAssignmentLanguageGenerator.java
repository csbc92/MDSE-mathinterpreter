/**
 * generated by Xtext 2.21.0
 */
package dk.chcla15.mathinterpreter.generator;

import com.google.common.collect.Iterators;
import dk.chcla15.mathinterpreter.mathAssignmentLanguage.Div;
import dk.chcla15.mathinterpreter.mathAssignmentLanguage.Exp;
import dk.chcla15.mathinterpreter.mathAssignmentLanguage.ExpOp;
import dk.chcla15.mathinterpreter.mathAssignmentLanguage.MathExp;
import dk.chcla15.mathinterpreter.mathAssignmentLanguage.Minus;
import dk.chcla15.mathinterpreter.mathAssignmentLanguage.Mult;
import dk.chcla15.mathinterpreter.mathAssignmentLanguage.Parenthesis;
import dk.chcla15.mathinterpreter.mathAssignmentLanguage.Plus;
import java.util.Arrays;
import javax.swing.JOptionPane;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class MathAssignmentLanguageGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final MathExp math = Iterators.<MathExp>filter(resource.getAllContents(), MathExp.class).next();
    final double result = this.compute(math);
    CharSequence _display = this.display(math);
    String _plus = ("Math expression = " + _display);
    System.out.println(_plus);
    JOptionPane.showMessageDialog(null, ("result = " + Double.valueOf(result)), "Math Language", JOptionPane.INFORMATION_MESSAGE);
  }
  
  public double compute(final MathExp math) {
    return this.computeExp(math.getExp());
  }
  
  protected double _computeExp(final Exp exp) {
    double _xblockexpression = (double) 0;
    {
      final double left = this.computeExp(exp.getLeft());
      double _switchResult = (double) 0;
      ExpOp _operator = exp.getOperator();
      boolean _matched = false;
      if (_operator instanceof Plus) {
        _matched=true;
        double _computeExp = this.computeExp(exp.getRight());
        _switchResult = (left + _computeExp);
      }
      if (!_matched) {
        if (_operator instanceof Minus) {
          _matched=true;
          double _computeExp = this.computeExp(exp.getRight());
          _switchResult = (left - _computeExp);
        }
      }
      if (!_matched) {
        if (_operator instanceof Mult) {
          _matched=true;
          double _computeExp = this.computeExp(exp.getRight());
          _switchResult = (left * _computeExp);
        }
      }
      if (!_matched) {
        if (_operator instanceof Div) {
          _matched=true;
          double _computeExp = this.computeExp(exp.getRight());
          _switchResult = (left / _computeExp);
        }
      }
      if (!_matched) {
        _switchResult = left;
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  protected double _computeExp(final dk.chcla15.mathinterpreter.mathAssignmentLanguage.Number n) {
    return n.getValue();
  }
  
  protected double _computeExp(final Parenthesis n) {
    return this.computeExp(n.getExp());
  }
  
  public CharSequence display(final MathExp math) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Math[");
    CharSequence _displayExp = this.displayExp(math.getExp());
    _builder.append(_displayExp);
    _builder.append("]");
    return _builder;
  }
  
  protected CharSequence _displayExp(final Exp exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Exp[");
    CharSequence _displayExp = this.displayExp(exp.getLeft());
    _builder.append(_displayExp);
    _builder.append(",");
    ExpOp _operator = exp.getOperator();
    String _displayOp = null;
    if (_operator!=null) {
      _displayOp=this.displayOp(_operator);
    }
    _builder.append(_displayOp);
    _builder.append(",");
    Exp _right = exp.getRight();
    CharSequence _displayExp_1 = null;
    if (_right!=null) {
      _displayExp_1=this.displayExp(_right);
    }
    _builder.append(_displayExp_1);
    _builder.append("]");
    return _builder;
  }
  
  protected CharSequence _displayExp(final dk.chcla15.mathinterpreter.mathAssignmentLanguage.Number n) {
    return Integer.valueOf(n.getValue()).toString();
  }
  
  protected CharSequence _displayExp(final Parenthesis p) {
    return this.displayExp(p.getExp());
  }
  
  protected String _displayOp(final Plus op) {
    return "+";
  }
  
  protected String _displayOp(final Minus op) {
    return "-";
  }
  
  protected String _displayOp(final Mult op) {
    return "*";
  }
  
  protected String _displayOp(final Div op) {
    return "/";
  }
  
  public double computeExp(final Exp n) {
    if (n instanceof dk.chcla15.mathinterpreter.mathAssignmentLanguage.Number) {
      return _computeExp((dk.chcla15.mathinterpreter.mathAssignmentLanguage.Number)n);
    } else if (n instanceof Parenthesis) {
      return _computeExp((Parenthesis)n);
    } else if (n != null) {
      return _computeExp(n);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(n).toString());
    }
  }
  
  public CharSequence displayExp(final Exp n) {
    if (n instanceof dk.chcla15.mathinterpreter.mathAssignmentLanguage.Number) {
      return _displayExp((dk.chcla15.mathinterpreter.mathAssignmentLanguage.Number)n);
    } else if (n instanceof Parenthesis) {
      return _displayExp((Parenthesis)n);
    } else if (n != null) {
      return _displayExp(n);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(n).toString());
    }
  }
  
  public String displayOp(final ExpOp op) {
    if (op instanceof Div) {
      return _displayOp((Div)op);
    } else if (op instanceof Minus) {
      return _displayOp((Minus)op);
    } else if (op instanceof Mult) {
      return _displayOp((Mult)op);
    } else if (op instanceof Plus) {
      return _displayOp((Plus)op);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(op).toString());
    }
  }
}
