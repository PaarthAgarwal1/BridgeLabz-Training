
import java.util.Scanner;

public class MultipleOfNumberUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number below 100 : ");
        int number = sc.nextInt();
        if (number > 0 && number < 100) { // Checking if the number is a natural number and less than 100
            System.out.println("Multiples of " + number + " up to 100 are:");
            int counter = 100;
            while (counter >= 1) {
                if (counter % number == 0) { // Checking if counter is a multiple of number
                    System.out.println(counter);
                }
                counter--;
            }
        } else {
            System.out.println("Please enter a natural number greater than 0 and less than 100.");
        }
    }
}
