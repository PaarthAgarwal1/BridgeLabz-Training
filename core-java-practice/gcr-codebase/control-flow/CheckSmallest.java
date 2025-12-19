
import java.util.Scanner;

public class CheckSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        System.out.println("Is the first number smallest? " + (num1 < num2 && num1 < num3));
    }
}
