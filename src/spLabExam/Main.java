
package spLabExam;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Category aA = new Category("Dairy");
		Category aB = new Category("Produced");
		Category aC = new Category("Pharmacy");
		Category aD = new Category("Electronics");
		
		Item b1 = new Item("Milk", "100", aA,10);
		Item b2 = new Item("Cheese", "101", aA, 11);
		Item b3 = new Item("Butter", "102", aA, 12);
		Item b4 = new Item("Carrot", "200", aB,1.2);
		Item b5 = new Item("Spinach", "201", aB, 2.3);
		Item b6 = new Item("Latuce", "202", aB, 4.5);
		Item b7 = new Item("Bodywash", "300", aC, 6.1);
		Item b8 = new Item("Soap", "301", aC, 3.3);
		Item b9 = new Item("Toothpaste", "302", aC, 4.4);
		Item b10 = new Item("Phone", "400", aD, 100);
		Item b11 = new Item("Computer", "401", aD,200);
		
		Customer c1 = new Customer("Alice", 1001);
		Customer c2 = new Customer("Bob", 1002);
		Customer c3 = new Customer("Carol", 1003);
		Customer c4 = new Customer("Dave", 1004);
		
		c1.addItem(b1);
		c1.addItem(b2);
		c1.addItem(b3);
		
		c2.addItem(b1);
		c2.addItem(b4);
		c2.addItem(b7);
		c2.addItem(b10);
		
		c3.addItem(b7);
		c3.addItem(b10);
		c3.addItem(b11);
		
		c4.addItem(b1);
		c4.addItem(b2);
		c4.addItem(b3);
		c4.addItem(b4);
		c4.addItem(b5);
		c4.addItem(b6);
		c4.addItem(b7);
		c4.addItem(b8);
		c4.addItem(b9);
		c4.addItem(b10);
		c4.addItem(b11);
		
		System.out.println(c1.getInvoice());
		System.out.println(c1.boughtCategoryString());
		
		System.out.println(c2.getInvoice());
		System.out.println(c2.boughtCategoryString());
		
		System.out.println(c3.getInvoice());
		System.out.println(c3.boughtCategoryString());
		
		System.out.println(c4.getInvoice());
		System.out.println(c4.boughtCategoryString());
		
	}
	
	

}
