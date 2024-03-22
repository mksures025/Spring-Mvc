package com.te.springmvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@Builder
@Entity
@Table(name="student_tb")
public class Student {
	
	@Column(name="stu_ID")
	@Id
	private String studentId;
	@Column(name="stu_Name")
	private String studentName;
	@Column(name="stu_Age")
	private int studentAge;
	private String password;
	
}
