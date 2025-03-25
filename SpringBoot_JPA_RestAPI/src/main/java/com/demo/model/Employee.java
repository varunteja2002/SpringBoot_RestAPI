package com.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="emp_Info")
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employee {

	@Id
	private int empId;
	private String empName;
	private int empSalary;
	private String empAddress;
	
	
}
