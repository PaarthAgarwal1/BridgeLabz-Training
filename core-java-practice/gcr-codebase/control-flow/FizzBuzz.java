
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                if (i % 3 == 0 && i % 5 == 0) { //check divisibility of both 3 and 5
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) { //check divisibility of 3
                    System.out.println("Fizz");
                } else if (i % 5 == 0) { //check divisibility of 5
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Please enter a natural number greater than 0.");
        }
    }
}
