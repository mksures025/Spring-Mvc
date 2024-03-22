 package com.te.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class CommonController {

	
	@RequestMapping(path = "/dummylogin", method = RequestMethod.POST)
	public String DummyRegister(Model model) {
		
		
	// dummy list to explore the list of date in view page
		List<String> friends = new ArrayList<String>();
		friends.add("java");
		friends.add("python");
		friends.add("c#");
		model.addAttribute("f", friends);
		

		return "dummy";
	}
	
}
