package com.masai.isARelationship;

import com.masai.associationmapping.maniToOneUni.Address;
import com.masai.associationmapping.maniToOneUni.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class IsADemo {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("sessionMgr3");
        EntityManager em = entityManagerFactory.createEntityManager();

        Book book = new Book();
        book.setName("Physics");
        book.setAuthor("C.V.raman");
        book.setProductID(1L);

        Pen pen = new Pen();
        pen.setName("parker");
        pen.setColor("blue");
        pen.setProductID(2L);

        em.getTransaction().begin();
        em.persist(book);
        em.persist(pen);
        em.getTransaction().commit();
        em.close();

//        Book book2 = em.find(Book.class,1L);
//        System.out.println(book2.getName()+" "+ book2.getAuthor());


    }
}
