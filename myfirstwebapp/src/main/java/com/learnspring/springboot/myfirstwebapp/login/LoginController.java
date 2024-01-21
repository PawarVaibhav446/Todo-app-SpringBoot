package com.learnspring.springboot.myfirstwebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@RequestMapping("login")
	public String login(@RequestParam String name, ModelMap model) {
//		logger.debug("Debug: Request Param is {}" + name);
//		logger.info("Info: Request Param is {}" + name);
//		logger.warn("Info: Request Param is {}" + name);
		model.put("name", name);
		return "login";
	}
}
