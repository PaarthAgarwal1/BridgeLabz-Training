import java.util.Scanner;

public class AthleteRun {

    // Method to calculate number of rounds
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        return Math.round(5000 *100.0 / perimeter)/100.0;   // 5 km = 5000 meters
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for sides of triangle
        System.out.print("Enter side 1 (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 (in meters): ");
        double side3 = sc.nextDouble();

        // Calling method
        double rounds = calculateRounds(side1, side2, side3);

        // Display result
        System.out.println("Number of rounds required to complete 5 km: " + rounds +" approx " +Math.round(rounds)+" rounds");
    }
}
