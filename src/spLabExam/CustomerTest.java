
package spLabExam;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class CustomerTest {

	@Test
	public void testCustomerConstuctor() {
		String name = "Name Name NameName";
		int id = 4050;
		Customer b = new Customer(name, id);
		assertEquals("Creating new Customer", name, b.getName());
		assertEquals("Creating new Customer", id, b.getId());
		assertTrue("Creating new Customer", b.getcart().isEmpty());
		assertTrue("Creating new Customer", b.getCategorys().isEmpty());
	}
	
	@Test
	public void testaddItem() {
		String name = "Name Name NameName";
		int id = 4050;
		Customer b = new Customer(name, id);
		
		String itemname = "Item Item Item";
		String itemcode = "10001";
		Category category = new Category("Name NameName");
		Item item = new Item(itemname, itemcode, category, 1.1);
		ArrayList<Item> expectedItems = new ArrayList<Item>();
		expectedItems.add(item);
		
		b.addItem(item);
		
		assertEquals(expectedItems, b.getcart());
		
		
	}

	@Test
	public void testReturnItem() {
		String name = "Name Name NameName";
		int id = 4050;
		Customer b = new Customer(name, id);
		
		String itemname = "Item Item Item";
		String itemcode = "10001";
		Category category = new Category("Name NameName");
		Item Item = new Item(itemname, itemcode, category,1.1);
		
		
		String itemname1 = "Item Item";
		String itemcode2 = "10002";
		Item Item2 = new Item(itemname1, itemcode2, category,1.1);
		
		b.addItem(Item);
		b.addItem(Item2);
		b.removeItem(Item);
		
		ArrayList<Item> expectedItems = new ArrayList<Item>();
		// after borrowing and returning Item Item2 should be the only
		// one left
		expectedItems.add(Item2);
		
		
		assertEquals(expectedItems, b.getcart());
	}
	
	@Test
	public void testgetCategory() {
		String name = "Name Name NameName";
		int id = 4050;
		Customer b = new Customer(name, id);
		
		String itemname = "Item Item Item";
		String itemcode = "10001";
		Category category = new Category("Name NameName");
		Item Item = new Item(itemname, itemcode, category,1.1);
				
		String itemname2 = "Item Item";
		String itemcode2 = "10002";
		Item Item2 = new Item(itemname2, itemcode2, category,2.2);

		String itemname3 = "Item ";
		String itemcode3 = "10003";
		Category category2 = new Category ("Namish Name");
		Item Item3 = new Item(itemname3, itemcode3, category2, 3.3);
		
		b.addItem(Item);
		b.addItem(Item2);
		b.addItem(Item3);
		
		ArrayList<Category> expectedCategorys = 
				new ArrayList<>();
		expectedCategorys.add(category);
		expectedCategorys.add(category2);
		
		assertEquals(expectedCategorys, b.getCategorys());
		
		
	}
	
	@Test
	public void testgetInvoice() {
	
	}
	
}
