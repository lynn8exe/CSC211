package Project;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
	
    private List<Product> cart;

    // Constructor
    public Customer(String username, String email) {
    	
        super(username, email);
        this.cart = new ArrayList<>();
    }

    // Add product
    public void addToCart(Product product) {
    	
        cart.add(product);
        System.out.println(product.getName() + " added to cart.");
    }

    // View cart
    public List<Product> viewCart() {
    	
        return cart;
    }

    @Override
    public String toString() {
    	
        return super.toString() + " [Customer]";
    }
}
