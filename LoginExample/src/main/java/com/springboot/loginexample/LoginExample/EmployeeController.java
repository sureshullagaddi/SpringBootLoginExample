package com.springboot.loginexample.LoginExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.loginexample.model.Employee;
import com.springboot.loginexample.model.EmployeeAddress;

@Controller
public class EmployeeController {
	
	@RequestMapping("/emp")
	public String getEmployeeForm() {
		return "employeeform";
	}
		
	@RequestMapping(value = "/saveemployee", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute Employee employee) {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("employee-data");
		modelAndView.addObject("employee",employee);
		return modelAndView;
	}

}
