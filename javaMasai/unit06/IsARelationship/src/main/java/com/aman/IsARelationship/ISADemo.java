package com.aman.IsARelationship;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ISADemo {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("sessionMgr3");
        EntityManager em = entityManagerFactory.createEntityManager();

        Book book = new Book();
        book.setName("Physics");
        book.setAuthor("C.V.raman");
        book.setProductID(1);

        Pen pen = new Pen();
        pen.setName("parker");
        pen.setColor("blue");
        pen.setProductID(2);

        em.getTransaction().begin();
        em.persist(book);
        em.persist(pen);
        em.getTransaction().commit();
        em.close();


    }
}
