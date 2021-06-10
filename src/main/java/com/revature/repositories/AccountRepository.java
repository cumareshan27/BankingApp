package com.revature.repositories;

import java.util.List;

import com.revature.models.Account;

//public class AccountRepository extends GenericRepository{
//	
//	public Account add(Account a) {
//		Account account = MockDB.accounts.stream().max((b1, b2) -> b1.getId().compareTo(b2.getId())).orElse(null);
//		Integer id = (account != null) ? account.getId()+ 1 : 1;
//		b.setId(id);
//		MockDB.breeds.add(b);
//		return a;
//	}
//}

public class AccountRepository implements GenericRepository<Account> {

	@Override
	public Account add(Account a) {
		// TODO Auto-generated method stub
	
		return null;
	}

	@Override
	public Account getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Account a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Account a) {
		// TODO Auto-generated method stub
		return false;
	}
	
}

