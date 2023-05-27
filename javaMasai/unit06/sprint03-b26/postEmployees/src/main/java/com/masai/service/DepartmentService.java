package com.masai.service;

import com.masai.model.Department;

import java.util.List;

public interface DepartmentService {
	
	
	public Department addNewDepartment(Department dept);
	
	//public Department getDepartmentByEmployeeId(int empId);
	
	public List<String> getEmpDeptCustomDetails(Integer deptId);

}
