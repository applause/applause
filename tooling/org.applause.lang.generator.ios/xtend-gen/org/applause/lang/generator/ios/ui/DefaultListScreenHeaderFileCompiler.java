package org.applause.lang.generator.ios.ui;

import com.google.inject.Inject;
import org.applause.lang.applauseDsl.Screen;
import org.applause.lang.generator.ios.ui.ScreenClassExtensions;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class DefaultListScreenHeaderFileCompiler {
  @Inject
  @Extension
  private ScreenClassExtensions _screenClassExtensions;
  
  public CharSequence compileHeader(final Screen it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#import <UIKit/UIKit.h>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@interface ");
    String _controllerClassName = this._screenClassExtensions.controllerClassName(it);
    _builder.append(_controllerClassName, "");
    _builder.append(" : UITableViewController");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("@end");
    _builder.newLine();
    return _builder;
  }
}
