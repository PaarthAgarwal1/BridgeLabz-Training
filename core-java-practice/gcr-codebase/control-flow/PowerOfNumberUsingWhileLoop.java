
import java.util.Scanner;

public class PowerOfNumberUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive as base: ");
        int base = sc.nextInt();
        System.out.print("Enter a positive integer as exponent: ");
        int power = sc.nextInt();
        if (power > 0 && base > 0) { // Checking if the exponent and base is a positive integer
            int result = 1; // Initialize result
            int count = 1; // Initialize counter
            while (count <= power) { // Loop to calculate power
                result *= base; // Multiply base for exponent times
                count++;
            }
            System.out.println(base + " raised to the power of " + power + " is: " + result);
        } else {
            System.out.println("Please enter a positive integer for the power and base.");
        }
        sc.close();
    }
}
