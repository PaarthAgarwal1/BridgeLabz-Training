                                                                    

import java.util.Scanner;

public class ReplaceMultipleSpace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the text to replace multiple spaces : ");
        // Taking text input
        String text=sc.nextLine();
        // Regular Expression for replacing multiple spaces with single space
        String regex="\\s+";
        // Replacing multiple spaces with single space
        String result=text.replaceAll(regex, " ");
        System.out.println("Text after replacing multiple spaces : "+ result);
        
    }
    
}
