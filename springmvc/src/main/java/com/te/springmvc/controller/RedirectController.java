package com.te.springmvc.controller;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;


//this controller class used to explore the redirect page process.
@Controller
public class RedirectController {
	
	// using redirect attribute 
//	@RequestMapping(path="/one")
//	public String one() {
//		
//		System.out.println("from one");
//		
//		return "redirect:/enjoy";
//	}
	
	
//	using redirect object
//	@RequestMapping(path="/one")
//	public RedirectView one() {
//		
//		System.out.println("from RedirectView object");
//		
//		RedirectView redirectView=new RedirectView();
//		redirectView.setUrl("enjoy");
//		
//		return redirectView;
//	}
//	
//	// using httpservletresponse
//	@RequestMapping(path="/one")
//	public String one(HttpServletResponse response) {
//		
//		System.out.println("from HttpServletResponse");
//		
//      try {
//		response.sendRedirect("");
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//		
//		return "";
//	}
//	
//	@RequestMapping(path="/enjoy")
//	public String two(Model model) {
//		
//		System.out.println("from two");
//		
//		return"studentRegister";
//	}
	

	// dummy method to explore the ModelAndView object
//
//	@RequestMapping(path = "/help")
//	public ModelAndView help() {
//
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.addObject("name", "suresh");
//		modelAndView.addObject("rollnumber", 12345);
//
//		LocalDateTime now = LocalDateTime.now();
//		modelAndView.addObject("time", now);
//
//		List<Integer> marks = new ArrayList<Integer>();
//		marks.add(24);
//		marks.add(25);
//		marks.add(100);
//		modelAndView.addObject("marks", marks);
//		modelAndView.setViewName("help");
//
//		return modelAndView;
//	}


}
