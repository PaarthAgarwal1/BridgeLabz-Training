import java.util.Scanner;

public class FibonacciSequence {

    // Function to calculate and print Fibonacci sequence
    public static void printFibonacci(int terms) {
        int first = 0, second = 1;

        System.out.println("Fibonacci Sequence:");

        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int terms = sc.nextInt();

        if (terms <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            printFibonacci(terms);
        }
    }
}
