package de.itemis.mobilizer.generator.iphone;

import com.google.inject.Inject;
import de.itemis.mobilizer.appModelDsl.Application;
import de.itemis.mobilizer.appModelDsl.ProviderConstruction;
import de.itemis.mobilizer.appModelDsl.ScalarExpression;
import de.itemis.mobilizer.appModelDsl.TabbarButton;
import de.itemis.mobilizer.appModelDsl.View;
import de.itemis.mobilizer.appModelDsl.ViewCall;
import de.itemis.mobilizer.generator.iphone.Extensions;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ApplicationDelegate {
  @Inject private Extensions extensions;
  
  public void main(final Application app, final IFileSystemAccess fsa) {
    {
      String _classRootFilename = this.extensions.classRootFilename();
      String _filenameApplicationDelegateHeader = this.extensions.filenameApplicationDelegateHeader(app);
      String _operator_plus = StringExtensions.operator_plus(_classRootFilename, _filenameApplicationDelegateHeader);
      StringConcatenation _headerFile = this.headerFile(app);
      fsa.generateFile(_operator_plus, _headerFile);
      String _classRootFilename_1 = this.extensions.classRootFilename();
      String _filenameApplicationDelegateModule = this.extensions.filenameApplicationDelegateModule(app);
      String _operator_plus_1 = StringExtensions.operator_plus(_classRootFilename_1, _filenameApplicationDelegateModule);
      StringConcatenation _moduleFile = this.moduleFile(app);
      fsa.generateFile(_operator_plus_1, _moduleFile);
    }
  }
  
  public StringConcatenation headerFile(final Application app) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#import <UIKit/UIKit.h>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@interface ");
    String _applicationDelegateClassname = this.extensions.applicationDelegateClassname(app);
    _builder.append(_applicationDelegateClassname, "");
    _builder.append(" : NSObject <UIApplicationDelegate> {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("UIWindow *window;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("UIViewController *rootController;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@property (nonatomic, retain) IBOutlet UIWindow *window;");
    _builder.newLine();
    _builder.append("@property (nonatomic, retain) UIViewController *rootController;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@end");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation moduleImportStatements(final Application app) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<TabbarButton> _buttons = app.getButtons();
      for(TabbarButton b : _buttons) {
        StringConcatenation _moduleImportStatement = this.moduleImportStatement(b);
        _builder.append(_moduleImportStatement, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation moduleImportStatement(final TabbarButton button) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#import \"");
    ViewCall _view = button.getView();
    View _view_1 = _view.getView();
    String _filenameHeader = this.extensions.filenameHeader(_view_1);
    _builder.append(_filenameHeader, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation moduleFile(final Application app) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#import \"");
    String _filenameApplicationDelegateHeader = this.extensions.filenameApplicationDelegateHeader(app);
    _builder.append(_filenameApplicationDelegateHeader, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("#import \"IPUIView.h\"");
    _builder.newLine();
    _builder.append("#import \"");
    String _filenameCentralProvidersHeader = this.extensions.filenameCentralProvidersHeader(app);
    _builder.append(_filenameCentralProvidersHeader, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    StringConcatenation _moduleImportStatements = this.moduleImportStatements(app);
    _builder.append(_moduleImportStatements, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("@implementation ");
    String _applicationDelegateClassname = this.extensions.applicationDelegateClassname(app);
    _builder.append(_applicationDelegateClassname, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("@synthesize window, rootController;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("-(UIViewController*)createController {");
    _builder.newLine();
    _builder.append("\t");
    String _centralProvidersClassName = this.extensions.centralProvidersClassName(app);
    _builder.append(_centralProvidersClassName, "	");
    _builder.append(" *providers = [[[");
    String _centralProvidersClassName_1 = this.extensions.centralProvidersClassName(app);
    _builder.append(_centralProvidersClassName_1, "	");
    _builder.append(" alloc] init] autorelease];");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("UITabBarController *result = [[UITabBarController alloc] init];");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("NSMutableArray *controllers = [NSMutableArray array];");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("UIViewController<IPUIView> *controller;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("UINavigationController *navController;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("IPContentProvider *contentProvider;");
    _builder.newLine();
    _builder.newLine();
    {
      EList<TabbarButton> _buttons = app.getButtons();
      for(TabbarButton b : _buttons) {
        _builder.append("\t");
        StringConcatenation _barControllerInstance = this.barControllerInstance(b);
        _builder.append(_barControllerInstance, "	");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("\t");
    _builder.append("result.viewControllers = controllers;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return result;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("- (void)applicationDidFinishLaunching:(UIApplication *)application {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("self.rootController = [self createController];");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[window addSubview: [self.rootController view]];");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[window makeKeyAndVisible];");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("- (void)dealloc {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("self.rootController = nil;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[window release];");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[super dealloc];");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("@end");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation barControllerInstance(final TabbarButton button) {
    StringConcatenation _builder = new StringConcatenation();
    {
      ViewCall _view = button.getView();
      ProviderConstruction _provider = _view.getProvider();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_provider, null);
      if (_operator_notEquals) {
        _builder.append("// controller for ");
        ScalarExpression _title = button.getTitle();
        String _expression = this.extensions.expression(_title, "", "");
        _builder.append(_expression, "");
        _builder.newLineIfNotEmpty();
        _builder.append("contentProvider = ");
        ViewCall _view_1 = button.getView();
        ProviderConstruction _provider_1 = _view_1.getProvider();
        String _contentProvider = this.extensions.contentProvider(_provider_1, "providers", "", "");
        _builder.append(_contentProvider, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("controller = [[");
    ViewCall _view_2 = button.getView();
    View _view_3 = _view_2.getView();
    String _className = this.extensions.className(_view_3);
    _builder.append(_className, "");
    _builder.append(" alloc] init];");
    _builder.newLineIfNotEmpty();
    _builder.append("[controller setContentProvider: contentProvider];");
    _builder.newLine();
    _builder.append("controller.tabBarItem.title = ");
    ScalarExpression _title_1 = button.getTitle();
    String _expression_1 = this.extensions.expression(_title_1, "", "");
    _builder.append(_expression_1, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("controller.tabBarItem.image = [UIImage imageNamed:");
    ScalarExpression _icon = button.getIcon();
    String _expression_2 = this.extensions.expression(_icon, "", "");
    _builder.append(_expression_2, "");
    _builder.append("];");
    _builder.newLineIfNotEmpty();
    _builder.append("navController = [[UINavigationController alloc] initWithRootViewController:controller];");
    _builder.newLine();
    _builder.append("[controllers addObject: navController];");
    _builder.newLine();
    _builder.append("[controller release];");
    _builder.newLine();
    _builder.append("[navController release];");
    _builder.newLine();
    return _builder;
  }
}