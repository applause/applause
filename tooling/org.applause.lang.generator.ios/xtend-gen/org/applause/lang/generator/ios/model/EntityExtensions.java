package org.applause.lang.generator.ios.model;

import org.applause.lang.applauseDsl.Entity;

@SuppressWarnings("all")
public class EntityExtensions {
  public String moduleFileName(final Entity it) {
    String _name = it.getName();
    String _plus = (_name + ".m");
    return _plus;
  }
  
  public String headerFileName(final Entity it) {
    String _name = it.getName();
    String _plus = (_name + ".h");
    return _plus;
  }
}
