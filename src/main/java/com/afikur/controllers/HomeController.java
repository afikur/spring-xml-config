package com.afikur.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.afikur.models.User;

@Controller
public class HomeController {
	
	@RequestMapping(value= {"/", "/home"}, method=RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("user", new User("Afikur Rahman", "Khan"));
		return "home";
	}
	
	@RequestMapping(value= {"/createuser"}, method=RequestMethod.GET)
	public String getUserCreateForm() {
		return "addUser";
	}
	
	@RequestMapping(value= "/createuser", method=RequestMethod.POST)
	public String createUser(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName());
		return "home";
	}
}
