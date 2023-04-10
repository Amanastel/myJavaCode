package com.masai.curd.account.dao;

import com.masai.curd.account.model.Account;

public interface AccountDao {
    public void createAccount(Account account);
    public Account findAccount(int accountNumber);
    public void deleteAccount(int accno);
    public void updateAccount(Account account);
}
