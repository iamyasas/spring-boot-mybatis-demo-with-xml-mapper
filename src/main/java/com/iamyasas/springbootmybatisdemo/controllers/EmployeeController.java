package com.iamyasas.springbootmybatisdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iamyasas.springbootmybatisdemo.constants.AuthConstants;
import com.iamyasas.springbootmybatisdemo.models.Employee;
import com.iamyasas.springbootmybatisdemo.services.EmployeeService;
import com.iamyasas.springbootmybatisdemo.utils.AuthUtils;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping
	public ResponseEntity<Employee[]> getEmployees(@RequestParam(required = false) String name, @CookieValue(required = false, name = AuthConstants.TOKEN) String token) {
		
		String userPrinciple = AuthUtils.getUserPrinciple(token);
		
		if (null != userPrinciple) {
			return ResponseEntity.ok().body(service.getEmployees(name));
		}
		else { 
			return new ResponseEntity<Employee[]>(HttpStatus.UNAUTHORIZED);
		}
	}
	
	@GetMapping("{employeeID}")
	public ResponseEntity<Employee> getEmployee(@PathVariable int employeeID, @CookieValue(required = false, name = AuthConstants.TOKEN) String token) {
		
		String userPrinciple = AuthUtils.getUserPrinciple(token);
		
		if (null != userPrinciple) {
			return ResponseEntity.ok().body(service.getEmployee(employeeID));
		}
		else { 
			return new ResponseEntity<Employee>(HttpStatus.UNAUTHORIZED);
		}
	}
}
