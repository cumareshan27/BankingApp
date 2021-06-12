package com.revature.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.revature.models.User;
import com.revature.models.UserLogin;
import com.revature.utils.JDBCConnection;

public class UserLoginDAO implements GenericRepository<UserLogin> {

	private Connection conn = JDBCConnection.getConnection();
	User user = new User();
	UserLogin loginuser = new UserLogin();
	
	@Override
	public UserLogin add(UserLogin l) {
		
		String sql = "insert into usercredentials values (default, ?, ?, ?, ?,?) returning *;";
		// TODO Auto-generated method stub
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(2, l.getUsername());
			ps.setString(3, l.getPassword());
			ps.setString(4, l.getUseremail());
			ps.setString(5, l.getUserType());
			ps.setInt(6, user.getId());
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
	
	
	public UserLogin getByUserName(String usename) {
		// TODO Auto-generated method stub
		try {
			
			String sql = "select * from usercredentials where user_name = ?;";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, usename);

			ResultSet rs = ps.executeQuery();
			System.out.println("UserloginDAO getbyusername method" + rs );
			
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++" );
			if (rs.next()) {
				
				System.out.println("If loop inside of the UserloginDAO getbyusername method" + rs);
//				loginuser.setuserloginId(rs.getInt());
//				loginuser.setUsername(rs.getString(usename));
//				loginuser.set()
//				loginuser.setUseremail(rs.getNString();
				
//				public String userloginId;
//				public String username;
//				public String useremail; 
//				public String password; 
//				public String usertype;
//				public int userId; 
			}
			
		} catch(Exception e) {
			System.out.println(e);
		}
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
