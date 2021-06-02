package com.revature.repositories;

import com.revature.models.Account;

public class AccountRepository extends GenericRepository{
	
	public Account add(Account a) {
		Account account = MockDB.accounts.stream().max((b1, b2) -> b1.getId().compareTo(b2.getId())).orElse(null);
		Integer id = (account != null) ? account.getId()+ 1 : 1;
		b.setId(id);
		MockDB.breeds.add(b);
		return a;
	}
}
