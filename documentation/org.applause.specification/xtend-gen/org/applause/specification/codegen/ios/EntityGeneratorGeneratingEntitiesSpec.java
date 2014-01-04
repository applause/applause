package org.applause.specification.codegen.ios;

import org.applause.specification.codegen.ios.EntityGeneratorGeneratingEntitiesAbstractEntitiesSpec;
import org.applause.specification.codegen.ios.EntityGeneratorGeneratingEntitiesEntityInheritanceSpec;
import org.applause.specification.codegen.ios.EntityGeneratorGeneratingEntitiesSimpleEntitiesSpec;
import org.applause.specification.codegen.ios.EntityGeneratorSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains({ EntityGeneratorGeneratingEntitiesSimpleEntitiesSpec.class, EntityGeneratorGeneratingEntitiesAbstractEntitiesSpec.class, EntityGeneratorGeneratingEntitiesEntityInheritanceSpec.class })
@Named("Generating Entities")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class EntityGeneratorGeneratingEntitiesSpec extends EntityGeneratorSpec {
}
