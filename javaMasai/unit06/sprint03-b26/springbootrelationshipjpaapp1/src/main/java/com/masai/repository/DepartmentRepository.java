package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.masai.model.Department;
import com.masai.model.Employee;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{

	
	@Query(value =  "select d.employees from Department d where d.deptId=?1")
	public List<Employee> getAllEmployeesByDeptId(Integer deptid);
	
	
	
	
	@Query("select e.ename,e.email,e.salary,d.dname,d.location from Employee e INNER JOIN Department d ON d.deptId=e.dept.deptId AND d.deptId = ?1")
	public List<String> getDeptEmpDetails(Integer deptId);
	
	
}



