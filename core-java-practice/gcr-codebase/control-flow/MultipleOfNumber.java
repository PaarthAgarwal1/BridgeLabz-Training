
import java.util.Scanner;

public class MultipleOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number below 100 : ");
        int number = sc.nextInt();
        if (number > 0 && number<100) { // Checking if the number is a natural number
            System.out.println("Multiples of " + number + " up to 100 are:");
            for (int i = 100; i>=1;i--) {
                if (i % number == 0) { // Checking if i is a multiple of number
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Please enter a natural number greater than 0 and less than 100.");
        }
        sc.close();
    }
}
