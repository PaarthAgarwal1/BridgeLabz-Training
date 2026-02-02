
import java.util.Arrays;
import java.util.List;


public class EventWelcomeMessage {
    public static void main(String[] args) {
        List<String> attendees=Arrays.asList("Paarth","Amit","Neha","Rahul","Sneha");
        //Print welcome message for each attendee
        attendees.stream().forEach(name->System.out.println("Welcome to the event, "+name));
    }
}
