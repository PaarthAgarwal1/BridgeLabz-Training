import java.util.Scanner;

public class QuotientAndRemainder {

    // Method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2];

        result[0] = number / divisor;  // Quotient
        result[1] = number % divisor;  // Remainder

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        // Method call
        int[] output = findRemainderAndQuotient(number, divisor);

        // Display result
        System.out.println("Quotient = " + output[0]);
        System.out.println("Remainder = " + output[1]);

        sc.close();
    }
}
