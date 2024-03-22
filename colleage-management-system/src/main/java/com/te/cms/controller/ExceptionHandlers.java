package com.te.cms.controller;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionHandlers {

	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	  @ExceptionHandler(value=NullPointerException.class) 
	  public String exceptionHandlerNull(Model model) {
	  
	  model.addAttribute("exception", "null pointer exception");
	  return"exceptionpage";
	  
	  }
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = NumberFormatException.class)
	public String exceptionHandlerNumber(Model model) {

		model.addAttribute("exception", "number pointer exception");
		return "exceptionpage";

	}

}
