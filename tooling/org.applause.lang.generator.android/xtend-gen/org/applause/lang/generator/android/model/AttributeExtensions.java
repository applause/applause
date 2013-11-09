package org.applause.lang.generator.android.model;

import org.applause.lang.applauseDsl.Attribute;
import org.applause.lang.applauseDsl.Type;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class AttributeExtensions {
  public String typeName(final Attribute it) {
    Type _type = it.getType();
    String _name = _type.getName();
    return _name;
  }
  
  public String setterName(final Attribute it) {
    String _name = it.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    String _plus = ("set" + _firstUpper);
    return _plus;
  }
  
  public String getterName(final Attribute it) {
    String _name = it.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    String _plus = ("get" + _firstUpper);
    return _plus;
  }
}
