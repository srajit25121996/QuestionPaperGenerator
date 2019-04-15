package com.cognizant.daoImpl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cognizant.dao.RegistrationDao;
import com.cognizant.model.Registration;
import com.cognizant.util.JdbcConnection;

public class RegistrationDaoImpl implements RegistrationDao{

	public boolean insert(Registration registration) {
		Connection con =null;
		PreparedStatement ps=null;
		con=JdbcConnection.getConnection();
		
		String query="insert into users values(?,?,?,?,?,?)";
	try {
		ps=con.prepareStatement(query);
		
		ps.setString(1, registration.getFirst_Name());
		ps.setString(2, registration.getLast_Name());
		ps.setString(3, registration.getEmail());
	    ps.setString(4, registration.getUser_Id());
		ps.setString(5, registration.getPassword());
		ps.setString(6, registration.getEmp_Type());	
		
		
		int rs=ps.executeUpdate();
		if(rs>0){
			return true;
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally{
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
		
		
		
		
		return false;
	}

	
	//not used
	
	public Registration getUser(String m_userid){
		
		
		
		return null;
	}
	
	
	
	
	
	public boolean update(Registration reg) {
	Connection con=null;
	con=JdbcConnection.getConnection();
	String query="update set First_Name=?,Last_Name=?,Email=?,Password=?,Emp_Id=? from Users where User_Id=?";
	try {
		PreparedStatement pst=con.prepareStatement(query);
		pst.setString(1,reg.getFirst_Name());
		pst.setString(2, reg.getLast_Name());
		pst.setString(3, reg.getEmail());
		pst.setString(4, reg.getPassword());
		pst.setString(5, reg.getEmp_Type());
		int rec=pst.executeUpdate();
		if(rec==1){
			return true;
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally{
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		return false;
	}

	
	

	

}
