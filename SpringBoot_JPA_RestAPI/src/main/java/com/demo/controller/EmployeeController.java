package com.demo.controller;

import java.util.List;
import java.util.Optional;

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
@RequestMapping("/emp_info")
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	@PostMapping
	public Employee addEmployee(@RequestBody Employee emp) {
		 System.out.println("Employee added successfully");
		 return service.addEmployee(emp);
	}
	
	@PutMapping
	public Employee updateEmployee(@RequestBody Employee emp) {
		return service.updateEmployee(emp);	
	}
	
	@GetMapping("/{id}")
	public Optional<Employee> getEmployee(@PathVariable("id") @RequestBody int empid) {
		return service.getEmployee(empid);
	}
	
	
	@GetMapping
	public List<Employee> getAllEmployee(){
		return service.getAllEmployees();
	}
	
	@DeleteMapping("/{id}")
	public String deleteEmployee(@PathVariable("id") int empId) {
		service.deleteEmployee(empId);
		return "Employee deleted successfullly";
	}
}
