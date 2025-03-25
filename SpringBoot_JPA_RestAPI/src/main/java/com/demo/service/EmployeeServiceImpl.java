package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.EmployeeDao;
import com.demo.model.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao dao;
	
	@Override
	public Employee addEmployee(Employee emp) {
		
		return dao.save(emp);
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		
		return dao.save(emp);
	}

	@Override
	public Optional<Employee> getEmployee(int empId) {
		
		return dao.findById(empId);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return dao.findAll();
	}

	@Override
	public String deleteEmployee(int empId) {
		dao.deleteById(empId);
		return "Employee deleted successfully";
	}
	

}
