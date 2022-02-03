package com.mph.service;
import java.util.List;


import com.mph.entity.Register;

public interface RegisterService {
	public void createRegister(Register register);
	public List<Register> getAllRegister();
	public Register getRegister(Register reg);
	public List<Register> updateRegister(Register register);
	public List<Register> deleteRegister(int rid);
	public  Register getRegister(int id);

}