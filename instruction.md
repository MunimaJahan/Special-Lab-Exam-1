# COMP 1502 - Special Lab Exam 1 

You have **45 minutes** to complete this exam.

You are free to use any resources you want, _with the exception of any other person, online or otherwise_.

The rubric for this quiz is provided at the bottom of this document.

## Requirements

A  mini super store requires a software to keep track of items available in the store and the invoice for a customer who is buying a 
list of items from the store.
To manage this you'll have to make a program that keeps information about the `Customer` and to allow them to buy 
different items from the store and prepare the invoice for the customer. 
Additionally we would like to have a report of all the types of items a customer has bought.

You need to write tests to show that your list of different categries for items and the invoice for each customer is correct.

### Example

Here's an example of the use of the Mini Super Store:

```java
	
package spLabExam;

public class displayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Category aA = new Category("Dairy");
		Category aB = new Category("Produced");
		
		Item b1 = new Item("Milk", "100", aA,10);
		Item b2 = new Item("Cheese", "101", aA, 11);
		Item b3 = new Item("Butter", "102", aA, 12);
		Item b4 = new Item("Carrot", "200", aB,1.2);
		Item b5 = new Item("Spinach", "201", aB, 2.3);
		
		
		Customer c1 = new Customer("Alice", 1001);
		Customer c2 = new Customer("Bob", 1002);
		
		c1.addItem(b1);
		c1.addItem(b2);
		c1.addItem(b3);
		
		c2.addItem(b1);
		c2.addItem(b4);
		
		c1.removeItem(b1);
		c1.addItem(b5);
		
		System.out.println(c1.getInvoice());
				
		System.out.println(c1.boughtCategoryString());
		
		System.out.println(c2.getInvoice());
		System.out.println(c2.boughtCategoryString());
		
	
	}
	
	
}
//May generate an ouput like this
The invoice for Alice
	Dairy
		Cheese		11.0
		Butter		12.0
	Produced
		Spinach		2.3
Total= 25.3

Alice
	Dairy
	Produced

The invoice for Bob
	Dairy
		Milk		10.0
	Produced
		Carrot		1.2
Total= 11.2

Bob
	Dairy
	Produced

	

```

### Hints

- Focus on the requirements of the data structures first and then on the algorithms to manage the cart and invoice.
- You *have* been provided with a main class, which provides some helpful functions.
- Remember to check the test code to see what names are appropriate for the methods below.

### Details

* The `Category` class needs to only hold the category name. It should have:
   * A constructor which takes the name as a string.
   * An appropriately named getter 
   
* The `Item` class needs to track the item name, category (like: dairy, produced etc.), unit price and an itemcode. This class needs:
   * A constructor which takes the name (String), itemcode (String), category (Category) and unitprice (double) in this given order.
   * Appropriately named getters for all.
   
* The `Customer` class needs a *name*, *id* and a *cart* that stores the list of items the customer is going to buy. The class needs:
   * A constructor which takes the customer's name (String) and id (int). It should also initialize the cart to be empty. 
   * Appropriately named getters for each of the variable.
   * A method called addItem, which takes an item and adds it to the customers's cart.
   * A method called returnItem, which takes an item and removes it from the customer's cart.
   * A method called getCategories, which returns the list of categories of items the customer currently has in the cart.
   * A method called getItems, which returns a list of items the customer currently has in the cart.
   * A method called getInvoice, which returns a string with the customer's name and the list of items in the cart with their price under each category in a format like this:
The invoice for <customer name>
	<category 1>
		<item 1>	<price 1>
		<item 2>	<price 2>
	Total =<total price> [as you can also see from the sample output at the begining]
   * A method called boughtCategoryString, which returns a string with the customer's name on one line and then each category they have bought one-per-line on the lines that follow.
   
   
### Tests

Tests have been provided for many methods, but you need to add tests to see that the getInvoice() and getCategories() methods of `Customer` are implemented correctly.

### NOTES

- remember to save and commit often and keep an eye on your tests and warnings
- you can use the Main provided to see if your code is behaving reasonably, or you can just rely on the automated tests. Or both.
- you can choose to drag and drop these files into an eclipse project or to connect this to your eclipse as we have in tutorial.

---

## Rubric

### Grade: A range

- compiles
- all methods behave as expected
- follows all naming conventions (maybe with 1 or 2 minor slips)
- code is easy to read and understand because it is formatted nicely, everything is named expressively, and constants are used when appropriate
- Tests have been added and correctly test the behaviour of the classes.


### Grade: B range

- this is like an A range, with more slips in convention, or perhaps is noticeably (but not significantly) harder to read/understand because of formatting/naming issues
- a lab exam might also be graded as a B if the testing is insufficient, even if the solution would normally be graded as an A. 

### Grade: C range

- doesn't compile, but the instructor can tell that the methods present would work correctly, if not for some minor syntax issue; otherwise, everything else is at a B range
- you will also get a C range if the code compiles and behaves as expected, but frequent slips in convention/formatting/naming make the code confusing and hard to follow

### Grade: D

- like a C range, but the instructor can see that numerous methods are incomplete or off-base

### Grade: F

- no attempt, or the code present is wildly incorrect

