
import java.util.Scanner;

public class SumOfNaturalNumber {
    //method to calculate sum of natural numbers up to n
    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    //for checking whether the number is natural number or not
    public static boolean isNaturalNumber(int number) {
        return number > 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();
        //checking and calculating sum if it is a natural number
        if (isNaturalNumber(number)) {
            int sum = sumOfNaturalNumbers(number);
            System.out.println("The sum of "+ number +" natural numbers is " + sum);
        } else {
            System.out.println("The number "+number + " is not a natural number.");
        }
        sc.close();
    }
}
