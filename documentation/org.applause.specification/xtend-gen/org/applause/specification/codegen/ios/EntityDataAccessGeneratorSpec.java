package org.applause.specification.codegen.ios;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import org.applause.lang.applauseDsl.DataSource;
import org.applause.lang.applauseDsl.Model;
import org.applause.lang.applauseDsl.NamedElement;
import org.applause.lang.generator.ios.dataaccess.EntityDataAccessHeaderFileCompiler;
import org.applause.lang.generator.ios.dataaccess.EntityDataAccessModuleFileCompiler;
import org.applause.specification.ApplauseDslInjectorProvider;
import org.applause.specification.ApplauseDslTestCreator;
import org.applause.specification.codegen.ios.EntityDataAccessGeneratorGeneratingDataAccessCodeForEntitiesSpec;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.Assert;
import org.junit.runner.RunWith;

@Contains(EntityDataAccessGeneratorGeneratingDataAccessCodeForEntitiesSpec.class)
@Named("Entity Data Access Generator")
@RunWith(ExampleGroupRunner.class)
@InjectWith(ApplauseDslInjectorProvider.class)
@CreateWith(ApplauseDslTestCreator.class)
@SuppressWarnings("all")
public class EntityDataAccessGeneratorSpec {
  @Inject
  @Extension
  @org.jnario.runner.Extension
  public ParseHelper<Model> _parseHelper;
  
  @Inject
  @Extension
  @org.jnario.runner.Extension
  public EntityDataAccessHeaderFileCompiler _entityDataAccessHeaderFileCompiler;
  
  @Inject
  @Extension
  @org.jnario.runner.Extension
  public EntityDataAccessModuleFileCompiler _entityDataAccessModuleFileCompiler;
  
  private DataSource datasource(final CharSequence input, final String datasourceName) {
    try {
      DataSource _xblockexpression = null;
      {
        final Model model = this._parseHelper.parse(input);
        EList<NamedElement> _elements = model.getElements();
        Iterable<DataSource> _filter = Iterables.<DataSource>filter(_elements, DataSource.class);
        final Function1<DataSource,Boolean> _function = new Function1<DataSource,Boolean>() {
          public Boolean apply(final DataSource it) {
            String _name = it.getName();
            boolean _equals = Objects.equal(_name, datasourceName);
            return Boolean.valueOf(_equals);
          }
        };
        DataSource _findFirst = IterableExtensions.<DataSource>findFirst(_filter, _function);
        _xblockexpression = (_findFirst);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void isGeneratedHeaderFileFromModel(final CharSequence expectedGeneratedCode, final String dataSourceName, final CharSequence input) {
    final DataSource datasource = this.datasource(input, dataSourceName);
    final CharSequence result = this._entityDataAccessHeaderFileCompiler.compileHeaderFile(datasource);
    String _string = result.toString();
    String _string_1 = expectedGeneratedCode.toString();
    Matcher<String> _equalTo = CoreMatchers.<String>equalTo(_string_1);
    Assert.<String>assertThat(_string, _equalTo);
  }
  
  public void isGeneratedModuleFileFromModel(final CharSequence expectedGeneratedCode, final String dataSourceName, final CharSequence input) {
    final DataSource datasource = this.datasource(input, dataSourceName);
    final CharSequence result = this._entityDataAccessModuleFileCompiler.compileModuleFile(datasource);
    String _string = result.toString();
    String _string_1 = expectedGeneratedCode.toString();
    Matcher<String> _equalTo = CoreMatchers.<String>equalTo(_string_1);
    Assert.<String>assertThat(_string, _equalTo);
  }
}
