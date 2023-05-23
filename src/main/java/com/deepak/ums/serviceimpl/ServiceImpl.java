package com.deepak.ums.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepak.ums.entity.Register;
import com.deepak.ums.repository.UserRepository;
import com.deepak.ums.service.userService;

@Service
public class ServiceImpl implements userService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public void processUser(Register register) {
		userRepository.saveUser(register);

	}

	@Override
	public List<Register> getAllUsers() {
		return userRepository.getAllUser();

	}

}
