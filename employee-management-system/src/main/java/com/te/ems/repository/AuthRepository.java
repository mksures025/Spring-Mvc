package com.te.ems.repository;

import java.util.List;

import com.te.ems.entity.Employee;

public interface AuthRepository {

	String insertEmployee(Employee employee);
	
	//Employee getEmployeeByID(String employeeID);

	boolean getEmployeeByID(String employeeId, String password);

	boolean getEmployeeResetPassword(String employeeId, String password, String retypePassword);

	boolean deleteByEmployee(String employeeId);

	List<Employee> fetechDetails();


}
