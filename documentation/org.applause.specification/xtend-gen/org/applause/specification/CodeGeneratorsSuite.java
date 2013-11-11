package org.applause.specification;

import org.applause.specification.codegen.ios.IOSCodeGeneratorSuite;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Named("Code Generators")
@Contains(IOSCodeGeneratorSuite.class)
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class CodeGeneratorsSuite {
}
