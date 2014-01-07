package org.applause.specification.data;

import com.google.inject.Inject;
import org.applause.lang.applauseDsl.Model;
import org.applause.lang.generator.ios.dataaccess.RESTURLExtensions;
import org.applause.specification.ApplauseDslInjectorProvider;
import org.applause.specification.ApplauseDslTestCreator;
import org.applause.specification.data.RESTURLsAbsoluteRESTURLsSpec;
import org.applause.specification.data.RESTURLsRelativeRESTURLsSpec;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains({ RESTURLsAbsoluteRESTURLsSpec.class, RESTURLsRelativeRESTURLsSpec.class })
@Named("REST URLs")
@RunWith(ExampleGroupRunner.class)
@InjectWith(ApplauseDslInjectorProvider.class)
@CreateWith(ApplauseDslTestCreator.class)
@SuppressWarnings("all")
public class RESTURLsSpec {
  @Inject
  @Extension
  @org.jnario.runner.Extension
  public ParseHelper<Model> _parseHelper;
  
  @Inject
  @Extension
  @org.jnario.runner.Extension
  public RESTURLExtensions _rESTURLExtensions;
}
