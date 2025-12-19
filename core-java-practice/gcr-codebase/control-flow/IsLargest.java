
import java.util.Scanner;

public class IsLargest {
    public static boolean isLargest(int num1, int num2, int num3) {
        return num1 > num2 && num1 > num3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        //checking for largest by relacing the order of the paremeters for all the numbers
        System.out.println("Is the first number largest? " + isLargest(num1, num2, num3));
        System.out.println("Is the second number largest? " + isLargest(num2, num1, num3));
        System.out.println("Is the third number largest? " + isLargest(num3, num1, num2));
        sc.close();
    }
}
