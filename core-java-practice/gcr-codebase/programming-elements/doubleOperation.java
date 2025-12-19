import java.util.Scanner;

public class DoubleOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter first number:");
        double firstNum = sc.nextDouble();
        System.err.print("Enter second number:");
        double secondNum = sc.nextDouble();
        System.err.print("Enter third number:");
        double thirdNum = sc.nextDouble();

        double opt1=firstNum + secondNum * thirdNum;
        double opt2=firstNum * secondNum + thirdNum;
        double opt3=thirdNum + firstNum / secondNum;
        double opt4=firstNum % secondNum + thirdNum;

        System.err.println("The result of Double Operations are "+opt1+", "+opt2+", "+opt3+", "+ " and "+opt4);
    }
    
}
