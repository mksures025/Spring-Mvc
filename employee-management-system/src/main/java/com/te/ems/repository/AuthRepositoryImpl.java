package com.te.ems.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.te.ems.entity.Employee;

@Repository
public class AuthRepositoryImpl implements AuthRepository {

	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MySQL01");
	private EntityManager entityManager = entityManagerFactory.createEntityManager();

	@Override
	public String insertEmployee(Employee employee) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		return employee.getEmployeeId();
	}

	// @Override
//	public Employee getEmployeeByID(String employeeID) {
//		return entityManager.getReference(Employee.class, employeeID);
//	}

	@Override
	public boolean getEmployeeByID(String employeeId, String password) {
		Employee employee = entityManager.find(Employee.class, employeeId);
		return employee.getPassword().equals(password);
	}

	@Override
	public boolean getEmployeeResetPassword(String employeeId, String password, String retypePassword) {
		Employee employee = entityManager.find(Employee.class, employeeId);
		if (password.equals(retypePassword)) {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			employee.setPassword(password);
			entityManager.persist(employee);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteByEmployee(String employeeId) {
		Employee employee = entityManager.find(Employee.class, employeeId);
		if (employee != null) {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(employee);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

	@Override
	public List<Employee> fetechDetails() {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		System.out.println("hi");
		Query query = entityManager.createQuery("FROM Employee");
		List<Employee> list = query.getResultList();
		entityTransaction.commit();
		return list;
	}

}
