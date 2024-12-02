package Project;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductSorter {
    // Sort products by price (ascending)
    public static List<Product> sortByPriceAscending(List<Product> products) {
        return products.stream()
                       .sorted(Comparator.comparingDouble(Product::getPrice))
                       .collect(Collectors.toList()); // Corrected `toList()`
    }

    // Sort products by price (descending)
    public static List<Product> sortByPriceDescending(List<Product> products) {
        return products.stream()
                       .sorted(Comparator.comparingDouble(Product::getPrice).reversed())
                       .collect(Collectors.toList()); // Corrected `toList()`
    }
}

