package de.itemis.mobilizer.generator.iphone;

import com.google.inject.Inject;
import de.itemis.mobilizer.appModelDsl.Application;
import de.itemis.mobilizer.appModelDsl.ContentProvider;
import de.itemis.mobilizer.appModelDsl.Parameter;
import de.itemis.mobilizer.appModelDsl.ScalarExpression;
import de.itemis.mobilizer.generator.base.Extensions;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class Provider {
  @Inject private Extensions baseExtensions;
  @Inject private de.itemis.mobilizer.generator.iphone.Extensions extensions;
  
  public void main(final Application app, final IFileSystemAccess fsa) {
    {
      String _classRootFilename = this.extensions.classRootFilename();
      String _filenameCentralProvidersHeader = this.extensions.filenameCentralProvidersHeader(app);
      String _operator_plus = StringExtensions.operator_plus(_classRootFilename, _filenameCentralProvidersHeader);
      StringConcatenation _headerFile = this.headerFile(app);
      fsa.generateFile(_operator_plus, _headerFile);
      String _classRootFilename_1 = this.extensions.classRootFilename();
      String _filenameCentralProvidersModule = this.extensions.filenameCentralProvidersModule(app);
      String _operator_plus_1 = StringExtensions.operator_plus(_classRootFilename_1, _filenameCentralProvidersModule);
      StringConcatenation _moduleFile = this.moduleFile(app);
      fsa.generateFile(_operator_plus_1, _moduleFile);
    }
  }
  
  public StringConcatenation headerFile(final Application app) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#import \"IPContentProvider.h\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@interface ");
    String _centralProvidersClassName = this.extensions.centralProvidersClassName(app);
    _builder.append(_centralProvidersClassName, "");
    _builder.append(" : NSObject {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    {
      Iterable<ContentProvider> _providersWithImplementation = this.baseExtensions.providersWithImplementation(app);
      for(ContentProvider p : _providersWithImplementation) {
        String _methodSignature = this.methodSignature(p);
        _builder.append(_methodSignature, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("@end");
    _builder.newLine();
    return _builder;
  }
  
  public String methodSignature(final ContentProvider p) {
    final ContentProvider typeConverted_p = (ContentProvider)p;
    String _name = typeConverted_p.getName();
    String _operator_plus = StringExtensions.operator_plus("-(IPContentProvider*)providerFor", _name);
    String _xifexpression = null;
    Parameter _parameter = p.getParameter();
    boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_parameter, null);
    if (_operator_notEquals) {
      Parameter _parameter_1 = p.getParameter();
      String _name_1 = _parameter_1.getName();
      String _operator_plus_1 = StringExtensions.operator_plus(":(id)", _name_1);
      _xifexpression = _operator_plus_1;
    } else {
      _xifexpression = "";
    }
    String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus, _xifexpression);
    return _operator_plus_2;
  }
  
  public StringConcatenation moduleFile(final Application app) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#import \"");
    String _filenameCentralProvidersHeader = this.extensions.filenameCentralProvidersHeader(app);
    _builder.append(_filenameCentralProvidersHeader, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("#import \"IPXMLContentProvider.h\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@implementation ");
    String _centralProvidersClassName = this.extensions.centralProvidersClassName(app);
    _builder.append(_centralProvidersClassName, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      Iterable<ContentProvider> _providersWithImplementation = this.baseExtensions.providersWithImplementation(app);
      for(ContentProvider p : _providersWithImplementation) {
        String _providerMethodImplementation = this.providerMethodImplementation(p);
        _builder.append(_providerMethodImplementation, "");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("@end");
    _builder.newLine();
    return _builder;
  }
  
  public String providerMethodImplementation(final ContentProvider p) {
    {
      String _xifexpression = null;
      Parameter _parameter = p.getParameter();
      String _name = _parameter==null?(String)null:_parameter.getName();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_name, null);
      if (_operator_notEquals) {
        Parameter _parameter_1 = p.getParameter();
        String _name_1 = _parameter_1.getName();
        _xifexpression = _name_1;
      } else {
        _xifexpression = "";
      }
      final String kvcTarget = _xifexpression;
      String _methodSignature = this.methodSignature(p);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(" ");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("NSString* url = ");
      ScalarExpression _url = p.getUrl();
      String _expression = this.extensions.expression(_url, kvcTarget, "");
      _builder.append(_expression, "	");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("IPContentProvider *result = [[[IPXMLContentProvider alloc] ");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t\t\t  ");
      _builder.append("initWithURL: [NSURL URLWithString:url] ");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t\t\t  ");
      _builder.append("initialContent: nil");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t\t\t  ");
      _builder.append("keyPathToContent: ");
      ScalarExpression _selection = p.getSelection();
      String _expression_1 = this.extensions.expression(_selection, kvcTarget, "");
      _builder.append(_expression_1, "								  ");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t\t\t\t\t\t  ");
      _builder.append("andProviders:self] autorelease];");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("return result;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      String _operator_plus = StringExtensions.operator_plus(_methodSignature, _builder);
      return _operator_plus;
    }
  }
}