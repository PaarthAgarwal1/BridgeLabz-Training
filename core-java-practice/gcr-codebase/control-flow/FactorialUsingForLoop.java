
import java.util.Scanner;

public class FactorialUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        if (number > 0) {
            int factorial = 1;
            for (int i = number; i > 0; i--) {
                factorial *= i;
            }
            System.out.println("The factorial of " + number + " is: " + factorial);
        } else {
            System.out.println("Please enter a natural number greater than 0.");
        }
        sc.close();
    }
}
