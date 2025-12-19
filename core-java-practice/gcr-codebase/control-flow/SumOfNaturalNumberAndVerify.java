
import java.util.Scanner;

public class SumOfNaturalNumberAndVerify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n=sc.nextInt();
        // Calculate sum using loop
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        // Verify using formula
        int sumCheck= (n*(n+1))/2;
        if(sum==sumCheck){
            System.out.println("The sum of first "+ n +" natural numbers is " + sum +" using both methods.");
        } else {
            System.out.println("There is a error in the calculations.");
        }
        sc.close();
    }
}
