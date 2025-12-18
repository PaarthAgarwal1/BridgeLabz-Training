import java.util.Scanner;

public class addTwoNumbers {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers to add:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int sum = add(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
