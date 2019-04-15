package com.cognizant.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cognizant.dao.RegistrationDao;
import com.cognizant.daoImpl.RegistrationDaoImpl;

public class UpdateUser {
RegistrationDao rd=new RegistrationDaoImpl();
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void test() {
		rd.getUser("#123");
		assertNotNull(rd);
	}

}
