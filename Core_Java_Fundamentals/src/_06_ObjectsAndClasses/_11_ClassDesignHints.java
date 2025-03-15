package _06_ObjectsAndClasses;

import java.util.Scanner; // Import Scanner for user input

class User {
    private String username = "admin";
    private String password = "1234";

    // Constructor to initialize User object
    User(String username, String password) {
        this.setUsername(username);
        this.password = password;
    }

    // Method to authenticate user
    public boolean authenticate(String password) {
        return this.password.equals(password);
    }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}

public class _11_ClassDesignHints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object
        
        // Taking input for username and password
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        
        System.out.print("Set your password: ");
        String password = scanner.nextLine();
        
        // Creating a User object with input credentials
        User user = new User(username, password);

        // Asking for authentication
        System.out.print("Enter password to authenticate: ");
        String enteredPassword = scanner.nextLine();

        // Authenticating the user
        if (user.authenticate(enteredPassword)) {
            System.out.println("Authentication successful! Welcome, " + username + "!");
        } else {
            System.out.println("Authentication failed! Incorrect password.");
        }

        scanner.close(); // Close scanner to prevent memory leaks
    }
}
