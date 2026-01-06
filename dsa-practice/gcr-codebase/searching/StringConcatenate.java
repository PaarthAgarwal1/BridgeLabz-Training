
import java.util.Scanner;

public class StringConcatenate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the five word to be concatenate together ");
        String [] words=new String[5];
        for(int i=0;i<5;i++){
            words[i]=sc.next();
        }
        StringBuffer string=new StringBuffer();
        for(int i=0;i<5;i++){
            string.append(words[i]+" ");
        }
        System.out.print(string.toString());
    }    
}
