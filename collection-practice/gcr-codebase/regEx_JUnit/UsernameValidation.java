
import java.util.Scanner;
public class UsernameValidation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the usename to validate : ");
        while (true) { 
            // Taking username input 
            String username=sc.nextLine();
            // Regualar Expression for username validation
            String regex="^[a-zA-Z][a-zA-Z0-9_]{4,15}$";
            if(username.matches(regex)){
                System.out.println("Valid username");
                break;
            }else{
                System.out.println("Invalid username, please enter again : ");
            }
            
        }}
        
}
    
