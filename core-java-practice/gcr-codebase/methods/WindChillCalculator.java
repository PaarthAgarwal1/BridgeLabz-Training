import java.util.Scanner;

public class WindChillCalculator {

    // Method to calculate wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {
        double windChill = 35.74 
                + (0.6215 * temperature) 
                + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);

        return Math.round(windChill*100)/100.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter temperature (in Fahrenheit): ");
        double temperature = sc.nextDouble();

        System.out.print("Enter wind speed (in mph): ");
        double windSpeed = sc.nextDouble();

        // Method call
        double result = calculateWindChill(temperature, windSpeed);

        // Display result
        System.out.println("Wind Chill Temperature = " + result);

        sc.close();
    }
}
