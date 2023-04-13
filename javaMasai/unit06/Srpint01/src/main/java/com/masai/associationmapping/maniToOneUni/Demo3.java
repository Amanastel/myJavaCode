package com.masai.associationmapping.maniToOneUni;

import com.masai.associationmapping.OneToOneBi.Passport;
import com.masai.associationmapping.OneToOneBi.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo3 {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("sessionMgr2");
        EntityManager em = entityManagerFactory.createEntityManager();



        Address address = new Address();
        address.setaID(1);
        address.setCity("mumbai");
        address.setPinCode("123456");

        Student student = new Student();
        student.setName("Aman");
        student.setAddress(address);

        Student student2 = new Student();
        student2.setName("Kartik");
        student2.setAddress(address);

        Student student3 = new Student();
        student3.setName("Leone");
        student3.setAddress(address);

        em.getTransaction().begin();
        em.persist(student);
        em.persist(student2);
        em.persist(student3);
        em.getTransaction().commit();
        em.close();


    }
}
