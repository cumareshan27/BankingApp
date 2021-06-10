package com.revature.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.revature.models.UserLogin;
import com.revature.utils.JDBCConnection;

public class UserLoginDAO implements GenericRepository<UserLogin> {

	private Connection conn = JDBCConnection.getConnection();
	
	@Override
	public UserLogin add(UserLogin l) {
		
		String sql = "insert into usercredentials values (default, ?, ?, ?, ?) returning *;";
		// TODO Auto-generated method stub
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(2, l.getUsername());
			ps.setString(3, l.getPassword());
			ps.setString(4, l.getUseremail());
			ps.setString(5, l.getUserType());
		} 
		catch(Exception e) {
			System.out.println("Exxception " + e);
		}
		return null;
	}

	@Override
	public UserLogin getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserLogin> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(UserLogin l) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(UserLogin l) {
		// TODO Auto-generated method stub
		return false;
	}

}
