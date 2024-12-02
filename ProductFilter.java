package Project;

import java.util.List;
import java.util.stream.Collectors;

public class ProductFilter {
    // Filter products by category
    public static List<Product> filterByCategory(List<Product> products, String category) {
    	
        return products.stream()
        		
                       .filter(product -> product.getCategory().equalsIgnoreCase(category))
                       .collect(Collectors.toList());
    }
}

