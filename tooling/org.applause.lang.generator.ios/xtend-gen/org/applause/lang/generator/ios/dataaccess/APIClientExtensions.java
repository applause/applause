package org.applause.lang.generator.ios.dataaccess;

import org.applause.lang.applauseDsl.Entity;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class APIClientExtensions {
  public String parameterName(final Entity it) {
    String _name = it.getName();
    String _firstLower = StringExtensions.toFirstLower(_name);
    return _firstLower;
  }
}
