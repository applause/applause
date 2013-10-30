package org.applause.specification.data;

import org.applause.specification.data.EntitiesSpec;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Entities can have any name and can be defined anywhere in your DSL program.
 */
@Named("Defining Entities")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class EntitiesDefiningEntitiesSpec extends EntitiesSpec {
  /**
   * Entities can be defined using the `entity` keyword.
   * @filter('''|.isValid.*)
   */
  @Test
  @Named("Simple entities")
  @Order(1)
  public void _simpleEntities() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("entity Person {");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._entitiesValidationTestHelper.isValidEntity(_builder);
  }
  
  /**
   * Entities can extend other entities.
   * @filter('''|.isValid.*)
   */
  @Test
  @Named("Entity inheritance")
  @Order(2)
  public void _entityInheritance() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("entity Person {");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("entity Employee extends Person {");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._entitiesValidationTestHelper.isValidEntityWithInheritance(_builder);
  }
  
  /**
   * If an entity is merely used to specify base attributes for an inheritance hierarchy,
   * it makes sense to define it as being abstract to make sure it cannot be instantiated.
   * @filter('''|isValid.*)
   */
  @Test
  @Named("Abstract Entities")
  @Order(3)
  public void _abstractEntities() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("abstract entity Person {");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("entity Employee extends Person {");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._entitiesValidationTestHelper.isValidAbstractEntityWithInheritance(_builder);
  }
  
  /**
   * Entities can have any number of attributes. Attribute types refer to `datatype`s or other
   * `entity`s.
   * @filter('''|.isValid.*)
   */
  @Test
  @Named("Entity attributes")
  @Order(4)
  public void _entityAttributes() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("datatype String");
    _builder.newLine();
    _builder.append("datatype Date");
    _builder.newLine();
    _builder.append("entity Person {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("String name");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Date birthdate");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._entitiesValidationTestHelper.isValidEntityWithAttributes(_builder);
  }
  
  /**
   * Properties can have an optional cardinality, so you can express 1:n relationships.
   * @filter('''|.isValid.*)
   */
  @Test
  @Named("Property cardinality")
  @Order(5)
  public void _propertyCardinality() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("entity Person {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Person[] friends");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._entitiesValidationTestHelper.isValidEntityWithOneToManyRelationship(_builder);
  }
}
