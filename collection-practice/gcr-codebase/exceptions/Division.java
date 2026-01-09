
import java.util.InputMismatchException;
import java.util.Scanner;


public class Division {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try {
            System.out.print("Enter the first number : ");
            int num1=sc.nextInt();

            System.out.print("Enter the second number : ");
            int num2=sc.nextInt();

            int result=num1/num2;
            System.out.println("Result : "+result);
            
        } catch (ArithmeticException e) {
            // Division by zero
            System.out.println("Cannot divide by zero");

        } catch (InputMismatchException e) {
            // Non-numeric input
            System.out.println("Please enter valid numbers");

        } finally {
            sc.close();
        }
    }
    
}
