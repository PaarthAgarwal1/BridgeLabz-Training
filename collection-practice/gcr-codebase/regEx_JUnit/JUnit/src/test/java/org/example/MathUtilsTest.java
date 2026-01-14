package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class MathUtilsTest {
    @Test
    void testDivideByZeroThrowsException(){
        MathUtils mathUtils=new MathUtils();
        ArithmeticException exception=assertThrows(ArithmeticException.class,()->mathUtils.divide(10,0));
        assertEquals("Division by zero is not allowed",exception.getMessage());
    }
}
