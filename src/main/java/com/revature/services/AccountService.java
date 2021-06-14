package com.revature.services;

import java.util.List;
import java.util.Scanner;

import com.revature.logging.AppLogger;
import com.revature.models.Account;
import com.revature.models.UserLogin;
import com.revature.repositories.AccountDAO;

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
	
public AccountService(int i, String custId) {
		// TODO Auto-generated constructor stub
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


public void openaccountmainmenu(UserLogin user) {
	 char option='\0';
	 Scanner scanner = new Scanner(System.in);
	 
	 System.out.println("Welcome to \"New Account Opening  \" ");
	 System.out.println("Welcome to \"Get the custoer ID TBD \" ");
	 System.out.println("\n");
	 System.out.println("A. What type of account do you want to open ");
	 String choice = scanner.next();
	 System.out.println("Enter checking or saving");
	 String type = scanner.next();
	 System.out.println("B. How much do you want deposit");
	 int money = scanner.nextInt();
	 System.out.println("B. account number");
	 int accNum = scanner.nextInt();
	 AccountDAO acc= new AccountDAO();
	 Account a= new Account();
	 a.setAccountBalance(money);
	 a.setAccountNumber(accNum);
	 a.setAccountStatus("Inactive");
	 a.setAccountType(type);
	 a.setUserId(user.getUserId());
	 acc.add(a);
	 
	 //System.out.println("C. Exit ");
	 
}	 			 
		 


public void customerselection(UserLogin user) {
	char option='\0';
	 Scanner scanner = new Scanner(System.in);
	 
	 System.out.println("Customer Selection menu ");
	 System.out.println("A. View All accounts ");
	 System.out.println("B. open new accounts ");
	 System.out.println("E. Exit ");
	 option = scanner.next().charAt(0);
	 
	 do {
		 switch(option) {
		 case 'A':
			 System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			 System.out.println("View All Customer Accounts "); 
			 System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			 System.out.println("\n");
			 //show all the customers account (write a method to display all the customer accounts. )
			 AccountDAO dao=new AccountDAO();
			 Account account= dao.getById(user.getUserId());
			 System.out.println("Account Info" + account);
			 showtransactionmenu(user);
			//accountService.showtransactionmenu();	
			 break;
		
		 case 'B':
			 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			 System.out.println("Open New Account  ");
			 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			// option = scanner.next().charAt(0);
			 System.out.println("\n");
			 openaccountmainmenu(user);
			 break;
			 
		 }
	 } while (true);
}

public void showemployeemenu() {
	 char option='\0';
	 Scanner scanner = new Scanner(System.in);
	 AccountDAO dao= new AccountDAO(); 
	 System.out.println("Employee approval menu ");
	 System.out.println("A. View All pending accounts ");
	List<Account> acc = dao.getAll();
	if(acc != null)
	{
		for(Account a : acc)
		{
			System.out.println("Account Id" + a.getAccountId() + "=====Account Number " + a.getAccountNumber() + " Status " + a.getAccountStatus());
		}
	}
	 System.out.println("B. select account id  to be approved ");
	int  accId = scanner.nextInt();
	 System.out.println("1. Apprvoe Account  ");
	 System.out.println("2. Reject Account ");
	   int status = scanner.nextInt();
	   if(status == 1)
	   {
		   dao.update(accId);
	   }
	   else
	   {
		   System.out.println("Rejecte");
	   }
	 System.out.println("E. Exit ");
	 
	 do
	 {		 
			 switch(option) {
			 case 'A':
				 System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
				 System.out.println("View all accounts for Aproval"); 
				 System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
				 System.out.println("show all the pending accounts with customer name ");
				 option = scanner.next().charAt(0);
				 System.out.println("\n");
				 break;
			
			 case 'B':
				 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				 System.out.println("Select an account to be approved  ");
				 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				 option = scanner.next().charAt(0);
				 System.out.println("\n");
				 break;
				 
			 case 'C':
				 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				 System.out.println("Select an account to be rejected  ");
				 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				 option = scanner.next().charAt(0);
				 System.out.println("\n");
				 break;
				 
			 case 'D':
				 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				 System.out.println("Select an account to be rejected  ");
				 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				 option = scanner.next().charAt(0);
				 System.out.println("\n");
				 break;
				 
			 case 'E':
				 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				 break;
			 } 
		 
	 }
while(option != 'E');
	 
	 System.out.println("Thanks for using our Banking App, we are here to disrupt the banking inustry for a better future");
	 }
	

	
 public void showtransactionmenu(UserLogin user) {
	 
	 char option='\0';
	 Scanner scanner = new Scanner(System.in);
	 
	 System.out.println("Welcome to \"Get the custoer name TBD \" ");
	 System.out.println("Welcome to \"Get the custoer ID TBD \" ");
	 System.out.println("\n");
	 System.out.println("A. Chose your account for the transaction ");
	 
	 
	 AccountDAO dao = new AccountDAO();
	List<Account> acc = dao.getAll(user.getUserId());
	int count = 0;
	if(acc != null)
	{
	
		for(Account a : acc)
		{
			count ++;
			System.out.println("Account Id" + count + "=====Account Number " + a.getAccountNumber() + " Status " + a.getAccountStatus());
		}
	}
	 System.out.println("B. select account id  to be approved ");
	int  accId = scanner.nextInt();
	 System.out.println("B. Check Balance ");
	 System.out.println("C. Deposit ");
	 System.out.println("D. Withdraw ");
	String a = scanner.next();
	if(a.equals("B"))
	{
		System.out.println("Balance"   + acc.get(count-1).getAccountBalance());
		AppLogger.logger.info("Money Deposited. " + acc.get(count-1).getAccountBalance());
	}
	else if(a.equals("C"))
	{
		System.out.println("Enter Amount to be deposited");
		int ax = scanner.nextInt();
		dao.addMoney(ax, user.getUserId(),acc.get(count-1).getAccountNumber());
		AppLogger.logger.info("Money withdrwan. " + acc.get(count-1).getAccountBalance());
	}
	else if(a.equals("D"))
	{
		System.out.println("Enter Amount to be withdrawn");
		int b = scanner.nextInt();
		dao.deductAmot(b, user.getUserId(),acc.get(count-1).getAccountNumber());
		AppLogger.logger.info("Amount withdrwan. " + dao.deductAmot(b, user.getUserId(),acc.get(count-1).getAccountNumber()));
	}
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
		 System.out.println("Ente an account for transaction"); 
		 System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		 System.out.println("show all accounts of the customer");
		 option = scanner.next().charAt(0);
		 System.out.println("\n");
		 break;
		 
		 case 'B':
		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		 System.out.println("Balance = \" + add balance varibale TBD \" ");
		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		 option = scanner.next().charAt(0);
		 System.out.println("\n");
		 
		 break;
		 
		 case 'C':
		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		 System.out.println("Enter an amount to deposit into ");
		 System.out.println("Balance = \\\" + add balance varibale TBD \\\" \"");
		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		 option = scanner.next().charAt(0);
		 System.out.println("\n");
		 break;
		 
		 case 'D':
			 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			 System.out.println("Enter an amount to deposit into ");
			 System.out.println("Balance = \\\" + add balance varibale TBD \\\" \"");
			 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			 System.out.println("\n");
			 option = scanner.next().charAt(0);
			 break;
			 
		 case 'E':
			 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			 System.out.println("Enter an amount to deposit into ");
			 System.out.println("Balance = \\\" + add balance varibale TBD \\\" \"");
			 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			 option = scanner.next().charAt(0);
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
