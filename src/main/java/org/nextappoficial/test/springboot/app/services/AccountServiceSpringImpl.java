package org.nextappoficial.test.springboot.app.services;

import org.nextappoficial.test.springboot.app.models.Account;
import org.nextappoficial.test.springboot.app.models.Bank;
import org.nextappoficial.test.springboot.app.repositories.IAccountRepository;
import org.nextappoficial.test.springboot.app.repositories.IBankRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@Primary
public class AccountServiceSpringImpl implements IAccountService {

    private IAccountRepository accountRepository;
    private IBankRepository bankRepository;

    public AccountServiceSpringImpl(IAccountRepository accountRepository, IBankRepository bankRepository) {
        this.accountRepository = accountRepository;
        this.bankRepository = bankRepository;
    }

    @Override
    public Account findById(Long id) {
        return accountRepository.findById(id);
    }

    @Override
    public int reviewTotalTransfer(Long bankId) {
        Bank bank = bankRepository.findById(bankId);
        return bank.getTotalTransfer();
    }

    @Override
    public BigDecimal reviewBalance(Long accountId) {
        Account account = accountRepository.findById(accountId);
        return account.getBalance();
    }

    @Override
    public void transfer(Long bankId, Long numberAccountOrigin, Long numberAccountDestination, BigDecimal amount) {
        Account accountOrigin = accountRepository.findById(numberAccountOrigin);
        accountOrigin.debit(amount);
        accountRepository.update(accountOrigin);

        Account accountDestination = accountRepository.findById(numberAccountDestination);
        accountDestination.credit(amount);
        accountRepository.update(accountDestination);

        Bank bank = bankRepository.findById(bankId);
        int totalTransfer = bank.getTotalTransfer();
        bank.setTotalTransfer(++totalTransfer);
        bankRepository.update(bank);
    }
}
