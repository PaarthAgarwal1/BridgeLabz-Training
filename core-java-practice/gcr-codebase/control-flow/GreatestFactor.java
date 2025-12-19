
import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();
        if (number > 0) {// Checking if the number is a natural number
            int greatestFactor = 1; // Initialize greatest factor
            for (int i = number - 1; i >= 1; i--) { // Start checking from number-1 down to 1
                if (number % i == 0) { // Checking if i is a factor of number
                    greatestFactor = i; // Update greatest factor
                    break; // Exit loop after finding the greatest factor
                }
            }
            System.out.println("Greatest factor of " + number + " (excluding itself) is: " + greatestFactor);
        } else {
            System.out.println("Please enter a natural number greater than 0.");
        }
        sc.close();
    }
}
