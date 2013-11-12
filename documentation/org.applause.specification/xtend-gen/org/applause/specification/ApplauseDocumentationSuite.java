package org.applause.specification;

import org.applause.specification.CodeGeneratorsSuite;
import org.applause.specification.CommonConceptsSuite;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Named("Applause Documentation")
@Contains({ CommonConceptsSuite.class, CodeGeneratorsSuite.class })
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class ApplauseDocumentationSuite {
}
