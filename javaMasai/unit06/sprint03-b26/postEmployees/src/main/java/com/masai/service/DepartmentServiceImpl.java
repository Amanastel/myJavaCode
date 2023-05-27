package com.masai.service;

import com.masai.model.Department;
import com.masai.model.Employee;
import com.masai.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	
	@Autowired
	private DepartmentRepository deptDepartmentRepository;
	
	
	@Override
	public Department addNewDepartment(Department dept) {
        List<Employee> employees = dept.getEmployees();
        //linking/associating all the employee with their deprtment
        for(Employee emp:employees)
            emp.setDept(dept);
		return deptDepartmentRepository.save(dept);

	}


	@Override
	public List<String> getEmpDeptCustomDetails(Integer deptId) {
		
		return deptDepartmentRepository.getDeptEmpDetails(deptId);
	}

	

	
	
}
