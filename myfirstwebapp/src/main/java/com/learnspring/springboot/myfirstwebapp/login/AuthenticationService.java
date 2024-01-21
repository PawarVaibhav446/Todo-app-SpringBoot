package com.learnspring.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username, String password) {
		
		boolean isValidUsername = username.equalsIgnoreCase("Vaibhav");
		boolean isValidPassword = password.equals("1234");
		
		return isValidPassword && isValidUsername;
	}
}
