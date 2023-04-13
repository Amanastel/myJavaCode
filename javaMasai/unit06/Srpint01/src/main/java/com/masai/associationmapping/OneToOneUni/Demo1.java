package com.masai.associationmapping.OneToOneUni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo1 {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("sessionMgr2");
        EntityManager em = entityManagerFactory.createEntityManager();


        Employee employee = new Employee();
        employee.setName("Aman Singh");
        employee.setEmpID(1);

        EmployeeDetails employeeDetails = new EmployeeDetails();
        employeeDetails.setAge(26);
        employeeDetails.setState("UP");
        employeeDetails.setEmpID(1);


        employee.setEmployeeDetails(employeeDetails);


        em.getTransaction().begin();
        em.persist(employee);
        em.getTransaction().commit();
        em.close();


    }
}
