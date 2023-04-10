package com.masai.curd.account.dao.impl;

import com.masai.curd.account.dao.AccountDao;
import com.masai.curd.account.model.Account;
import com.masai.curd.account.util.EMUtils;

import javax.persistence.EntityManager;

public class AccountDaoImpl implements AccountDao {
    @Override
    public void createAccount(Account account) {
        EntityManager em = EMUtils.getEntityManager();

        em.getTransaction().begin();
        em.persist(account);
        em.getTransaction().commit();
        System.out.println("Insertion happened");
        em.close();

    }

    @Override
    public Account findAccount(int accountNumber) {
        EntityManager em = EMUtils.getEntityManager();


        return em.find(Account.class, accountNumber);
    }

    @Override
    public void deleteAccount(int accno) {
        EntityManager em = EMUtils.getEntityManager();

        Account account = em.find(Account.class, accno);

        if(account != null){
            em.getTransaction().begin();
            em.remove(account);
            em.getTransaction().commit();
            System.out.println("account deleted");

        }

        em.close();

    }

    @Override
    public void updateAccount(Account account) {
//        EntityManagerFactory entityManagerFactory =
//                Persistence.createEntityManagerFactory("sessionMgr");
//        EntityManager em = entityManagerFactory.createEntityManager();

        EntityManager em = EMUtils.getEntityManager();

        em.getTransaction().begin();
        em.merge(account);
        em.getTransaction().commit();

        System.out.println("Account updated");
        em.close();
    }
}
