package org.applause.specification.data;

import com.google.inject.Inject;
import org.applause.lang.applauseDsl.Model;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class ApplauseValidationTestHelper extends ValidationTestHelper {
  @Inject
  @Extension
  private ParseHelper<Model> _parseHelper;
  
  public Model isValid(final CharSequence sequence) {
    try {
      Model _xblockexpression = null;
      {
        final Model model = this._parseHelper.parse(sequence);
        this.assertNoErrors(model);
        _xblockexpression = (model);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
