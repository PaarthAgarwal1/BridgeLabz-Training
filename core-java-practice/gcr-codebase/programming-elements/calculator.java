
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to perform arithmetic operations:");
        int number1=sc.nextInt();
        int number2=sc.nextInt();

        int sum = number1 + number2;
        int difference = number1 - number2;
        int product = number1 * number2;
        int quotient = number1 / number2;

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+ number1 +" and "+ number2 +" is "+sum+", "+difference+", "+ product+", "+"and " +quotient);
    }
}
