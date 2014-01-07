package org.applause.lang.generator.ios.dataaccess;

import com.google.inject.Inject;
import java.util.List;
import org.applause.lang.applauseDsl.DataSource;
import org.applause.lang.applauseDsl.DataSourceAccessMethod;
import org.applause.lang.applauseDsl.Entity;
import org.applause.lang.applauseDsl.Parameter;
import org.applause.lang.applauseDsl.Type;
import org.applause.lang.generator.ios.model.TypeExtensions;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class EntityDataAccessExtensions {
  @Inject
  @Extension
  private TypeExtensions _typeExtensions;
  
  public String parameterName(final Type it) {
    String _name = it.getName();
    String _firstLower = StringExtensions.toFirstLower(_name);
    return _firstLower;
  }
  
  public String parameterName(final Entity it) {
    String _name = it.getName();
    String _firstLower = StringExtensions.toFirstLower(_name);
    return _firstLower;
  }
  
  public String plural(final String it) {
    String _plus = (it + "s");
    return _plus;
  }
  
  public String listAllMethodName(final Entity it) {
    String _name = it.getName();
    String _plural = this.plural(_name);
    String _firstUpper = StringExtensions.toFirstUpper(_plural);
    String _plus = ("all" + _firstUpper);
    return _plus;
  }
  
  public String parameterList(final DataSourceAccessMethod it) {
    EList<Parameter> _declaredParameters = it.getDeclaredParameters();
    final Function1<Parameter,String> _function = new Function1<Parameter,String>() {
      public String apply(final Parameter param) {
        Type _type = param.getType();
        String _typeName = EntityDataAccessExtensions.this._typeExtensions.typeName(_type);
        String _plus = (_typeName + " *");
        Type _type_1 = param.getType();
        String _parameterName = EntityDataAccessExtensions.this.parameterName(_type_1);
        String _plus_1 = (_plus + _parameterName);
        return _plus_1;
      }
    };
    List<String> _map = ListExtensions.<Parameter, String>map(_declaredParameters, _function);
    String _join = IterableExtensions.join(_map, ", ");
    return _join;
  }
  
  public Entity resourceType(final DataSourceAccessMethod it) {
    EObject _eContainer = it.eContainer();
    Entity _resourceType = ((DataSource) _eContainer).getResourceType();
    return _resourceType;
  }
}
