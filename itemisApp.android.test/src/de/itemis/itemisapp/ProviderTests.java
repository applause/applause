package de.itemis.itemisapp;

import java.util.List;

import junit.framework.TestCase;

public class ProviderTests extends TestCase {

	public void testBlogPosts() throws Exception {
		BlogpostsProvider p = ProviderFactory.getBlogpostsProvider();
		List<BlogItem> items = p.getAllItems();
		assertNotNull(items);
		assertFalse(items.isEmpty());
		System.out.println(items.size());
	}
	
	public void testVortragItems() throws Exception {
		AllVortragItemsProvider p = ProviderFactory.getAllVortragItemsProvider();
		List<Vortrag> items = p.getAllItems();
		assertNotNull(items);
		assertFalse(items.isEmpty());
		System.out.println(items.size());
	}
	
	public void testSprecherItems() throws Exception {
		AllSprecherItemsProvider p = ProviderFactory.getAllSprecherItemsProvider();
		List<Sprecher> items = p.getAllItems();
		assertNotNull(items);
		assertFalse(items.isEmpty());
		System.out.println(items.size());
	}
	
	public void testSprecherByName() throws Exception {
		SprecherByNameProvider p = ProviderFactory.getSprecherByNameProvider("Heiko Behrens");
		Sprecher item = p.getItem();
		assertNotNull(item);
		System.out.println(item);
	}
}
