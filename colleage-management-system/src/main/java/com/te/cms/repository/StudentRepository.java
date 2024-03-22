package com.te.cms.repository;

import java.util.List;

import com.te.cms.entity.Student;

public interface StudentRepository {

	String registerData(Student student);

	boolean loginRepository(String studentId, String password);

	boolean updatePasswordRepository(String studentId, String oldPassword, String newPassword);

	boolean deleteRepository(String studentId);

	List<Student> fetchDeatailRepository();

}
