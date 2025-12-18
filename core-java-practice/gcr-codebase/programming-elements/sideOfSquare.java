
import java.util.Scanner;

public class sideOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the perimeter of the square (Ex-20.0) :");
        double perimeter = sc.nextDouble();
        double sideCm = perimeter / 4;
        System.err.println("The length of the side is "+ sideCm+" whose perimeter is "+perimeter);
    }
}
