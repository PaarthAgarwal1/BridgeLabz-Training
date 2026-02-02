package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UnitTest {

    @Test
    public void Test_Deposit_ValidAmount() {
        Program account = new Program(100.0);

        account.deposit(50.0);

        assertEquals(150.0, account.balance);
    }

    @Test
    public void Test_Deposit_NegativeAmount() {
        Program account = new Program(100.0);

        Exception exception = assertThrows(RuntimeException.class, () -> {account.deposit(-20.0);});

        assertEquals("Deposit amount cannot be negative", exception.getMessage());
    }

    @Test
    public void Test_Withdraw_ValidAmount() {
        Program account = new Program(200.0);

        account.withdraw(80.0);

        assertEquals(120.0, account.balance);
    }

    @Test
    public void Test_Withdraw_InsufficientFunds() {
        Program account = new Program(50.0);

        Exception exception = assertThrows(RuntimeException.class, () -> {account.withdraw(100.0);});

        assertEquals("Insufficient funds.", exception.getMessage());
    }
}

