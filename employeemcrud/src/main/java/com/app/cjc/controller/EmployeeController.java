package com.app.cjc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.cjc.model.Employee;
import com.app.cjc.serviceint.EmployeeServiceint;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeServiceint es;
	
	
	
	@PostMapping("/save")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee e)
	{
		Employee emp = es.addEmployee(e);
		ResponseEntity<Employee> re = new ResponseEntity<Employee>(emp, HttpStatus.CREATED);
		return re;
	}

	@GetMapping("/allEmployee")
	public List<Employee> getAllEmployee()
	{
		
	}

}
