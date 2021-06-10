package com.revature.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.revature.models.Transactions;
import com.revature.utils.JDBCConnection;

public class TransactionDAO implements GenericRepository<Transactions> {
	
	private Connection conn = JDBCConnection.getConnection();

	@Override
	public Transactions add(Transactions t) {
		// TODO Auto-generated method stub
		
		String sql = "call transfer(?,?,?,?);";
		
		try {
			
			PreparedStatement cs = conn.prepareCall(sql);
			
		} catch(Exception e) {
			System.out.println("Exception happened at " + e);
		}
		return null;
	}

	@Override
	public Transactions getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transactions> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Transactions t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Transactions t) {
		// TODO Auto-generated method stub
		return false;
	}

}
