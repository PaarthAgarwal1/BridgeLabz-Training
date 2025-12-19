
import java.util.Scanner;

public class CalculateSI {
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return Math.round((principal * rate * time) / 100 * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount (Ex-1000.0) :");
        double principal = sc.nextDouble();
        System.out.println("Enter rate of interest (Ex-5.0) :");
        double rate =   sc.nextDouble(); 
        System.out.println("Enter time in years (Ex-3.0) :");
        double time =   sc.nextDouble();     
        double simpleInterest = calculateSimpleInterest(principal, rate, time);
        System.out.println("Simple Interest for principal " + principal + ", rate " + rate + "%, over " + time + " years is: " + simpleInterest);
    }
}
