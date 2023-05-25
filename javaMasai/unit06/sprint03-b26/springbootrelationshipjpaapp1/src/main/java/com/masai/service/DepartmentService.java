package com.masai.service;

import java.util.List;

import com.masai.model.Department;

public interface DepartmentService {
	
	
	public Department addNewDepartment(Department dept);
	
	//public Department getDepartmentByEmployeeId(int empId);
	
	public List<String> getEmpDeptCustomDetails(Integer deptId);

}
