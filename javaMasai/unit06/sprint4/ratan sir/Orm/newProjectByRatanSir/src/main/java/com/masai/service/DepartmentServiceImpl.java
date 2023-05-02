package com.masai.service;

import com.masai.model.Department;
import com.masai.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	
	@Autowired
	private DepartmentRepository deptDepartmentRepository;
	
	
	@Override
	public Department addNewDepartment(Department dept) {
	
		return deptDepartmentRepository.save(dept);
	}

}
