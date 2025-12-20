
import java.util.Scanner;

public class IsArmstrong {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int originalNum=num;
        int numberOfDigits=String.valueOf(num).length();
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum+=Math.pow(digit,numberOfDigits);
            num/=10;
        }
        if(sum==originalNum){
            System.out.println(originalNum+" is an Armstrong number.");
        }else{
            System.out.println(originalNum+" is not an Armstrong number.");
        }
    }
}
