package com.masai.service;

import com.masai.model.Employee;

import java.util.List;

public interface EmployeeService {
	
	
	public Employee addEmployeeInDepartment(Integer deptId, Employee employee);
	
	public List<Employee> getAllEmployeesByDeptId(Integer deptId);

}
