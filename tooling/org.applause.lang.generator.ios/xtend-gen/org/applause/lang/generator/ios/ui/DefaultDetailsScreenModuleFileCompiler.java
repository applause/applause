package org.applause.lang.generator.ios.ui;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.HashSet;
import java.util.List;
import org.applause.lang.applauseDsl.DataSource;
import org.applause.lang.applauseDsl.DataSourceAccessMethod;
import org.applause.lang.applauseDsl.DataSourceCall;
import org.applause.lang.applauseDsl.Entity;
import org.applause.lang.applauseDsl.Expression;
import org.applause.lang.applauseDsl.ListItemCellDeclaration;
import org.applause.lang.applauseDsl.Parameter;
import org.applause.lang.applauseDsl.RESTMethodCall;
import org.applause.lang.applauseDsl.RESTSpecification;
import org.applause.lang.applauseDsl.RESTVerb;
import org.applause.lang.applauseDsl.Screen;
import org.applause.lang.applauseDsl.ScreenListItemCell;
import org.applause.lang.applauseDsl.ScreenSection;
import org.applause.lang.applauseDsl.ScreenSectionItems;
import org.applause.lang.applauseDsl.UIComponentMemberCall;
import org.applause.lang.applauseDsl.UIComponentMemberConfiguration;
import org.applause.lang.applauseDsl.UIComponentMemberDeclaration;
import org.applause.lang.generator.ios.ExpressionExtensions;
import org.applause.lang.generator.ios.dataaccess.DataAccessMethodCompiler;
import org.applause.lang.generator.ios.model.TypeExtensions;
import org.applause.lang.generator.ios.ui.DefaultDetailsScreenClassExtensions;
import org.applause.lang.generator.ios.ui.DefaultDetailsScreenControllerCompiler;
import org.applause.lang.generator.ios.ui.DefaultDetailsScreenImportHelper;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class DefaultDetailsScreenModuleFileCompiler {
  @Inject
  @Extension
  private DefaultDetailsScreenClassExtensions _defaultDetailsScreenClassExtensions;
  
  @Inject
  @Extension
  private TypeExtensions _typeExtensions;
  
  @Inject
  @Extension
  private ExpressionExtensions _expressionExtensions;
  
  @Inject
  @Extension
  private DefaultDetailsScreenControllerCompiler _defaultDetailsScreenControllerCompiler;
  
  @Inject
  @Extension
  private DefaultDetailsScreenImportHelper _defaultDetailsScreenImportHelper;
  
  @Inject
  @Extension
  private DataAccessMethodCompiler _dataAccessMethodCompiler;
  
  public Iterable<UIComponentMemberConfiguration> configurations(final Screen it) {
    EList<ScreenSection> _sections = it.getSections();
    final Function1<ScreenSection,ScreenSectionItems> _function = new Function1<ScreenSection,ScreenSectionItems>() {
      public ScreenSectionItems apply(final ScreenSection it) {
        ScreenSectionItems _items = it.getItems();
        return _items;
      }
    };
    List<ScreenSectionItems> _map = ListExtensions.<ScreenSection, ScreenSectionItems>map(_sections, _function);
    final Function1<ScreenSectionItems,EList<ScreenListItemCell>> _function_1 = new Function1<ScreenSectionItems,EList<ScreenListItemCell>>() {
      public EList<ScreenListItemCell> apply(final ScreenSectionItems it) {
        EList<ScreenListItemCell> _items = it.getItems();
        return _items;
      }
    };
    List<EList<ScreenListItemCell>> _map_1 = ListExtensions.<ScreenSectionItems, EList<ScreenListItemCell>>map(_map, _function_1);
    Iterable<ScreenListItemCell> _flatten = Iterables.<ScreenListItemCell>concat(_map_1);
    final Function1<ScreenListItemCell,EList<UIComponentMemberConfiguration>> _function_2 = new Function1<ScreenListItemCell,EList<UIComponentMemberConfiguration>>() {
      public EList<UIComponentMemberConfiguration> apply(final ScreenListItemCell it) {
        EList<UIComponentMemberConfiguration> _configurations = it.getConfigurations();
        return _configurations;
      }
    };
    Iterable<EList<UIComponentMemberConfiguration>> _map_2 = IterableExtensions.<ScreenListItemCell, EList<UIComponentMemberConfiguration>>map(_flatten, _function_2);
    Iterable<UIComponentMemberConfiguration> _flatten_1 = Iterables.<UIComponentMemberConfiguration>concat(_map_2);
    return _flatten_1;
  }
  
  public Iterable<ScreenListItemCell> cells(final Screen it) {
    EList<ScreenSection> _sections = it.getSections();
    final Function1<ScreenSection,ScreenSectionItems> _function = new Function1<ScreenSection,ScreenSectionItems>() {
      public ScreenSectionItems apply(final ScreenSection it) {
        ScreenSectionItems _items = it.getItems();
        return _items;
      }
    };
    List<ScreenSectionItems> _map = ListExtensions.<ScreenSection, ScreenSectionItems>map(_sections, _function);
    final Function1<ScreenSectionItems,EList<ScreenListItemCell>> _function_1 = new Function1<ScreenSectionItems,EList<ScreenListItemCell>>() {
      public EList<ScreenListItemCell> apply(final ScreenSectionItems it) {
        EList<ScreenListItemCell> _items = it.getItems();
        return _items;
      }
    };
    List<EList<ScreenListItemCell>> _map_1 = ListExtensions.<ScreenSectionItems, EList<ScreenListItemCell>>map(_map, _function_1);
    Iterable<ScreenListItemCell> _flatten = Iterables.<ScreenListItemCell>concat(_map_1);
    return _flatten;
  }
  
  public ScreenListItemCell defaultCell(final Screen it) {
    EList<ScreenSection> _sections = it.getSections();
    final Function1<ScreenSection,ScreenSectionItems> _function = new Function1<ScreenSection,ScreenSectionItems>() {
      public ScreenSectionItems apply(final ScreenSection it) {
        ScreenSectionItems _items = it.getItems();
        return _items;
      }
    };
    List<ScreenSectionItems> _map = ListExtensions.<ScreenSection, ScreenSectionItems>map(_sections, _function);
    final Function1<ScreenSectionItems,EList<ScreenListItemCell>> _function_1 = new Function1<ScreenSectionItems,EList<ScreenListItemCell>>() {
      public EList<ScreenListItemCell> apply(final ScreenSectionItems it) {
        EList<ScreenListItemCell> _items = it.getItems();
        return _items;
      }
    };
    List<EList<ScreenListItemCell>> _map_1 = ListExtensions.<ScreenSectionItems, EList<ScreenListItemCell>>map(_map, _function_1);
    Iterable<ScreenListItemCell> _flatten = Iterables.<ScreenListItemCell>concat(_map_1);
    ScreenListItemCell _head = IterableExtensions.<ScreenListItemCell>head(_flatten);
    return _head;
  }
  
  public DataSourceAccessMethod restMethod(final Screen it) {
    ScreenListItemCell _defaultCell = this.defaultCell(it);
    RESTMethodCall _restMethod = _defaultCell.getRestMethod();
    DataSourceAccessMethod _restMethod_1 = _restMethod.getRestMethod();
    return _restMethod_1;
  }
  
  public CharSequence compileModule(final Screen it) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _compileModuleImports = this._defaultDetailsScreenImportHelper.compileModuleImports(it);
    _builder.append(_compileModuleImports, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("@interface ");
    String _controllerClassName = this._defaultDetailsScreenClassExtensions.controllerClassName(it);
    _builder.append(_controllerClassName, "");
    _builder.append(" ()");
    _builder.newLineIfNotEmpty();
    _builder.append("@property(nonatomic) enum DetailsViewMode mode;");
    _builder.newLine();
    _builder.append("@property(nonatomic, copy) void (^doneBlock)(");
    Entity _resourceType = this._defaultDetailsScreenClassExtensions.resourceType(it);
    String _typeName = this._typeExtensions.typeName(_resourceType);
    _builder.append(_typeName, "");
    _builder.append(" *);");
    _builder.newLineIfNotEmpty();
    Iterable<Parameter> _considerableParameters = this._defaultDetailsScreenControllerCompiler.considerableParameters(it);
    final Function1<Parameter,String> _function = new Function1<Parameter,String>() {
      public String apply(final Parameter it) {
        CharSequence _compile = DefaultDetailsScreenModuleFileCompiler.this._defaultDetailsScreenControllerCompiler.compile(it);
        String _string = _compile.toString();
        return _string;
      }
    };
    Iterable<String> _map = IterableExtensions.<Parameter, String>map(_considerableParameters, _function);
    HashSet<String> _unique = this._defaultDetailsScreenImportHelper.unique(_map);
    String _join = IterableExtensions.join(_unique);
    _builder.append(_join, "");
    _builder.newLineIfNotEmpty();
    _builder.append("@end");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@implementation ");
    String _controllerClassName_1 = this._defaultDetailsScreenClassExtensions.controllerClassName(it);
    _builder.append(_controllerClassName_1, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("enum DetailsViewMode {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("DetailsViewModeAdd,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("DetailsViewModeEdit,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("DetailsViewModeDisplay");
    _builder.newLine();
    _builder.append("};");
    _builder.newLine();
    _builder.append("typedef enum DetailsViewMode DetailsViewMode;");
    _builder.newLine();
    _builder.newLine();
    CharSequence _compileControllerMethods = this._defaultDetailsScreenControllerCompiler.compileControllerMethods(it);
    _builder.append(_compileControllerMethods, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("- (id)initWithMode:(DetailsViewMode)mode");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("self = [super initWithRoot:[self createForm]];");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if (self) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("self.mode = mode;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("[self createActionButtons];");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return self;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("- (void)createActionButtons");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if (self.mode == DetailsViewModeAdd) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("self.navigationItem.leftBarButtonItem = [[UIBarButtonItem alloc] initWithBarButtonSystemItem:UIBarButtonSystemItemCancel");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  ");
    _builder.append("target:self");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  ");
    _builder.append("action:@selector(onCancel)];");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("self.navigationItem.rightBarButtonItem = [[UIBarButtonItem alloc] initWithBarButtonSystemItem:UIBarButtonSystemItemDone");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   ");
    _builder.append("target:self");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   ");
    _builder.append("action:@selector(onDone)];");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("- (void)onDone");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[self.root fetchValueUsingBindingsIntoObject:self.item];");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if (self.mode == DetailsViewModeAdd) {");
    _builder.newLine();
    _builder.append("\t\t");
    CharSequence _compileCreateNewItemFragment = this.compileCreateNewItemFragment(it);
    _builder.append(_compileCreateNewItemFragment, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("else {");
    _builder.newLine();
    _builder.append("\t\t");
    CharSequence _compileUpdateItemFragment = this.compileUpdateItemFragment(it);
    _builder.append(_compileUpdateItemFragment, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("- (void)onCancel");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[self.presentingViewController dismissViewControllerAnimated:YES completion:nil];");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("- (void)setItem:(");
    Entity _resourceType_1 = this._defaultDetailsScreenClassExtensions.resourceType(it);
    String _typeName_1 = this._typeExtensions.typeName(_resourceType_1);
    _builder.append(_typeName_1, "");
    _builder.append(" *)item");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("_item = item;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[self.root bindToObject:self.item];");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    CharSequence _compileForm = this.compileForm(it);
    _builder.append(_compileForm, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("@end");
    _builder.newLine();
    return _builder;
  }
  
  public String dataAccessMethodNameForUpdate(final Screen it) {
    DataSourceCall _datasource = it.getDatasource();
    DataSource _datasource_1 = _datasource.getDatasource();
    EList<DataSourceAccessMethod> _methods = _datasource_1.getMethods();
    final Function1<DataSourceAccessMethod,Boolean> _function = new Function1<DataSourceAccessMethod,Boolean>() {
      public Boolean apply(final DataSourceAccessMethod it) {
        RESTSpecification _restSpecification = it.getRestSpecification();
        RESTVerb _verb = _restSpecification.getVerb();
        boolean _equals = Objects.equal(_verb, RESTVerb.PUT);
        return Boolean.valueOf(_equals);
      }
    };
    DataSourceAccessMethod _findFirst = IterableExtensions.<DataSourceAccessMethod>findFirst(_methods, _function);
    String _name = _findFirst.getName();
    return _name;
  }
  
  public CharSequence compileUpdateItemFragment(final Screen it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[self.item ");
    String _dataAccessMethodNameForUpdate = this.dataAccessMethodNameForUpdate(it);
    _builder.append(_dataAccessMethodNameForUpdate, "");
    _builder.append(":^(");
    Entity _resourceType = this._defaultDetailsScreenClassExtensions.resourceType(it);
    String _typeName = this._typeExtensions.typeName(_resourceType);
    _builder.append(_typeName, "");
    _builder.append(" *item, NSError *error)");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if(error == nil) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (self.doneBlock) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("self.doneBlock(item);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("else {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// use a HUD to display this to the user:");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("NSLog(@\"Problem saving the ");
    Entity _resourceType_1 = this._defaultDetailsScreenClassExtensions.resourceType(it);
    String _typeName_1 = this._typeExtensions.typeName(_resourceType_1);
    String _firstLower = StringExtensions.toFirstLower(_typeName_1);
    _builder.append(_firstLower, "\t\t");
    _builder.append(". Try again later.\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}];");
    _builder.newLine();
    return _builder;
  }
  
  public String dataAccessMethodNameForCreate(final Screen it) {
    DataSourceCall _datasource = it.getDatasource();
    DataSource _datasource_1 = _datasource.getDatasource();
    EList<DataSourceAccessMethod> _methods = _datasource_1.getMethods();
    final Function1<DataSourceAccessMethod,Boolean> _function = new Function1<DataSourceAccessMethod,Boolean>() {
      public Boolean apply(final DataSourceAccessMethod it) {
        RESTSpecification _restSpecification = it.getRestSpecification();
        RESTVerb _verb = _restSpecification.getVerb();
        boolean _equals = Objects.equal(_verb, RESTVerb.POST);
        return Boolean.valueOf(_equals);
      }
    };
    DataSourceAccessMethod _findFirst = IterableExtensions.<DataSourceAccessMethod>findFirst(_methods, _function);
    String _name = _findFirst.getName();
    return _name;
  }
  
  public String dataAccessMethodCallForCreate(final Screen it) {
    DataSourceCall _datasource = it.getDatasource();
    DataSource _datasource_1 = _datasource.getDatasource();
    EList<DataSourceAccessMethod> _methods = _datasource_1.getMethods();
    final Function1<DataSourceAccessMethod,Boolean> _function = new Function1<DataSourceAccessMethod,Boolean>() {
      public Boolean apply(final DataSourceAccessMethod it) {
        RESTSpecification _restSpecification = it.getRestSpecification();
        RESTVerb _verb = _restSpecification.getVerb();
        boolean _equals = Objects.equal(_verb, RESTVerb.POST);
        return Boolean.valueOf(_equals);
      }
    };
    DataSourceAccessMethod _findFirst = IterableExtensions.<DataSourceAccessMethod>findFirst(_methods, _function);
    String _dataAccessMethodCall = this._dataAccessMethodCompiler.dataAccessMethodCall(_findFirst);
    return _dataAccessMethodCall;
  }
  
  public CharSequence compileCreateNewItemFragment(final Screen it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[self.item ");
    String _dataAccessMethodCallForCreate = this.dataAccessMethodCallForCreate(it);
    _builder.append(_dataAccessMethodCallForCreate, "");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if(error == nil) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (self.doneBlock) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("self.doneBlock(item);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("else {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// use a HUD to display this to the user:");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("NSLog(@\"Problem saving the ");
    Entity _resourceType = this._defaultDetailsScreenClassExtensions.resourceType(it);
    String _typeName = this._typeExtensions.typeName(_resourceType);
    String _firstLower = StringExtensions.toFirstLower(_typeName);
    _builder.append(_firstLower, "\t\t");
    _builder.append(". Try again later.\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}];");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileForm(final Screen it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("- (QRootElement *)createForm");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("QRootElement *root = [[QRootElement alloc] init];");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("root.controllerName = @\"");
    String _controllerClassName = this._defaultDetailsScreenClassExtensions.controllerClassName(it);
    _builder.append(_controllerClassName, "\t");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("root.grouped = YES;");
    _builder.newLine();
    {
      String _title = it.getTitle();
      boolean _notEquals = (!Objects.equal(_title, null));
      if (_notEquals) {
        _builder.append("\t");
        _builder.append("root.title = @\"");
        String _title_1 = it.getTitle();
        _builder.append(_title_1, "\t");
        _builder.append("\";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("\t");
    _builder.append("QSection *sectionMain = [[QSection alloc] init];");
    _builder.newLine();
    _builder.newLine();
    {
      Iterable<ScreenListItemCell> _cells = this.cells(it);
      for(final ScreenListItemCell it_1 : _cells) {
        _builder.append("\t");
        CharSequence _compileCell = this.compileCell(it_1);
        _builder.append(_compileCell, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("[root addSection:sectionMain];");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return root;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileCell(final ScreenListItemCell it) {
    CharSequence _switchResult = null;
    ListItemCellDeclaration _type = it.getType();
    String _name = _type.getName();
    final String _switchValue = _name;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_switchValue,"TextDetailsItemCell")) {
        _matched=true;
        CharSequence _compileTextCell = this.compileTextCell(it);
        _switchResult = _compileTextCell;
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"ToggleDetailsItemCell")) {
        _matched=true;
        CharSequence _compileBooleanCell = this.compileBooleanCell(it);
        _switchResult = _compileBooleanCell;
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"DateDetailsItemCell")) {
        _matched=true;
        CharSequence _compileDateCell = this.compileDateCell(it);
        _switchResult = _compileDateCell;
      }
    }
    return _switchResult;
  }
  
  public UIComponentMemberConfiguration labelConfig(final ScreenListItemCell it) {
    EList<UIComponentMemberConfiguration> _configurations = it.getConfigurations();
    final Function1<UIComponentMemberConfiguration,Boolean> _function = new Function1<UIComponentMemberConfiguration,Boolean>() {
      public Boolean apply(final UIComponentMemberConfiguration it) {
        UIComponentMemberCall _type = it.getType();
        UIComponentMemberDeclaration _component = _type.getComponent();
        String _name = _component.getName();
        boolean _equals = Objects.equal(_name, "label");
        return Boolean.valueOf(_equals);
      }
    };
    UIComponentMemberConfiguration _findFirst = IterableExtensions.<UIComponentMemberConfiguration>findFirst(_configurations, _function);
    return _findFirst;
  }
  
  public UIComponentMemberConfiguration detailsConfig(final ScreenListItemCell it) {
    EList<UIComponentMemberConfiguration> _configurations = it.getConfigurations();
    final Function1<UIComponentMemberConfiguration,Boolean> _function = new Function1<UIComponentMemberConfiguration,Boolean>() {
      public Boolean apply(final UIComponentMemberConfiguration it) {
        UIComponentMemberCall _type = it.getType();
        UIComponentMemberDeclaration _component = _type.getComponent();
        String _name = _component.getName();
        boolean _equals = Objects.equal(_name, "details");
        return Boolean.valueOf(_equals);
      }
    };
    UIComponentMemberConfiguration _findFirst = IterableExtensions.<UIComponentMemberConfiguration>findFirst(_configurations, _function);
    return _findFirst;
  }
  
  public String entryElementName(final ScreenListItemCell it) {
    UIComponentMemberConfiguration _detailsConfig = this.detailsConfig(it);
    Expression _value = _detailsConfig.getValue();
    String _evaluateExpression = this._expressionExtensions.evaluateExpression(_value);
    String _firstLower = StringExtensions.toFirstLower(_evaluateExpression);
    String _plus = (_firstLower + "Element");
    return _plus;
  }
  
  public CharSequence compileTextCell(final ScreenListItemCell it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("QEntryElement *");
    String _entryElementName = this.entryElementName(it);
    _builder.append(_entryElementName, "");
    _builder.append(" = [[QEntryElement alloc] init];");
    _builder.newLineIfNotEmpty();
    String _entryElementName_1 = this.entryElementName(it);
    _builder.append(_entryElementName_1, "");
    _builder.append(".title = @\"");
    UIComponentMemberConfiguration _labelConfig = this.labelConfig(it);
    Expression _value = _labelConfig.getValue();
    String _evaluateExpression = this._expressionExtensions.evaluateExpression(_value);
    _builder.append(_evaluateExpression, "");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    String _entryElementName_2 = this.entryElementName(it);
    _builder.append(_entryElementName_2, "");
    _builder.append(".key = @\"");
    UIComponentMemberConfiguration _detailsConfig = this.detailsConfig(it);
    Expression _value_1 = _detailsConfig.getValue();
    String _evaluateExpression_1 = this._expressionExtensions.evaluateExpression(_value_1);
    _builder.append(_evaluateExpression_1, "");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    String _entryElementName_3 = this.entryElementName(it);
    _builder.append(_entryElementName_3, "");
    _builder.append(".bind = @\"textValue:");
    UIComponentMemberConfiguration _detailsConfig_1 = this.detailsConfig(it);
    Expression _value_2 = _detailsConfig_1.getValue();
    String _evaluateExpression_2 = this._expressionExtensions.evaluateExpression(_value_2);
    _builder.append(_evaluateExpression_2, "");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("[sectionMain addElement:");
    String _entryElementName_4 = this.entryElementName(it);
    _builder.append(_entryElementName_4, "");
    _builder.append("];");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compileBooleanCell(final ScreenListItemCell it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("QBooleanElement *");
    String _entryElementName = this.entryElementName(it);
    _builder.append(_entryElementName, "");
    _builder.append(" = [[QBooleanElement alloc] init];");
    _builder.newLineIfNotEmpty();
    String _entryElementName_1 = this.entryElementName(it);
    _builder.append(_entryElementName_1, "");
    _builder.append(".title = @\"");
    UIComponentMemberConfiguration _labelConfig = this.labelConfig(it);
    Expression _value = _labelConfig.getValue();
    String _evaluateExpression = this._expressionExtensions.evaluateExpression(_value);
    _builder.append(_evaluateExpression, "");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    String _entryElementName_2 = this.entryElementName(it);
    _builder.append(_entryElementName_2, "");
    _builder.append(".key = @\"");
    UIComponentMemberConfiguration _detailsConfig = this.detailsConfig(it);
    Expression _value_1 = _detailsConfig.getValue();
    String _evaluateExpression_1 = this._expressionExtensions.evaluateExpression(_value_1);
    _builder.append(_evaluateExpression_1, "");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    String _entryElementName_3 = this.entryElementName(it);
    _builder.append(_entryElementName_3, "");
    _builder.append(".bind = @\"boolValue:");
    UIComponentMemberConfiguration _detailsConfig_1 = this.detailsConfig(it);
    Expression _value_2 = _detailsConfig_1.getValue();
    String _evaluateExpression_2 = this._expressionExtensions.evaluateExpression(_value_2);
    _builder.append(_evaluateExpression_2, "");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("[sectionMain addElement:");
    String _entryElementName_4 = this.entryElementName(it);
    _builder.append(_entryElementName_4, "");
    _builder.append("];");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compileDateCell(final ScreenListItemCell it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("QDateTimeInlineElement *");
    String _entryElementName = this.entryElementName(it);
    _builder.append(_entryElementName, "");
    _builder.append(" = [[QDateTimeInlineElement alloc] init];");
    _builder.newLineIfNotEmpty();
    String _entryElementName_1 = this.entryElementName(it);
    _builder.append(_entryElementName_1, "");
    _builder.append(".title = @\"");
    UIComponentMemberConfiguration _labelConfig = this.labelConfig(it);
    Expression _value = _labelConfig.getValue();
    String _evaluateExpression = this._expressionExtensions.evaluateExpression(_value);
    _builder.append(_evaluateExpression, "");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    String _entryElementName_2 = this.entryElementName(it);
    _builder.append(_entryElementName_2, "");
    _builder.append(".mode = UIDatePickerModeDateAndTime;");
    _builder.newLineIfNotEmpty();
    String _entryElementName_3 = this.entryElementName(it);
    _builder.append(_entryElementName_3, "");
    _builder.append(".dateValue = [NSDate date]; ");
    _builder.newLineIfNotEmpty();
    String _entryElementName_4 = this.entryElementName(it);
    _builder.append(_entryElementName_4, "");
    _builder.append(".key = @\"");
    UIComponentMemberConfiguration _detailsConfig = this.detailsConfig(it);
    Expression _value_1 = _detailsConfig.getValue();
    String _evaluateExpression_1 = this._expressionExtensions.evaluateExpression(_value_1);
    _builder.append(_evaluateExpression_1, "");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    String _entryElementName_5 = this.entryElementName(it);
    _builder.append(_entryElementName_5, "");
    _builder.append(".bind = @\"dateValue:");
    UIComponentMemberConfiguration _detailsConfig_1 = this.detailsConfig(it);
    Expression _value_2 = _detailsConfig_1.getValue();
    String _evaluateExpression_2 = this._expressionExtensions.evaluateExpression(_value_2);
    _builder.append(_evaluateExpression_2, "");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("[sectionMain addElement:");
    String _entryElementName_6 = this.entryElementName(it);
    _builder.append(_entryElementName_6, "");
    _builder.append("];");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
