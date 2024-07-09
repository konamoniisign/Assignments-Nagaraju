package com.springMVCRegistration.DTO.api;

import java.util.Arrays;

public class UserRegisterPageDTO {
	
	private String name;
	
	private String userName;
	private char[] password;
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public char[] getPassword() {
		return password;
	}
	public void setPassword(char[] password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserRegisterPageDTO [name=" + name + ", userName=" + userName + ", password="
				+ Arrays.toString(password) + "]";
	}
	
	
	

}
