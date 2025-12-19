
import java.util.Scanner;

public class GreatestFactorUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();
        if (number > 0) { // Checking if the number is a natural number
            int greatestFactor = 1; // Initialize greatest factor
            int counter = number - 1; // Start checking from number-1 down to 1
            while (counter >= 1) { // Loop until i is greater than or equal to counter
                if (number % counter == 0) { // Checking if counter is a factor of number
                    greatestFactor = counter; // Update greatest factor
                    break; // Exit loop after finding the greatest factor
                }
                counter--; // Decrement counter
            }
            System.out.println("Greatest factor of " + number + " (excluding itself) is: " + greatestFactor);
        } else {
            System.out.println("Please enter a natural number greater than 0.");
        }
        sc.close();
    }
}
