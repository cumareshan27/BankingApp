package com.revature.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
			ps.setString(1, l.getUsername());
			ps.setString(2, l.getPassword());
			ps.setString(3, l.getUseremail());
			ps.setString(4, l.getUserType());
			ps.setInt(5, l.getUserId());
			ps.execute();
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
	
	public UserLogin getByUserNameAndPassword(String username, String password) {
		UserLogin loginuser = new UserLogin();
		String sql = "select * from usercredentials where user_name = ? and password = ?;" ;
		
		try{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			ps.execute();
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				loginuser.setUserId(rs.getInt("loginid"));
				loginuser.setUsername(rs.getString("user_name"));
				loginuser.setPassword(rs.getString("password"));
				loginuser.setUseremail(rs.getString("user_email"));
				loginuser.setUserType(rs.getString("usertype"));
				
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return loginuser;
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
				loginuser.setUserId(rs.getInt("user_id_fk"));
				loginuser.setUsername(rs.getString("user_name"));
				loginuser.setPassword(rs.getString("password"));
				loginuser.setUseremail(rs.getString("user_email"));
				loginuser.setUserType(rs.getString("usertype"));
				 
			}
			
		} catch(Exception e) {
			System.out.println(e);
		}
		return loginuser;
	}

	@Override
	public List<UserLogin> getAll() {
		// TODO Auto-generated method stub
		List<UserLogin> list = new ArrayList<UserLogin>();
		String sql = "select * from customers where employee = true;";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				//Customer c = new Customer();
				loginuser.setUserId(rs.getInt("user_id_fk"));
				loginuser.setUsername(rs.getString("user_name"));
				loginuser.setPassword(rs.getString("password"));
				loginuser.setUseremail(rs.getString("user_email"));
				loginuser.setUserType(rs.getString("usertype"));
			//	loginuser.setAccounts(AccountRepository.getInstance().getAllByCustomerId(loginuser.getId()));
				list.add(loginuser);
			}
			
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
		//return null;
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
