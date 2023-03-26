package com.employee.dao;

import com.employee.dto.Employee;
import com.employee.exception.NoRecordFoundException;
import com.employee.exception.SomethingWentWrongException;


import java.time.LocalDate;
import java.util.List;

public interface EmployeeDAO {
    public void addEmployee(Employee emp) throws SomethingWentWrongException;
    public void updateEmployee(Employee emp) throws SomethingWentWrongException;
    public void deleteEmployee(String empID) throws SomethingWentWrongException;
    public List<Employee> getEmployeeList() throws SomethingWentWrongException, NoRecordFoundException;
    public List<Employee> searchEmployeeByJoiningDateRange(LocalDate startDate, LocalDate endDate) throws SomethingWentWrongException, NoRecordFoundException;


}
