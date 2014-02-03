package org.applause.lang.generator.ios.ui;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.Arrays;
import org.applause.lang.applauseDsl.ControllerVerb;
import org.applause.lang.applauseDsl.ControllerVerbKind;
import org.applause.lang.applauseDsl.Entity;
import org.applause.lang.applauseDsl.Screen;
import org.applause.lang.applauseDsl.ScreenListItemCell;
import org.applause.lang.applauseDsl.UIAction;
import org.applause.lang.applauseDsl.UIActionDeleteAction;
import org.applause.lang.applauseDsl.UIActionNavigateAction;
import org.applause.lang.applauseDsl.UIActionSpecification;
import org.applause.lang.generator.ios.model.TypeExtensions;
import org.applause.lang.generator.ios.ui.DefaultDetailsScreenControllerCompiler;
import org.applause.lang.generator.ios.ui.DefaultListScreenClassExtensions;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class DefaultListScreenActionCompiler {
  @Inject
  @Extension
  private DefaultListScreenClassExtensions _defaultListScreenClassExtensions;
  
  @Inject
  @Extension
  private TypeExtensions _typeExtensions;
  
  @Inject
  @Extension
  private DefaultDetailsScreenControllerCompiler _defaultDetailsScreenControllerCompiler;
  
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
        _builder.append(_compileActionButton, "\t");
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
        _builder.append("// ");
        String _title = action.getTitle();
        _builder.append(_title, "");
        _builder.newLineIfNotEmpty();
        UIActionSpecification _action = action.getAction();
        CharSequence _compileActionMethod = this.compileActionMethod(_action);
        _builder.append(_compileActionMethod, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  private CharSequence _compileActionMethod(final UIActionDeleteAction it) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  private String methodNameForActionVerb(final ControllerVerb it) {
    String _switchResult = null;
    ControllerVerbKind _kind = it.getKind();
    final ControllerVerbKind _switchValue = _kind;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_switchValue,ControllerVerbKind.ADD)) {
        _matched=true;
        _switchResult = "onAddItem";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,ControllerVerbKind.EDIT)) {
        _matched=true;
        _switchResult = "onEditItem";
      }
    }
    if (!_matched) {
      _switchResult = "uncaught";
    }
    return _switchResult;
  }
  
  private Screen screen(final ControllerVerb it) {
    Screen _containerOfType = EcoreUtil2.<Screen>getContainerOfType(it, Screen.class);
    return _containerOfType;
  }
  
  private String parameterCallForActionVerb(final ControllerVerb it) {
    String _switchResult = null;
    ControllerVerbKind _kind = it.getKind();
    final ControllerVerbKind _switchValue = _kind;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_switchValue,ControllerVerbKind.ADD)) {
        _matched=true;
        _switchResult = "";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,ControllerVerbKind.EDIT)) {
        _matched=true;
        Screen _screen = this.screen(it);
        Entity _resourceType = this._defaultListScreenClassExtensions.resourceType(_screen);
        String _typeName = this._typeExtensions.typeName(_resourceType);
        String _plus = (":(" + _typeName);
        String _plus_1 = (_plus + "*)item");
        _switchResult = _plus_1;
      }
    }
    if (!_matched) {
      _switchResult = "uncaught";
    }
    return _switchResult;
  }
  
  private CharSequence _compileActionMethod(final UIActionNavigateAction it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("- (void)");
    ControllerVerb _actionVerb = it.getActionVerb();
    String _methodNameForActionVerb = this.methodNameForActionVerb(_actionVerb);
    _builder.append(_methodNameForActionVerb, "");
    ControllerVerb _actionVerb_1 = it.getActionVerb();
    String _parameterCallForActionVerb = this.parameterCallForActionVerb(_actionVerb_1);
    _builder.append(_parameterCallForActionVerb, "");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[");
    Screen _targetScreen = it.getTargetScreen();
    String _controllerClassName = this._defaultListScreenClassExtensions.controllerClassName(_targetScreen);
    _builder.append(_controllerClassName, "\t");
    _builder.append(" ");
    ControllerVerb _actionVerb_2 = it.getActionVerb();
    String _controllerMethodCall = this._defaultDetailsScreenControllerCompiler.controllerMethodCall(_actionVerb_2);
    _builder.append(_controllerMethodCall, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("[self refresh];");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}]; ");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence compileActionMethod(final UIActionSpecification it) {
    if (it instanceof UIActionDeleteAction) {
      return _compileActionMethod((UIActionDeleteAction)it);
    } else if (it instanceof UIActionNavigateAction) {
      return _compileActionMethod((UIActionNavigateAction)it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
}
