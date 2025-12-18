
import java.util.Scanner;

public class distanceConversion {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in feet :");
        double feet = sc.nextDouble();
        double yard=Math.round((feet/3)*100.0)/100.0;
        double miles=Math.round((yard/1760)*100.0)/100.0;
        System.out.println("The distance in feet is "+feet+" while in yards is "+yard+" and in miles is "+miles);
    }
}
