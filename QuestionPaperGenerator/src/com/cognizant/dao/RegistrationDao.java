package com.cognizant.dao;

import com.cognizant.model.Registration;

public interface RegistrationDao {
public boolean insert(Registration registration);
public boolean update(Registration reg)	;
public Registration getUser(String m_username);



}
