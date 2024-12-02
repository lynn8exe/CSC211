package Project;

//Grocery subclass
public class Grocery extends Product {
	
	 private String expirationDate;
	
	 public Grocery(String name, double price, String expirationDate) {
	     super(name, price, "Grocery");
	     this.expirationDate = expirationDate;
	 }
	
	 public String getExpirationDate() {
	     return expirationDate;
	 }
	
	 @Override
	 public String toString() {
	     return super.toString() + " [Expiration Date: " + expirationDate + "]";
	 }
}