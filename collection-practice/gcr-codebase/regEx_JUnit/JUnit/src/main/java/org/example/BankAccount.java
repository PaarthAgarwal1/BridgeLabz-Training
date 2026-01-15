package org.example;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }

    public void deposite(double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Deposite amount must be positive");
        }
        balance+=amount;
    }

    public void withdraw(int amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if(amount>balance){
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance-=amount;
    }

    public double getBalance() {
        return balance;
    }
}
