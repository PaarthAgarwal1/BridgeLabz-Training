
import java.util.Scanner;
public class FindLengthWithoutUsingLengthFunction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the text : ");
        String text=sc.next();

        int customLength=findLength(text);
        int builtInLength=text.length();

        System.out.println("Length of the string without using built in function : "+customLength);
        System.out.println("Length of the string using built in function : "+builtInLength);
    
    }
    public static int findLength(String text){
        int count=0;
        try{
            while(true){
                text.charAt(count);
                count++;
            }
        }catch(Exception e){
            return count;
        }
    }
    
}
