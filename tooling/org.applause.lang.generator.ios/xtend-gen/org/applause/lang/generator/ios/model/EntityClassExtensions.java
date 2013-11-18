package org.applause.lang.generator.ios.model;

import com.google.inject.Inject;
import org.applause.lang.applauseDsl.Attribute;
import org.applause.lang.applauseDsl.Entity;
import org.applause.lang.generator.ios.model.TypeExtensions;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class EntityClassExtensions {
  @Inject
  @Extension
  private TypeExtensions _typeExtensions;
  
  public String entityModelHeaderFileName(final Entity it) {
    String _typeName = this._typeExtensions.typeName(it);
    String _plus = (_typeName + ".h");
    return _plus;
  }
  
  public String entityModelModuleFileName(final Entity it) {
    String _typeName = this._typeExtensions.typeName(it);
    String _plus = (_typeName + ".m");
    return _plus;
  }
  
  public String propertyName(final Attribute it) {
    String _name = it.getName();
    return _name;
  }
}
