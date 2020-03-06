
package spLabExam;

import java.util.ArrayList;

public class Customer {
	
	private String name;
	private int id;
	private ArrayList<Item> cart;
	
	public Customer(String name, int id) {
		this.name = name;
		this.id = id;
		this.cart = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public ArrayList<Item> getcart() {
		return cart;
	}
	
	public void addItem(Item bItem) {
		this.cart.add(bItem);
	}
	
	public void removeItem(Item item) {
		this.cart.remove(item);
	}
	
	public ArrayList<Category> getCategorys() {
		ArrayList<Category> Categorys = 
				new ArrayList<>();
		
		for (Item b : cart) {
			if (!Categorys.contains(b.getCategory())) {
				Categorys.add(b.getCategory());
			}
		}
		
		return Categorys;
	}
	
	public String getInvoice1() {
		StringBuilder builder = new StringBuilder();
		double total=0.0;
		builder.append(this.name).append("\n");
		for (Item b : cart) {
			builder.append("\t")
			.append(b.getName())
			.append("\t\t")
			.append(b.getUnitprice())
			.append("\n");
			total+=b.getUnitprice();
		}
		builder.append("Total= "+total)
		.append("\n");
		return builder.toString();
	}
	
	public String boughtCategoryString() {
		StringBuilder builder = new StringBuilder();
		ArrayList<Category> Categorys = 
				this.getCategorys();
		builder.append(this.name).append("\n");
		for (Category a : Categorys) {
			builder.append("\t")
			.append(a.getName())
			.append("\n");
		}
		return builder.toString();
	}
			

	
	public String getInvoice() {
		StringBuilder builder = new StringBuilder();
		double total=0.0;
		//builder.append(this.name).append("\n");
		ArrayList<Category> Categorys = 
				this.getCategorys();
		builder.append("The invoice for "+this.name).append("\n");
		for (Category a : Categorys) {
			builder.append("\t")
			.append(a.getName()+"\n");
			for (Item b : cart) {
				
				
				if(b.getCategory().equals(a)) {
				builder.append("\t\t")
				.append(b.getName())
				.append("\t\t")
				.append(b.getUnitprice())
				.append("\n");
				total+=b.getUnitprice();
				}
			}
		}
		builder.append("Total= "+total)
		.append("\n");
		return builder.toString();
	}
	
	
	
	

}
