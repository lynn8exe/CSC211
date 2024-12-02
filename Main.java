package Project;

public class Main {
	
    public static void main(String[] args) {
    	
        // Create Products
    	
        Electronics laptop = new Electronics("Laptop", 999.99, "TechBrand", "1 year");
        Clothing jeans = new Clothing("Jeans", 49.99, "M", "Denim");
        Grocery apples = new Grocery("Apples", 5.99, "12/15/2024");

        //Output
        
        System.out.println(laptop);
        System.out.println(jeans);
        System.out.println(apples);
    }
}
