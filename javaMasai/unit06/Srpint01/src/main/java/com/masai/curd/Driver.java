package com.masai.curd;

import com.masai.curd.account.dao.AccountDao;
import com.masai.curd.account.dao.impl.AccountDaoImpl;

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
       /* Account account = dao.findAccount(inp);
        System.out.println(account.toString());*/

      /*  account.setBalance(500);
        dao.updateAccount(account);*/


        dao.deleteAccount(inp);

    }
}
