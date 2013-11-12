package org.applause.lang.generator.ios.model;

import com.google.common.base.Objects;
import org.applause.lang.applauseDsl.Attribute;
import org.applause.lang.applauseDsl.Entity;
import org.applause.lang.applauseDsl.Type;

@SuppressWarnings("all")
public class TypeExtensions {
  public String typeName(final Entity it) {
    String _xifexpression = null;
    boolean _notEquals = (!Objects.equal(it, null));
    if (_notEquals) {
      String _name = it.getName();
      _xifexpression = _name;
    } else {
      _xifexpression = "NSObject";
    }
    return _xifexpression;
  }
  
  public String typeName(final Attribute it) {
    String _switchResult = null;
    Type _type = it.getType();
    String _name = _type.getName();
    final String _switchValue = _name;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_switchValue,"String")) {
        _matched=true;
        _switchResult = "NSString";
      }
    }
    if (!_matched) {
      Type _type_1 = it.getType();
      String _name_1 = _type_1.getName();
      _switchResult = _name_1;
    }
    return _switchResult;
  }
}
