import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Recursive method to find sum of n natural numbers
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumUsingRecursion(n - 1);
    }

    // Method to find sum using formula n*(n+1)/2
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Check for natural number
        if (n <= 0) {
            System.out.println("Please enter a valid natural number (n > 0).");
            return;
        }

        // Compute sums
        int recursiveSum = sumUsingRecursion(n);
        int formulaSum = sumUsingFormula(n);

        // Display results
        System.out.println("Sum using Recursion: " + recursiveSum);
        System.out.println("Sum using Formula  : " + formulaSum);

        // Compare results
        if (recursiveSum == formulaSum) {
            System.out.println("Both results are correct and equal.");
        } else {
            System.out.println("Results do not match.");
        }

        sc.close();
    }
}
