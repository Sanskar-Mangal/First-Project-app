package com.vj.demo.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vj.demo.EmployeeRequest;
import com.vj.demo.entity.Employee;
import com.vj.demo.repo.EmployeeRepository;

import java.util.Optional;



@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	
	@Override
	public Employee saveEmployee(EmployeeRequest employeeRequest) {
		Employee employee = new Employee();
		if(employeeRequest.getEmployeeId() != 0) {
			Optional<Employee> emp = employeeRepository.findById(employeeRequest.getEmployeeId());
			if(emp.isPresent()) {
				employee = emp.get();
			}
			else{
				employee = new Employee();
			}
		}
		
		BeanUtils.copyProperties(employeeRequest, employee);
//		employee.setAddress(employeeRequest.getAddress());
//		employee.setAge(employeeRequest.getAge());
//		employee.setCompanyName(employeeRequest.getCompanyName());
//		employee.setDept(employeeRequest.getDept());
//		employee.setSalary(employeeRequest.getSalary());
		
		return employeeRepository.save(employee);
	}


	@Override
	public Employee getEmployee(Long id) {
		
		Optional<Employee> emp = employeeRepository.findById(id);
		if(emp.isPresent()) {
			return emp.get();
		}
		else {
			new Employee();
		}
		return null;
	}


	

}
