package org.applause.specification.data;

import com.google.inject.Inject;
import org.applause.specification.ApplauseDslInjectorProvider;
import org.applause.specification.ApplauseDslTestCreator;
import org.applause.specification.data.EntitiesDefiningEntitiesSpec;
import org.applause.specification.data.EntitiesValidationTestHelper;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

/**
 * Entities represent the data we deal with. At their core, they are a similar to POJOs
 * or plain C# classes, but with a very stripped-down syntax, which makes for great
 * readability and allows us to write very efficient code generators.
 */
@Contains(EntitiesDefiningEntitiesSpec.class)
@Named("Entities")
@RunWith(ExampleGroupRunner.class)
@InjectWith(ApplauseDslInjectorProvider.class)
@CreateWith(ApplauseDslTestCreator.class)
@SuppressWarnings("all")
public class EntitiesSpec {
  @Inject
  @Extension
  @org.jnario.runner.Extension
  public EntitiesValidationTestHelper _entitiesValidationTestHelper;
}
