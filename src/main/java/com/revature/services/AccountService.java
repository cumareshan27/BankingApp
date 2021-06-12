package com.revature.services;

import java.util.Scanner;

import com.revature.app.showtransactionmenu;

public class AccountService {
 // this class is to implement account transactions, withdrawals and deposits 
	// between two accounts 
	
 void showtransactionmenu() {
	 
	 char option='\0';
	 Scanner scanner = new Scanner(System.in);
	 
	 System.out.println("Welcome to \"Get the custoer name TBD \" ");
	 System.out.println("Welcome to \"Get the custoer ID TBD \" ");
	 System.out.println("\n");
	 System.out.println("A. Check Balance ");
	 System.out.println("B. Deposit ");
	 System.out.println("C. Withdraw ");
	 System.out.println("D. Previous Transaction ");
	 System.out.println("E. Exit ");
	 
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
		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		 System.out.println("Balance = \" + add balance varibale TBD \" ");
		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		 System.out.println("\n");
		 break;
		 
		 case 'B':
		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		 System.out.println("Enter an amount to deposit into ");
		 System.out.println("Balance = \\\" + add balance varibale TBD \\\" \"");
		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		 System.out.println("\n");
		 }
	 }
	 while(char.class){
		 System.out.println();
	 }
	}
}
