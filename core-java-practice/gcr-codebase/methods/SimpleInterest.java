
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        //taking input from user
        System.out.print("Enter the Principal ammount : ");
        double principal=sc.nextDouble();

        System.out.print("Enter the rate of interest : ");
        double rate=sc.nextDouble();

        System.out.print("Enter the time period : ");
        int time=sc.nextInt();

        double simpleInterest=calculateSI(principal, rate, time);// calling method
        System.out.println("The Simple Interest is "+simpleInterest+" for Principal "+principal+", Rate of Interest "+rate+" and Time "+time);

    }
    //Method for calculating the simple intrest
    public static double calculateSI(double principal,double rate,int time){
        double simpleInterest=principal*rate*time/100.0;
        return simpleInterest;
    } 
}
