package com.revature.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import com.revature.models.User;
import com.revature.utils.JDBCConnection;

public class UserDAO implements GenericRepository<User>{
	
	Connection conn = JDBCConnection.getConnection();

	@Override
	public User add(User u) {
		// TODO Auto-generated method stub
		
		String sql = "insert into values (default, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) returning *;";
		
		try {
			
			PreparedStatement ps = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, u.getFirstname());
			ps.setString(2, u.getLastname());
			ps.setString(3, u.getAddress1());
			ps.setString(4, u.getAddress2());
			ps.setString(5, u.getCity());
			ps.setString(6, u.getState());
			ps.setString(7, u.getZipCode());
			ps.setString(8, u.getMobilephonenumber());
			ps.setString(9, u.getHomephonenumber());
			ps.execute();
			ResultSet rs = ps.getGeneratedKeys();
			int generatedKey = 0;
			if (rs.next()) {
			    generatedKey = rs.getInt(1);
			    u.setId(generatedKey);
			}
			 
			System.out.println("Inserted record's ID: " + generatedKey);

		} catch(Exception e) {
			
		}
		return null;
	}

	public User registerUser(User u) {
		// TODO Auto-generated method stub
		add(u);
return null;	}

	@Override
	public User getById(Integer id) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(User u) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(User u) {
		// TODO Auto-generated method stub
		return false;
	}

}