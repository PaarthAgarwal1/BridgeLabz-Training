
import java.util.function.Function;


public class StringLengthChecker {
    public static void main(String[] args) {
        int maxLength=10;
        Function<String,Integer> checkLength=msg -> msg.length();
        String testString="BridgeLabz";
        if(checkLength.apply(testString)<=maxLength){
            System.out.println("String length is within the limit: " + testString.length());
        } else {
            System.out.println("String length exceeds the limit: " + testString.length());
        }
    }
}
