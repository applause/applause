package org.applause.lang.generator.ios.dataaccess;

import com.google.common.collect.Iterables;
import java.util.Arrays;
import java.util.List;
import org.applause.lang.applauseDsl.AbsoluteRESTURL;
import org.applause.lang.applauseDsl.Attribute;
import org.applause.lang.applauseDsl.Parameter;
import org.applause.lang.applauseDsl.ParameterCall;
import org.applause.lang.applauseDsl.ParameterMemberCall;
import org.applause.lang.applauseDsl.ParameterReference;
import org.applause.lang.applauseDsl.RESTURL;
import org.applause.lang.applauseDsl.RelativeRESTURL;
import org.applause.lang.applauseDsl.UrlFragment;
import org.applause.lang.applauseDsl.UrlPathFragment;
import org.applause.lang.applauseDsl.Variable;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class RESTURLExtensions {
  protected String _value(final AbsoluteRESTURL it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("http://");
    UrlFragment _host = it.getHost();
    String _value = this.value(_host);
    _builder.append(_value, "");
    String _xifexpression = null;
    int _port = it.getPort();
    boolean _notEquals = (_port != 0);
    if (_notEquals) {
      int _port_1 = it.getPort();
      String _plus = (":" + Integer.valueOf(_port_1));
      _xifexpression = _plus;
    }
    _builder.append(_xifexpression, "");
    _builder.append("/");
    EList<UrlFragment> _fragments = it.getFragments();
    final Function1<UrlFragment,String> _function = new Function1<UrlFragment,String>() {
      public String apply(final UrlFragment fragment) {
        String _value = RESTURLExtensions.this.value(fragment);
        return _value;
      }
    };
    List<String> _map = ListExtensions.<UrlFragment, String>map(_fragments, _function);
    String _join = IterableExtensions.join(_map, "/");
    _builder.append(_join, "");
    return _builder.toString();
  }
  
  protected String _value(final RelativeRESTURL it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/");
    EList<UrlFragment> _fragments = it.getFragments();
    final Function1<UrlFragment,String> _function = new Function1<UrlFragment,String>() {
      public String apply(final UrlFragment fragment) {
        String _value = RESTURLExtensions.this.value(fragment);
        return _value;
      }
    };
    List<String> _map = ListExtensions.<UrlFragment, String>map(_fragments, _function);
    String _join = IterableExtensions.join(_map, "/");
    _builder.append(_join, "");
    return _builder.toString();
  }
  
  protected String _value(final UrlPathFragment it) {
    String _name = it.getName();
    return _name;
  }
  
  protected String _value(final Variable it) {
    return "%@";
  }
  
  public Iterable<String> variables(final RESTURL it) {
    EList<UrlFragment> _fragments = it.getFragments();
    Iterable<Variable> _filter = Iterables.<Variable>filter(_fragments, Variable.class);
    final Function1<Variable,String> _function = new Function1<Variable,String>() {
      public String apply(final Variable it) {
        String _variable = RESTURLExtensions.this.variable(it);
        return _variable;
      }
    };
    Iterable<String> _map = IterableExtensions.<Variable, String>map(_filter, _function);
    return _map;
  }
  
  protected String _variable(final Variable it) {
    ParameterReference _parameterReference = it.getParameterReference();
    String _variable = this.variable(_parameterReference);
    return _variable;
  }
  
  protected String _variable(final ParameterCall it) {
    Parameter _head = it.getHead();
    String _name = _head.getName();
    return _name;
  }
  
  protected String _variable(final ParameterMemberCall it) {
    ParameterReference _reference = it.getReference();
    String _variable = this.variable(_reference);
    String _plus = (_variable + ".");
    Attribute _tail = it.getTail();
    String _name = _tail.getName();
    String _plus_1 = (_plus + _name);
    return _plus_1;
  }
  
  protected String _variable(final UrlPathFragment it) {
    return null;
  }
  
  public String value(final EObject it) {
    if (it instanceof AbsoluteRESTURL) {
      return _value((AbsoluteRESTURL)it);
    } else if (it instanceof RelativeRESTURL) {
      return _value((RelativeRESTURL)it);
    } else if (it instanceof UrlPathFragment) {
      return _value((UrlPathFragment)it);
    } else if (it instanceof Variable) {
      return _value((Variable)it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
  
  public String variable(final EObject it) {
    if (it instanceof ParameterCall) {
      return _variable((ParameterCall)it);
    } else if (it instanceof ParameterMemberCall) {
      return _variable((ParameterMemberCall)it);
    } else if (it instanceof UrlPathFragment) {
      return _variable((UrlPathFragment)it);
    } else if (it instanceof Variable) {
      return _variable((Variable)it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
}
