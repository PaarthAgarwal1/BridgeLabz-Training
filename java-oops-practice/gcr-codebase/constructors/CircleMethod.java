class Circle {

    double radius;

    // Default Constructor
    public Circle() {
        this(1.0);   // constructor chaining
    }

    // Parameterized Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to display radius
    public void displayRadius() {
        System.out.println("Radius: " + radius);
    }
}


public class CircleMethod {
    public static void main(String[] args) {

        Circle c1 = new Circle();       // uses default constructor
        c1.displayRadius();

        Circle c2 = new Circle(5.5);    // user-provided value
        c2.displayRadius();
    }
    
}
