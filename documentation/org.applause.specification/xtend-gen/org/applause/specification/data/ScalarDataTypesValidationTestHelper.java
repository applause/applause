package org.applause.specification.data;

import com.google.inject.Inject;
import org.applause.lang.applauseDsl.ApplauseDslPackage;
import org.applause.lang.applauseDsl.Model;
import org.applause.specification.data.ApplauseValidationTestHelper;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;

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
      this.assertError(_parse, _dataType, null, "Duplicate Type \'String\'");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
