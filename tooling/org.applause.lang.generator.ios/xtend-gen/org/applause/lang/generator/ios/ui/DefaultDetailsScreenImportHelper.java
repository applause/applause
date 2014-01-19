package org.applause.lang.generator.ios.ui;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.HashSet;
import java.util.List;
import org.applause.lang.applauseDsl.ControllerVerb;
import org.applause.lang.applauseDsl.Entity;
import org.applause.lang.applauseDsl.Parameter;
import org.applause.lang.applauseDsl.Screen;
import org.applause.lang.applauseDsl.Type;
import org.applause.lang.generator.ios.dataaccess.DataAccessClassExtensions;
import org.applause.lang.generator.ios.model.EntityClassExtensions;
import org.applause.lang.generator.ios.ui.DefaultDetailsScreenClassExtensions;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class DefaultDetailsScreenImportHelper {
  @Inject
  @Extension
  private EntityClassExtensions _entityClassExtensions;
  
  @Inject
  @Extension
  private DataAccessClassExtensions _dataAccessClassExtensions;
  
  @Inject
  @Extension
  private DefaultDetailsScreenClassExtensions _defaultDetailsScreenClassExtensions;
  
  public CharSequence compileHeaderImports(final Screen it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#import <Foundation/Foundation.h>");
    _builder.newLine();
    _builder.append("#import \"QuickDialogController.h\"");
    _builder.newLine();
    _builder.append("#import \"");
    Entity _resourceType = this._defaultDetailsScreenClassExtensions.resourceType(it);
    String _entityModelHeaderFileName = this._entityClassExtensions.entityModelHeaderFileName(_resourceType);
    _builder.append(_entityModelHeaderFileName, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    final Iterable<String> importedFileNames = this.importedHeaderFileForControllerMethods(it);
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
  
  public CharSequence compileModuleImports(final Screen it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#import \"");
    String _screenHeaderFileName = this._defaultDetailsScreenClassExtensions.screenHeaderFileName(it);
    _builder.append(_screenHeaderFileName, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("#import \"QRootElement.h\"");
    _builder.newLine();
    _builder.append("#import \"QEntryElement.h\"");
    _builder.newLine();
    _builder.append("#import \"QBooleanElement.h\"");
    _builder.newLine();
    _builder.append("#import \"QDateTimeInlineElement.h\"");
    _builder.newLine();
    _builder.append("#import \"QButtonElement.h\"");
    _builder.newLine();
    _builder.append("#import \"");
    Entity _resourceType = this._defaultDetailsScreenClassExtensions.resourceType(it);
    String _entityDataAccessCategoryHeaderFileName = this._dataAccessClassExtensions.entityDataAccessCategoryHeaderFileName(_resourceType);
    _builder.append(_entityDataAccessCategoryHeaderFileName, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    final Iterable<String> importedFileNames = this.importedHeaderFileForControllerMethods(it);
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
  
  public Iterable<String> importedHeaderFileForControllerMethods(final Screen it) {
    EList<ControllerVerb> _verbs = it.getVerbs();
    final Function1<ControllerVerb,EList<Parameter>> _function = new Function1<ControllerVerb,EList<Parameter>>() {
      public EList<Parameter> apply(final ControllerVerb it) {
        EList<Parameter> _declaredParameters = it.getDeclaredParameters();
        return _declaredParameters;
      }
    };
    List<EList<Parameter>> _map = ListExtensions.<ControllerVerb, EList<Parameter>>map(_verbs, _function);
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
        String _entityModelHeaderFileName = DefaultDetailsScreenImportHelper.this._entityClassExtensions.entityModelHeaderFileName(it);
        return _entityModelHeaderFileName;
      }
    };
    Iterable<String> _map_2 = IterableExtensions.<Entity, String>map(_filter, _function_2);
    return _map_2;
  }
}
