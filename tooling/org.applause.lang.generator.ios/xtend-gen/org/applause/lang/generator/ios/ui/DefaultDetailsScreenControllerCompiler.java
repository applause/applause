package org.applause.lang.generator.ios.ui;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.List;
import org.applause.lang.applauseDsl.ControllerVerb;
import org.applause.lang.applauseDsl.ControllerVerbKind;
import org.applause.lang.applauseDsl.DataSource;
import org.applause.lang.applauseDsl.DataSourceCall;
import org.applause.lang.applauseDsl.Entity;
import org.applause.lang.applauseDsl.Parameter;
import org.applause.lang.applauseDsl.Screen;
import org.applause.lang.applauseDsl.Type;
import org.applause.lang.generator.ios.model.TypeExtensions;
import org.applause.lang.generator.ios.ui.DefaultDetailsScreenClassExtensions;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class DefaultDetailsScreenControllerCompiler {
  @Inject
  @Extension
  private DefaultDetailsScreenClassExtensions _defaultDetailsScreenClassExtensions;
  
  @Inject
  @Extension
  private TypeExtensions _typeExtensions;
  
  public CharSequence compileControllerMethodsHeaders(final Screen it) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<ControllerVerb> _verbs = it.getVerbs();
      for(final ControllerVerb verb : _verbs) {
        CharSequence _compileControllerMethodHeader = this.compileControllerMethodHeader(verb);
        _builder.append(_compileControllerMethodHeader, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compileControllerMethods(final Screen it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#pragma mark - Controller Methods");
    _builder.newLine();
    _builder.newLine();
    {
      EList<ControllerVerb> _verbs = it.getVerbs();
      for(final ControllerVerb verb : _verbs) {
        CharSequence _compileControllerMethod = this.compileControllerMethod(verb);
        _builder.append(_compileControllerMethod, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  private Screen screen(final ControllerVerb it) {
    Screen _containerOfType = EcoreUtil2.<Screen>getContainerOfType(it, Screen.class);
    return _containerOfType;
  }
  
  private String purposifiedVerb(final ControllerVerb it) {
    String _switchResult = null;
    ControllerVerbKind _kind = it.getKind();
    final ControllerVerbKind _switchValue = _kind;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_switchValue,ControllerVerbKind.ADD)) {
        _matched=true;
        _switchResult = "ForAdding";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,ControllerVerbKind.EDIT)) {
        _matched=true;
        _switchResult = "ForEditing";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,ControllerVerbKind.DISPLAY)) {
        _matched=true;
        _switchResult = "ForDisplaying";
      }
    }
    return _switchResult;
  }
  
  private String parameterClause(final ControllerVerb it) {
    EList<Parameter> _declaredParameters = it.getDeclaredParameters();
    final Function1<Parameter,String> _function = new Function1<Parameter,String>() {
      public String apply(final Parameter it) {
        Type _type = it.getType();
        String _typeName = DefaultDetailsScreenControllerCompiler.this._typeExtensions.typeName(_type);
        String _plus = (_typeName + " *)");
        String _name = it.getName();
        String _plus_1 = (_plus + _name);
        return _plus_1;
      }
    };
    List<String> _map = ListExtensions.<Parameter, String>map(_declaredParameters, _function);
    String _join = IterableExtensions.join(_map, " and:(");
    String _plus = ("WithParameter:(" + _join);
    return _plus;
  }
  
  public String controllerMethodName(final ControllerVerb it) {
    String _purposifiedVerb = this.purposifiedVerb(it);
    String _plus = ("+ (void)present" + _purposifiedVerb);
    String _xifexpression = null;
    EList<Parameter> _declaredParameters = it.getDeclaredParameters();
    int _size = _declaredParameters.size();
    boolean _equals = (_size == 0);
    if (_equals) {
      _xifexpression = "FromParent:(UIViewController *)parentViewController";
    } else {
      String _parameterClause = this.parameterClause(it);
      String _plus_1 = (_parameterClause + " fromParent:(UIViewController *)parentViewController");
      String _plus_2 = (_plus_1 + " onDone:(void (^)(");
      Screen _screen = this.screen(it);
      Entity _resourceType = this._defaultDetailsScreenClassExtensions.resourceType(_screen);
      String _typeName = this._typeExtensions.typeName(_resourceType);
      String _plus_3 = (_plus_2 + _typeName);
      String _plus_4 = (_plus_3 + " *item))doneBlock");
      _xifexpression = _plus_4;
    }
    String _plus_5 = (_plus + _xifexpression);
    return _plus_5;
  }
  
  private CharSequence compileControllerMethodHeader(final ControllerVerb it) {
    StringConcatenation _builder = new StringConcatenation();
    String _controllerMethodName = this.controllerMethodName(it);
    _builder.append(_controllerMethodName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private CharSequence compileControllerMethod(final ControllerVerb it) {
    StringConcatenation _builder = new StringConcatenation();
    String _controllerMethodName = this.controllerMethodName(it);
    _builder.append(_controllerMethodName, "");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _compileControllerMethodBody = this.compileControllerMethodBody(it);
    _builder.append(_compileControllerMethodBody, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence compileControllerMethodBody(final ControllerVerb it) {
    CharSequence _switchResult = null;
    ControllerVerbKind _kind = it.getKind();
    final ControllerVerbKind _switchValue = _kind;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_switchValue,ControllerVerbKind.ADD)) {
        _matched=true;
        CharSequence _compileControllerMethodBody_ADD = this.compileControllerMethodBody_ADD(it);
        _switchResult = _compileControllerMethodBody_ADD;
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,ControllerVerbKind.EDIT)) {
        _matched=true;
        CharSequence _compileControllerMethodBody_EDIT = this.compileControllerMethodBody_EDIT(it);
        _switchResult = _compileControllerMethodBody_EDIT;
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,ControllerVerbKind.DISPLAY)) {
        _matched=true;
        CharSequence _compileControllerMethodBody_DISPLAY = this.compileControllerMethodBody_DISPLAY(it);
        _switchResult = _compileControllerMethodBody_DISPLAY;
      }
    }
    return _switchResult;
  }
  
  private Iterable<Parameter> considerableParameters(final ControllerVerb it) {
    Iterable<Parameter> _xifexpression = null;
    ControllerVerbKind _kind = it.getKind();
    boolean _equals = Objects.equal(_kind, ControllerVerbKind.ADD);
    if (_equals) {
      EList<Parameter> _declaredParameters = it.getDeclaredParameters();
      final Function1<Parameter,Boolean> _function = new Function1<Parameter,Boolean>() {
        public Boolean apply(final Parameter param) {
          Type _type = param.getType();
          Screen _screen = DefaultDetailsScreenControllerCompiler.this.screen(it);
          DataSourceCall _datasource = _screen.getDatasource();
          DataSource _datasource_1 = _datasource.getDatasource();
          Entity _resourceType = _datasource_1.getResourceType();
          boolean _notEquals = (!Objects.equal(_type, _resourceType));
          return Boolean.valueOf(_notEquals);
        }
      };
      Iterable<Parameter> _filter = IterableExtensions.<Parameter>filter(_declaredParameters, _function);
      _xifexpression = _filter;
    } else {
      EList<Parameter> _declaredParameters_1 = it.getDeclaredParameters();
      _xifexpression = _declaredParameters_1;
    }
    return _xifexpression;
  }
  
  public CharSequence compile(final Parameter it) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Type _type = it.getType();
      boolean _isScalar = this._typeExtensions.isScalar(_type);
      if (_isScalar) {
        _builder.append("@property (nonatomic) ");
        String _typeName = this._typeExtensions.typeName(it);
        _builder.append(_typeName, "");
        _builder.append(" ");
        String _name = it.getName();
        _builder.append(_name, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("@property (nonatomic, strong) ");
        String _typeName_1 = this._typeExtensions.typeName(it);
        _builder.append(_typeName_1, "");
        _builder.append(" *");
        String _name_1 = it.getName();
        _builder.append(_name_1, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public Iterable<Parameter> considerableParameters(final Screen it) {
    EList<ControllerVerb> _verbs = it.getVerbs();
    final Function1<ControllerVerb,Iterable<Parameter>> _function = new Function1<ControllerVerb,Iterable<Parameter>>() {
      public Iterable<Parameter> apply(final ControllerVerb it) {
        Iterable<Parameter> _considerableParameters = DefaultDetailsScreenControllerCompiler.this.considerableParameters(it);
        return _considerableParameters;
      }
    };
    List<Iterable<Parameter>> _map = ListExtensions.<ControllerVerb, Iterable<Parameter>>map(_verbs, _function);
    Iterable<Parameter> _flatten = Iterables.<Parameter>concat(_map);
    return _flatten;
  }
  
  private CharSequence compileControllerMethodBody_ADD(final ControllerVerb it) {
    StringConcatenation _builder = new StringConcatenation();
    Screen _screen = this.screen(it);
    String _controllerClassName = this._defaultDetailsScreenClassExtensions.controllerClassName(_screen);
    _builder.append(_controllerClassName, "");
    _builder.append(" *detailsViewController = [[");
    Screen _screen_1 = this.screen(it);
    String _controllerClassName_1 = this._defaultDetailsScreenClassExtensions.controllerClassName(_screen_1);
    _builder.append(_controllerClassName_1, "");
    _builder.append(" alloc] initWithMode:DetailsViewModeAdd];");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      Iterable<Parameter> _considerableParameters = this.considerableParameters(it);
      for(final Parameter parameter : _considerableParameters) {
        _builder.append("detailsViewController.");
        String _name = parameter.getName();
        _builder.append(_name, "");
        _builder.append(" = ");
        String _name_1 = parameter.getName();
        _builder.append(_name_1, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("detailsViewController.item = [[");
    Screen _screen_2 = this.screen(it);
    Entity _resourceType = this._defaultDetailsScreenClassExtensions.resourceType(_screen_2);
    String _typeName = this._typeExtensions.typeName(_resourceType);
    _builder.append(_typeName, "");
    _builder.append(" alloc] init];");
    _builder.newLineIfNotEmpty();
    _builder.append("detailsViewController.doneBlock = ^(");
    Screen _screen_3 = this.screen(it);
    Entity _resourceType_1 = this._defaultDetailsScreenClassExtensions.resourceType(_screen_3);
    String _typeName_1 = this._typeExtensions.typeName(_resourceType_1);
    _builder.append(_typeName_1, "");
    _builder.append(" *editedItem)");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[parentViewController dismissViewControllerAnimated:YES completion:nil];");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if (doneBlock) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("doneBlock(editedItem);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("};");
    _builder.newLine();
    _builder.append("UINavigationController *navigationController = [[UINavigationController alloc] initWithRootViewController:detailsViewController];");
    _builder.newLine();
    _builder.append("[parentViewController presentViewController:navigationController animated:YES completion:nil];");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence compileControllerMethodBody_EDIT(final ControllerVerb it) {
    StringConcatenation _builder = new StringConcatenation();
    Screen _screen = this.screen(it);
    String _controllerClassName = this._defaultDetailsScreenClassExtensions.controllerClassName(_screen);
    _builder.append(_controllerClassName, "");
    _builder.append(" *detailsViewController = [[");
    Screen _screen_1 = this.screen(it);
    String _controllerClassName_1 = this._defaultDetailsScreenClassExtensions.controllerClassName(_screen_1);
    _builder.append(_controllerClassName_1, "");
    _builder.append(" alloc] initWithMode:DetailsViewModeEdit];");
    _builder.newLineIfNotEmpty();
    _builder.append("detailsViewController.item = item;");
    _builder.newLine();
    _builder.append("detailsViewController.doneBlock = ^(");
    Screen _screen_2 = this.screen(it);
    Entity _resourceType = this._defaultDetailsScreenClassExtensions.resourceType(_screen_2);
    String _typeName = this._typeExtensions.typeName(_resourceType);
    _builder.append(_typeName, "");
    _builder.append(" *editedItem)");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[parentViewController.navigationController popViewControllerAnimated:YES];");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if (doneBlock) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("doneBlock(editedItem);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("};");
    _builder.newLine();
    _builder.append("[parentViewController.navigationController pushViewController:detailsViewController animated:YES];");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence compileControllerMethodBody_DISPLAY(final ControllerVerb it) {
    StringConcatenation _builder = new StringConcatenation();
    Screen _screen = this.screen(it);
    String _controllerClassName = this._defaultDetailsScreenClassExtensions.controllerClassName(_screen);
    _builder.append(_controllerClassName, "");
    _builder.append(" *detailsViewController = [[");
    Screen _screen_1 = this.screen(it);
    String _controllerClassName_1 = this._defaultDetailsScreenClassExtensions.controllerClassName(_screen_1);
    _builder.append(_controllerClassName_1, "");
    _builder.append(" alloc] initWithMode:DetailsViewModeDisplay];");
    _builder.newLineIfNotEmpty();
    _builder.append("detailsViewController.item = item;");
    _builder.newLine();
    _builder.append("detailsViewController.doneBlock = ^(");
    Screen _screen_2 = this.screen(it);
    Entity _resourceType = this._defaultDetailsScreenClassExtensions.resourceType(_screen_2);
    String _typeName = this._typeExtensions.typeName(_resourceType);
    _builder.append(_typeName, "");
    _builder.append(" *editedItem)");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[parentViewController.navigationController popViewControllerAnimated:YES];");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if (doneBlock) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("doneBlock(editedItem);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("};");
    _builder.newLine();
    _builder.append("[parentViewController.navigationController pushViewController:detailsViewController animated:YES];");
    _builder.newLine();
    return _builder;
  }
}
