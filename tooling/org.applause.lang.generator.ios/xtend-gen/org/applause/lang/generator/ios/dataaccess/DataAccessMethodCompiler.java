package org.applause.lang.generator.ios.dataaccess;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.applause.lang.applauseDsl.DataSource;
import org.applause.lang.applauseDsl.DataSourceAccessMethod;
import org.applause.lang.applauseDsl.Entity;
import org.applause.lang.applauseDsl.Parameter;
import org.applause.lang.applauseDsl.RESTSpecification;
import org.applause.lang.applauseDsl.RESTVerb;
import org.applause.lang.applauseDsl.Type;
import org.applause.lang.generator.ios.dataaccess.EntityDataAccessExtensions;
import org.applause.lang.generator.ios.model.TypeExtensions;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class DataAccessMethodCompiler {
  @Inject
  @Extension
  private TypeExtensions _typeExtensions;
  
  @Inject
  @Extension
  private EntityDataAccessExtensions _entityDataAccessExtensions;
  
  private String parameterClause(final DataSourceAccessMethod it) {
    Iterable<Parameter> _considerableParameters = this.considerableParameters(it);
    final Function1<Parameter,String> _function = new Function1<Parameter,String>() {
      public String apply(final Parameter it) {
        Type _type = it.getType();
        String _typeName = DataAccessMethodCompiler.this._typeExtensions.typeName(_type);
        String _plus = (_typeName + " *)");
        String _name = it.getName();
        String _plus_1 = (_plus + _name);
        return _plus_1;
      }
    };
    Iterable<String> _map = IterableExtensions.<Parameter, String>map(_considerableParameters, _function);
    String _join = IterableExtensions.join(_map, " and:(");
    String _plus = ("WithParameter:(" + _join);
    return _plus;
  }
  
  public String methodType(final DataSourceAccessMethod it) {
    String _switchResult = null;
    RESTSpecification _restSpecification = it.getRestSpecification();
    RESTVerb _verb = _restSpecification.getVerb();
    final RESTVerb _switchValue = _verb;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_switchValue,RESTVerb.GET)) {
        _matched=true;
        _switchResult = "+";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,RESTVerb.POST)) {
        _matched=true;
        _switchResult = "-";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,RESTVerb.PUT)) {
        _matched=true;
        _switchResult = "-";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,RESTVerb.DELETE)) {
        _matched=true;
        _switchResult = "-";
      }
    }
    return _switchResult;
  }
  
  private DataSource dataSource(final DataSourceAccessMethod it) {
    DataSource _containerOfType = EcoreUtil2.<DataSource>getContainerOfType(it, DataSource.class);
    return _containerOfType;
  }
  
  public Parameter parametersInEntity(final DataSourceAccessMethod it) {
    Parameter _xifexpression = null;
    DataSource _dataSource = this.dataSource(it);
    Entity _resourceType = _dataSource.getResourceType();
    EList<Parameter> _declaredParameters = it.getDeclaredParameters();
    Parameter _head = IterableExtensions.<Parameter>head(_declaredParameters);
    Type _type = _head.getType();
    boolean _equals = Objects.equal(_resourceType, _type);
    if (_equals) {
      EList<Parameter> _declaredParameters_1 = it.getDeclaredParameters();
      Parameter _head_1 = IterableExtensions.<Parameter>head(_declaredParameters_1);
      _xifexpression = _head_1;
    }
    return _xifexpression;
  }
  
  public Iterable<Parameter> parametersInSignature(final DataSourceAccessMethod it) {
    Iterable<Parameter> _xifexpression = null;
    RESTSpecification _restSpecification = it.getRestSpecification();
    RESTVerb _verb = _restSpecification.getVerb();
    boolean _equals = Objects.equal(_verb, RESTVerb.GET);
    if (_equals) {
      EList<Parameter> _declaredParameters = it.getDeclaredParameters();
      _xifexpression = _declaredParameters;
    } else {
      Iterable<Parameter> _xifexpression_1 = null;
      DataSource _dataSource = this.dataSource(it);
      Entity _resourceType = _dataSource.getResourceType();
      EList<Parameter> _declaredParameters_1 = it.getDeclaredParameters();
      Parameter _head = IterableExtensions.<Parameter>head(_declaredParameters_1);
      Type _type = _head.getType();
      boolean _equals_1 = Objects.equal(_resourceType, _type);
      if (_equals_1) {
        EList<Parameter> _declaredParameters_2 = it.getDeclaredParameters();
        Iterable<Parameter> _tail = IterableExtensions.<Parameter>tail(_declaredParameters_2);
        _xifexpression_1 = _tail;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  private Iterable<Parameter> considerableParameters(final DataSourceAccessMethod it) {
    Iterable<Parameter> _xifexpression = null;
    RESTSpecification _restSpecification = it.getRestSpecification();
    RESTVerb _verb = _restSpecification.getVerb();
    boolean _equals = Objects.equal(_verb, RESTVerb.GET);
    if (_equals) {
      EList<Parameter> _declaredParameters = it.getDeclaredParameters();
      _xifexpression = _declaredParameters;
    } else {
      Iterable<Parameter> _xifexpression_1 = null;
      DataSource _dataSource = this.dataSource(it);
      Entity _resourceType = _dataSource.getResourceType();
      EList<Parameter> _declaredParameters_1 = it.getDeclaredParameters();
      Parameter _head = IterableExtensions.<Parameter>head(_declaredParameters_1);
      Type _type = _head.getType();
      boolean _equals_1 = Objects.equal(_resourceType, _type);
      if (_equals_1) {
        EList<Parameter> _declaredParameters_2 = it.getDeclaredParameters();
        Iterable<Parameter> _tail = IterableExtensions.<Parameter>tail(_declaredParameters_2);
        _xifexpression_1 = _tail;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  private String returnType(final DataSourceAccessMethod it) {
    String _xifexpression = null;
    boolean _isReturnsMany = it.isReturnsMany();
    if (_isReturnsMany) {
      _xifexpression = "NSArray *items";
    } else {
      Entity _resourceType = this._entityDataAccessExtensions.resourceType(it);
      String _typeName = this._typeExtensions.typeName(_resourceType);
      String _plus = (_typeName + " *item");
      _xifexpression = _plus;
    }
    return _xifexpression;
  }
  
  public String dataAccessMethodName(final DataSourceAccessMethod it) {
    String _xblockexpression = null;
    {
      String _xifexpression = null;
      Iterable<Parameter> _considerableParameters = this.considerableParameters(it);
      int _size = IterableExtensions.size(_considerableParameters);
      boolean _equals = (_size == 0);
      if (_equals) {
        String _name = it.getName();
        String _plus = (_name + ":");
        _xifexpression = _plus;
      } else {
        String _name_1 = it.getName();
        String _parameterClause = this.parameterClause(it);
        String _plus_1 = (_name_1 + _parameterClause);
        String _plus_2 = (_plus_1 + " onResult:");
        _xifexpression = _plus_2;
      }
      final String parameterSection = _xifexpression;
      String _methodType = this.methodType(it);
      String _plus_3 = (_methodType + " (void)");
      String _plus_4 = (_plus_3 + parameterSection);
      String _plus_5 = (_plus_4 + "(void (^)(");
      String _returnType = this.returnType(it);
      String _plus_6 = (_plus_5 + _returnType);
      String _plus_7 = (_plus_6 + ", NSError *error))resultBlock");
      _xblockexpression = (_plus_7);
    }
    return _xblockexpression;
  }
  
  private String parameterCallClause(final DataSourceAccessMethod it) {
    Iterable<Parameter> _considerableParameters = this.considerableParameters(it);
    final Function1<Parameter,String> _function = new Function1<Parameter,String>() {
      public String apply(final Parameter it) {
        String _name = it.getName();
        String _plus = ("self." + _name);
        return _plus;
      }
    };
    Iterable<String> _map = IterableExtensions.<Parameter, String>map(_considerableParameters, _function);
    String _join = IterableExtensions.join(_map, " and:");
    String _plus = ("WithParameter:" + _join);
    return _plus;
  }
  
  public String dataAccessMethodCall(final DataSourceAccessMethod it) {
    String _xblockexpression = null;
    {
      String _xifexpression = null;
      Iterable<Parameter> _considerableParameters = this.considerableParameters(it);
      int _size = IterableExtensions.size(_considerableParameters);
      boolean _equals = (_size == 0);
      if (_equals) {
        String _name = it.getName();
        String _plus = (_name + ":");
        _xifexpression = _plus;
      } else {
        String _name_1 = it.getName();
        String _parameterCallClause = this.parameterCallClause(it);
        String _plus_1 = (_name_1 + _parameterCallClause);
        String _plus_2 = (_plus_1 + " onResult:");
        _xifexpression = _plus_2;
      }
      final String parameterSection = _xifexpression;
      String _returnType = this.returnType(it);
      String _plus_3 = ((parameterSection + "^(") + _returnType);
      String _plus_4 = (_plus_3 + ", NSError *error)");
      _xblockexpression = (_plus_4);
    }
    return _xblockexpression;
  }
}
