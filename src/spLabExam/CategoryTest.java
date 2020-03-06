
package spLabExam;

import static org.junit.Assert.*;

import org.junit.Test;

public class CategoryTest {

	@Test
	public void testCategoryConstructor() {
		String aName = "NameName NameName";
		Category category = new Category(aName);
		assertEquals("Creating new Category", aName, category.getName());
	}

}
