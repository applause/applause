package org.applause.specification.data;

import com.google.common.collect.Iterables;
import org.applause.lang.applauseDsl.AbsoluteRESTURL;
import org.applause.lang.applauseDsl.DataSource;
import org.applause.lang.applauseDsl.Model;
import org.applause.lang.applauseDsl.NamedElement;
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

@Named("Absolute REST URLs")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class RESTURLsAbsoluteRESTURLsSpec extends RESTURLsSpec {
  public void baseUrlShouldBe(final CharSequence sequence, final String url) {
    try {
      final Model model = this._parseHelper.parse(sequence);
      EList<NamedElement> _elements = model.getElements();
      Iterable<DataSource> _filter = Iterables.<DataSource>filter(_elements, DataSource.class);
      final DataSource datasource = IterableExtensions.<DataSource>head(_filter);
      final AbsoluteRESTURL baseUrl = datasource.getBaseUrl();
      String _value = this._rESTURLExtensions.value(baseUrl);
      Matcher<String> _is = CoreMatchers.<String>is(url);
      Assert.<String>assertThat(_value, _is);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Absolute REST URLs start with `http://`, continue with a hostname, and end with a resource path
   * @filter('''|.baseUrlShouldBe.*)
   */
  @Test
  @Named("Simple absolute REST URLS")
  @Order(1)
  public void _simpleAbsoluteRESTURLS() throws Exception {
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
    _builder.append("}");
    _builder.newLine();
    this.baseUrlShouldBe(_builder, "http://localhost/persons");
  }
  
  /**
   * An absolute REST URL can contain a port.
   * @filter('''|.baseUrlShouldBe.*)
   */
  @Test
  @Named("Simple absolute REST URLS with port")
  @Order(2)
  public void _simpleAbsoluteRESTURLSWithPort() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("entity Person {}");
    _builder.newLine();
    _builder.append("datasource PersonDataSource {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("baseUrl: http://localhost:2403/persons");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("resource: Person");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.baseUrlShouldBe(_builder, "http://localhost:2403/persons");
  }
  
  /**
   * An absolute REST URL can have a full domain name, a port and a deep path.
   * @filter('''|.baseUrlShouldBe.*)
   */
  @Test
  @Named("Absolute REST URL with full domain name, port and deep path")
  @Order(3)
  public void _absoluteRESTURLWithFullDomainNamePortAndDeepPath() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("entity Person {}");
    _builder.newLine();
    _builder.append("datasource PersonDataSource {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("baseUrl: http://www.foobar.com:2403/foo/bar/baz");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("resource: Person");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.baseUrlShouldBe(_builder, "http://www.foobar.com:2403/foo/bar/baz");
  }
}
