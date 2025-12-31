
import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str=sc.nextLine();
        //StringBuilder object to store the string
        StringBuilder newStr=new StringBuilder(str);
        //Built-in method to rerverse the string
        newStr.reverse();
        System.out.println("String after reverse : "+newStr.toString());

    }
    
}
