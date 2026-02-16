package org.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class CompanyEmpWageTest {

    private CompanyEmpWage company;

    @BeforeEach
    void setUp() {
        company = new CompanyEmpWage("Demo", 20, 20, 100);
    }

    @Test
    void testAddDailyWage() {
        company.addDailyWage(160);
        company.addDailyWage(80);

        assertEquals(2, company.getDailyWages().size());
    }

    @Test
    void testSetAndGetTotalWage() {
        company.setTotalEmpWage(1000);
        assertEquals(1000, company.getTotalEmpWage());
    }

    @Test
    void testCompanyName() {
        assertEquals("Demo", company.getCompanyName());
    }
}

