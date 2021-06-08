package com.revature.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCConnection {

	public static Connection conn = null;
	
	//method to get the connection
	
	public static Connection getConnection() {
		try {
			//if connection doesn't exist - make one
			if (conn == null) {
				/*
				 * 'hot-fix' to ensure that the driver loads correctly
				 * when our application starts
				 * */
				Class.forName("org.postgresql.Driver");
				
				Properties props = new Properties();
				
				InputStream input = JDBCConnection.class.getClassLoader().getResourceAsStream("connection.properties");
				
				props.load(input);
				
				String url = props.getProperty("url");
				String username = props.getProperty("username");
				String password = props.getProperty("password");
				
				conn = DriverManager.getConnection(url, username, password);
				return conn;
			} else {
				return conn;
			}
		} catch (SQLException | IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) {
		Connection conn = JDBCConnection.getConnection();
		
		if (conn != null) {
			System.out.println("Connection successfull");
		} else {
			System.out.println("Connection unsuccessull");
		}
		
		
	}
}
