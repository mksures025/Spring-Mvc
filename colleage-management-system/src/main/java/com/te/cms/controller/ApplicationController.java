package com.te.cms.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.te.cms.dto.LoginDTO;
import com.te.cms.entity.Student;
import com.te.cms.service.AppService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/app/cms")
@Controller
public class ApplicationController {

	private final AppService appService;

	// this is common method for all handler method those ,methods can use this
	// model object
	@ModelAttribute
	public void commonMessage(Model m) {

		m.addAttribute("head", "GKM college");

	}

	// Register the student record into data base

	@RequestMapping(path = "/register", method = RequestMethod.GET)
	public String register(Model m) {

		return "studentRegister";
	}

	
	@RequestMapping(path = "/register", method = RequestMethod.POST)
	public String register(@ModelAttribute("student")Student student,BindingResult result,ModelMap model) {

		if (result.hasErrors()) {
			
			return "studentRegister";
			
		}
		String str=null;
		System.out.println(str.length());
		System.out.println();
		// if using httpServletRequest we have to store like below
//		String id = request.getParameter("id");
//		String studentName = request.getParameter("studentName");
//		Integer studentAge = Integer.parseInt(request.getParameter("studentAge"));
//		String userName = request.getParameter("UserName");
//		String password = request.getParameter("password");

	 String studentId = appService.registerData(student);
	 
	 model.addAttribute("message","Registration successfull :"+studentId);

		return "login";
	}

	
	// student login validation with database login credentials
	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public String login() {

		return "login";
	}
	

	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public String login(@RequestBody LoginDTO logindto, Model model) {
		
		boolean islogin=appService.login(logindto);
		System.out.println(islogin);
		
		if (islogin) {
			model.addAttribute("message","login successfull");
			return "welcome";
		}else
			model.addAttribute("message","login un-successfull");

		return "login";
	}
	
	
	// update the student record
	
	@RequestMapping(path = "/update", method = RequestMethod.GET)
	 public String updateRecord(Model model) {
		
		return "update";	 
	 }
	
	@RequestMapping(path = "/update", method = RequestMethod.POST)
	 public String updateRecord(@RequestParam("studentId")String studentId,
			 @RequestParam("oldPassword")String oldPassword,
			 @RequestParam("newPassword")String newPassword, Model model) {
		
		
		boolean isUpdatePassword=appService.updatepasswordService(studentId,oldPassword,newPassword);
		
		if (isUpdatePassword) {
			
			model.addAttribute("reset","password updated");
			
		}
		return "login";	 
	 }
	
	// delete the record
	
	@RequestMapping(path = "/delete", method = RequestMethod.GET)
	 public String deleteRecord(Model model) {
		
		return "delete";	 
	 }
	
	@RequestMapping(path = "/delete", method = RequestMethod.POST)
	 public String deleteRecord(@RequestParam("studentId")String studentId,Model model) {
		
		boolean ifdelete=appService.deleteService(studentId);
		
		if (ifdelete) {
			
			model.addAttribute("status", "record deteleted"+studentId);
			return "status";	
		}
		model.addAttribute("status", "record not deteleted"+studentId);
		return "delete";	 
	 }
	
	// fetch the all record from the table
	@RequestMapping(path="fetch" ,method = RequestMethod.GET )
	public String  fetchdata(Model model) {
		
	List<Student> studentDetails=appService.fetchDetailService();
	
	model.addAttribute("list", studentDetails);
		return "display";
	}
	
	
	// to handle the exception we using method
	
	
	// to handle exception we created handler class 
	
	/*
	 * @ExceptionHandler(value=NullPointerException.class) public String
	 * exceptionHandler(Model model) {
	 * 
	 * model.addAttribute("exception", "null pointer exception");
	 * return"exceptionpage";
	 * 
	 * }
	 */

}
