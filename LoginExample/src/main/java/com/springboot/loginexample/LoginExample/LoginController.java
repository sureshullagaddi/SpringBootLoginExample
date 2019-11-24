package com.springboot.loginexample.LoginExample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.loginexample.model.User;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public String index() {
		return "login";
	}

	//@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute User user) {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("user-data");
		modelAndView.addObject("user", user);
		return modelAndView;
	}
	//https://www.thymeleaf.org/documentation.html
	
	@RequestMapping(value = "/home" ,method = RequestMethod.POST)
	public String loginValidation(@RequestParam String name,@RequestParam String email) {
		if(name != null && email != null)return "Home";
		return "login";
	}
	
	@RequestMapping(value="/Fixedline",method = RequestMethod.GET)
	public String getUsers() {
		return "Fixedline";
	}
}
