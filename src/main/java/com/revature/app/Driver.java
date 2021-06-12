package com.revature.app;

import java.util.*;

import com.revature.models.User;
import com.revature.models.UserLogin;
import com.revature.repositories.AccountDAO;
import com.revature.repositories.UserDAO;
import com.revature.repositories.UserLoginDAO;

public class Driver {
	
	public static void main(String[] args) {
	
	new AccountDAO();
	//ar.add(new Account(23, 123, "Saving", 123, 456));
	
	String welcomeMessage = "\nWelcome to the Banking App!" + "\n"
			+ "Please choose an option to continue:" + "\n"
			+ "1. Log In - for registered users." + "\n"
			+ "2. Register New User" + "\n"
			+ "3. Quit Application";
	
	System.out.println(welcomeMessage);
	UserLoginDAO userlogin = new UserLoginDAO();
	
	userlogin.getByUserName("usertest1");
	
	
	// Scanner for collecting user input
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		
		UserLoginDAO loginDAO = new UserLoginDAO();
		
		System.out.println("Please choose an option");
		
			
			// make sure they've entered a valid option
			if (choice == 1 || choice == 2 || choice ==3) { 	
				switch(choice) {
				
				case 1: {
					System.out.println("Please enter your username: ");
					String username1 = scanner.next();
					System.out.println("Please enter your password: ");
					String password2 = scanner.next();
					break;
				}
				
				
				case 2: { 
					
					System.out.println("You are a new registration screen, TBD");
					System.out.println("Please enter FirstName: ");
					String firstname = scanner.next();
					System.out.println("Please enter LastName: ");
					String lastname = scanner.nextLine();
					System.out.println("Please enter Address 1: ");
					String address1 = scanner.nextLine();
					System.out.println("Please enter Address 2: ");
					String address2 = scanner.nextLine();
					System.out.println("Please enter City: ");
					String city = scanner.nextLine();
					System.out.println("Please enter State: ");
					String state = scanner.nextLine();
					System.out.println("Please enter Zip: ");
					String zip = scanner.nextLine();
					System.out.println("Please enter Home Number: ");
					String homenumber = scanner.nextLine();
					System.out.println("Please enter Mobile Number: ");
					String mobilenumber = scanner.nextLine();
					System.out.println("Please enter your username: ");
					String username = scanner.nextLine();
					System.out.println("Please enter your password: ");
					String password = scanner.nextLine();
					System.out.println("Please enter your email");
					String email = scanner.nextLine();
					User user = new User(firstname, lastname, address1, address2, city, state, zip, homenumber, mobilenumber);
					UserDAO dao= new UserDAO();
					dao.add(user);
					UserLogin userLogin = new UserLogin(username, email, password, "customer", user.getId());
					loginDAO.add(userLogin);
					
					
					break;
				}
				
				case 3:{
					System.out.println("You have exited the app");
				}
				
				default: {
					// default implementation if input doesn't match any choices
					System.out.println("Uh oh! It looks like you entered an invalid character. \nPlease only select from the options provided.");
					
				}	
				}
			} else {
				System.out.println("Uh oh! It looks like you entered an invalid character. \nPlease only select from the options provided.");
				//TBD entered the methods here 
			}
			
		
		
		

	//List<Account> accounts = ar.getAll();
}

	
}
