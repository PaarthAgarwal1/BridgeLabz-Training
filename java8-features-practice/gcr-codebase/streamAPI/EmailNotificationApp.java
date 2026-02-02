import java.util.Arrays;
import java.util.List;

public class EmailNotificationApp {

    public static void main(String[] args) {

        // List of user emails
        List<String> emails=Arrays.asList("user1@gmail.com","user2@yahoo.com","admin@company.com","support@service.com");

        // Send notification to each email
        emails.forEach(email -> sendEmailNotification(email));
    }

    // Simulated email sending method
    private static void sendEmailNotification(String email) {
        System.out.println("Notification sent to: " + email);
    }
}
