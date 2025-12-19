
import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int base = sc.nextInt();
        System.out.print("Enter the exponent (non-negative integer): ");
        int power = sc.nextInt();
        if (power > 0 && base > 0) { // Checking if the exponent is a positive integer
            int result = 1; // Initialize result
            for (int i = 1; i <= power; i++) { // Loop to calculate power
                result *= base; // Multiply base for exponent times
            }
            System.out.println(base + " raised to the power of " + power + " is: " + result);
        } else {
            System.out.println("Please enter a positive integer for the power and base.");
        }
    }
}
