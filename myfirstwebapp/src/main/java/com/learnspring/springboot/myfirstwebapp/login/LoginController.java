package com.learnspring.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	// http://localhost:8080/login-jsp?name=Vaibhav
	@RequestMapping("login")
	public String login(@RequestParam String name, ModelMap model) {
		model.put("name", name);
		System.out.println("Request Param is " + name);
		return "login";
	}
}
