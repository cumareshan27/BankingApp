package com.revature.models;

public class Transactions{
	
	//Instance Variables
						
			private int transcationalId;
			private String transactiontype; 
			private int Transactionamount;
			private int accountId; // - foreignKey
			int userId; // - foreignkey
			private String Created_at;
			private String created_by;
			
			
			
			
			public Transactions(int transcationalId, String transactiontype, int transactionamount, int accountId,
					int userId, String created_at, String created_by) {
				super();
				this.transcationalId = transcationalId;
				this.transactiontype = transactiontype;
				Transactionamount = transactionamount;
				this.accountId = accountId;
				this.userId = userId;
				Created_at = created_at;
				this.created_by = created_by;
			}
			
			
			
			
			public int getTranscationalId() {
				return transcationalId;
			}
			public void setTranscationalId(int transcationalId) {
				this.transcationalId = transcationalId;
			}
			public String getTransactiontype() {
				return transactiontype;
			}
			public void setTransactiontype(String transactiontype) {
				this.transactiontype = transactiontype;
			}
			public int getTransactionamount() {
				return Transactionamount;
			}
			public void setTransactionamount(int transactionamount) {
				Transactionamount = transactionamount;
			}
			public int getAccountId() {
				return accountId;
			}
			public void setAccountId(int accountId) {
				this.accountId = accountId;
			}
			public int getUserId() {
				return userId;
			}
			public void setUserId(int userId) {
				this.userId = userId;
			}
			public String getCreated_at() {
				return Created_at;
			}
			public void setCreated_at(String created_at) {
				Created_at = created_at;
			}
			public String getCreated_by() {
				return created_by;
			}
			public void setCreated_by(String created_by) {
				this.created_by = created_by;
			}
			
			
			

			

}
