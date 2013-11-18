package org.applause.specification.codegen.ios;

import org.applause.specification.codegen.ios.APIClientGeneratorSpec;
import org.applause.specification.codegen.ios.EntityDataAccessGeneratorSpec;
import org.applause.specification.codegen.ios.EntityDataMappingGeneratorSpec;
import org.applause.specification.codegen.ios.EntityGeneratorSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Named("Data")
@Contains({ APIClientGeneratorSpec.class, EntityDataAccessGeneratorSpec.class, EntityDataMappingGeneratorSpec.class, EntityGeneratorSpec.class })
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class DataSuite {
}
