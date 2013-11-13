package org.applause.lang.generator.ios.dataaccess;

import com.google.inject.Inject;
import org.applause.lang.applauseDsl.Entity;
import org.applause.lang.generator.ios.dataaccess.APIClientExtensions;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class APIClientHeaderFileCompiler {
  @Inject
  @Extension
  private APIClientExtensions _aPIClientExtensions;
  
  public CharSequence compileHeaderFile(final Entity it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#import <Foundation/Foundation.h>");
    _builder.newLine();
    _builder.append("#import \"AFHTTPSessionManager.h\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@interface ");
    String _className = this._aPIClientExtensions.className(it);
    _builder.append(_className, "");
    _builder.append(" : AFHTTPSessionManager");
    _builder.newLineIfNotEmpty();
    _builder.append("+ (");
    String _className_1 = this._aPIClientExtensions.className(it);
    _builder.append(_className_1, "");
    _builder.append(" *)sharedClient;");
    _builder.newLineIfNotEmpty();
    _builder.append("@end");
    _builder.newLine();
    return _builder;
  }
}
