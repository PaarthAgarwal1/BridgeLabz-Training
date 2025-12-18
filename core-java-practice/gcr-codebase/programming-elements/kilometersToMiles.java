
import java.util.Scanner;

public class kilometersToMiles {
    public static double convertKmToMiles(double kilometers) {
        return Math.round(kilometers * 0.621371 * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in kilometers (Ex-10.0) :");
        double kilometers = sc.nextDouble();
        double miles = convertKmToMiles(kilometers);
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");
    }
}
