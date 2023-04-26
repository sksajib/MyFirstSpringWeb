package com.sajib.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	public boolean authenticate(String username,String password) {
		boolean isValidUserName=username.equalsIgnoreCase("sajib");
		boolean isValidPassword=password.equalsIgnoreCase("sajib");
		return isValidUserName && isValidPassword;
	}
}
