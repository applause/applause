package org.applause.lang.generator.ios.ui;

import com.google.inject.Inject;
import org.applause.lang.applauseDsl.Screen;
import org.applause.lang.generator.ios.ui.DefaultDetailsScreenClassExtensions;
import org.applause.lang.generator.ios.ui.DefaultDetailsScreenControllerCompiler;
import org.applause.lang.generator.ios.ui.DefaultDetailsScreenImportHelper;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class DefaultDetailsScreenHeaderFileCompiler {
  @Inject
  @Extension
  private DefaultDetailsScreenClassExtensions _defaultDetailsScreenClassExtensions;
  
  @Inject
  @Extension
  private DefaultDetailsScreenControllerCompiler _defaultDetailsScreenControllerCompiler;
  
  @Inject
  @Extension
  private DefaultDetailsScreenImportHelper _defaultDetailsScreenImportHelper;
  
  public CharSequence compileHeader(final Screen it) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _compileHeaderImports = this._defaultDetailsScreenImportHelper.compileHeaderImports(it);
    _builder.append(_compileHeaderImports, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("@interface ");
    String _controllerClassName = this._defaultDetailsScreenClassExtensions.controllerClassName(it);
    _builder.append(_controllerClassName, "");
    _builder.append(" : QuickDialogController");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _compileControllerMethodsHeaders = this._defaultDetailsScreenControllerCompiler.compileControllerMethodsHeaders(it);
    _builder.append(_compileControllerMethodsHeaders, "");
    _builder.newLineIfNotEmpty();
    _builder.append("@end");
    _builder.newLine();
    return _builder;
  }
}
