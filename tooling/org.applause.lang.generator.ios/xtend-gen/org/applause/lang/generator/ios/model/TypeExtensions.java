package org.applause.lang.generator.ios.model;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Arrays;
import org.applause.lang.applauseDsl.Attribute;
import org.applause.lang.applauseDsl.DataType;
import org.applause.lang.applauseDsl.Entity;
import org.applause.lang.applauseDsl.Model;
import org.applause.lang.applauseDsl.NamedElement;
import org.applause.lang.applauseDsl.Parameter;
import org.applause.lang.applauseDsl.Platform;
import org.applause.lang.applauseDsl.PlatformMapping;
import org.applause.lang.applauseDsl.Type;
import org.applause.lang.applauseDsl.TypeMapping;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class TypeExtensions {
  public Platform platform(final EObject it) {
    Platform _xblockexpression = null;
    {
      final Model model = EcoreUtil2.<Model>getContainerOfType(it, Model.class);
      EList<NamedElement> _elements = model.getElements();
      Iterable<Platform> _filter = Iterables.<Platform>filter(_elements, Platform.class);
      final Function1<Platform,Boolean> _function = new Function1<Platform,Boolean>() {
        public Boolean apply(final Platform it) {
          String _name = it.getName();
          boolean _equals = Objects.equal(_name, "iOS");
          return Boolean.valueOf(_equals);
        }
      };
      Iterable<Platform> _filter_1 = IterableExtensions.<Platform>filter(_filter, _function);
      Platform _head = IterableExtensions.<Platform>head(_filter_1);
      _xblockexpression = (_head);
    }
    return _xblockexpression;
  }
  
  public TypeMapping platformMapping(final Type that) {
    Platform _platform = this.platform(that);
    EList<PlatformMapping> _mappings = _platform.getMappings();
    Iterable<TypeMapping> _filter = Iterables.<TypeMapping>filter(_mappings, TypeMapping.class);
    final Function1<TypeMapping,Boolean> _function = new Function1<TypeMapping,Boolean>() {
      public Boolean apply(final TypeMapping it) {
        DataType _type = it.getType();
        String _name = _type.getName();
        String _name_1 = that.getName();
        boolean _equals = Objects.equal(_name, _name_1);
        return Boolean.valueOf(_equals);
      }
    };
    TypeMapping _findFirst = IterableExtensions.<TypeMapping>findFirst(_filter, _function);
    return _findFirst;
  }
  
  protected String _typeName(final Type it) {
    String _xifexpression = null;
    boolean _notEquals = (!Objects.equal(it, null));
    if (_notEquals) {
      String _name = it.getName();
      _xifexpression = _name;
    }
    return _xifexpression;
  }
  
  protected String _typeName(final DataType it) {
    String _xifexpression = null;
    boolean _notEquals = (!Objects.equal(it, null));
    if (_notEquals) {
      TypeMapping _platformMapping = this.platformMapping(it);
      String _simpleName = _platformMapping.getSimpleName();
      _xifexpression = _simpleName;
    }
    return _xifexpression;
  }
  
  protected String _typeName(final Parameter it) {
    String _xifexpression = null;
    boolean _notEquals = (!Objects.equal(it, null));
    if (_notEquals) {
      Type _type = it.getType();
      String _typeName = this.typeName(_type);
      _xifexpression = _typeName;
    }
    return _xifexpression;
  }
  
  protected String _typeName(final Entity it) {
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
  
  protected String _typeName(final Attribute it) {
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
      if (Objects.equal(_switchValue,"Bool")) {
        _matched=true;
        _switchResult = "BOOL";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"Date")) {
        _matched=true;
        _switchResult = "NSDate";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"Integer")) {
        _matched=true;
        _switchResult = "NSNumber";
      }
    }
    if (!_matched) {
      Type _type_1 = it.getType();
      String _name_1 = _type_1.getName();
      _switchResult = _name_1;
    }
    return _switchResult;
  }
  
  public boolean isScalar(final Attribute it) {
    boolean _switchResult = false;
    Type _type = it.getType();
    String _name = _type.getName();
    final String _switchValue = _name;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_switchValue,"Bool")) {
        _matched=true;
        _switchResult = true;
      }
    }
    if (!_matched) {
      _switchResult = false;
    }
    return _switchResult;
  }
  
  public boolean isScalar(final Type it) {
    boolean _switchResult = false;
    String _name = it.getName();
    final String getName = _name;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(getName,"Bool")) {
        _matched=true;
        _switchResult = true;
      }
    }
    if (!_matched) {
      _switchResult = false;
    }
    return _switchResult;
  }
  
  public String typeName(final EObject it) {
    if (it instanceof DataType) {
      return _typeName((DataType)it);
    } else if (it instanceof Entity) {
      return _typeName((Entity)it);
    } else if (it instanceof Parameter) {
      return _typeName((Parameter)it);
    } else if (it instanceof Type) {
      return _typeName((Type)it);
    } else if (it instanceof Attribute) {
      return _typeName((Attribute)it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
}
