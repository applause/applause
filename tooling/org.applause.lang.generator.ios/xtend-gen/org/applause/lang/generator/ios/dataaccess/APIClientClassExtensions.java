package org.applause.lang.generator.ios.dataaccess;

import org.applause.lang.applauseDsl.Entity;

@SuppressWarnings("all")
public class APIClientClassExtensions {
  public String apiClientClassName(final Entity it) {
    String _name = it.getName();
    String _plus = (_name + "APIClient");
    return _plus;
  }
}
