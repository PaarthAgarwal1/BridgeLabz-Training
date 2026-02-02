
import java.util.Arrays;
import java.util.List;


public class NamesForDisplay {
   public static void main(String[] args) {
       List<String> customers =Arrays.asList("rahul","Amit","neha","pooja","Suresh");
        customers.stream()
            .map(String::toUpperCase) //Convert to uppercase
            .sorted()                 // Sort alphabetically
            .forEach(System.out::println); //Display
   } 
}
