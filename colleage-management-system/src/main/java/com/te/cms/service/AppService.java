package com.te.cms.service;

import java.util.List;

import com.te.cms.dto.LoginDTO;
import com.te.cms.entity.Student;

public interface AppService {

	String registerData(Student student);

	boolean login(LoginDTO logindto);

	boolean updatepasswordService(String studentId, String oldPassword, String newPassword);

	boolean deleteService(String studentId);

	List<Student> fetchDetailService();

}
