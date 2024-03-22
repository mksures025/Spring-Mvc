package com.te.ems.service;

import java.util.List;

import com.te.ems.dto.LoginDTO;
import com.te.ems.entity.Employee;

public interface AuthService {

	String register(String employeeId, String employeeAge, String employeeEmail, String password);

	boolean login(LoginDTO loginDTO);

	boolean resetPassword(String employeeId, String password, String retypePassword);

	boolean deleteEmployee(String employeeId);

	List<Employee> fetechDetails();



}
