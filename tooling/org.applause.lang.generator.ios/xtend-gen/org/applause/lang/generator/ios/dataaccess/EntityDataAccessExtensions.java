package org.applause.lang.generator.ios.dataaccess;

import org.applause.lang.applauseDsl.Entity;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class EntityDataAccessExtensions {
  public String parameterName(final Entity it) {
    String _name = it.getName();
    String _firstLower = StringExtensions.toFirstLower(_name);
    return _firstLower;
  }
  
  public String plural(final String it) {
    String _plus = (it + "s");
    return _plus;
  }
  
  public String listAllMethodName(final Entity it) {
    String _name = it.getName();
    String _plural = this.plural(_name);
    String _firstUpper = StringExtensions.toFirstUpper(_plural);
    String _plus = ("all" + _firstUpper);
    return _plus;
  }
}
