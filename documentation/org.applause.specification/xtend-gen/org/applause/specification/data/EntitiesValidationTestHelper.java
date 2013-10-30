package org.applause.specification.data;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import org.applause.lang.applauseDsl.Attribute;
import org.applause.lang.applauseDsl.Entity;
import org.applause.lang.applauseDsl.Model;
import org.applause.lang.applauseDsl.Type;
import org.applause.specification.data.ApplauseValidationTestHelper;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.junit.Assert;

/**
 * This class provides extension methods we use in the `Entities.spec` specification. The reason for defining the
 * tests here is that we do not want to clutter Jnario's documentation output with the test code.
 */
@SuppressWarnings("all")
public class EntitiesValidationTestHelper extends ApplauseValidationTestHelper {
  @Inject
  @Extension
  private ParseHelper<Model> _parseHelper;
  
  public void isValidEntity(final CharSequence sequence) {
    try {
      final Model model = this._parseHelper.parse(sequence);
      EList<Type> _elements = model.getElements();
      Type _head = IterableExtensions.<Type>head(_elements);
      final Entity entity = ((Entity) _head);
      String _name = entity.getName();
      Assert.assertNotNull(_name);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void isValidEntityWithInheritance(final CharSequence sequence) {
    try {
      final Model model = this._parseHelper.parse(sequence);
      EList<Type> _elements = model.getElements();
      Type _head = IterableExtensions.<Type>head(_elements);
      final Entity person = ((Entity) _head);
      EList<Type> _elements_1 = model.getElements();
      Type _last = IterableExtensions.<Type>last(_elements_1);
      final Entity employee = ((Entity) _last);
      Entity _superType = employee.getSuperType();
      Matcher<Entity> _is = CoreMatchers.<Entity>is(person);
      Assert.<Entity>assertThat(_superType, _is);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void isValidAbstractEntityWithInheritance(final CharSequence sequence) {
    try {
      final Model model = this._parseHelper.parse(sequence);
      EList<Type> _elements = model.getElements();
      Type _head = IterableExtensions.<Type>head(_elements);
      final Entity person = ((Entity) _head);
      EList<Type> _elements_1 = model.getElements();
      Type _last = IterableExtensions.<Type>last(_elements_1);
      final Entity employee = ((Entity) _last);
      boolean _isAbstract = person.isAbstract();
      Matcher<Boolean> _is = CoreMatchers.<Boolean>is(Boolean.valueOf(true));
      Assert.<Boolean>assertThat(Boolean.valueOf(_isAbstract), _is);
      Entity _superType = employee.getSuperType();
      Matcher<Entity> _is_1 = CoreMatchers.<Entity>is(person);
      Assert.<Entity>assertThat(_superType, _is_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void isValidEntityWithAttributes(final CharSequence sequence) {
    try {
      final Model model = this._parseHelper.parse(sequence);
      EList<Type> _elements = model.getElements();
      Iterable<Entity> _filter = Iterables.<Entity>filter(_elements, Entity.class);
      final Entity entity = IterableExtensions.<Entity>head(_filter);
      final EList<Attribute> attributes = entity.getAttributes();
      int _size = attributes.size();
      Matcher<Integer> _is = CoreMatchers.<Integer>is(Integer.valueOf(2));
      Assert.<Integer>assertThat(Integer.valueOf(_size), _is);
      EList<Type> _elements_1 = model.getElements();
      final Function1<Type,Boolean> _function = new Function1<Type,Boolean>() {
        public Boolean apply(final Type it) {
          String _name = it.getName();
          boolean _equals = Objects.equal(_name, "Date");
          return Boolean.valueOf(_equals);
        }
      };
      final Type dateType = IterableExtensions.<Type>findFirst(_elements_1, _function);
      EList<Type> _elements_2 = model.getElements();
      final Function1<Type,Boolean> _function_1 = new Function1<Type,Boolean>() {
        public Boolean apply(final Type it) {
          String _name = it.getName();
          boolean _equals = Objects.equal(_name, "String");
          return Boolean.valueOf(_equals);
        }
      };
      final Type stringType = IterableExtensions.<Type>findFirst(_elements_2, _function_1);
      final Attribute firstAttribute = IterableExtensions.<Attribute>head(attributes);
      String _name = firstAttribute.getName();
      Matcher<String> _is_1 = CoreMatchers.<String>is("name");
      Assert.<String>assertThat(_name, _is_1);
      Type _type = firstAttribute.getType();
      Matcher<Type> _is_2 = CoreMatchers.<Type>is(stringType);
      Assert.<Type>assertThat(_type, _is_2);
      final Attribute secondAttribute = IterableExtensions.<Attribute>last(attributes);
      String _name_1 = secondAttribute.getName();
      Matcher<String> _is_3 = CoreMatchers.<String>is("birthdate");
      Assert.<String>assertThat(_name_1, _is_3);
      Type _type_1 = secondAttribute.getType();
      Matcher<Type> _is_4 = CoreMatchers.<Type>is(dateType);
      Assert.<Type>assertThat(_type_1, _is_4);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void isValidEntityWithOneToManyRelationship(final CharSequence sequence) {
    try {
      final Model model = this._parseHelper.parse(sequence);
      EList<Type> _elements = model.getElements();
      Iterable<Entity> _filter = Iterables.<Entity>filter(_elements, Entity.class);
      final Entity person = IterableExtensions.<Entity>head(_filter);
      EList<Attribute> _attributes = person.getAttributes();
      final Attribute friends = IterableExtensions.<Attribute>head(_attributes);
      boolean _isMany = friends.isMany();
      Matcher<Boolean> _is = CoreMatchers.<Boolean>is(Boolean.valueOf(true));
      Assert.<Boolean>assertThat(Boolean.valueOf(_isMany), _is);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
