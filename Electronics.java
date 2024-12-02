package Project;

public class Electronics extends Product {
 private String brand;
 private String warranty;

 public Electronics(String name, double price, String brand, String warranty) {
     super(name, price, "Electronics"); // Call the parent class constructor
     this.brand = brand;
     this.warranty = warranty;
 }

 public String getBrand() {
     return brand;
 }

 public String getWarranty() {
     return warranty;
 }

 @Override
 public String toString() {
     return super.toString() + " [Brand: " + brand + ", Warranty: " + warranty + "]";
 }
}

