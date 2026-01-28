
import java.util.function.Predicate;


public class TemperatureAlert {
    public static void main(String[] args) {
        double threshold = 75.0;
        Predicate<Double> highTemperature= temp -> temp > threshold;
        double currentTemp = 80.5;
        if (highTemperature.test(currentTemp)) {
            System.out.println("Alert: High temperature detected! Current Temperature: " + currentTemp);
        } else {
            System.out.println("Temperature is normal. Current Temperature: " + currentTemp);
        }
    }    
}
