
import java.util.Scanner;

public class CalculatorUsingSwtich {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        String op = sc.next();
        double result;
        switch(op){
            case "+":
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case "/":
                if(num2 != 0){
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                }else{
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                break;
        }
    }
}
