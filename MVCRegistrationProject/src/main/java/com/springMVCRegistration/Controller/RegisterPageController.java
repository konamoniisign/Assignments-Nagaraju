package com.springMVCRegistration.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springMVCRegistration.DTO.api.UserRegisterPageDTO;

@Controller
public class RegisterPageController {
	
	@RequestMapping("/")
	public String navigatePage() {
		return "security";
	}
	
	@RequestMapping("/r")
	public String registerPage(@ModelAttribute ("userReg") UserRegisterPageDTO userRegisterPageDTO) {
		return"register-page";
	}
	
	@RequestMapping("/process-register")
	public String registerDetails(@ModelAttribute ("userReg") UserRegisterPageDTO userRegisterPageDTO) {
		System.out.println("Name : " + userRegisterPageDTO.getName());
		System.out.println("User Name : " + userRegisterPageDTO.getUserName());
		return"register-Details";
	}

}
