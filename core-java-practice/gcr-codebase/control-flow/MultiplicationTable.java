
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.err.print("Enter a number : ");
        int number=sc.nextInt();
        System.err.println("Multiplication Table of " + number + " is :");
        for(int i=6;i<=9;i++){
            System.out.println(number + " x " + i + " = " + (number*i));
        }
    }
}
