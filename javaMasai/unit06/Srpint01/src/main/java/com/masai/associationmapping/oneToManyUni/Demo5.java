package com.masai.associationmapping.oneToManyUni;

import com.masai.associationmapping.oneTOManyBi.Department;
import com.masai.associationmapping.oneTOManyBi.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo5 {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("sessionMgr3");
        EntityManager em = entityManagerFactory.createEntityManager();

        User user = new User();
        user.setUserID(1);
        user.setUserName("Aman Kumar");

        Phone phone = new Phone();
        phone.setUserID(1);
        phone.setPhoneNumber("7007219431");

        Phone phone2 = new Phone();
        phone2.setUserID(1);
        phone2.setPhoneNumber("8009626557");

        Phone phone3 = new Phone();
        phone3.setUserID(1);
        phone3.setPhoneNumber("7080410664");

        List<Phone> phoneList = new ArrayList<>();
        phoneList.add(phone);
        phoneList.add(phone2);
        phoneList.add(phone3);

        user.setPhoneList(phoneList);

        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        em.close();


    }
}
