package org.applause.lang.generator.ios.model;

import com.google.common.base.Objects;
import org.applause.lang.applauseDsl.Attribute;
import org.applause.lang.applauseDsl.Entity;
import org.applause.lang.applauseDsl.Type;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class EntityInterfaceCompiler {
  public String typeName(final Attribute it) {
    String _switchResult = null;
    Type _type = it.getType();
    String _name = _type.getName();
    final String _switchValue = _name;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_switchValue,"String")) {
        _matched=true;
        _switchResult = "NSString";
      }
    }
    if (!_matched) {
      Type _type_1 = it.getType();
      String _name_1 = _type_1.getName();
      _switchResult = _name_1;
    }
    return _switchResult;
  }
  
  public String typeName(final Entity it) {
    String _xifexpression = null;
    boolean _notEquals = (!Objects.equal(it, null));
    if (_notEquals) {
      String _name = it.getName();
      _xifexpression = _name;
    } else {
      _xifexpression = "NSObject";
    }
    return _xifexpression;
  }
  
  public String propertyName(final Attribute it) {
    String _name = it.getName();
    return _name;
  }
  
  public CharSequence superTypeForwardDeclaration(final Entity it) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Entity _superType = it.getSuperType();
      boolean _notEquals = (!Objects.equal(_superType, null));
      if (_notEquals) {
        _builder.newLine();
        _builder.append("@class ");
        Entity _superType_1 = it.getSuperType();
        String _typeName = this.typeName(_superType_1);
        _builder.append(_typeName, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compileHeader(final Entity it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#import <Foundation/Foundation.h>");
    _builder.newLine();
    CharSequence _superTypeForwardDeclaration = this.superTypeForwardDeclaration(it);
    _builder.append(_superTypeForwardDeclaration, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("@interface ");
    String _name = it.getName();
    _builder.append(_name, "");
    _builder.append(" : ");
    Entity _superType = it.getSuperType();
    String _typeName = this.typeName(_superType);
    _builder.append(_typeName, "");
    _builder.newLineIfNotEmpty();
    {
      EList<Attribute> _attributes = it.getAttributes();
      for(final Attribute attribute : _attributes) {
        CharSequence _compile = this.compile(attribute);
        _builder.append(_compile, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("@end");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Attribute it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@property (nonatomic, strong) ");
    String _typeName = this.typeName(it);
    _builder.append(_typeName, "");
    _builder.append(" *");
    String _propertyName = this.propertyName(it);
    _builder.append(_propertyName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
