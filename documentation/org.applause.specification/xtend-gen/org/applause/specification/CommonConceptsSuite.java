package org.applause.specification;

import org.applause.specification.data.DataAccessLayerDSLSuite;
import org.applause.specification.ui.UserInterfaceDSLSuite;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Named("Common Concepts")
@Contains({ DataAccessLayerDSLSuite.class, UserInterfaceDSLSuite.class })
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class CommonConceptsSuite {
}
