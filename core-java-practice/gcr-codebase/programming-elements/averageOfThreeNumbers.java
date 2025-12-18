import java.util.Scanner;
public class averageOfThreeNumbers {
    public static double calculateAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int number1 = sc.nextInt();
        System.out.println("Enter second number:");
        int number2 = sc.nextInt();
        System.out.println("Enter third number:");
        int number3 = sc.nextInt();
        double average = calculateAverage(number1, number2, number3);
        System.out.println("Average of " + number1 + ", " + number2 + ", and " + number3 + " is: " + average);
    }
}
