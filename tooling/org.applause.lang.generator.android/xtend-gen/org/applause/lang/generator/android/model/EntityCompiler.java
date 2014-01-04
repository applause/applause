package org.applause.lang.generator.android.model;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import org.applause.lang.applauseDsl.Attribute;
import org.applause.lang.applauseDsl.Entity;
import org.applause.lang.generator.android.AndroidOutputConfigurationProvider;
import org.applause.lang.generator.android.model.AttributeExtensions;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class EntityCompiler {
  @Inject
  @Extension
  private AttributeExtensions _attributeExtensions;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Entity> _filter = Iterables.<Entity>filter(_iterable, Entity.class);
    final Procedure1<Entity> _function = new Procedure1<Entity>() {
      public void apply(final Entity it) {
        String _fileName = EntityCompiler.this.fileName(it);
        CharSequence _compile = EntityCompiler.this.compile(it);
        fsa.generateFile(_fileName, AndroidOutputConfigurationProvider.ANDROID_DEFAULT_OUTPUT, _compile);
      }
    };
    IterableExtensions.<Entity>forEach(_filter, _function);
  }
  
  public String fileName(final Entity entity) {
    String _name = entity.getName();
    String _plus = (_name + ".java");
    return _plus;
  }
  
  public CharSequence compile(final Entity it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class ");
    String _name = it.getName();
    _builder.append(_name, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      EList<Attribute> _attributes = it.getAttributes();
      for(final Attribute attribute : _attributes) {
        _builder.append("\t");
        CharSequence _compile = this.compile(attribute);
        _builder.append(_compile, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Attribute it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private ");
    String _typeName = this._attributeExtensions.typeName(it);
    _builder.append(_typeName, "");
    _builder.append(" ");
    String _name = it.getName();
    _builder.append(_name, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public void ");
    String _setterName = this._attributeExtensions.setterName(it);
    _builder.append(_setterName, "");
    _builder.append("(");
    String _typeName_1 = this._attributeExtensions.typeName(it);
    _builder.append(_typeName_1, "");
    _builder.append(" ");
    String _name_1 = it.getName();
    _builder.append(_name_1, "");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("this.");
    String _name_2 = it.getName();
    _builder.append(_name_2, "	");
    _builder.append(" = ");
    String _name_3 = it.getName();
    _builder.append(_name_3, "	");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public ");
    String _typeName_2 = this._attributeExtensions.typeName(it);
    _builder.append(_typeName_2, "");
    _builder.append(" ");
    String _terName = this._attributeExtensions.getterName(it);
    _builder.append(_terName, "");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return this.");
    String _name_4 = it.getName();
    _builder.append(_name_4, "	");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
