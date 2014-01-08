package org.applause.lang.generator.ios.ui;

import org.applause.lang.applauseDsl.Screen;

@SuppressWarnings("all")
public class ScreenClassExtensions {
  public String controllerClassName(final Screen it) {
    String _name = it.getName();
    String _plus = (_name + "ViewController");
    return _plus;
  }
  
  public String screenHeaderFileName(final Screen it) {
    String _controllerClassName = this.controllerClassName(it);
    String _plus = (_controllerClassName + ".h");
    return _plus;
  }
  
  public String screenModuleFileName(final Screen it) {
    String _controllerClassName = this.controllerClassName(it);
    String _plus = (_controllerClassName + ".m");
    return _plus;
  }
}
