
import java.util.Scanner;

public class IsAbundantNumber {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){ //check for divisors
                sum+=i; //sum of divisors
            }
        }
        if(sum>num){ //check for abundant condition
            System.out.println(num+" is an Abundant number.");
        }else{
            System.out.println(num+" is not an Abundant number.");
        }
        sc.close();
    }
}
