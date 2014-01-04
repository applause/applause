package org.applause.lang.generator.ios.dataaccess;

import com.google.inject.Inject;
import org.applause.lang.applauseDsl.Entity;
import org.applause.lang.generator.ios.dataaccess.APIClientClassExtensions;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class APIClientHeaderFileCompiler {
  @Inject
  @Extension
  private APIClientClassExtensions _aPIClientClassExtensions;
  
  public CharSequence compileHeaderFile(final Entity it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#import <Foundation/Foundation.h>");
    _builder.newLine();
    _builder.append("#import \"AFHTTPSessionManager.h\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@interface ");
    String _apiClientClassName = this._aPIClientClassExtensions.apiClientClassName(it);
    _builder.append(_apiClientClassName, "");
    _builder.append(" : AFHTTPSessionManager");
    _builder.newLineIfNotEmpty();
    _builder.append("+ (");
    String _apiClientClassName_1 = this._aPIClientClassExtensions.apiClientClassName(it);
    _builder.append(_apiClientClassName_1, "");
    _builder.append(" *)sharedClient;");
    _builder.newLineIfNotEmpty();
    _builder.append("@end");
    _builder.newLine();
    return _builder;
  }
}
