package org.example;

public class Program {
    public double balance;
    public Program(double balance){
        this.balance=balance;
    }

    public void deposit(double amount){
        if(amount<0){
            throw new RuntimeException("Deposit amount cannot be negative");
        }
        balance+=amount;
    }
    public void withdraw(double amount){
        if(amount>balance){
            throw new RuntimeException("Insufficient funds.");
        }
        balance-=amount;
    }
}
