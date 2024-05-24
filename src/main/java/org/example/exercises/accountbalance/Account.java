package org.example.exercises.accountbalance;

public class Account {
    private double balance;

    public Account(double initialBalance) {
        balance = initialBalance;
    }

    public double deposit(double depositAmount) {
        return balance += depositAmount;
    }

    public double withdraw(double withdrawalAmount) {
        if (balance < withdrawalAmount) {
            return balance;
        }
        return balance -= withdrawalAmount;
    }
}