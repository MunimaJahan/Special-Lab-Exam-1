
package spLabExam;

public class Item {
	
	private String name;
	private String itemcode;
	private Category category;
	private double unitprice;
	
	public Item(String name, 
			String icode, 
			Category category,double uprice) {
		this.name = name;
		this.itemcode = icode;
		this.category = category;
		this.unitprice=uprice;
	}
	
	public String getName() {
		return name;
	}
	
	public String getItemCode() {
		return itemcode;
	}
	
	public Category getCategory() {
		return category;
	}
	
	public double getUnitprice() {
		return unitprice;
	}
	

}
