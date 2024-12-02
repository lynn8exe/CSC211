package Project;

import java.util.List;

public class DiscountManager {
	
    public static void applyDiscount(List<Product> products, double discountPercentage) {
    	
        products.forEach(product -> {
        	
            double discountedPrice = product.getPrice() * (1 - discountPercentage / 100);
            System.out.println("Applying " + discountPercentage + "% discount to " + product.getName());
            
            //setter
            product.setPrice(discountedPrice);
        });
    }
}
