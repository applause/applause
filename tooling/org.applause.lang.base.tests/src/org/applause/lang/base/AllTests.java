package org.applause.lang.base;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	NamespaceTests.class, 
	TypeTests.class, 
	org.applause.lang.base.importmanager.classbased.ImportManagerTest.class,
	org.applause.lang.base.importmanager.namespacebased.ImportManagerTest.class
	})
public class AllTests {

}
