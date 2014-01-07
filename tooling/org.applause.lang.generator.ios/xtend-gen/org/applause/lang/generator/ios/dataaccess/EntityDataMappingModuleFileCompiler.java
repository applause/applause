package org.applause.lang.generator.ios.dataaccess;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.applause.lang.applauseDsl.Attribute;
import org.applause.lang.applauseDsl.Entity;
import org.applause.lang.generator.ios.dataaccess.DataMappingExtensions;
import org.applause.lang.generator.ios.model.EntityClassExtensions;
import org.applause.lang.generator.ios.model.TypeExtensions;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class EntityDataMappingModuleFileCompiler {
  @Inject
  @Extension
  private TypeExtensions _typeExtensions;
  
  @Inject
  @Extension
  private EntityClassExtensions _entityClassExtensions;
  
  @Inject
  @Extension
  private DataMappingExtensions _dataMappingExtensions;
  
  public CharSequence compileModuleFile(final Entity it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#import \"");
    String _entityModelHeaderFileName = this._entityClassExtensions.entityModelHeaderFileName(it);
    _builder.append(_entityModelHeaderFileName, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("#import \"");
    String _dataMappingHeaderFileName = this._dataMappingExtensions.dataMappingHeaderFileName(it);
    _builder.append(_dataMappingHeaderFileName, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("@implementation ");
    String _typeName = this._typeExtensions.typeName(it);
    _builder.append(_typeName, "");
    _builder.append(" (DataMapping)");
    _builder.newLineIfNotEmpty();
    _builder.append("- (id)initWithAttributes:(NSDictionary *)attributes");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("self = [super init];");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if (self) {");
    _builder.newLine();
    {
      EList<Attribute> _attributes = it.getAttributes();
      for(final Attribute attribute : _attributes) {
        _builder.append("\t\t");
        CharSequence _compileAttributeToPropertyMapping = this.compileAttributeToPropertyMapping(attribute);
        _builder.append(_compileAttributeToPropertyMapping, "		");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return self;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("- (NSDictionary *)attributes");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("NSMutableDictionary *attributes = [[NSMutableDictionary alloc] init];");
    _builder.newLine();
    {
      EList<Attribute> _attributes_1 = it.getAttributes();
      for(final Attribute attribute_1 : _attributes_1) {
        _builder.append("\t");
        CharSequence _compilePropertyToAttributeMapping = this.compilePropertyToAttributeMapping(attribute_1);
        _builder.append(_compilePropertyToAttributeMapping, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("return attributes;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("@end");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compilePropertyToAttributeMapping(final Attribute it) {
    CharSequence _switchResult = null;
    String _typeName = this._typeExtensions.typeName(it);
    final String typeName = _typeName;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(typeName,"NSString")) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("if (self.");
        String _propertyName = this._entityClassExtensions.propertyName(it);
        _builder.append(_propertyName, "");
        _builder.append(" != nil) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("attributes[@\"");
        String _propertyName_1 = this._entityClassExtensions.propertyName(it);
        _builder.append(_propertyName_1, "	");
        _builder.append("\"] = self.");
        String _propertyName_2 = this._entityClassExtensions.propertyName(it);
        _builder.append(_propertyName_2, "	");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (Objects.equal(typeName,"NSDate")) {
        _matched=true;
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("NSDateFormatter *dateFormatter = [[NSDateFormatter alloc] init];");
        _builder_1.newLine();
        _builder_1.append("[dateFormatter setTimeStyle:NSDateFormatterNoStyle];");
        _builder_1.newLine();
        _builder_1.append("[dateFormatter setDateStyle:NSDateFormatterShortStyle];");
        _builder_1.newLine();
        _builder_1.append("NSString *");
        String _propertyName_3 = this._entityClassExtensions.propertyName(it);
        _builder_1.append(_propertyName_3, "");
        _builder_1.append("String = [dateFormatter stringFromDate:self.dueDate];");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("if (");
        String _propertyName_4 = this._entityClassExtensions.propertyName(it);
        _builder_1.append(_propertyName_4, "");
        _builder_1.append("String != nil) {");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t");
        _builder_1.append("attributes[@\"");
        String _propertyName_5 = this._entityClassExtensions.propertyName(it);
        _builder_1.append(_propertyName_5, "	");
        _builder_1.append("\"] = ");
        String _propertyName_6 = this._entityClassExtensions.propertyName(it);
        _builder_1.append(_propertyName_6, "	");
        _builder_1.append("String;");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("}");
        _builder_1.newLine();
        _switchResult = _builder_1;
      }
    }
    if (!_matched) {
      if (Objects.equal(typeName,"BOOL")) {
        _matched=true;
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("attributes[@\"");
        String _propertyName_7 = this._entityClassExtensions.propertyName(it);
        _builder_2.append(_propertyName_7, "");
        _builder_2.append("\"] = [NSNumber numberWithBool:self.");
        String _propertyName_8 = this._entityClassExtensions.propertyName(it);
        _builder_2.append(_propertyName_8, "");
        _builder_2.append("];");
        _builder_2.newLineIfNotEmpty();
        _switchResult = _builder_2;
      }
    }
    return _switchResult;
  }
  
  public CharSequence compileAttributeToPropertyMapping(final Attribute it) {
    CharSequence _switchResult = null;
    String _typeName = this._typeExtensions.typeName(it);
    final String typeName = _typeName;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(typeName,"NSString")) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("self.");
        String _propertyName = this._entityClassExtensions.propertyName(it);
        _builder.append(_propertyName, "");
        _builder.append(" = [attributes valueForKeyPath:@\"");
        String _name = it.getName();
        _builder.append(_name, "");
        _builder.append("\"];");
        _builder.newLineIfNotEmpty();
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (Objects.equal(typeName,"NSDate")) {
        _matched=true;
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("NSDateFormatter *dateFormatter = [[NSDateFormatter alloc] init];");
        _builder_1.newLine();
        _builder_1.append("[dateFormatter setTimeStyle:NSDateFormatterNoStyle];");
        _builder_1.newLine();
        _builder_1.append("[dateFormatter setDateStyle:NSDateFormatterShortStyle];");
        _builder_1.newLine();
        _builder_1.append("self.");
        String _propertyName_1 = this._entityClassExtensions.propertyName(it);
        _builder_1.append(_propertyName_1, "");
        _builder_1.append(" = [dateFormatter dateFromString:[attributes valueForKeyPath:@\"");
        String _name_1 = it.getName();
        _builder_1.append(_name_1, "");
        _builder_1.append("\"]];");
        _builder_1.newLineIfNotEmpty();
        _switchResult = _builder_1;
      }
    }
    if (!_matched) {
      if (Objects.equal(typeName,"BOOL")) {
        _matched=true;
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("self.");
        String _propertyName_2 = this._entityClassExtensions.propertyName(it);
        _builder_2.append(_propertyName_2, "");
        _builder_2.append(" = [[attributes valueForKeyPath:@\"");
        String _name_2 = it.getName();
        _builder_2.append(_name_2, "");
        _builder_2.append("\"] boolValue];");
        _builder_2.newLineIfNotEmpty();
        _switchResult = _builder_2;
      }
    }
    return _switchResult;
  }
}
