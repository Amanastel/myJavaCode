package com.masai.associationmapping.oneTOManyBi;

import com.masai.associationmapping.maniToOneUni.Address;
import com.masai.associationmapping.maniToOneUni.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashSet;
import java.util.Set;

public class Demo4 {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("sessionMgr3");
        EntityManager em = entityManagerFactory.createEntityManager();

        Department department =new Department();
        department.setDeptName("HR");

        Employee employee1 = new Employee();
        employee1.setEmpName("Rahul");
        employee1.setDepartment(department);

        Employee employee2 = new Employee();
        employee2.setEmpName("Aman");
        employee2.setDepartment(department);

        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(employee1);
        employeeSet.add(employee2);

        department.setEmployees(employeeSet);

        em.getTransaction().begin();
        em.persist(department);
        em.getTransaction().commit();
        em.close();


    }
}
