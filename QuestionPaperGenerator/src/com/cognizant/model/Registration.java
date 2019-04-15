package com.cognizant.model;

import com.cognizant.dao.RegistrationDao;

public class Registration {

	 private String First_Name ;                                       
	 private String  Last_Name ;                                       
	 private String  Email ;                                
	 private String User_Id;                      
	 private String  Password;                                   
	 private String Emp_Type;
	 
	 
	 
	 
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}








	
	

	public Registration(String first_Name, String last_Name, String email, String user_Id, String password,
			String emp_Type) {
		super();
		this.First_Name = first_Name;
		this.Last_Name = last_Name;
		this.Email = email;
		this.User_Id = user_Id;
		this.Password = password;
		this.Emp_Type = emp_Type;
	}











	public String getFirst_Name() {
		return First_Name;
	}




	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}




	public String getLast_Name() {
		return Last_Name;
	}




	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}




	public String getEmail() {
		return Email;
	}




	public void setEmail(String email) {
		Email = email;
	}




	public String getUser_Id() {
		return User_Id;
	}




	public void setUser_Id(String user_Id) {
		User_Id = user_Id;
	}




	public String getPassword() {
		return Password;
	}




	public void setPassword(String password) {
		Password = password;
	}




	public String getEmp_Type() {
		return Emp_Type;
	}




	public void setEmp_Type(String emp_Type) {
		Emp_Type = emp_Type;
	}




	                               
	
	
	
	
}
