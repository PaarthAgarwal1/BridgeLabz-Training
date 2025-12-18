
import java.util.Scanner;

public class areaOfCircle {
    public static double calculateArea(double radius) {
        return Math.round(Math.PI * radius * radius*100.0)/100.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the circle (Ex-5.0) :");
        double radius =sc.nextDouble(); // Example radius
        double area = calculateArea(radius);
        System.out.println("Area of circle with radius " + radius + " is: " + area);
    }
}
