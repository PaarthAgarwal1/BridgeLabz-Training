package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
    BankAccount account;

    @BeforeEach
    void setUp(){
        account = new BankAccount(1000);
    }

    @Test
    void testDeposite(){
        account.deposite(500);
        assertEquals(1500,account.getBalance());
    }

    @Test
    void testWithdraw(){
        account.withdraw(300);
        assertEquals(700,account.getBalance());
    }

    @Test
    void testWithdrawInsufficientFunds(){
        assertThrows(IllegalArgumentException.class,()->account.withdraw(1500));
    }

    @Test
    void testDepositeInvalidAmount(){
        assertThrows(IllegalArgumentException.class,()->account.deposite(-100));
    }

    @Test
    void testWithdrawInvalidAmount(){
        assertThrows(IllegalArgumentException.class,()->account.withdraw(0));
    }
}

