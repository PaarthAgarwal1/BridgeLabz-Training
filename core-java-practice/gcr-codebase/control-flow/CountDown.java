
import java.util.Scanner;

public class CountDown {
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number to start countdown: ");
        int number= sc.nextInt();
        while(number>0){
            System.out.println(number);
            number--;
        }
    }
}
