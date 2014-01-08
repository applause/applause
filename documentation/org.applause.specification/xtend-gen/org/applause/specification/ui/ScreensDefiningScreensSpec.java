package org.applause.specification.ui;

import org.applause.specification.ui.ScreensSpec;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("Defining Screens")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class ScreensDefiningScreensSpec extends ScreensSpec {
  /**
   * Screens can be defined using the `screen` keyword. A screen can either be a list screen or a details screen,
   * which is indicated by either specifying `DefaultList` or `DefaultDetails`. Each screen is identified by its name,
   * which needs to be unique.
   * @filter('''|.valid.*)
   */
  @Test
  @Named("Simple screens")
  @Order(1)
  public void _simpleScreens() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("screen DefaultList PersonList {");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("screen DefaultDetails PersonDetails {");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._screensValidationTestHelper.isValidScreen(_builder);
  }
  
  /**
   * Screens must be unique. Currently, this means they must be unique across the board and __cannot__
   * be namespaced.
   * @filter('''|.hasDuplicateScreen)
   */
  @Test
  @Named("Screens must be unique")
  @Order(2)
  public void _screensMustBeUnique() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("screen DefaultList PersonList {");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("screen DefaultList PersonList {");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._screensValidationTestHelper.hasDuplicateScreen(_builder);
  }
  
  /**
   * Screens can have an optional title, which will be displayed in the title area of a screen.
   * @filter('''|.hasTitle.*)
   */
  @Test
  @Named("Screens can have an optional title")
  @Order(3)
  public void _screensCanHaveAnOptionalTitle() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("screen DefaultList PersonList {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("title = \"Persons\"");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._screensValidationTestHelper.hasTitle(_builder, "Person");
  }
  
  /**
   * Screens can be linked to a data source, which can then be used to fetch data to be displayed on the screen.
   * @filter('''|hasDataSource.*)
   */
  @Test
  @Named("Screens can have an optional data source")
  @Order(4)
  public void _screensCanHaveAnOptionalDataSource() throws Exception {
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
    _builder.append("screen DefaultList PersonList {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("title = \"Persons\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("datasource = PersonDataSource");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._screensValidationTestHelper.hasDataSource(_builder);
  }
}
