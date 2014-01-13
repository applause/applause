package org.applause.lang.generator.ios.ui;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.List;
import org.applause.lang.applauseDsl.DataSource;
import org.applause.lang.applauseDsl.DataSourceAccessMethod;
import org.applause.lang.applauseDsl.DataSourceCall;
import org.applause.lang.applauseDsl.Entity;
import org.applause.lang.applauseDsl.RESTSpecification;
import org.applause.lang.applauseDsl.RESTVerb;
import org.applause.lang.applauseDsl.Screen;
import org.applause.lang.applauseDsl.ScreenListItemCell;
import org.applause.lang.applauseDsl.UIAction;
import org.applause.lang.applauseDsl.UIActionDeleteAction;
import org.applause.lang.applauseDsl.UIActionSpecification;
import org.applause.lang.generator.ios.model.TypeExtensions;
import org.applause.lang.generator.ios.ui.DefaultListScreenClassExtensions;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class DefaultListScreenEditActionCompiler {
  @Inject
  @Extension
  private DefaultListScreenClassExtensions _defaultListScreenClassExtensions;
  
  @Inject
  @Extension
  private TypeExtensions _typeExtensions;
  
  public boolean supportsDeleteAction(final Screen it) {
    ScreenListItemCell _defaultCell = this._defaultListScreenClassExtensions.defaultCell(it);
    EList<UIAction> _actions = _defaultCell.getActions();
    final Function1<UIAction,UIActionSpecification> _function = new Function1<UIAction,UIActionSpecification>() {
      public UIActionSpecification apply(final UIAction it) {
        UIActionSpecification _action = it.getAction();
        return _action;
      }
    };
    List<UIActionSpecification> _map = ListExtensions.<UIAction, UIActionSpecification>map(_actions, _function);
    Iterable<UIActionDeleteAction> _filter = Iterables.<UIActionDeleteAction>filter(_map, UIActionDeleteAction.class);
    int _size = IterableExtensions.size(_filter);
    boolean _greaterThan = (_size > 0);
    return _greaterThan;
  }
  
  public UIActionDeleteAction deleteAction(final Screen it) {
    ScreenListItemCell _defaultCell = this._defaultListScreenClassExtensions.defaultCell(it);
    EList<UIAction> _actions = _defaultCell.getActions();
    final Function1<UIAction,UIActionSpecification> _function = new Function1<UIAction,UIActionSpecification>() {
      public UIActionSpecification apply(final UIAction it) {
        UIActionSpecification _action = it.getAction();
        return _action;
      }
    };
    List<UIActionSpecification> _map = ListExtensions.<UIAction, UIActionSpecification>map(_actions, _function);
    Iterable<UIActionDeleteAction> _filter = Iterables.<UIActionDeleteAction>filter(_map, UIActionDeleteAction.class);
    UIActionDeleteAction _head = IterableExtensions.<UIActionDeleteAction>head(_filter);
    return _head;
  }
  
  public DataSourceAccessMethod deleteMethod(final Screen it) {
    DataSourceCall _datasource = it.getDatasource();
    DataSource _datasource_1 = _datasource.getDatasource();
    EList<DataSourceAccessMethod> _methods = _datasource_1.getMethods();
    final Function1<DataSourceAccessMethod,Boolean> _function = new Function1<DataSourceAccessMethod,Boolean>() {
      public Boolean apply(final DataSourceAccessMethod it) {
        RESTSpecification _restSpecification = it.getRestSpecification();
        RESTVerb _verb = _restSpecification.getVerb();
        boolean _equals = Objects.equal(_verb, RESTVerb.DELETE);
        return Boolean.valueOf(_equals);
      }
    };
    Iterable<DataSourceAccessMethod> _filter = IterableExtensions.<DataSourceAccessMethod>filter(_methods, _function);
    DataSourceAccessMethod _head = IterableExtensions.<DataSourceAccessMethod>head(_filter);
    return _head;
  }
  
  public CharSequence compileCommitEditing(final Screen it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("- (void)tableView:(UITableView *)tableView commitEditingStyle:(UITableViewCellEditingStyle)editingStyle forRowAtIndexPath:(NSIndexPath *)indexPath");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    Entity _resourceType = this._defaultListScreenClassExtensions.resourceType(it);
    String _typeName = this._typeExtensions.typeName(_resourceType);
    _builder.append(_typeName, "	");
    _builder.append(" *item= self.items[indexPath.row];");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("[item ");
    DataSourceAccessMethod _deleteMethod = this.deleteMethod(it);
    String _name = _deleteMethod.getName();
    _builder.append(_name, "	");
    _builder.append(":^(");
    Entity _resourceType_1 = this._defaultListScreenClassExtensions.resourceType(it);
    String _typeName_1 = this._typeExtensions.typeName(_resourceType_1);
    _builder.append(_typeName_1, "	");
    _builder.append(" *item, NSError *error)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (error) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("NSLog(@\"Error %@\", error);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("else {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if (indexPath.row < self.items.count) {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("[self.items removeObjectAtIndex:indexPath.row];");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("[self.tableView deleteRowsAtIndexPaths:@[indexPath] withRowAnimation:UITableViewRowAnimationFade];");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}];");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
