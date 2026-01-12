import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractWebLink {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the text to extract weblinks : ");
        // Taking text input 
        String text=sc.nextLine();
        // Regular Expression for weblink extraction 
        String regex="https?://[^\\s]+";
        // Compiling the regex
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(text);
        while(matcher.find()){
            System.out.println("Extracted WebLink : "+ matcher.group());
        }
    }
    
}
