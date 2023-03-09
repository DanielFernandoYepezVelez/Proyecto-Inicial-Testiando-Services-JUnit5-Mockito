/*
package org.nextappoficial.test.springboot.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.nextappoficial.test.springboot.app.exceptions.InsufficientMoneyEception;
import org.nextappoficial.test.springboot.app.models.Account;
import org.nextappoficial.test.springboot.app.models.Bank;
import org.nextappoficial.test.springboot.app.repositories.IAccountRepository;
import org.nextappoficial.test.springboot.app.repositories.IBankRepository;
import org.nextappoficial.test.springboot.app.services.AccountServiceImpl;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class SpringbootAnotacionesMockTests {

    @Mock
    IAccountRepository accountRepository;

    @Mock
    IBankRepository bankRepository;

    @InjectMocks
    AccountServiceImpl accountService;

    @Test
    void transferirDineroDeUnaCuentaAOtra() {
*/
/*
 GIVEN

 Creo Mi Contexto De Prueba
*//*


        Mockito.when(accountRepository.findById(1L)).thenReturn(Datos.createAccount001());
        Mockito.when(accountRepository.findById(2L)).thenReturn(Datos.createAccount002());
        Mockito.when(bankRepository.findById(1L)).thenReturn(Datos.createBank());

 */
/*WHEN

 Obtengo Los Saldos En Un Primer Momento *//*


        BigDecimal accountBalanceOrigin = accountService.reviewBalance(1L);
        BigDecimal accountBalanceDestination = accountService.reviewBalance(2L);

*/
/* THEN

 Verifico Los Saldos, Que La expectativa Sea Igual A Mi Realidad *//*


        Assertions.assertEquals("1000", accountBalanceOrigin.toPlainString());
        Assertions.assertEquals("2000", accountBalanceDestination.toPlainString());

        */
/* Ejecuto La Transferencia *//*


        accountService.transfer(1L, 1L, 2L, new BigDecimal("100"));

        */
/* Obtengo Los Saldos En Un Segundo Momento, Después De La Transferencia *//*


        accountBalanceOrigin = accountService.reviewBalance(1L);
        accountBalanceDestination = accountService.reviewBalance(2L);

        */
/*Verifico Los Saldos Nuevamente, Que La expectativa Sea Igual A Mi Realidad *//*


        Assertions.assertEquals("900", accountBalanceOrigin.toPlainString());
        Assertions.assertEquals("2100", accountBalanceDestination.toPlainString());

        */
/*Verifico La Cantidad De Veces Que Se Invocaron Los Respectivos Métodos Del Mock Account *//*


        Mockito.verify(accountRepository, Mockito.times(3)).findById(1L);
        Mockito.verify(accountRepository, Mockito.times(3)).findById(2L);
        Mockito.verify(accountRepository, Mockito.times(2)).update(ArgumentMatchers.any(Account.class));

        */
/* Reviso El Total De La Transferencia *//*


        int reviewTotalTransfer = accountService.reviewTotalTransfer(1L);

        */
/*Verifico El Total Transferencia, Que La expectativa Sea Igual A Mi Realidad *//*


        Assertions.assertEquals(1, reviewTotalTransfer);

        */
/* Verifico La Cantidad De Veces Que Se Invocaron Los Respectivos Métodos Del Mock Bank *//*


        Mockito.verify(bankRepository, Mockito.times(2)).findById(1L);
        Mockito.verify(bankRepository).update(ArgumentMatchers.any(Bank.class));

        Mockito.verify(accountRepository, Mockito.never()).findAll();
        Mockito.verify(accountRepository, Mockito.times(6)).findById(ArgumentMatchers.anyLong());
    }

    @Test
    void dineroInsuficienteParaTransferir() {
        */
/*GIVEN *//*


        Mockito.when(accountRepository.findById(1L)).thenReturn(Datos.createAccount001());
        Mockito.when(accountRepository.findById(2L)).thenReturn(Datos.createAccount002());
        Mockito.when(bankRepository.findById(1L)).thenReturn(Datos.createBank());

        */
/*WHEN *//*


        BigDecimal accountBalanceOrigin = accountService.reviewBalance(1L);
        BigDecimal accountBalanceDestination = accountService.reviewBalance(2L);

        */
/*THEN *//*


        Assertions.assertEquals("1000", accountBalanceOrigin.toPlainString());
        Assertions.assertEquals("2000", accountBalanceDestination.toPlainString());

        Assertions.assertThrows(InsufficientMoneyEception.class, () -> {
            accountService.transfer(1L, 1L, 2L, new BigDecimal("1200"));
        });

        accountBalanceOrigin = accountService.reviewBalance(1L);
        accountBalanceDestination = accountService.reviewBalance(2L);

        Assertions.assertEquals("1000", accountBalanceOrigin.toPlainString());
        Assertions.assertEquals("2000", accountBalanceDestination.toPlainString());

        Mockito.verify(accountRepository, Mockito.times(3)).findById(1L);
        Mockito.verify(accountRepository, Mockito.times(2)).findById(2L);
        Mockito.verify(accountRepository, Mockito.never()).update(ArgumentMatchers.any(Account.class));

        int reviewTotalTransfer = accountService.reviewTotalTransfer(1L);

        Assertions.assertEquals(0, reviewTotalTransfer);

        Mockito.verify(bankRepository, Mockito.times(1)).findById(1L);
        Mockito.verify(bankRepository, Mockito.never()).update(ArgumentMatchers.any(Bank.class));

        Mockito.verify(accountRepository, Mockito.never()).findAll();
        Mockito.verify(accountRepository, Mockito.times(5)).findById(ArgumentMatchers.anyLong());
    }

    @Test
    void verificandoSiEsElMismoObjetoCuenta() {
        */
/*GIVEN*//*


        Mockito.when(accountRepository.findById(1L)).thenReturn(Datos.createAccount001());

        */
/*WHEN *//*


        Account accountOne = accountService.findById(1L);
        Account accountTwo = accountService.findById(1L);

        */
/* THEN *//*


        Assertions.assertSame(accountOne, accountTwo);
        Assertions.assertTrue(accountOne == accountTwo);
        Assertions.assertEquals("Daniel", accountOne.getName());
        Assertions.assertEquals("Daniel", accountTwo.getName());

        Mockito.verify(accountRepository, Mockito.times(2)).findById(1L);
    }
}
*/
