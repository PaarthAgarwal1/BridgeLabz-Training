package org.example;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class DateFormatterTest {

    private  DateFormatter formatter;
    
    @BeforeEach
    void setUp(){
        formatter=new DateFormatter();
    }

    @Test
    void testValidDateFormatting(){
        assertEquals("31-01-2024",formatter.formateDate("2024-01-31"));
        assertEquals("05-12-2023", formatter.formateDate("2023-12-05"));
    }

    @Test
    void testInvalidDateFormat() {
        assertThrows(IllegalArgumentException.class, () -> formatter.formateDate("31-01-2024"));
    }

    @Test
    void testInvalidDateValue() {
        assertThrows(IllegalArgumentException.class, () -> formatter.formateDate("02-2024-30"));
    }

    @Test
    void testNullInput() {
        assertThrows(IllegalArgumentException.class, () -> formatter.formateDate(null));
    }

}
