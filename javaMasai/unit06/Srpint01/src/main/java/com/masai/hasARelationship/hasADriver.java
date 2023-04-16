package com.masai.hasARelationship;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class hasADriver {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("sessionMgr");
        EntityManager em = entityManagerFactory.createEntityManager();


        Students students = new Students();
        students.setName("aman");
        students.setMarks(99);

//        Address homeAddress = new Address("Hamirpur","UP","210301","home");
//        students.getAddressSet().add(homeAddress);
//
//        Address officeAddress = new Address("Bangalore","KN","530068","office");
//        students.getAddressSet().add(officeAddress);


         /*Address homeAddress = new Address("Hamirpur","UP","210301","home");
        Address officeAddress = new Address("Bangalore","KN","530068","office");

        students.getAddressSet().add(officeAddress);
        students.getAddressSet().add(homeAddress);

        em.getTransaction().begin();
        em.persist(students);

        em.getTransaction().commit();
        em.close();
*/

        Students student = em.find(Students.class,1);
//        em.close();
        System.out.println(student.getName());
        System.out.println(student.getMarks());
        System.out.println(student.getSid());


        for(Address a: student.getAddressSet()){
            System.out.println(a);
        }


    }
}
