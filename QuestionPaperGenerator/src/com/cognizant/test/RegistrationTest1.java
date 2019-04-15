package com.cognizant.test;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cognizant.model.Registration;
import com.cognizant.service.RegistrationService;
import com.cognizant.serviceimpl.RegistrationServiceImpl;


public class RegistrationTest1 {
	Registration reg=null;
RegistrationService rService;
	@Before
	public void setUp() throws Exception {
		reg =new Registration("Shubham","Rajit","shubhamrajit00@gmail.com","#123","qwerty123","A");
		rService =new RegistrationServiceImpl() ;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(rService.insertUser(reg));
	}

}
