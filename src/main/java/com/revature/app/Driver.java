package com.revature.app;

import java.util.*;

import com.revature.models.Account;
import com.revature.repositories.AccountDAO;
import com.revature.repositories.AccountRepository;
import com.revature.repositories.UserLoginDAO;

public class Driver {
	
	public static void main(String[] args) {
	
	new AccountDAO();
	
	String welcomeMessage = "\nWelcome to the Banking App!" + "\n"
			+ "Please choose an option to continue:" + "\n"
			+ "1. Log In - for registered users." + "\n"
			+ "2. Register New User" + "\n"
			+ "3. Quit Application";
	
	System.out.println(welcomeMessage);
	
	//ar.add(new Account(23, 123, "Saving", 123, 456));
	
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
					String username = scanner.next();
					System.out.println("Please enter your password: ");
					String password = scanner.next();
					System.out.println("Please enter your email");
					String email = scanner.next();
					//loginDAO(username, password, email);
					break;
				}
				
				
				case 2: {
					System.out.println("You are a new registration screen, TBD");
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
