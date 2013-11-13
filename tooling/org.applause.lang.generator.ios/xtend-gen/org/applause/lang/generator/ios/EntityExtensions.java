package org.applause.lang.generator.ios;

import org.applause.lang.applauseDsl.Entity;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class EntityExtensions {
  public String modelClassName(final Entity it) {
    String _name = it.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    return _firstUpper;
  }
}
