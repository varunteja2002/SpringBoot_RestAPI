package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.EmployeeDao;
import com.demo.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao dao;
	
	public int addEmployee(Employee emp) {
		return dao.addEmployee(emp);
	}
	
	public int updateEmployee(Employee emp) {
		return dao.updateEmployee(emp);
	}
	
	public Employee getEmployee(int empid) {
		return dao.getEmployee(empid);
	}

	public List<Employee> getAllEmployee() {
		return dao.getAllEmployee();
	}
	
	public int deleteEmployee(int empId) {
		return dao.deleteEmployee(empId);
	}
}
