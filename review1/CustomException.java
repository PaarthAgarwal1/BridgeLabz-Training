
import java.util.Scanner;

class InvalidPhoneNumberException extends Exception{

    InvalidPhoneNumberException(String msg) {
        super(msg);
    }
    
}
public class CustomException {
    public static void main(String[] args) throws InvalidPhoneNumberException {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your phone number : ");
        String phoneNumber=sc.next();
        try {
            if(!phoneNumber.matches("\\d{10}")){
                throw new InvalidPhoneNumberException("Your phone number is invalid !");
            }else{
                System.out.println("Your phone number is valid : "+phoneNumber);
            }

        } catch (InvalidPhoneNumberException e) {
            System.err.println("Error : "+e.getMessage());
        }
    }
    
}


