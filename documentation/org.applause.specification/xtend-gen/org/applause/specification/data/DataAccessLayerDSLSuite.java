package org.applause.specification.data;

import org.applause.specification.data.DescribingDataAccessSuite;
import org.applause.specification.data.DescribingDataSuite;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Named("Data Access Layer DSL")
@Contains({ DescribingDataSuite.class, DescribingDataAccessSuite.class })
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class DataAccessLayerDSLSuite {
}
