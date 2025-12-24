
import java.util.Scanner;

// Circle class to compute area and circumference
class Circle {
    double radius;

    // Constructor to initialize radius
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area of the circle
    double calculateArea() {
        return Math.round(Math.PI * radius * radius*100)/100.0;
    }

    // Method to calculate circumference of the circle
    double calculateCircumference() {
        return Math.round(2 * Math.PI * radius*100)/100.0;
    }

    // Method to display area and circumference
    void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of circle : ");
        double radius=sc.nextDouble();
        Circle c = new Circle(radius); // create object with radius 5.0
        c.displayDetails();
    }
}