package com.mph.service;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.mph.dao.RegisterDao;

import com.mph.entity.Register;
/**
*
* @author Thirumalai K
*/
@Service
@Transactional
public class RegisterServiceImpl implements RegisterService {
	@Autowired
	public RegisterDao registerDao;
	@Override
	public void createRegister(Register register) {
		registerDao.createRegister(register);
		
	}
	@Override
	public List<Register> getAllRegister() {
		return registerDao.getAllRegister();
	}
	@Override
	public Register getRegister(Register reg) {
		
		return registerDao.getRegister(reg);
	}

	@Override
	public List<Register> updateRegister(Register register) {
		
		return registerDao.updateRegister(register);
	}

	@Override
	public List<Register> deleteRegister(int rid) {
	
		return registerDao.deleteRegister(rid);
	}
	@Override
	public  Register getRegister(int id) {
		
		return registerDao.getRegister(id);
	}


	
	

}