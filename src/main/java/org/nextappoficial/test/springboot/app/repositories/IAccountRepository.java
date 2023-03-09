package org.nextappoficial.test.springboot.app.repositories;

import org.nextappoficial.test.springboot.app.models.Account;

import java.util.List;

public interface IAccountRepository {

    List<Account> findAll();
    Account findById(Long id);
    void update(Account account);

}