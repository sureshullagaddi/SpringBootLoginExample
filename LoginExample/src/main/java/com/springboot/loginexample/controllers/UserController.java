package com.springboot.loginexample.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.loginexample.entity.Users;
import com.springboot.loginexample.service.UserService;

@Controller
public class UserController {
	
	@Autowired
    private UserService service;
	
	@RequestMapping("/Fixedline")
	public String viewHomePage(Model model) {
	    List<Users> listProducts = service.listAll();
	    model.addAttribute("listUsers", listProducts);
	     
	    return "Fixedline";
	}

}
