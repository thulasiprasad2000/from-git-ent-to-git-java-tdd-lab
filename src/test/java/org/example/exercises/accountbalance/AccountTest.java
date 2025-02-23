package org.example.exercises.accountbalance;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AccountTest {
    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney() {
        Account account = new Account(100.0);
        assertThat(account.deposit(50.0), is(150.0));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney() {
        Account account = new Account(100.0);
        assertThat(account.withdraw(50.0), is(50.0));
    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal() {
        Account account = new Account(50.0);
        assertThat(account.withdraw(100.0), is(50.0));
    }
}