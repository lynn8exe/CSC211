package Project;

import java.util.List;
import java.util.function.Function;

public class Order {
    private Customer customer;
    private List<Product> products;
    private static final double TAX_RATE = 0.08; // 8% tax rate
    private static final double SHIPPING_FEE = 5.0; // Flat shipping fee

    // Constructor
    public Order(Customer customer) {
        this.customer = customer;
        this.products = customer.viewCart(); // Fetch products from the customer's cart
    }

    // Lambda to calculate subtotal
    private Function<List<Product>, Double> calculateSubtotal = 
        productList -> productList.stream().mapToDouble(Product::getPrice).sum();

    // Lambda to calculate tax
    private Function<Double, Double> calculateTax = 
        subtotal -> subtotal * TAX_RATE;

    // Calculate total
    public double calculateTotal() {
        double subtotal = calculateSubtotal.apply(products);
        double tax = calculateTax.apply(subtotal);
        return subtotal + tax + SHIPPING_FEE;
    }

    // Generate an order summary
    public String getOrderSummary() {
        StringBuilder summary = new StringBuilder("Order Summary:\n");
        for (Product product : products) {
            summary.append(product).append("\n");
        }
        double subtotal = calculateSubtotal.apply(products);
        double tax = calculateTax.apply(subtotal);
        summary.append(String.format("Subtotal: $%.2f\n", subtotal));
        summary.append(String.format("Tax: $%.2f\n", tax));
        summary.append(String.format("Shipping Fee: $%.2f\n", SHIPPING_FEE));
        summary.append(String.format("Total: $%.2f\n", subtotal + tax + SHIPPING_FEE));
        return summary.toString();
    }
}
