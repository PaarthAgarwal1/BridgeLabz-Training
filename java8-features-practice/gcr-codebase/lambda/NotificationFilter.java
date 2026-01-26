import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Alert {
    String type;
    String message;

    Alert(String type, String message){
        this.type = type;
        this.message = message;
    }

    @Override
    public String toString() {
        return type + ": " + message;
    }
}

public class NotificationFilter {
    public static void main(String[] args) {
        List<Alert> alerts = List.of(
            new Alert("Critical", "Patient heart rate high"),
            new Alert("Info", "Daily health report ready"),
            new Alert("Critical", "Low oxygen level")
        );

        // Lambda to filter only critical alerts
        Predicate<Alert> criticalOnly = alert -> "Critical".equals(alert.type);

        List<Alert> filtered = alerts.stream().filter(criticalOnly).collect(Collectors.toList());
        filtered.forEach(System.out::println);
    }
}