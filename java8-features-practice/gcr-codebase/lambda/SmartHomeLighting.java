
import java.util.function.Consumer;


public class SmartHomeLighting {
    public static void main(String[] args) {


        // Lambda for motion trigger
        Consumer<String> motionTrigger = room -> System.out.println("Motion detected in " + room + ". Turning on lights.");


        // Lambda for time of day
        Consumer<String> timeTrigger = time -> System.out.println("Time is " + time + ". Activating evening lights.");


        // Lambda for voice command
        Consumer<String> voiceCommand = command -> System.out.println("Voice command received: '" + command + "'. Adjusting lights accordingly.");


        // Test triggers
        motionTrigger.accept("Living Room");
        timeTrigger.accept("7:00 PM");
        voiceCommand.accept("Dim lights in Bedroom");
    }
}
