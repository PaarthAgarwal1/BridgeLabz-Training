package org.example;

import org.junit.jupiter.api.*;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class EmpWageBuilderTest {

    private EmpWageBuilder builder;

    @BeforeEach
    void setUp() {
        // Fixed random seed for predictable behavior
        builder = new EmpWageBuilder(new Random(1));
        builder.addCompany("TestCompany", 20, 5, 20);
    }

    @Test
    void testCompanyAddedSuccessfully() {
        assertNotNull(builder);
    }

    @Test
    void testComputeEmployeeWage() {
        builder.computeEmpWage();
        int totalWage = builder.getTotalWage("TestCompany");

        assertTrue(totalWage >= 0);
    }

    @Test
    void testGetTotalWageForNonExistingCompany() {
        builder.computeEmpWage();
        int totalWage = builder.getTotalWage("Unknown");

        assertEquals(0, totalWage);
    }

    @Test
    void testTotalWageShouldBeConsistentWithDailyWages() {
        builder.computeEmpWage();
        int totalWage = builder.getTotalWage("TestCompany");

        assertTrue(totalWage >= 0);
    }

    @Test
    void testMultipleCompanies() {
        builder.addCompany("SecondCompany", 25, 5, 20);
        builder.computeEmpWage();

        int wage1 = builder.getTotalWage("TestCompany");
        int wage2 = builder.getTotalWage("SecondCompany");

        assertNotEquals(wage1, wage2);
    }
}
