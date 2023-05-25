package com.masai.service;

import java.util.List;

import com.masai.model.Employee;

public interface EmployeeService {
	
	
	public Employee addEmployeeInDepartment(Integer deptId, Employee employee);
	
	public List<Employee> getAllEmployeesByDeptId(Integer deptId);

}
