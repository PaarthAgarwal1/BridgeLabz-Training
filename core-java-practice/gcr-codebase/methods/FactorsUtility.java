import java.util.Scanner;

public class FactorsUtility {

    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {

        //count factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Create array of required size
        int[] factors = new int[count];

        //store factors
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to find the greatest factor
    public static int findGreatestFactor(int[] factors) {
        int max = Integer.MIN_VALUE;
        for (int f : factors) {
            if (f > max) {
                max = f;
            }
        }
        return max;
    }

    // Method to find sum of factors
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    // Method to find product of factors
    public static long findProductOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    // Method to find product of cube of factors
    public static double findProductOfCubes(int[] factors) {
        double product = 1;
        for (int f : factors) {
            product *= Math.pow(f, 3);
        }
        return product;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = findFactors(number);

        System.out.println("\nFactors:");
        for (int f : factors) {
            System.out.print(f + " ");
        }

        System.out.println("\n\nGreatest Factor: " +
                findGreatestFactor(factors));

        System.out.println("Sum of Factors: " +
                findSumOfFactors(factors));

        System.out.println("Product of Factors: " +
                findProductOfFactors(factors));

        System.out.println("Product of Cubes of Factors: " +
                findProductOfCubes(factors));

        sc.close();
    }
}
