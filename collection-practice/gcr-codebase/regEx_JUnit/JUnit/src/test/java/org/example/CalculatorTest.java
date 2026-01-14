package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp(){
        calculator=new Calculator();
    }

    @Test
    void testAdd(){
        assertEquals(10,calculator.add(4,6));
    }

    @Test
    void testSubtract(){
        assertEquals(2,calculator.subtract(6,4));
    }

    @Test
    void testMultiply(){
        assertEquals(24,calculator.multiply(4,6));
    }

    @Test
    void testDivide(){
        assertEquals(2,calculator.divide(10,5));
    }

    @Test
    void testDivideByZero(){
        ArithmeticException exception=assertThrows(ArithmeticException.class,()->calculator.divide(10,0));
        assertEquals("Cannot divide by zero",exception.getMessage());

    }
}
