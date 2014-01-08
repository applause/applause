package org.applause.specification.ui;

import org.applause.specification.ui.DescribingDataBindingSuite;
import org.applause.specification.ui.DescribingUIComponentsAndScreensSuite;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Named("User Interface DSL")
@Contains({ DescribingUIComponentsAndScreensSuite.class, DescribingDataBindingSuite.class })
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class UserInterfaceDSLSuite {
}
