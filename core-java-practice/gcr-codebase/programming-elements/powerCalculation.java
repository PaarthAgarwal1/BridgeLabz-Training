
import java.util.Scanner;

public class PowerCalculation {
    public static int calculatePower(int base, int exponent) {
        return (int)Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base (Ex-2) :");
        int base = sc.nextInt();
        System.out.println("Enter exponent (Ex-3) :");  
        int exponent = sc.nextInt();
        int result = calculatePower(base, exponent); 
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
}
