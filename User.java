package Project;

//Base User class
public class User {
	
	 private String username;
	 
		 private String email;
		
		 // Constructor
		 public User(String username, String email) {
		     this.username = username;
		     this.email = email;
		 }
		
		 // Getters
		 public String getUsername() {
		     return username;
		 }
		
		 public String getEmail() {
		     return email;
		 }
		
		 @Override
		 public String toString() {
		     return "Username: " + username + ", Email: " + email;
		 }
}
