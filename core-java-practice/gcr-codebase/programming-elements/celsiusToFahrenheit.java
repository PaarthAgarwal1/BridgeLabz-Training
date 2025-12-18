
import java.util.Scanner;

public class celsiusToFahrenheit {
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius (Ex-25.04) :");
        double celsius = sc.nextDouble(); // Example Celsius temperature
        double fahrenheit = convertCelsiusToFahrenheit(celsius);
        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
    }
}
