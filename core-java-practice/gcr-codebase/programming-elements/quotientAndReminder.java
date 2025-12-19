
import java.util.Scanner;

public class QuotientAndReminder {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dividend : ");
        int dividend = sc.nextInt();
        System.out.print("Enter the divisor : ");
        int divisor = sc.nextInt();
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println("The Quotient is " + quotient+" and Remainder is " + remainder+" of two numbers "+dividend+" and "+divisor);
    }
}
