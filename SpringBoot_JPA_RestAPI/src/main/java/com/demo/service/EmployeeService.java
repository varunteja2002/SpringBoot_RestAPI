package com.demo.service;

import java.util.List;
import java.util.Optional;

import com.demo.model.Employee;

public interface EmployeeService {

	Employee addEmployee(Employee emp);
	Employee updateEmployee(Employee emp);
	Optional<Employee> getEmployee(int empId);
	List<Employee> getAllEmployees();
	String deleteEmployee(int empId);
}
