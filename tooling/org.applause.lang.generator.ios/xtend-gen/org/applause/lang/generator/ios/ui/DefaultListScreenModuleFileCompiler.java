package org.applause.lang.generator.ios.ui;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.applause.lang.applauseDsl.DataSource;
import org.applause.lang.applauseDsl.DataSourceAccessMethod;
import org.applause.lang.applauseDsl.DataSourceCall;
import org.applause.lang.applauseDsl.Entity;
import org.applause.lang.applauseDsl.Expression;
import org.applause.lang.applauseDsl.Screen;
import org.applause.lang.applauseDsl.UIComponentMemberCall;
import org.applause.lang.applauseDsl.UIComponentMemberConfiguration;
import org.applause.lang.applauseDsl.UIComponentMemberDeclaration;
import org.applause.lang.generator.ios.ExpressionExtensions;
import org.applause.lang.generator.ios.dataaccess.DataAccessClassExtensions;
import org.applause.lang.generator.ios.model.TypeExtensions;
import org.applause.lang.generator.ios.ui.DefaultListScreenActionCompiler;
import org.applause.lang.generator.ios.ui.DefaultListScreenClassExtensions;
import org.applause.lang.generator.ios.ui.DefaultListScreenEditActionCompiler;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class DefaultListScreenModuleFileCompiler {
  @Inject
  @Extension
  private DefaultListScreenClassExtensions _defaultListScreenClassExtensions;
  
  @Inject
  @Extension
  private TypeExtensions _typeExtensions;
  
  @Inject
  @Extension
  private ExpressionExtensions _expressionExtensions;
  
  @Inject
  @Extension
  private DataAccessClassExtensions _dataAccessClassExtensions;
  
  @Inject
  @Extension
  private DefaultListScreenActionCompiler _defaultListScreenActionCompiler;
  
  @Inject
  @Extension
  private DefaultListScreenEditActionCompiler _defaultListScreenEditActionCompiler;
  
  public CharSequence compileModule(final Screen it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#import \"");
    String _screenHeaderFileName = this._defaultListScreenClassExtensions.screenHeaderFileName(it);
    _builder.append(_screenHeaderFileName, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("#import \"");
    Entity _resourceType = this._defaultListScreenClassExtensions.resourceType(it);
    String _entityDataAccessCategoryHeaderFileName = this._dataAccessClassExtensions.entityDataAccessCategoryHeaderFileName(_resourceType);
    _builder.append(_entityDataAccessCategoryHeaderFileName, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("#import \"");
    Screen _targetNavigationScreen = this._defaultListScreenClassExtensions.targetNavigationScreen(it);
    String _screenHeaderFileName_1 = this._defaultListScreenClassExtensions.screenHeaderFileName(_targetNavigationScreen);
    _builder.append(_screenHeaderFileName_1, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("@interface ");
    String _controllerClassName = this._defaultListScreenClassExtensions.controllerClassName(it);
    _builder.append(_controllerClassName, "");
    _builder.append(" ()");
    _builder.newLineIfNotEmpty();
    _builder.append("@property(nonatomic, strong) NSMutableArray *items;\t\t");
    _builder.newLine();
    _builder.append("@end");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@implementation ");
    String _controllerClassName_1 = this._defaultListScreenClassExtensions.controllerClassName(it);
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
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    CharSequence _compileActionButtons = this._defaultListScreenActionCompiler.compileActionButtons(it);
    _builder.append(_compileActionButtons, "		");
    _builder.newLineIfNotEmpty();
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
    Entity _resourceType_2 = this._defaultListScreenClassExtensions.resourceType(it);
    String _typeName_1 = this._typeExtensions.typeName(_resourceType_2);
    _builder.append(_typeName_1, "	");
    _builder.append(" *item = self.items[(NSUInteger) indexPath.row];");
    _builder.newLineIfNotEmpty();
    {
      Iterable<UIComponentMemberConfiguration> _configurations = this._defaultListScreenClassExtensions.configurations(it);
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
    _builder.append("#pragma mark - Table view delegate");
    _builder.newLine();
    _builder.newLine();
    _builder.append("- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    Entity _resourceType_3 = this._defaultListScreenClassExtensions.resourceType(it);
    String _typeName_2 = this._typeExtensions.typeName(_resourceType_3);
    _builder.append(_typeName_2, "	");
    _builder.append(" *item = self.items[(NSUInteger) indexPath.row];");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("[self onEditItem:item];");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    {
      boolean _supportsDeleteAction = this._defaultListScreenEditActionCompiler.supportsDeleteAction(it);
      if (_supportsDeleteAction) {
        CharSequence _compileCommitEditing = this._defaultListScreenEditActionCompiler.compileCommitEditing(it);
        _builder.append(_compileCommitEditing, "");
        _builder.newLineIfNotEmpty();
      }
    }
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
    Entity _resourceType_4 = this._defaultListScreenClassExtensions.resourceType(it);
    String _typeName_3 = this._typeExtensions.typeName(_resourceType_4);
    _builder.append(_typeName_3, "	");
    _builder.append(" ");
    DataSourceAccessMethod _restMethod = this._defaultListScreenClassExtensions.restMethod(it);
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
    _builder.append("self.items = [NSMutableArray arrayWithArray:items];");
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
    _builder.append("#pragma mark - Actions");
    _builder.newLine();
    _builder.newLine();
    CharSequence _compileActionMethods = this._defaultListScreenActionCompiler.compileActionMethods(it);
    _builder.append(_compileActionMethods, "");
    _builder.newLineIfNotEmpty();
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
