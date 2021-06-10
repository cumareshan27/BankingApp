package com.revature.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.revature.models.Account;
import com.revature.utils.JDBCConnection;

public class AccountDAO implements GenericRepository<Account>  {
	
	private Connection conn = JDBCConnection.getConnection();

	@Override
	public Account add(Account a) {
		// TODO Auto-generated method stub
		String sql = "insert into account values (default, ?, ?, ?, ?) returning *;";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, a.getAccountNumber());
			ps.setString(2,a.getAccountType());
			ps.setDouble(3, a.getAccountBalance());
			ps.setInt(4, a.getUserId());
			ps.execute();
		}
		
		catch(Exception e)
		{
			System.out.println("Exception Occured : "+ e);
		}
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
