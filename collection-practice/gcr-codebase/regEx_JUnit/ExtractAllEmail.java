
import java.util.Scanner;


public class ExtractAllEmail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the text to extract email addresses : ");
        // Taking text input 
        String text=sc.nextLine();
        // Regular Expression for email extraction 
        String regex="^[a-zA-Z0-9]+@[a-zA-Z]+\\.[a-zA-Z]{2,}$";
        // Creating array to store words from the text 
        String[] emails=text.split(" ");
        for(int i=0;i<emails.length;i++){
            // MAtching each word with regex 
            if(emails[i].matches(regex)){
                System.out.println("Extracted email address : "+ emails[i]);
            }
        }
        
    }
    
}
