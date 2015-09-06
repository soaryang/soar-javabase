package com.annotation.methodannotation;

public class PasswordUtils {
	
	@MyMethodAnnotation(id=4, description="no description")
	public String encryptPassword(String password) {
		return password;
	}
}
