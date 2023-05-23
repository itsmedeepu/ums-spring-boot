package com.deepak.ums.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.deepak.ums.entity.Register;
import com.deepak.ums.serviceimpl.ServiceImpl;

@RestController
public class RegisterRestController {
	@Autowired
	private ServiceImpl serviceImpl;

	@GetMapping("/getallusers")
	public @ResponseBody List<Register> getAllusers() {

		return serviceImpl.getAllUsers();

	}

	@PostMapping("/saveuser")	
//	@RequestMapping(value = "/saveuser", method = RequestMethod.POST)
	public void userRegister(@RequestBody Register register) {

		serviceImpl.processUser(register);
	}

}
