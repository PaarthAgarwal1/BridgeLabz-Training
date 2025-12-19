import java.util.Scanner;

public class CountDownUsingForLoop {
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number to start countdown: ");
        int startNumber = sc.nextInt();
        for(int i = startNumber; i > 0; i--){
            System.out.println(i);
        }
        sc.close();
    }
    
}
