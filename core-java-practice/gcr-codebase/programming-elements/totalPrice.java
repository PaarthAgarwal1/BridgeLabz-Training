
import java.util.Scanner;

public class TotalPrice {
    public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        System.err.print("Enter the unit price of the item (Ex-100.0) :");
        double unitPrice=sc.nextDouble();
        System.out.print("Enter the quantity of the item (Ex-5) :");
        int quantity=sc.nextInt();
        double totalPrice=unitPrice*quantity;
        System.err.println("The total purchase price is INR "+ totalPrice+" if the quantity "+quantity+" and unit price is INR "+unitPrice);
    }
}
