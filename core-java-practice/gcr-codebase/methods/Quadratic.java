import java.util.Scanner;

public class Quadratic {

    // Method to find roots of quadratic equation
    public static double[] findRoots(double a, double b, double c) {

        double delta = Math.pow(b, 2) - 4 * a * c;

        // If delta is negative, no real roots
        if (delta < 0) {
            return new double[0];
        }

        // If delta is zero, one root
        if (delta == 0) {
            double root = -b / (2 * a);
            return new double[] { root };
        }

        // If delta is positive, two roots
        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
        double root2 = (-b - Math.sqrt(delta)) / (2 * a);

        return new double[] { root1, root2 };
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Quadratic Equaction is ax^2 + bx + c");
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();
        // Method Call
        double[] roots = findRoots(a, b, c);

        if (roots.length == 0) {
            System.out.println("No real roots exist.");
        } else if (roots.length == 1) {
            System.out.println("One real root: " + roots[0]);
        } else {
            System.out.println("Root 1: " + roots[0]);
            System.out.println("Root 2: " + roots[1]);
        }

        sc.close();
    }
}
