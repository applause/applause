package org.applause.specification.data;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import org.applause.lang.applauseDsl.ApplauseDslPackage;
import org.applause.lang.applauseDsl.DataType;
import org.applause.lang.applauseDsl.Model;
import org.applause.lang.applauseDsl.NamedElement;
import org.applause.lang.applauseDsl.Platform;
import org.applause.lang.applauseDsl.PlatformMapping;
import org.applause.lang.applauseDsl.TypeMapping;
import org.applause.specification.data.ApplauseValidationTestHelper;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.junit.Assert;

/**
 * This class provides extension methods we use in the `ScalarDataTypes.spec` specification. The reason for
 * defining the tests here is that we do not want to clutter Jnario's documentation output with the test code.
 */
@SuppressWarnings("all")
public class ScalarDataTypesValidationTestHelper extends ApplauseValidationTestHelper {
  @Inject
  @Extension
  private ParseHelper<Model> _parseHelper;
  
  public void hasDuplicateDatatype(final CharSequence sequence) {
    try {
      Model _parse = this._parseHelper.parse(sequence);
      EClass _dataType = ApplauseDslPackage.eINSTANCE.getDataType();
      this.assertError(_parse, _dataType, null, "Duplicate NamedElement \'String\'");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void hasPlatform(final CharSequence sequence, final String platformName) {
    try {
      final Model model = this._parseHelper.parse(sequence);
      EList<NamedElement> _elements = model.getElements();
      final NamedElement platform = IterableExtensions.<NamedElement>head(_elements);
      String _name = platform.getName();
      Matcher<String> _is = CoreMatchers.<String>is(platformName);
      Assert.<String>assertThat(_name, _is);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void hasPlatformTypeMapping(final CharSequence sequence, final String typeName, final String mappedName) {
    try {
      final Model model = this._parseHelper.parse(sequence);
      EList<NamedElement> _elements = model.getElements();
      Iterable<Platform> _filter = Iterables.<Platform>filter(_elements, Platform.class);
      final Platform platform = IterableExtensions.<Platform>head(_filter);
      EList<PlatformMapping> _mappings = platform.getMappings();
      PlatformMapping _head = IterableExtensions.<PlatformMapping>head(_mappings);
      final TypeMapping platformMapping = ((TypeMapping) _head);
      DataType _type = platformMapping.getType();
      String _name = _type.getName();
      Matcher<String> _is = CoreMatchers.<String>is("String");
      Assert.<String>assertThat(_name, _is);
      String _simpleName = platformMapping.getSimpleName();
      Matcher<String> _is_1 = CoreMatchers.<String>is("NSString");
      Assert.<String>assertThat(_simpleName, _is_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
