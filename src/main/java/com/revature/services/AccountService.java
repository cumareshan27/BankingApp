package com.revature.services;

import java.util.Scanner;

public class AccountService {
 // this class is to implement account transactions, withdrawals and deposits 
	// between two accounts 
	int balance;
	int previousTransactions;
	String customerName;
	String customerID;
	
	public AccountService(String custname, String custId){
		customerName = custname;
		customerID = custId;
		
	}
	
void deposit(int amount) {
	if(amount != 0  ) {
		balance = balance + amount;
		previousTransactions = amount;
	}
}

void withdrawl(int amount) {
	if (amount != 0 ) {
		balance = balance + amount;
		previousTransactions = -amount;
	}
}

void getPReviousTransaction() {
	if(previousTransactions > 0) {
		System.out.println("Deposited: "+ previousTransactions);
	} else if (previousTransactions < 0 ) {
		System.out.println("Withdrawn: "+ Math.abs(previousTransactions));
	} else {
		System.out.println("No Transactoin occured");
	}
}

public void openaccountmainmenu() {
	 char option='\0';
	 Scanner scanner = new Scanner(System.in);
	 
	 System.out.println("Welcome to \"New Account Opening  \" ");
	 System.out.println("Welcome to \"Get the custoer ID TBD \" ");
	 System.out.println("\n");
	 System.out.println("A. What type of account do you want to open ");
	 System.out.println("Enter checking or saving");
	 System.out.println("B. How much do you want deposit");
	 System.out.println("C. Exit ");
	 
	 do
	 {
		 System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		 System.out.println("Enter an option"); 
		 System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		 option = scanner.next().charAt(0);
		 System.out.println("\n");
		 
		 
		 switch(option) {
		 case 'A':
			 System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			 System.out.println("Wha type of account do you want to open"); 
			 System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			 option = scanner.next().charAt(0);
			 System.out.println("\n");
			 break;
			 
		 case 'B':
			 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			 System.out.println("Account type:  ");
			 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			 System.out.println("\n");
			 break;
			 
		 case 'C':
			 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			 System.out.println("Enter an amount to deposit ");
			 System.out.println("Deposit = ");
			 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			 System.out.println("\n");
			 break;	 
			 
		 }
	 } while (true);
}
	
 public void showtransactionmenu() {
	 
	 char option='\0';
	 Scanner scanner = new Scanner(System.in);
	 
	 System.out.println("Welcome to \"Get the custoer name TBD \" ");
	 System.out.println("Welcome to \"Get the custoer ID TBD \" ");
	 System.out.println("\n");
	 System.out.println("A. Chose your account for the transaction ");
	 System.out.println("B. Check Balance ");
	 System.out.println("C. Deposit ");
	 System.out.println("D. Withdraw ");
	 System.out.println("E. Previous Transaction ");
	 System.out.println("F. Exit ");
	 
	 do
	 {
		 System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		 System.out.println("Enter an option"); 
		 System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		 option = scanner.next().charAt(0);
		 System.out.println("\n");
		 
		 switch(option)
		 {
		 case 'A':
		 System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		 System.out.println("Enter an option"); 
		 System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		 option = scanner.next().charAt(0);
		 System.out.println("\n");
		 break;
		 
		 case 'B':
		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		 System.out.println("Balance = \" + add balance varibale TBD \" ");
		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		 System.out.println("\n");
		 break;
		 
		 case 'C':
		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		 System.out.println("Enter an amount to deposit into ");
		 System.out.println("Balance = \\\" + add balance varibale TBD \\\" \"");
		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		 System.out.println("\n");
		 break;
		 
		 case 'D':
			 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			 System.out.println("Enter an amount to deposit into ");
			 System.out.println("Balance = \\\" + add balance varibale TBD \\\" \"");
			 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			 System.out.println("\n");
			 break;
			 
		 case 'E':
			 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			 System.out.println("Enter an amount to deposit into ");
			 System.out.println("Balance = \\\" + add balance varibale TBD \\\" \"");
			 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			 System.out.println("\n");
			 break;
			 
		
		 case 'F':
			 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			 break;
			 
	 }
	 }
	 while(option != 'F');
	 
	 System.out.println("Thanks for using our Banking App, we are here to disrupt the banking inustry for a better future");
	 }
 
}
