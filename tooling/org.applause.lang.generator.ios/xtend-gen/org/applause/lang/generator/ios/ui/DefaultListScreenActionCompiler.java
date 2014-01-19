package org.applause.lang.generator.ios.ui;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import org.applause.lang.applauseDsl.Entity;
import org.applause.lang.applauseDsl.Screen;
import org.applause.lang.applauseDsl.ScreenListItemCell;
import org.applause.lang.applauseDsl.UIAction;
import org.applause.lang.generator.ios.model.TypeExtensions;
import org.applause.lang.generator.ios.ui.DefaultListScreenClassExtensions;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class DefaultListScreenActionCompiler {
  @Inject
  @Extension
  private DefaultListScreenClassExtensions _defaultListScreenClassExtensions;
  
  @Inject
  @Extension
  private TypeExtensions _typeExtensions;
  
  public CharSequence compileActionButtons(final Screen it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// register action buttons");
    _builder.newLine();
    _builder.append("self.navigationItem.rightBarButtonItems = @[");
    _builder.newLine();
    {
      EList<UIAction> _actions = it.getActions();
      for(final UIAction action : _actions) {
        _builder.append("\t");
        Object _compileActionButton = this.compileActionButton(action);
        _builder.append(_compileActionButton, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("];");
    _builder.newLine();
    return _builder;
  }
  
  private Object compileActionButton(final UIAction it) {
    return null;
  }
  
  private CharSequence compileActionButton_AddItem(final Screen it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[[UIBarButtonItem alloc] initWithBarButtonSystemItem:UIBarButtonSystemItemAdd");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t\t\t\t  ");
    _builder.append("target:self");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t\t\t\t  ");
    _builder.append("action:@selector(onAddItem)]");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileActionMethods(final Screen it) {
    StringConcatenation _builder = new StringConcatenation();
    {
      ScreenListItemCell _defaultCell = this._defaultListScreenClassExtensions.defaultCell(it);
      EList<UIAction> _actions = _defaultCell.getActions();
      EList<UIAction> _actions_1 = it.getActions();
      Iterable<UIAction> _plus = Iterables.<UIAction>concat(_actions, _actions_1);
      for(final UIAction action : _plus) {
        Object _compileActionMethod = this.compileActionMethod(action);
        _builder.append(_compileActionMethod, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  private Object compileActionMethod(final UIAction it) {
    return null;
  }
  
  private CharSequence compileActionMethod_AddItem(final Screen it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("- (void)onAddItem");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[");
    Screen _targetNavigationScreen = this._defaultListScreenClassExtensions.targetNavigationScreen(it);
    String _controllerClassName = this._defaultListScreenClassExtensions.controllerClassName(_targetNavigationScreen);
    _builder.append(_controllerClassName, "	");
    _builder.append(" presentForAddingNewItemFromParent:self onDone:^(");
    Entity _resourceType = this._defaultListScreenClassExtensions.resourceType(it);
    String _typeName = this._typeExtensions.typeName(_resourceType);
    _builder.append(_typeName, "	");
    _builder.append(" *item)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("[self refresh];");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}];");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence compileActionMethod_EditItem(final Screen it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("- (void)onEditItem:(");
    Entity _resourceType = this._defaultListScreenClassExtensions.resourceType(it);
    String _typeName = this._typeExtensions.typeName(_resourceType);
    _builder.append(_typeName, "");
    _builder.append(" *)item");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[");
    Screen _targetNavigationScreen = this._defaultListScreenClassExtensions.targetNavigationScreen(it);
    String _controllerClassName = this._defaultListScreenClassExtensions.controllerClassName(_targetNavigationScreen);
    _builder.append(_controllerClassName, "	");
    _builder.append(" presentForEditingItem:item fromParent:self onDone:^(");
    Entity _resourceType_1 = this._defaultListScreenClassExtensions.resourceType(it);
    String _typeName_1 = this._typeExtensions.typeName(_resourceType_1);
    _builder.append(_typeName_1, "	");
    _builder.append(" *editedItem)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("[self refresh];");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}];");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
