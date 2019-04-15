package com.cognizant.dao;

public interface LoginDao {
	public boolean validateLogin(String email,String password,String emptype);
}
