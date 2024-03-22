package com.te.cms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.te.cms.dto.LoginDTO;
import com.te.cms.entity.Student;
import com.te.cms.repository.StudentRepository;
import com.te.cms.repository.StudentRepositoryimpl;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AppServiceimpl implements AppService {
	
	private final StudentRepository studentRepository;

	@Override
	public String registerData(Student student) {
		
		/* if we using httpservelet request that time we have to create for entity class
		store the values in object
		*/
//		Student student = Student.builder()
//		.id(id).studentname(studentName)
//		.studentAge(studentAge)
//		.UserName(userName).password(password).build();
		
		String StudentId=studentRepository.registerData(student);
		
		
		return StudentId;
	}

	@Override
	public boolean login(LoginDTO logindto) {
		
		
		boolean islogin=studentRepository.loginRepository(logindto.getStudentId(),logindto.getPassword());
		
		return islogin;
	}

	@Override
	public boolean updatepasswordService(String studentId, String oldPassword, String newPassword) {
	
		
		return studentRepository.updatePasswordRepository(studentId,oldPassword,newPassword);
	}

	@Override
	public boolean deleteService(String studentId) {
		
		return studentRepository.deleteRepository(studentId);
	}

	@Override
	public List<Student> fetchDetailService() {
	
		
		return studentRepository.fetchDeatailRepository();
	}



}
