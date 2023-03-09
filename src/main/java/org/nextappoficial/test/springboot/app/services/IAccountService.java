package org.nextappoficial.test.springboot.app.services;

import org.nextappoficial.test.springboot.app.models.Account;

import java.math.BigDecimal;

public interface IAccountService {

    Account findById(Long id);
    int reviewTotalTransfer(Long bankId);
    BigDecimal reviewBalance(Long accountId);
    void transfer(Long bankId, Long numberAccountOrigin, Long numberAccountDestination, BigDecimal amount);

}
