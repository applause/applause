package org.applause.lang.generator.ios.dataaccess;

import org.applause.lang.applauseDsl.Entity;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class EntityDataAccessExtensions {
  private final String DATAACCESS_CATEGORY = "DataAccess";
  
  public String headerFileName(final Entity it) {
    String _name = it.getName();
    String _plus = (_name + "+");
    String _plus_1 = (_plus + this.DATAACCESS_CATEGORY);
    String _plus_2 = (_plus_1 + ".h");
    return _plus_2;
  }
  
  public String moduleFileName(final Entity it) {
    String _name = it.getName();
    String _plus = (_name + "+");
    String _plus_1 = (_plus + this.DATAACCESS_CATEGORY);
    String _plus_2 = (_plus_1 + ".m");
    return _plus_2;
  }
  
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
