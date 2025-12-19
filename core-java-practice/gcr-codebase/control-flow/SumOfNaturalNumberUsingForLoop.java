import java.util.Scanner;

public class SumOfNaturalNumberUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter a natural number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        int sumCheck= (n*(n+1))/2;
        if(sum==sumCheck){
            System.out.println("The sum of first "+ n +" natural numbers is " + sum +" using for loop.");
        } else {
            System.out.println("There is a error in the calculations.");
        }
    }
}
