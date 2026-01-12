
import java.util.Scanner;

public class ValidHexColourCode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the hex color code to validate : ");
        while(true){
            // Taking hex color code input
            String colorCode=sc.nextLine();
            // Regular Expression for hex color code validation
            String regex="^#[0-9a-fA-F]{0,6}$";
            if(colorCode.matches(regex)){
                System.out.print("Valid hex color code !");
                break;
            }else{
                System.out.println("Invalid hex color code , please enter the again : ");
            }
        }
    }
    
}
