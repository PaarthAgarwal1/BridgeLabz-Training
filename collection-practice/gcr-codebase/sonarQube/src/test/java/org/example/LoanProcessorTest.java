package org.example;

import org.example.LoanApplication;
import org.example.LoanProcessor;
import org.example.LoanResult;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LoanProcessorTest {

    LoanProcessor processor = new LoanProcessor();

    @Test
    void testLowRiskApproval() {
        LoanApplication app = new LoanApplication(30, 50000, 780, 500000, 10000);
        LoanResult result = processor.evaluate(app);

        assertTrue(result.isApproved());
        assertEquals("LOW", result.getRiskCategory());
        assertEquals(8.0, result.getInterestRate());
    }

    @Test
    void testMediumRiskApproval() {
        LoanApplication app = new LoanApplication(35, 40000, 700, 300000, 10000);
        LoanResult result = processor.evaluate(app);

        assertEquals("MEDIUM", result.getRiskCategory());
    }

    @Test
    void testHighRiskApproval() {
        LoanApplication app = new LoanApplication(40, 45000, 620, 200000, 10000);
        LoanResult result = processor.evaluate(app);

        assertEquals("HIGH", result.getRiskCategory());
    }

    @Test
    void testRejectedDueToLowScore() {
        LoanApplication app = new LoanApplication(30, 50000, 550, 200000, 10000);
        LoanResult result = processor.evaluate(app);

        assertFalse(result.isApproved());
    }

    @Test
    void testRejectedDueToHighLoanAmount() {
        LoanApplication app = new LoanApplication(30, 20000, 780, 1000000, 1000);
        LoanResult result = processor.evaluate(app);

        assertFalse(result.isApproved());
    }

    @Test
    void testRejectedDueToHighEMI() {
        LoanApplication app = new LoanApplication(30, 30000, 780, 200000, 20000);
        LoanResult result = processor.evaluate(app);

        assertFalse(result.isApproved());
    }

    @Test
    void testInvalidAgeThrowsException() {
        LoanApplication app = new LoanApplication(18, 30000, 780, 200000, 5000);

        assertThrows(IllegalArgumentException.class,
                () -> processor.evaluate(app));
    }
}
