package org.applause.lang.generator.ios.dataaccess;

import java.util.Arrays;
import java.util.List;
import org.applause.lang.applauseDsl.AbsoluteRESTURL;
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
}
