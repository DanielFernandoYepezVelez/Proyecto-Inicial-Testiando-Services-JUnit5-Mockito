package org.nextappoficial.test.springboot.app;

import org.nextappoficial.test.springboot.app.models.Account;
import org.nextappoficial.test.springboot.app.models.Bank;

import java.math.BigDecimal;

public class Datos {
    //public static final Account ACCOUNT_001 = new Account(1L, "Daniel", new BigDecimal("1000"));
    //public static final Account ACCOUNT_002 = new Account(2L, "Fernando", new BigDecimal("2000"));
    //public static final Bank BANK = new Bank(1L, "El Banco Financiero", 0);

    public static Account createAccount001() {
        return new Account(1L, "Daniel", new BigDecimal("1000"));
    }

    public static Account createAccount002() {
        return new Account(2L, "Fernando", new BigDecimal("2000"));
    }

    public static Bank createBank() {
        return new Bank(1L, "El Banco Financiero", 0);
    }

}
