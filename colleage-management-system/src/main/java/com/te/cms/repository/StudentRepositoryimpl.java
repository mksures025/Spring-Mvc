package com.te.cms.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.te.cms.entity.Student;

@Repository
public class StudentRepositoryimpl implements StudentRepository {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MySQLcms");

	EntityManager entityManager = entityManagerFactory.createEntityManager();

	// insert the user detail to database
	@Override
	public String registerData(Student student) {

		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

		entityManager.persist(student);

		entityTransaction.commit();
		return student.getStudentId() ;
	}

	// login verification
	@Override
	public boolean loginRepository(String studentId, String password) {

		Student studentID = entityManager.find(Student.class, studentId);
		System.out.println(studentID.getPassword()+","+studentID.getStudentId());

		
		return studentID.getPassword().equals(password) && studentID.getStudentId().equals(studentId);
	}

	
	// password update
	@Override
	public boolean updatePasswordRepository(String studentId, String oldPassword, String newPassword) {
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		Student studentID = entityManager.find(Student.class, studentId);
		if (studentID.getPassword().equals(oldPassword)) {
			
			studentID.setPassword(newPassword);
			entityManager.persist(studentID);
			
			entityTransaction.commit();
			
			return true;
		}
		
		return false;
	}

	// delete record
	@Override
	public boolean deleteRepository(String studentId) {

		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Student studentID = entityManager.find(Student.class, studentId);
		if (studentID.getStudentId().equals(studentId)) {
			
		
			entityManager.remove(studentID);
			
			entityTransaction.commit();
			
			return true;
		}
		return false;
	}

	@Override
	public List<Student> fetchDeatailRepository() {
		
		Query query = entityManager.createQuery("from Student");
		List<Student> list = query.getResultList();
		
		return list;
	}

	
	
}
