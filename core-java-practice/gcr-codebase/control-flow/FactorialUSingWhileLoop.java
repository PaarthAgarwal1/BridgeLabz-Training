import java.util.Scanner;

public class FactorialUSingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        if (number > 0) {
            int original = number; // store original input
            int factorial = 1;
            while (number > 0) {
                factorial *= number;
                number--;
            }
            System.out.println("The factorial of " + original + " is: " + factorial);
        } else {
            System.out.println("Please enter a natural number greater than 0.");
        }

        sc.close();
    }
}
