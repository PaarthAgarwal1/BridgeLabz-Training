
import java.util.Arrays;
import java.util.List;


public class NameUpperCasing {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Vyomi", "paarth", "grvit", "aashish", "neha");
        System.out.println("Employees Names for the HR Letter : ");
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
    
}
