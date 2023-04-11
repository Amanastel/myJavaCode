package com.masai.hasARelationship;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class hasADriver {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("sessionMgr");
        EntityManager em = entityManagerFactory.createEntityManager();


       /* Students students = new Students();
        students.setName("aman");
        students.setMarks(99);

        Address address = new Address("kanpur","UP","210301");
        students.setAddress(address);

        em.getTransaction().begin();
        em.persist(students);

        em.getTransaction().commit();
        em.close();*/

        Students students = em.find(Students.class,1);
        System.out.println(students.toString());
    }
}
