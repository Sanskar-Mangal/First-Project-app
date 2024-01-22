package com.vj.demo.service;

import com.vj.demo.EmployeeRequest;
import com.vj.demo.entity.Employee;

public interface EmployeeService {
	
	public Employee saveEmployee(EmployeeRequest employeeRequest);
	
	public Employee getEmployee(Long id);

}
