package com.te.ems.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "employee_tbl")
public class Employee {
	@Column(name = "employee_id")
	@Id
	private String employeeId;
	@Column(name = "employee_age")
	private int employeeAge;
	@Column(name = "employee_email"
			+ "")
	private String employeeEmailId;
	private String password;
	

}
