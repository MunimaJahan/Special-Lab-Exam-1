
package spLabExam;

import static org.junit.Assert.*;

import org.junit.Test;

public class ItemTest {

	@Test
	public void testItemConstructor() {
		String title = "Item Item Item";
		String isbn = "10001";
		Category category = new Category("Name NameName");
		Item item = new Item(title, isbn, category,2.3);
		assertEquals("Creating new Item", title, item.getName());
		assertEquals("Creating new Item", isbn, item.getItemCode());
		assertEquals("Creating new Item", category, item.getCategory());
		assertEquals("Creating new Item", 2.3, item.getUnitprice(),0.000001);
	}

}
