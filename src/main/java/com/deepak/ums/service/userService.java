package com.deepak.ums.service;

import java.util.List;

import com.deepak.ums.entity.Register;

public interface userService {

	public void processUser(Register register);
	public List<Register> getAllUsers();

}
