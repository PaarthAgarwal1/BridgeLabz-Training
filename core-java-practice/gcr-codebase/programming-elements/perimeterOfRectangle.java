
import java.util.Scanner;

public class perimeterOfRectangle {
    public static double calculatePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the rectangle (Ex-5.0) :");
        double length = sc.nextDouble();
        System.out.println("Enter width of the rectangle (Ex-3.0) :");
        double width = sc.nextDouble();
        double perimeter = calculatePerimeter(length, width);
        System.out.println("Perimeter of rectangle with length " + length + " and width " + width + " is: " + perimeter);
    }
}
