package org.applause.lang.generator.ios.dataaccess;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.HashSet;
import java.util.List;
import org.applause.lang.applauseDsl.DataSource;
import org.applause.lang.applauseDsl.DataSourceAccessMethod;
import org.applause.lang.applauseDsl.Entity;
import org.applause.lang.applauseDsl.Parameter;
import org.applause.lang.applauseDsl.Type;
import org.applause.lang.generator.ios.FileNameExtensions;
import org.applause.lang.generator.ios.dataaccess.APIClientClassExtensions;
import org.applause.lang.generator.ios.dataaccess.DataAccessClassExtensions;
import org.applause.lang.generator.ios.model.EntityClassExtensions;
import org.applause.lang.generator.ios.model.TypeExtensions;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class DataAccessImportHelper {
  @Inject
  @Extension
  private TypeExtensions _typeExtensions;
  
  @Inject
  @Extension
  private FileNameExtensions _fileNameExtensions;
  
  @Inject
  @Extension
  private APIClientClassExtensions _aPIClientClassExtensions;
  
  @Inject
  @Extension
  private DataAccessClassExtensions _dataAccessClassExtensions;
  
  @Inject
  @Extension
  private EntityClassExtensions _entityClassExtensions;
  
  private String mappingClassName(final Entity it) {
    String _typeName = this._typeExtensions.typeName(it);
    String _plus = (_typeName + "+");
    String _plus_1 = (_plus + "DataMapping");
    return _plus_1;
  }
  
  public CharSequence compileHeaderImports(final DataSource it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#import <Foundation/Foundation.h>");
    _builder.newLine();
    _builder.append("#import \"");
    Entity _resourceType = it.getResourceType();
    String _entityModelHeaderFileName = this._entityClassExtensions.entityModelHeaderFileName(_resourceType);
    _builder.append(_entityModelHeaderFileName, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    final Iterable<String> importedFileNames = this.importedHeaderFilesForDataSourceAccessMethods(it);
    _builder.newLineIfNotEmpty();
    final HashSet<String> uniqueFileNames = this.unique(importedFileNames);
    _builder.newLineIfNotEmpty();
    {
      for(final String fileName : uniqueFileNames) {
        _builder.append("#import \"");
        _builder.append(fileName, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compileModuleImports(final DataSource it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#import \"");
    Entity _resourceType = it.getResourceType();
    String _entityDataAccessCategoryHeaderFileName = this._dataAccessClassExtensions.entityDataAccessCategoryHeaderFileName(_resourceType);
    _builder.append(_entityDataAccessCategoryHeaderFileName, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("#import \"");
    Entity _resourceType_1 = it.getResourceType();
    String _apiClientClassName = this._aPIClientClassExtensions.apiClientClassName(_resourceType_1);
    String _headerFileName = this._fileNameExtensions.headerFileName(_apiClientClassName);
    _builder.append(_headerFileName, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("#import \"");
    Entity _resourceType_2 = it.getResourceType();
    String _mappingClassName = this.mappingClassName(_resourceType_2);
    String _headerFileName_1 = this._fileNameExtensions.headerFileName(_mappingClassName);
    _builder.append(_headerFileName_1, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    final Iterable<String> importedFileNames = this.importedHeaderFilesForDataSourceAccessMethods(it);
    _builder.newLineIfNotEmpty();
    final HashSet<String> uniqueFileNames = this.unique(importedFileNames);
    _builder.newLineIfNotEmpty();
    {
      for(final String fileName : uniqueFileNames) {
        _builder.append("#import \"");
        _builder.append(fileName, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public HashSet<String> unique(final Iterable<String> strings) {
    HashSet<String> _xblockexpression = null;
    {
      final HashSet<String> unique = CollectionLiterals.<String>newHashSet();
      Iterables.<String>addAll(unique, strings);
      _xblockexpression = (unique);
    }
    return _xblockexpression;
  }
  
  public Iterable<String> importedHeaderFilesForDataSourceAccessMethods(final DataSource it) {
    EList<DataSourceAccessMethod> _methods = it.getMethods();
    final Function1<DataSourceAccessMethod,EList<Parameter>> _function = new Function1<DataSourceAccessMethod,EList<Parameter>>() {
      public EList<Parameter> apply(final DataSourceAccessMethod it) {
        EList<Parameter> _declaredParameters = it.getDeclaredParameters();
        return _declaredParameters;
      }
    };
    List<EList<Parameter>> _map = ListExtensions.<DataSourceAccessMethod, EList<Parameter>>map(_methods, _function);
    Iterable<Parameter> _flatten = Iterables.<Parameter>concat(_map);
    final Function1<Parameter,Type> _function_1 = new Function1<Parameter,Type>() {
      public Type apply(final Parameter it) {
        Type _type = it.getType();
        return _type;
      }
    };
    Iterable<Type> _map_1 = IterableExtensions.<Parameter, Type>map(_flatten, _function_1);
    Iterable<Entity> _filter = Iterables.<Entity>filter(_map_1, Entity.class);
    final Function1<Entity,String> _function_2 = new Function1<Entity,String>() {
      public String apply(final Entity it) {
        String _entityModelHeaderFileName = DataAccessImportHelper.this._entityClassExtensions.entityModelHeaderFileName(it);
        return _entityModelHeaderFileName;
      }
    };
    Iterable<String> _map_2 = IterableExtensions.<Entity, String>map(_filter, _function_2);
    return _map_2;
  }
}
