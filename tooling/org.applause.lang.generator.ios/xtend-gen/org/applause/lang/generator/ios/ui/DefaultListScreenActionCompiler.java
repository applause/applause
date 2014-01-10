package org.applause.lang.generator.ios.ui;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import org.applause.lang.applauseDsl.ActionVerb;
import org.applause.lang.applauseDsl.Entity;
import org.applause.lang.applauseDsl.Screen;
import org.applause.lang.applauseDsl.ScreenListItemCell;
import org.applause.lang.applauseDsl.UIAction;
import org.applause.lang.applauseDsl.UIActionNavigateAction;
import org.applause.lang.applauseDsl.UIActionSpecification;
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
        CharSequence _compileActionButton = this.compileActionButton(action);
        _builder.append(_compileActionButton, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("];");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence compileActionButton(final UIAction it) {
    CharSequence _xifexpression = null;
    UIActionSpecification _action = it.getAction();
    if ((_action instanceof UIActionNavigateAction)) {
      CharSequence _switchResult = null;
      UIActionSpecification _action_1 = it.getAction();
      ActionVerb _actionVerb = ((UIActionNavigateAction) _action_1).getActionVerb();
      final ActionVerb _switchValue = _actionVerb;
      boolean _matched = false;
      if (!_matched) {
        if (Objects.equal(_switchValue,ActionVerb.ADD)) {
          _matched=true;
          Screen _screen = this._defaultListScreenClassExtensions.screen(it);
          CharSequence _compileActionButton_AddItem = this.compileActionButton_AddItem(_screen);
          _switchResult = _compileActionButton_AddItem;
        }
      }
      _xifexpression = _switchResult;
    }
    return _xifexpression;
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
        CharSequence _compileActionMethod = this.compileActionMethod(action);
        _builder.append(_compileActionMethod, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  private CharSequence compileActionMethod(final UIAction it) {
    CharSequence _xifexpression = null;
    UIActionSpecification _action = it.getAction();
    if ((_action instanceof UIActionNavigateAction)) {
      CharSequence _switchResult = null;
      UIActionSpecification _action_1 = it.getAction();
      ActionVerb _actionVerb = ((UIActionNavigateAction) _action_1).getActionVerb();
      final ActionVerb _switchValue = _actionVerb;
      boolean _matched = false;
      if (!_matched) {
        if (Objects.equal(_switchValue,ActionVerb.ADD)) {
          _matched=true;
          Screen _screen = this._defaultListScreenClassExtensions.screen(it);
          CharSequence _compileActionMethod_AddItem = this.compileActionMethod_AddItem(_screen);
          _switchResult = _compileActionMethod_AddItem;
        }
      }
      if (!_matched) {
        if (Objects.equal(_switchValue,ActionVerb.EDIT)) {
          _matched=true;
          Screen _screen_1 = this._defaultListScreenClassExtensions.screen(it);
          CharSequence _compileActionMethod_EditItem = this.compileActionMethod_EditItem(_screen_1);
          _switchResult = _compileActionMethod_EditItem;
        }
      }
      _xifexpression = _switchResult;
    }
    return _xifexpression;
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
