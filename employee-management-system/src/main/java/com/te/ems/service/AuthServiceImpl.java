package com.te.ems.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.te.ems.dto.LoginDTO;
import com.te.ems.entity.Employee;
import com.te.ems.repository.AuthRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AuthServiceImpl implements AuthService{
	
	private final AuthRepository authRepository;

	@Override
	public String register(String employeeId, String employeeAge, String employeeEmail, String password) {
		
		employeeId = authRepository.insertEmployee(Employee.builder()
				.employeeId(employeeId)
				.employeeAge(Integer.parseInt(employeeAge))
				.employeeEmailId(employeeEmail)
				.password(password)
				.build());
		return employeeId;
	}

//	@Override
//	public String login(LoginDTO loginDTO) {
//		Employee employee = authRepository.getEmployeeByID(loginDTO.getEmployeeId());
//		if(employee!=null && employee.getPassword().equals(loginDTO.getPassword())) {
//			return employee.getEmployeeId();
//		}
//		return null;
//	}
	
	@Override
	public boolean login(LoginDTO loginDTO) {
		return authRepository.getEmployeeByID(loginDTO.getEmployeeId(), loginDTO.getPassword());
	}

	@Override
	public boolean resetPassword(String employeeId, String password, String retypePassword) {
		return authRepository.getEmployeeResetPassword(employeeId, password,retypePassword);
	}

	@Override
	public boolean deleteEmployee(String employeeId) {    
		return authRepository.deleteByEmployee(employeeId);
	}

	@Override
	public List<Employee> fetechDetails() {
		return authRepository.fetechDetails();
	}

	

}
