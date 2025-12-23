import java.util.Scanner;

public class UnitConvertor {

    // Convert Kilometers to Miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return Math.round(km * km2miles*100)/100.0;
    }

    // Convert Miles to Kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return Math.round(miles * miles2km*100)/100.0;
    }

    // Convert Meters to Feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return Math.round(meters * meters2feet*100)/100.0;
    }

    // Convert Feet to Meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return Math.round(feet * feet2meters*100)/100.0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in Kilometers: ");
        double km = sc.nextDouble();
        System.out.println("Kilometers to Miles: " + convertKmToMiles(km));

        System.out.print("\nEnter distance in Miles: ");
        double miles = sc.nextDouble();
        System.out.println("Miles to Kilometers: " + convertMilesToKm(miles));

        System.out.print("\nEnter distance in Meters: ");
        double meters = sc.nextDouble();
        System.out.println("Meters to Feet: " + convertMetersToFeet(meters));

        System.out.print("\nEnter distance in Feet: ");
        double feet = sc.nextDouble();
        System.out.println("Feet to Meters: " + convertFeetToMeters(feet));

        sc.close();
    }
}
