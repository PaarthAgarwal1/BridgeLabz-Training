
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to generate its multiplication table: ");
        int number = sc.nextInt();
        int [] table = new int[10]; // array to hold multiplication results
        for (int i = 0; i < 10; i++) {
            table[i] = number * (i + 1);
        }
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 0; i < 10; i++) {
            System.out.println(number + " x " + (i + 1) + " = " + table[i]); // displaying the results
        }

    }
}
