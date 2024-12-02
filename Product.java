package Project;

//Base Product class
public class Product {
 private String name;
 private double price;
 private String category;

 // Constructor
 public Product(String name, double price, String category) {
     this.name = name;
     this.price = price;
     this.category = category;
 }

 // Getters
 public String getName() {
     return name;
 }

 public double getPrice() {
     return price;
 }

 public String getCategory() {
     return category;
 }

 // String representation of the product
 @Override
 public String toString() {
     return name + " - $" + String.format("%.2f", price) + " (" + category + ")";
 }
}
