package com.te.ems.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.te.ems.dto.LoginDTO;
import com.te.ems.entity.Employee;
import com.te.ems.service.AuthService;
import com.te.ems.service.AuthServiceImpl;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping(path = "/auth")
@Controller
public class AuthController {
	// here we cannot do the tight coupling because in future some devleoper need to change the implementation.
	// if you declare the final with authservice it will initial the value by using requiredArgsConstructor that
	// will be specified for the particular class.
	private final AuthService authService;

	@RequestMapping(path = "/register", method = RequestMethod.GET)
	public String register() {
		return "register";
	}

	@RequestMapping(path = "/register", method = RequestMethod.POST)
	public String register(HttpServletRequest request, ModelMap modelMap) {
		System.out.println("we reached this page!!!");
		String employeeId = request.getParameter("empId");
		String employeeAge = request.getParameter("empAge");
		String employeeEmail = request.getParameter("empEmail");
		String password = request.getParameter("password");
		System.out.println(employeeId);
		System.out.println(employeeAge);
		System.out.println(employeeEmail);
		
		// TODO Implements Registration
		
		employeeId = authService.register(employeeId,employeeAge,employeeEmail,password);
		
		modelMap.addAttribute("message", "Registration sucessfully with employeeId : " + employeeId);
		return "login";
	}

	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public String login(@ModelAttribute LoginDTO loginDTO, Model model) {
		System.out.println("we are in login @ModelAtrribute Object o!!!");
//		System.out.println(loginDTO.getEmployeeId());
//		System.out.println(loginDTO.getPassword());
		
		String employeeId = loginDTO.getEmployeeId();
		String password = loginDTO.getPassword();	
		// TODO 
		 
		
		
//		if((loginDTO.getPassword().equals("password")))
//		{
//			model.addAttribute("message", "login sucessfully");
//			return "about";
//		} else {
//			model.addAttribute("message", "login un-sucessfully");
//		    return "login";
//		}
		
		// this is the oneway for login logic
		//employeeId = authService.login(loginDTO);
//		if(employeeId != null) {
//			model.addAttribute("message", "login sucessfully");
//			return "about";
//		} else {
//			model.addAttribute("message", "login un-sucessfully");
//			return "login";
//		}
		
		// secondway for longin logic
		boolean isLoginIn = authService.login(loginDTO);
		
		if(!(isLoginIn)) {
			model.addAttribute("message", "login un-sucessfully");
			return "login";
		} else {
			return "about";
		}
	}

	@RequestMapping(path = "/resetPassword", method = RequestMethod.GET)
	public String resetPassword() {
		return "resetPassword";
	}
	
	@RequestMapping(path = "/resetPassword", method = RequestMethod.POST)
	public String resetPassword(@RequestParam (name = "employeeId") String employeeId,
			@RequestParam (name = "password") String password,
			@RequestParam (name = "retypePassword") String retypePassword , Model model) {
		System.out.println(employeeId);
		System.out.println(password);
		System.out.println(retypePassword);
		
		boolean isResetPassword = authService.resetPassword(employeeId, password, retypePassword);
		
//		if(password.equals(retypePassword)) {
//			model.addAttribute("message", "password reset sucessfully");
//			return "login";
//		} else{
//			model.addAttribute("message", "password does not matches");
//			return "resetPassword";
//		}
		
		if(isResetPassword) {
			model.addAttribute("message", "password reset sucessfully");
			return "login";
		} else{
			model.addAttribute("message", "password does not matches");
			return "resetPassword";
		}
	}
	
	@RequestMapping(path = "/delete", method = RequestMethod.GET)
	public String delete() {
		return "delete";
	}
	
	@RequestMapping(path = "/delete", method = RequestMethod.POST)
	public String delete(@RequestParam (name = "employeeId") String employeeId, Model model) {
		
		boolean isDelete = authService.deleteEmployee(employeeId);
		if(isDelete) {
			model.addAttribute("message", "Employee deleted sucessfully");
			return "deleteEmployee";
		}
		return "delete";
	}
	
	@RequestMapping(path = "/fetech", method = RequestMethod.GET)
	public String fetech() {
		return "display";
	}
	
	@RequestMapping(path = "/fetech", method = RequestMethod.POST)
	public String fetech(@RequestParam(name="details") String details,Model  model) {
		
		List<Employee> employees = authService.fetechDetails();
		
		model.addAttribute("fetech", employees);
		
		
		return "fetech";
	}


}
