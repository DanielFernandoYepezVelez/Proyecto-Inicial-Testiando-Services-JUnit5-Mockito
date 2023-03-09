package org.nextappoficial.test.springboot.app.repositories;

import org.nextappoficial.test.springboot.app.models.Bank;

import java.util.List;

public interface IBankRepository {

    List<Bank> findAll();
    Bank findById(Long id);
    void update(Bank bank);

}
