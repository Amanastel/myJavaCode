package com.masai.curd.account.model;

import javax.persistence.*;

//@Entity
@NamedQuery(name = "find account by id", query = "Select e.name, e.balance from Account e where e.accno = :number")
//@NamedQuery(name = "find account by id",
//            query = "Select NEW com.masai.curd.account.model.Account(e.name, e.balance) from Account e where e.accno = :number")

@NamedNativeQuery(name = "find account by name", query = "Select * from Account where name = :name",resultClass = Account.class)
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int accno;
    private String name;
    private int balance;

    public Account(int accno, String name, int balance) {
        this.accno = accno;
        this.name = name;
        this.balance = balance;
    }

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public Account() {
    }

    public int getAccno() {
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "Account Number=" + accno +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
