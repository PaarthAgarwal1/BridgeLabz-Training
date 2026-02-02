import java.util.Arrays;
import java.util.List;

public class IoTSensorReadings {
    public static void main(String[] args) {

        List<Double> sensorReadings=Arrays.asList(22.5, 25.0, 30.2, 18.9, 35.6, 27.4);

        double threshold = 25.0;

        System.out.println("Sensor readings above threshold:");

        sensorReadings.stream().filter(reading -> reading > threshold).forEach(reading ->System.out.println("Reading: " + reading));
    }
}
