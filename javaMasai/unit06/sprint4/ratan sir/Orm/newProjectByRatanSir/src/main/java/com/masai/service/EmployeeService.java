package com.masai.service;

import com.masai.model.Employee;

import java.util.List;

public interface EmployeeService {
	
	
	public Employee addEmployeeInDepartment(Integer deptId, Employee employee);
	
	
	public List<Employee> getAllEmployeesByDepartmentId(Integer deptId);
	
	public List<String> getEmployeeCustomDetails(Integer deptId);
	
	

}
