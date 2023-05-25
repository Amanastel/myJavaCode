package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.Department;
import com.masai.model.Employee;
import com.masai.repository.DepartmentRepository;
import com.masai.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private DepartmentRepository deptRepo;
	
	@Autowired
	private EmployeeRepository empRepo;
	
	
	
	@Override
	public Employee addEmployeeInDepartment(Integer deptId, Employee employee) {
	
		Optional<Department> opt= deptRepo.findById(deptId);
		
		
		if(opt.isPresent()) {
			
			Department dept= opt.get();
			
			//associating emp with dept
			employee.setDept(dept);
			
			//associating dept with emp
			
			dept.getEmployees().add(employee);
			
			
			return empRepo.save(employee);
			
			
			
		}else
			throw new IllegalArgumentException("Invalid Department Details");
		
		
		
		
		
	}



	@Override
	public List<Employee> getAllEmployeesByDeptId(Integer deptId) {
		
		
		//Department dept= deptRepo.findById(deptId).orElseThrow(() -> new RuntimeException("Invalid Dept id :"));
		
		//return dept.getEmployees();
		
		return deptRepo.getAllEmployeesByDeptId(deptId);
		
		
	}

	
	
	
	
	
}
