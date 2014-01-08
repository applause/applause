package org.applause.lang.generator.ios;

import com.google.common.base.Objects;
import java.util.Arrays;
import org.applause.lang.applauseDsl.Attribute;
import org.applause.lang.applauseDsl.EntityMemberCall;
import org.applause.lang.applauseDsl.EntityMemberCallTail;
import org.applause.lang.applauseDsl.StringLiteral;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class ExpressionExtensions {
  protected String _evaluateExpression(final StringLiteral it) {
    String _value = it.getValue();
    return _value;
  }
  
  protected String _evaluateExpression(final EntityMemberCall it) {
    Attribute _head = it.getHead();
    String _evaluateExpression = this.evaluateExpression(_head);
    String _xifexpression = null;
    EntityMemberCallTail _tail = it.getTail();
    boolean _notEquals = (!Objects.equal(_tail, null));
    if (_notEquals) {
      EntityMemberCallTail _tail_1 = it.getTail();
      String _evaluateExpression_1 = this.evaluateExpression(_tail_1);
      String _plus = ("memberCall.tail:" + _evaluateExpression_1);
      _xifexpression = _plus;
    } else {
      _xifexpression = "";
    }
    String _plus_1 = (_evaluateExpression + _xifexpression);
    return _plus_1;
  }
  
  protected String _evaluateExpression(final Attribute it) {
    String _name = it.getName();
    return _name;
  }
  
  protected String _evaluateExpression(final EntityMemberCallTail it) {
    Attribute _head = it.getHead();
    String _evaluateExpression = this.evaluateExpression(_head);
    String _plus = ("." + _evaluateExpression);
    String _xifexpression = null;
    EntityMemberCallTail _tail = it.getTail();
    boolean _notEquals = (!Objects.equal(_tail, null));
    if (_notEquals) {
      EntityMemberCallTail _tail_1 = it.getTail();
      String _evaluateExpression_1 = this.evaluateExpression(_tail_1);
      String _plus_1 = ("memberCallTail.tail:" + _evaluateExpression_1);
      _xifexpression = _plus_1;
    } else {
      _xifexpression = "";
    }
    String _plus_2 = (_plus + _xifexpression);
    return _plus_2;
  }
  
  public String evaluateExpression(final EObject it) {
    if (it instanceof EntityMemberCall) {
      return _evaluateExpression((EntityMemberCall)it);
    } else if (it instanceof StringLiteral) {
      return _evaluateExpression((StringLiteral)it);
    } else if (it instanceof Attribute) {
      return _evaluateExpression((Attribute)it);
    } else if (it instanceof EntityMemberCallTail) {
      return _evaluateExpression((EntityMemberCallTail)it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
}
