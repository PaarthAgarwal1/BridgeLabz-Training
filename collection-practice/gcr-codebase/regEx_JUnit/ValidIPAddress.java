
import java.util.Scanner;


public class ValidIPAddress {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the IP Address to validate : ");
        // Taking IP Address input
        String ipAddress=sc.nextLine();
        // Regular Expression for validating IP Address
        String regex="^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        // Validating IP Address
        boolean isValid=ipAddress.matches(regex);
        if(isValid) {
            System.out.println(ipAddress + " is a valid IP Address.");
        } else {
            System.out.println(ipAddress + " is not a valid IP Address.");
        }
    }
    
}
