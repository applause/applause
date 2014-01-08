package org.applause.lang.generator.ios.ui;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.List;
import org.applause.lang.applauseDsl.DataSource;
import org.applause.lang.applauseDsl.DataSourceAccessMethod;
import org.applause.lang.applauseDsl.DataSourceCall;
import org.applause.lang.applauseDsl.Entity;
import org.applause.lang.applauseDsl.Expression;
import org.applause.lang.applauseDsl.RESTMethodCall;
import org.applause.lang.applauseDsl.Screen;
import org.applause.lang.applauseDsl.ScreenListItemCell;
import org.applause.lang.applauseDsl.ScreenSection;
import org.applause.lang.applauseDsl.ScreenSectionItems;
import org.applause.lang.applauseDsl.UIComponentMemberCall;
import org.applause.lang.applauseDsl.UIComponentMemberConfiguration;
import org.applause.lang.applauseDsl.UIComponentMemberDeclaration;
import org.applause.lang.generator.ios.ExpressionExtensions;
import org.applause.lang.generator.ios.dataaccess.DataAccessClassExtensions;
import org.applause.lang.generator.ios.model.TypeExtensions;
import org.applause.lang.generator.ios.ui.ScreenClassExtensions;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class DefaultListScreenModuleFileCompiler {
  @Inject
  @Extension
  private ScreenClassExtensions _screenClassExtensions;
  
  @Inject
  @Extension
  private TypeExtensions _typeExtensions;
  
  @Inject
  @Extension
  private ExpressionExtensions _expressionExtensions;
  
  @Inject
  @Extension
  private DataAccessClassExtensions _dataAccessClassExtensions;
  
  public Entity resourceType(final Screen it) {
    DataSourceCall _datasource = it.getDatasource();
    DataSource _datasource_1 = _datasource.getDatasource();
    Entity _resourceType = _datasource_1.getResourceType();
    return _resourceType;
  }
  
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
    _builder.append("#import \"");
    String _screenHeaderFileName = this._screenClassExtensions.screenHeaderFileName(it);
    _builder.append(_screenHeaderFileName, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("#import \"");
    Entity _resourceType = this.resourceType(it);
    String _entityDataAccessCategoryHeaderFileName = this._dataAccessClassExtensions.entityDataAccessCategoryHeaderFileName(_resourceType);
    _builder.append(_entityDataAccessCategoryHeaderFileName, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("@interface ");
    String _controllerClassName = this._screenClassExtensions.controllerClassName(it);
    _builder.append(_controllerClassName, "");
    _builder.append(" ()");
    _builder.newLineIfNotEmpty();
    _builder.append("@property(nonatomic, strong) NSArray *items;\t\t");
    _builder.newLine();
    _builder.append("@end");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@implementation ");
    String _controllerClassName_1 = this._screenClassExtensions.controllerClassName(it);
    _builder.append(_controllerClassName_1, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("static NSString *kCellIdentifier = @\"");
    DataSourceCall _datasource = it.getDatasource();
    DataSource _datasource_1 = _datasource.getDatasource();
    Entity _resourceType_1 = _datasource_1.getResourceType();
    String _typeName = this._typeExtensions.typeName(_resourceType_1);
    _builder.append(_typeName, "");
    _builder.append("Cell\";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("- (id)initWithStyle:(UITableViewStyle)style");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("self = [super initWithStyle:style];");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (self) {");
    _builder.newLine();
    {
      String _title = it.getTitle();
      boolean _notEquals = (!Objects.equal(_title, null));
      if (_notEquals) {
        _builder.append("\t\t");
        _builder.append("self.title = @\"");
        String _title_1 = it.getTitle();
        _builder.append(_title_1, "		");
        _builder.append("\";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("// register table view cell");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("[self.tableView registerClass:[UITableViewCell class] forCellReuseIdentifier:kCellIdentifier];");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("[self.tableView setDelegate:self];;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// refresh control");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("self.refreshControl = [[UIRefreshControl alloc] init];");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("[self.refreshControl addTarget:self action:@selector(refresh) forControlEvents:UIControlEventValueChanged];");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return self;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("- (void)viewDidLoad");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("[super viewDidLoad];");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[self reload];");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("- (void)didReceiveMemoryWarning");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("[super didReceiveMemoryWarning];");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#pragma mark - Table view data source");
    _builder.newLine();
    _builder.newLine();
    _builder.append("- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return [self.items count];");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("UITableViewCell *cell = [tableView dequeueReusableCellWithIdentifier:kCellIdentifier forIndexPath:indexPath];");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("\t");
    Entity _resourceType_2 = this.resourceType(it);
    String _typeName_1 = this._typeExtensions.typeName(_resourceType_2);
    _builder.append(_typeName_1, "	");
    _builder.append(" *item = self.items[(NSUInteger) indexPath.row];");
    _builder.newLineIfNotEmpty();
    {
      Iterable<UIComponentMemberConfiguration> _configurations = this.configurations(it);
      for(final UIComponentMemberConfiguration it_1 : _configurations) {
        _builder.append("\t");
        CharSequence _compileConfiguration = this.compileConfiguration(it_1);
        _builder.append(_compileConfiguration, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return cell;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#pragma mark - Data access");
    _builder.newLine();
    _builder.newLine();
    _builder.append("- (void)refresh");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[self reload];");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("- (void)reload");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[");
    Entity _resourceType_3 = this.resourceType(it);
    String _typeName_2 = this._typeExtensions.typeName(_resourceType_3);
    _builder.append(_typeName_2, "	");
    _builder.append(" ");
    DataSourceAccessMethod _restMethod = this.restMethod(it);
    String _name = _restMethod.getName();
    _builder.append(_name, "	");
    _builder.append(":^(NSArray *items, NSError *error)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("[self.refreshControl endRefreshing];");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (error) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("[[[UIAlertView alloc] initWithTitle:NSLocalizedString(@\"Error\", nil)");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t\t\t");
    _builder.append("message:[error localizedDescription]");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t\t   ");
    _builder.append("delegate:nil");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t  ");
    _builder.append("cancelButtonTitle:nil");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t  ");
    _builder.append("otherButtonTitles:NSLocalizedString(@\"OK\", nil), nil] show];");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("else {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("self.items = items;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("[self.tableView reloadData];");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}];");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@end");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileConfiguration(final UIComponentMemberConfiguration it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("cell.");
    UIComponentMemberCall _type = it.getType();
    UIComponentMemberDeclaration _component = _type.getComponent();
    String _name = _component.getName();
    _builder.append(_name, "");
    _builder.append(".");
    UIComponentMemberCall _type_1 = it.getType();
    UIComponentMemberDeclaration _member = _type_1.getMember();
    String _name_1 = _member.getName();
    _builder.append(_name_1, "");
    _builder.append(" = item.");
    Expression _value = it.getValue();
    String _evaluateExpression = this._expressionExtensions.evaluateExpression(_value);
    _builder.append(_evaluateExpression, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
