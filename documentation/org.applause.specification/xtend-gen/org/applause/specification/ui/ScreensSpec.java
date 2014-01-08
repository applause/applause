package org.applause.specification.ui;

import com.google.inject.Inject;
import org.applause.specification.ApplauseDslInjectorProvider;
import org.applause.specification.ApplauseDslTestCreator;
import org.applause.specification.ui.ScreensDefiningScreensSpec;
import org.applause.specification.ui.ScreensValidationTestHelper;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

/**
 * Screens represent a full screen UI in Applause.
 */
@Contains(ScreensDefiningScreensSpec.class)
@Named("Screens")
@RunWith(ExampleGroupRunner.class)
@InjectWith(ApplauseDslInjectorProvider.class)
@CreateWith(ApplauseDslTestCreator.class)
@SuppressWarnings("all")
public class ScreensSpec {
  @Inject
  @Extension
  @org.jnario.runner.Extension
  public ScreensValidationTestHelper _screensValidationTestHelper;
}
