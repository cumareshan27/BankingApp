package com.revature.models;

public class UserLogin{
	
	public String userloginId;
	public String username;
	public String useremail; 
	public String password; 
	public String usertype;
	public int userId; 
	
	
	public UserLogin(String username, String useremail, String password, String usertype, int userId) {
		super();
		this.username = username;
		this.useremail = useremail;
		this.password = password;
		this.usertype = usertype;
		this.userId = userId;
		
	}

	public UserLogin(String username, String useremail, String password ) {
		super();
		this.username = username;
		this.useremail = useremail;
		this.password = password;
		
		
	}
	
	public UserLogin(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public UserLogin() {
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public String getPassword() {
		return password;
	}
	

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public void setUserType(String usertype) {
		this.usertype = usertype;
	}
	
	public String getUserType() {
		return usertype;
	}

	
	
	
	

}
