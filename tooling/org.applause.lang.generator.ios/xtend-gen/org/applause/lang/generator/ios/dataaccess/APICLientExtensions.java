package org.applause.lang.generator.ios.dataaccess;

import org.applause.lang.applauseDsl.Entity;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class APIClientExtensions {
  public String className(final Entity it) {
    String _name = it.getName();
    String _plus = (_name + "APIClient");
    return _plus;
  }
  
  public String headerFileName(final Entity it) {
    String _className = this.className(it);
    String _plus = (_className + ".h");
    return _plus;
  }
  
  public String moduleFileName(final Entity it) {
    String _className = this.className(it);
    String _plus = (_className + ".m");
    return _plus;
  }
  
  public String parameterName(final Entity it) {
    String _name = it.getName();
    String _firstLower = StringExtensions.toFirstLower(_name);
    return _firstLower;
  }
}
