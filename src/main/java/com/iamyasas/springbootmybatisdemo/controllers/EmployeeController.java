package com.iamyasas.springbootmybatisdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iamyasas.springbootmybatisdemo.models.Employee;
import com.iamyasas.springbootmybatisdemo.services.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/employee")
	public Employee[] getEmployees() {
		return service.getEmployees();
	}
}
