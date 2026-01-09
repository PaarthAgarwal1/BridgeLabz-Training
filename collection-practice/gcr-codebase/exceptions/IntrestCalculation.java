
public class IntrestCalculation {
    // Method implement exception using 'throws' 
    static double calculateInterest(double amount, double rate, int years)
            throws IllegalArgumentException {

        // Manually throw exception using 'throw'
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Amount and rate must be positive");
        }

        // Simple interest formula
        return (amount * rate * years) / 100;
    }

    public static void main(String[] args) {

        try {
            double interest = calculateInterest(10000, 5, 2);
            System.out.println("Calculated Interest: " + interest);

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: Amount and rate must be positive");
        }
    }

    
}
