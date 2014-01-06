package org.applause.specification.codegen.ios;

import org.applause.specification.codegen.ios.MainClassGeneratorSpec;
import org.applause.specification.codegen.ios.PlistGeneratorSpec;
import org.applause.specification.codegen.ios.PrecompiledHeaderGeneratorSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Named("Support Files")
@Contains({ MainClassGeneratorSpec.class, PlistGeneratorSpec.class, PrecompiledHeaderGeneratorSpec.class })
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class SupportFilesSuite {
}
