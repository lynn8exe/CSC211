package Project;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create an Admin and Add Products to Inventory
        Admin admin = new Admin("admin1", "admin@example.com");
        admin.addProduct(new Electronics("Laptop", 999.99, "TechBrand", "1 year"));
        admin.addProduct(new Clothing("Jeans", 49.99, "M", "Denim"));
        admin.addProduct(new Grocery("Apples", 5.99, "12/15/2024"));
        admin.addProduct(new Electronics("Smartphone", 499.99, "PhoneBrand", "2 years"));

        // Display the Admin's Inventory
        System.out.println("\nAdmin Inventory:");
        List<Product> inventory = admin.viewInventory();
        inventory.forEach(System.out::println);

        // Step 2: Create a Customer and Add Products to Their Cart
        Customer customer = new Customer("customer1", "customer@example.com");
        customer.addToCart(new Electronics("Laptop", 999.99, "TechBrand", "1 year"));
        customer.addToCart(new Grocery("Apples", 5.99, "12/15/2024"));

        // Display the Customer's Cart
        System.out.println("\nCustomer Cart:");
        customer.viewCart().forEach(System.out::println);

        // Step 3: Process an Order for the Customer
        Order order = new Order(customer);

        // Display the Order Summary
        System.out.println("\nOrder Summary:");
        System.out.println(order.getOrderSummary());

        // Step 4: Apply Discounts to Inventory
        System.out.println("\nApplying a 10% Discount to All Products:");
        DiscountManager.applyDiscount(inventory, 10);

        // Display the Inventory After Discount
        System.out.println("\nInventory After Discounts:");
        inventory.forEach(System.out::println);

        // Step 5: Filter and Sort Inventory
        System.out.println("\nFiltered Electronics:");
        
        List<Product> filteredElectronics = ProductFilter.filterByCategory(inventory, "Electronics");
        filteredElectronics.forEach(System.out::println);
        
        System.out.println("\nProducts Sorted by Price (Ascending):");
        
        List<Product> sortedAscending = ProductSorter.sortByPriceAscending(inventory);
        sortedAscending.forEach(System.out::println);
        
        System.out.println("\nProducts Sorted by Price (Descending):");
        List<Product> sortedDescending = ProductSorter.sortByPriceDescending(inventory);
        sortedDescending.forEach(System.out::println);

        
        
        // Step 6: Search for Products
        System.out.println("\nSearch Results for 'Lap':");
        List<Product> searchResults = ProductSearch.searchByName(inventory, "Lap");
        searchResults.forEach(System.out::println);
    }
}
