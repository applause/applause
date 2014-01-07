package org.applause.specification.data;

import com.google.common.collect.Iterables;
import org.applause.lang.applauseDsl.DataSource;
import org.applause.lang.applauseDsl.DataSourceAccessMethod;
import org.applause.lang.applauseDsl.Model;
import org.applause.lang.applauseDsl.NamedElement;
import org.applause.lang.applauseDsl.RESTSpecification;
import org.applause.lang.applauseDsl.RESTURL;
import org.applause.specification.data.RESTURLsSpec;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("Relative REST URLs")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class RESTURLsRelativeRESTURLsSpec extends RESTURLsSpec {
  public void dataSourceAccessMethodUrlShouldBe(final CharSequence sequence, final String url) {
    try {
      final Model model = this._parseHelper.parse(sequence);
      EList<NamedElement> _elements = model.getElements();
      Iterable<DataSource> _filter = Iterables.<DataSource>filter(_elements, DataSource.class);
      final DataSource datasource = IterableExtensions.<DataSource>head(_filter);
      EList<DataSourceAccessMethod> _methods = datasource.getMethods();
      final DataSourceAccessMethod method = IterableExtensions.<DataSourceAccessMethod>head(_methods);
      RESTSpecification _restSpecification = method.getRestSpecification();
      RESTURL _path = _restSpecification.getPath();
      String _value = this._rESTURLExtensions.value(_path);
      Matcher<String> _is = CoreMatchers.<String>is(url);
      Assert.<String>assertThat(_value, _is);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Relative REST URLs start with `/`, and continue with a resource path
   * @filter('''|.dataSourceAccessMethodUrlShouldBe.*)
   */
  @Test
  @Named("Simple relative REST URL")
  @Order(1)
  public void _simpleRelativeRESTURL() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("entity Person {}");
    _builder.newLine();
    _builder.append("datasource PersonDataSource {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("baseUrl: http://localhost/persons");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("resource: Person");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("post(Person person) GET /persons");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.dataSourceAccessMethodUrlShouldBe(_builder, "/persons");
  }
  
  /**
   * Relative REST URLs start with `/`, and continue with a resource path
   * @filter('''|.dataSourceAccessMethodUrlShouldBe.*)
   */
  @Test
  @Named("More complex relative REST URL")
  @Order(2)
  public void _moreComplexRelativeRESTURL() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("entity Person {}");
    _builder.newLine();
    _builder.append("datasource PersonDataSource {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("baseUrl: http://localhost/persons");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("resource: Person");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("post(Person person) GET /boo/bar/baz/persons");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.dataSourceAccessMethodUrlShouldBe(_builder, "/boo/bar/baz/persons");
  }
}
