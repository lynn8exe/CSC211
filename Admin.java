package Project;

import java.util.ArrayList;
import java.util.List;

public class Admin extends User {
	
	private List<Product> inventory; 
	
	// Constructor
	public Admin(String username, String email) {
		
	    super(username, email);
	    this.inventory = new ArrayList<>();
	}
	
	// Add product
	public void addProduct(Product product) {
		
	    inventory.add(product);
	    System.out.println(product.getName() + " added to inventory.");
	}
	
	// View inventory
	public List<Product> viewInventory() {
		
	    return inventory;
	}
	
	@Override
	public String toString() {
		
	    return super.toString() + " [Admin]";
	}
}
