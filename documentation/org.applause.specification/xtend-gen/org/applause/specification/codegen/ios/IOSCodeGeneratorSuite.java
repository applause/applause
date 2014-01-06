package org.applause.specification.codegen.ios;

import org.applause.specification.codegen.ios.DataSuite;
import org.applause.specification.codegen.ios.SupportFilesSuite;
import org.applause.specification.codegen.ios.UISuite;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Named("iOS Code Generator")
@Contains({ DataSuite.class, UISuite.class, SupportFilesSuite.class })
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class IOSCodeGeneratorSuite {
}
