# COMP 1502 - Special Lab Exam 1 

You have **45 minutes** to complete this exam.

You are free to use any resources you want, _with the exception of any other person, online or otherwise_.

The rubric for this quiz is provided at the bottom of this document.

## Requirements

A  mini super store requires a software to keep track of items available in the store and the invoice for a customer who is buying a 
list of items from the store.
To manage this you'll have to make a class to define information about a mini super store `Customer` and to allow them to buy 
different items and produce the invoice for the customer. 
Additionally we would like to have a report of all the types of items a customer has bought.

You need to write tests to show that your list of different item types and the invoice for each customer is correct.

### Example

Here's an example of the use of a Mini Super Store:

```java
	Item anitem = new Item("Milk","Dairy",5.45);
  Item anitem = new Item("Carrot","Produce",1.45);
	//Invoice i1 = new Book("A First Book", "100", aA);
	Customer c1 = new Customer("Alen", 1001);
	
	c1.addItemtoCart(anitem);
	
	System.out.println(c1.printInvoice());
	// lists "Milk"----->5.45
            "Carrot"---->1.45
            Total:------->6.90
  
	System.out.println(c1.authorString());
	// lists "A. Author"
	
	c1.returnBook(b1);
	System.out.println(c1.borrowedBookString());
	// lists nothing
	System.out.println(c1.authorString());
	// lists nothing
	
	

```

### Hints

- Focus on the requirements of the data structures first and then on the algorithms to manage the items and categories.
- You still have not been provided with a Llama class, don't panic.
- You *have* been provided with a main class, which provides some helpful functions.
- Remember to check the test code to see what names are appropriate for the methods below.

### Details

* The `Author` class needs to only hold the author name. It should have:
   * A constructor which takes the name as a string.
   * An appropriately named getter 
   
* The `Item` class needs to track the item name, category (like: dairy,produce etc.), unit price and an itemcode. This class needs:
   * A constructor which takes the itemcode (int), name (String), category (Category) and unitprice.
   * Appropriately named getters for all.
   
* The borrower class needs a name and and id as well as a list of books the borrower has borrowed. The class needs:
   * A constructor which takes the borrower's name and id. It should also initialize the list of books to be empty. 
   *  Appropriately named getters for each of these
   * A method called borrowBook, which takes a book and adds it to the borrower's list.
   * A method called returnBook, which takes a book and removes it from the borrower's list.
   * A method called getBooks, which returns the list of books the borrower currently has borrowed.
   * A method called getAuthors, which returns a list of authors of the books the borrower currently has borrowed.
   *A method called borrowedBookString, which returns a string with the borrower's name on one line and then each book they have borrowed one-per-line on the lines that follow.
   *A method called borrowedAuthorString, which returns a string with the borrower's name on one line and then each author they have borrowed one-per-line on the lines that follow.
   
   
### Tests

Tests have been provided for many methods, but you need to add tests to see that the getBooks() and getAuthors() methods of `Borrower` are implemented correctly.

### NOTES

- remember to save and commit often and keep an eye on your tests and warnings
- you can use the Main provided to see if your code is behaving reasonably, or you can just rely on the automated tests. Or both.
- you can choose to drag and drop these files into an eclipse project or to connect this to your eclipse as we have in tutorial.

---

## Rubric

**NOTE!: This is a practice lab exam, so no formal grade will be given (just a participation grade), but marks for the full lab exams will be given as below.**

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

