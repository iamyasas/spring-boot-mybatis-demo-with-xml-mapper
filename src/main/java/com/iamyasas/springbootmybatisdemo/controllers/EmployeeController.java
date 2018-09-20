package com.iamyasas.springbootmybatisdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iamyasas.springbootmybatisdemo.models.Employee;
import com.iamyasas.springbootmybatisdemo.services.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping
	public Employee[] getEmployees(@RequestParam(required = false) String name) {
		return service.getEmployees(name);
	}
	
	@GetMapping("{employeeID}")
	public Employee getEmployee(@PathVariable int employeeID) {
		return service.getEmployee(employeeID);
	}
}
