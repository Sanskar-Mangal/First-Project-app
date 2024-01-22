package com.vj.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vj.demo.EmployeeRequest;
import com.vj.demo.entity.Employee;
import com.vj.demo.service.EmployeeService;

@RestController
@RequestMapping("api/v1/employee/")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("save")
	public ResponseEntity<String> saveEmployee(@RequestBody EmployeeRequest employeeRequest){
		Employee employee = employeeService.saveEmployee(employeeRequest);
		if(employee != null) {
			return new ResponseEntity<>("Employee Added...",HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>("Something went wrong...",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("get/{id}")
	public Employee getEmployeeById(@PathVariable Long id) {
		return employeeService.getEmployee(id);
	}
}
