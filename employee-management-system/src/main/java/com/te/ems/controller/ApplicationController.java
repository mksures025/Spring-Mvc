package com.te.ems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/app")
@Controller
public class ApplicationController {
	
//	@RequestMapping("/welcome")
//	public String welcome() {
//		System.out.println("We reached here!");
//		return "welcome";
//	}
//	
//	@RequestMapping("/contact")
//	public String contact() {
//		return "contact";
//	}
//	
//	@RequestMapping("/about")
//	public String about() {
//		return "about";
//	}
	
	@RequestMapping("/register")
	public String register() {
		return "register";
	}
}
