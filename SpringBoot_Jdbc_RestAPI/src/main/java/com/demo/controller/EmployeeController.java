package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	@PostMapping("/add")
	public int addEmployee(@RequestBody Employee emp) {
		return service.addEmployee(emp);
	}
	
	@PutMapping("/update/{id}")
	public int updateEmployee(@PathVariable("id") int empId, @RequestBody Employee emp) {
		return service.updateEmployee(emp);		
	}
	
	@GetMapping("/get/{id}")
	public Employee getEmployee(@PathVariable("id")  int empId) {
		return service.getEmployee(empId);
	}
	@GetMapping("/getAll")
	public List<Employee> getAllEmployee() {
		return service.getAllEmployee();
	}

	@DeleteMapping("/del/{id}")
	public int deleteEmployee(@PathVariable("id")  int empId) {
		return service.deleteEmployee(empId);
	}
	
}
