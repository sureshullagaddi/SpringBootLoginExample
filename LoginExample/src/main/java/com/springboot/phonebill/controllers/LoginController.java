package com.springboot.phonebill.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.phonebill.entity.Users;
import com.springboot.phonebill.models.User;
import com.springboot.phonebill.repository.UserRepository;
import com.springboot.phonebill.services.UserService;

@Controller
public class LoginController {
	
	@Autowired
	private UserService service;
	
	@Autowired
    private UserRepository repo;

	@RequestMapping("/login")
	public String index() {
		return "login";
	}

//	@RequestMapping(value = "/save", method = RequestMethod.POST)
//	public ModelAndView save(@ModelAttribute User user) {
//		
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("user-data");
//		modelAndView.addObject("user", user);
//		return modelAndView;
//	}
	
	@RequestMapping(value = "/home" ,method = RequestMethod.POST)
	public String loginValidation(@RequestParam String name,@RequestParam String email) {
		if(name != null && email != null)return "Home";
		return "login";
	}
	
	@RequestMapping(value="/Fixedline",method = RequestMethod.GET)
	public String getUsers() {
		return "Fixedline";
	}
	
	@RequestMapping("/users")
	public String viewHomePage(Model model) {
		List<Users> listProducts = service.listAll();
		model.addAttribute("listProducts", listProducts);
		
		return "users";
	}
	
	@RequestMapping("/new")
	public String showNewProductPage(Model model) {
		Users product = new Users();
		model.addAttribute("product", product);
		
		return "new_product";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("product") Users product) {
		service.save(product);
		return "redirect:/users";
	}
	
	/*
	 * @RequestMapping("/edit/{id}") public ModelAndView
	 * showEditProductPage(@PathVariable(name = "id") int id) { ModelAndView mav =
	 * new ModelAndView("edit_product"); Users product = service.get(id);
	 * mav.addObject("product", product);
	 * 
	 * return mav; }
	 */
	//edit method used it in different way
	
	@GetMapping("/edit/{id}")
	public String showUpdateForm(@PathVariable("id") int id, Model model) {
		Users user = service.get(id);
	    model.addAttribute("user", user);
	    return "update-user";
	}
	
	@PostMapping("/update/{id}")
	public String updateUser(@PathVariable("id") long id, @Valid Users user, 
	  BindingResult result, Model model) {
	         
		service.save(user);
	    return "redirect:/users";
	}
	//delete user
	@RequestMapping("/delete/{id}")
	public String deleteProduct(@PathVariable(name = "id") int id) {
		service.delete(id);
		return "redirect:/users";		
	}
}
