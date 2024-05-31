package com.app.cjc.serviceint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.cjc.model.Employee;
import com.app.cjc.repo.EmployeeRepo;

@Service
public class EmployeeService implements EmployeeServiceint {
	
	@Autowired
	EmployeeRepo er;

	@Override
	public Employee addEmployee(Employee e) {
		Employee save = er.save(e);
		return save;
	}

}
