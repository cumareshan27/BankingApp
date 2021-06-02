package com.revature.app;

import java.util.*;

import com.revature.models.Account;
import com.revature.repositories.AccountRepository;

public class Driver {
	
	public static void main(String[] args) {
	
	AccountRepository ar = new AccountRepository();

	List<Account> accounts = ar.getAll();
}
}
