package org.applause.specification.data;

import org.applause.specification.data.EntitiesSpec;
import org.applause.specification.data.ScalarDataTypesSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Named("Describing Data")
@Contains({ EntitiesSpec.class, ScalarDataTypesSpec.class })
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class DescribingDataSuite {
}
