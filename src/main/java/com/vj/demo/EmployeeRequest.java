package com.vj.demo;



public class EmployeeRequest {

	private Long employeeId;
	private Long salary;
	private String companyName;
	private String dept;
	private Long age;
	private String address;
	
	
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployee_Id(Long employeeId) {
		this.employeeId = employeeId;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "EmployeeRequest [employee_Id=" + employeeId + ", salary=" + salary + ", companyName=" + companyName
				+ ", dept=" + dept + ", age=" + age + ", address=" + address + "]";
	}
	
	
}
