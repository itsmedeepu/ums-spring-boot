package com.deepak.ums.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.deepak.ums.entity.Register;
import com.deepak.ums.serviceimpl.ServiceImpl;

@Controller
public class UserController {

	@Autowired
	private ServiceImpl serviceImpl;


	

}
