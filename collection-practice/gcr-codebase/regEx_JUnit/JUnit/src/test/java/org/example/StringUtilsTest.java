package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringUtilsTest {
    private StringUtils stringUtils;

    @BeforeEach
    void setUp(){
        stringUtils=new StringUtils();
    }

    @Test
    void testReverse(){
        assertEquals("olleh",stringUtils.reverse("hello"));
    }

    @Test
    void testIsPalindromeTrue(){
        assertTrue(stringUtils.isPalindrome("madam"));
    }

    @Test
    void testIsPalindromeFalse(){
        assertFalse(stringUtils.isPalindrome("hello"));
    }

    @Test
    void testToUpperCase(){
        assertEquals("JAVA",stringUtils.toUpperCase("java"));
    }

    @Test
    void testReverseWithNull(){
        assertNull(stringUtils.reverse(null));
    }
}
