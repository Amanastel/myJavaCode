package com.masai.curd;

import com.masai.curd.account.dao.AccountDao;
import com.masai.curd.account.dao.impl.AccountDaoImpl;
import com.masai.curd.account.model.Account;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the account number: ");
        int inp = sc.nextInt();

        AccountDao dao = new AccountDaoImpl();

        /*Account ac = new Account();
        ac.setName("Aman");
        ac.setBalance(100);
       dao.createAccount(ac);
*/
        Account account = dao.findAccount(inp);
        System.out.println(account.toString());

      /*  account.setBalance(500);
        dao.updateAccount(account);*/


//        dao.deleteAccount(inp);




//        JPQL
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("sessionMgr");
        EntityManager em = entityManagerFactory.createEntityManager();

      /*  Query query = em.createQuery("Select e from Account e");
//        Query query2 = em.createQuery("Select e from Account e where e.name LIKE 'a%'");
        Query query2 = em.createNativeQuery("Select * from Account", Account.class);  // this is a native query

        List<Account> list = query2.getResultList();
        for (Account l : list){
            System.out.println(l.toString());
        }*/



      /*  Query query1 = em.createQuery("Select MAX(e.balance) from Account e");

        int balance = (int) query1.getSingleResult();
        System.out.println(balance);*/


        Query query4 = em.createNamedQuery("find account by id");
        query4.setParameter("number",4);

//        List<Account> list = query4.getResultList();
//
//        for (Account l : list) {
//            System.out.println(l.toString());
//        }

        List<Object[]> list2 = query4.getResultList();
        for (Object[] l : list2) {
            System.out.println(l[0]+" "+l[1]);
            System.out.println(l[0]+" "+l[1]);
        }



        Query query5 = em.createNamedQuery("find account by name");
        query5.setParameter("name","aman");

        List<Account> list = query5.getResultList();

        for (Account l : list) {
            System.out.println(l.toString());
        }

    }
}
