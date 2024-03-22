package com.te.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.te.springmvc.entity.Student;





// this controller class used to explore the error handling within the form.
@Controller
public class FormsController {
	
	
	@RequestMapping("/error")
	public String Registers() {
		
		return "errorregister";
	}
	
	@RequestMapping(path="/error" , method=RequestMethod.POST)
	public String Registers(@ModelAttribute("error")Student student,BindingResult result) {
		
		if (result.hasErrors()) {
			
			return "errorregister";
		}
		
		return "dummy";
		
	}

}
