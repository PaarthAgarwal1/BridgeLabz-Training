
import java.util.Scanner;

public class IsHarshadNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int sum=0;
        int originalNum=num; //store original number to check later
        while(num>0){
            int digit=num%10;
            sum+=digit;
            num/=10;
        }
        if(originalNum%sum==0){ //check divisibility
            System.out.println(originalNum+" is a Harshad number.");
        }else{
            System.out.println(originalNum+" is not a Harshad number.");
        }
    }
}
