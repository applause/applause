package org.applause.specification.ui;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import org.applause.lang.applauseDsl.ApplauseDslPackage;
import org.applause.lang.applauseDsl.DataSourceCall;
import org.applause.lang.applauseDsl.Model;
import org.applause.lang.applauseDsl.NamedElement;
import org.applause.lang.applauseDsl.Screen;
import org.applause.specification.data.ApplauseValidationTestHelper;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;

/**
 * This class provides extension methods we use in the `Screens.spec` specification. The reason for defining the
 * tests here is that we do not want to clutter Jnario's documentation output with the test code.
 */
@SuppressWarnings("all")
public class ScreensValidationTestHelper extends ApplauseValidationTestHelper {
  @Inject
  @Extension
  private ParseHelper<Model> _parseHelper;
  
  public void isValidScreen(final CharSequence sequence) {
    try {
      final Model model = this._parseHelper.parse(sequence);
      EList<NamedElement> _elements = model.getElements();
      NamedElement _head = IterableExtensions.<NamedElement>head(_elements);
      final Screen screen = ((Screen) _head);
      String _name = screen.getName();
      Assert.assertNotNull(_name);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void hasDuplicateScreen(final CharSequence sequence) {
    try {
      Model _parse = this._parseHelper.parse(sequence);
      EClass _screen = ApplauseDslPackage.eINSTANCE.getScreen();
      this.assertError(_parse, _screen, null, "Duplicate NamedElement \'PersonList\'");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void hasTitle(final CharSequence sequence, final String expectedTitle) {
    try {
      final Model model = this._parseHelper.parse(sequence);
      EList<NamedElement> _elements = model.getElements();
      NamedElement _head = IterableExtensions.<NamedElement>head(_elements);
      final Screen screen = ((Screen) _head);
      String _title = screen.getTitle();
      Assert.assertNotNull(_title);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void hasDataSource(final CharSequence sequence) {
    try {
      final Model model = this._parseHelper.parse(sequence);
      EList<NamedElement> _elements = model.getElements();
      Iterable<Screen> _filter = Iterables.<Screen>filter(_elements, Screen.class);
      final Screen screen = IterableExtensions.<Screen>head(_filter);
      DataSourceCall _datasource = screen.getDatasource();
      Assert.assertNotNull(_datasource);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
