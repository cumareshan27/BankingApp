package com.revature.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Account;
import com.revature.models.User;
import com.revature.utils.JDBCConnection;

public class AccountDAO implements GenericRepository<Account>  {
	
	private Connection conn = JDBCConnection.getConnection();

	@Override
	public Account add(Account a) {
		// TODO Auto-generated method stub
		String sql = "insert into account values (default, ?, ?, ?, ?, ?) returning *;";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, a.getAccountNumber());
			ps.setString(2,a.getAccountType());
			ps.setDouble(3, a.getAccountBalance());
			ps.setInt(4, a.getUserId());
			ps.setString(5, a.getAccountStatus());
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
		Account account = new Account();
				try {
					String sql = "select * from account where user_id_fk = ?";
					PreparedStatement ps = conn.prepareStatement(sql);
					
					ps.setInt(1,  id);
					ResultSet rs = ps.executeQuery();
					
					if(rs.next()) {
						
						
//						ps.(u.id(setUserId(rs.getInt("id")));
						account.setAccountId(rs.getInt("account_id"));
						account.setAccountNumber(rs.getInt("account_number"));
						account.setAccountBalance(rs.getInt("account_balance"));
						
					
						
						System.out.println("You are logged in and Welcome to the banking app");
					
					} else {}
					
					System.out.println("Customer not found");
					
				} catch(Exception e) {
					System.out.println(e);
				}
				
				return account;

	}

	@Override
	public List<Account> getAll() {
		
		List<Account> acc= new ArrayList<>();
		try {
			String sql = "select * from account where account_status = 'Inactive'";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				Account account = new Account();
//				ps.(u.id(setUserId(rs.getInt("id")));
				account.setAccountId(rs.getInt("account_id"));
				account.setAccountNumber(rs.getInt("account_number"));
				account.setAccountBalance(rs.getInt("account_balance"));
				acc.add(account);
				
			
				
				System.out.println("You are logged in and Welcome to the banking app");
			
			} else {}
			
			System.out.println("Customer not found");
			
		} catch(Exception e) {
			System.out.println(e);
		}
		
		return acc;


	}

public List<Account> getAll(int id) {
		
		List<Account> acc= new ArrayList<>();
		try {
			String sql = "select * from account where user_id_fk = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				Account account = new Account();
//				ps.(u.id(setUserId(rs.getInt("id")));
				account.setAccountId(rs.getInt("account_id"));
				account.setAccountNumber(rs.getInt("account_number"));
				account.setAccountBalance(rs.getInt("account_balance"));
				acc.add(account);
				
			
				
				System.out.println("You are logged in and Welcome to the banking app");
			
			} else {}
			
			System.out.println("Customer not found");
			
		} catch(Exception e) {
			System.out.println(e);
		}
		
		return acc;


	}
	public boolean update(int a) {
	String sql = "update account set account_status = 'Active' where account_id = ? ";
		boolean status = false;
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, a);
			ps.execute();
			System.out.println("Account status updated");
			status = true;
		}
		
		catch(Exception e)
		{
			System.out.println("Exception Occured while status change of account : "+ e);
		}
		return status;

	}

	public boolean addMoney(int a,int id, int i) {
		String sql = "update account set account_balance =  (account_balance + ?)  where user_id_fk = ? and account_number = ?";
			boolean status = false;
			try {
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1, a);
				ps.setInt(2, id);
				ps.setInt(3,i);
				ps.execute();
				System.out.println("Account status updated");
				status = true;
			}
			
			catch(Exception e)
			{
				System.out.println("Exception Occured while status change of account : "+ e);
			}
			return status;

		}

	public boolean deductAmot(int a,int id, int i) {
		String sql = "update account set account_balance = account_balance - ?  where account_id = ? and account_number = ?";
		boolean status = false;
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, a);
			ps.setInt(2, id);
			ps.execute();
			System.out.println("Account status updated");
			status = true;
		}
		
		catch(Exception e)
		{
			System.out.println("Exception Occured while status change of account : "+ e);
		}
		return status;		}


	@Override
	public boolean delete(Account a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Account t) {
		// TODO Auto-generated method stub
		return false;
	}

}
