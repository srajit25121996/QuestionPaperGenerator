package com.cognizant.serviceimpl;

import com.cognizant.dao.RegistrationDao;
import com.cognizant.daoImpl.RegistrationDaoImpl;
import com.cognizant.model.Registration;
import com.cognizant.service.RegistrationService;

public class RegistrationServiceImpl implements RegistrationService {

	public boolean insertUser(Registration reg) {
		RegistrationDao rDao=new RegistrationDaoImpl() ;
			return rDao.insert(reg);
			
	
	}

}
