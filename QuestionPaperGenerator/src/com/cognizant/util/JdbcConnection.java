package com.cognizant.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
	
	public static Connection getConnection(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String username="HR";
		String password="hr";
		
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		Connection con=null;
		try {
			con=DriverManager.getConnection(url,username,password);
			
			if(con!=null){
				System.out.println("Connect");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

}
