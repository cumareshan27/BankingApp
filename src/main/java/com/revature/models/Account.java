package com.revature.models;

public class Account {
	//Instance Variables
		private int accountId; 
		private int accountNumber;	
		String accountType;
		double accountBalance;
		int userId;
		
		
		
		public Account(int accountId, int accountNumber, String accountType, double accountBalance, int userId) {
			super();
			this.accountId = accountId;
			this.accountNumber = accountNumber;
			this.accountType = accountType;
			this.accountBalance = accountBalance;
			this.userId = userId;
		}
		public int getAccountId() {
			return accountId;
		}
		public void setAccountId(int accountId) {
			this.accountId = accountId;
		}
		public int getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(int accountNumber) {
			this.accountNumber = accountNumber;
		}
		public String getAccountType() {
			return accountType;
		}
		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}
		public double getAccountBalance() {
			return accountBalance;
		}
		public void setAccountBalance(double accountBalance) {
			this.accountBalance = accountBalance;
		}
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		
		
		
		
		
		
		
		
}
