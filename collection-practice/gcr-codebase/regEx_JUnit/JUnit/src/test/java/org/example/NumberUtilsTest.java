package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.BeforeEach;
public class NumberUtilsTest {
    private NumberUtils numberUtils;

    @BeforeEach
    void setUp(){
        numberUtils=new NumberUtils();
    }

    @ParameterizedTest
    @ValueSource(ints = {2,4,6})
    void testIsEven_WithEvenNumbers(int number){
        assertTrue(numberUtils.isEven(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {7,9})
    void testIsEven_WithOddNumbers(int number){
        assertFalse(numberUtils.isEven(number));
    }

}
