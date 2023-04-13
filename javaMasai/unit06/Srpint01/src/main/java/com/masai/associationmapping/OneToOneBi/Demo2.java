package com.masai.associationmapping.OneToOneBi;

import com.masai.associationmapping.OneToOneUni.Employee;
import com.masai.associationmapping.OneToOneUni.EmployeeDetails;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo2 {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("sessionMgr2");
        EntityManager em = entityManagerFactory.createEntityManager();



       Passport passport = new Passport();
       passport.setpNumber("123456");
       User user = new User();
       user.setUsername("Anshika");

       passport.setUser(user);

       user.setPassport(passport);

        em.getTransaction().begin();
        em.persist(passport);
        em.getTransaction().commit();
        em.close();


    }
}
