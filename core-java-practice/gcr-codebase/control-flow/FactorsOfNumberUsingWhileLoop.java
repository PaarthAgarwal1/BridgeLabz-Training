
import java.util.Scanner;

public class FactorsOfNumberUsingWhileLoop {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number=sc.nextInt();
        if(number>0){// Checking if the number is a natural number
            System.out.println("Factors of "+number+" are:");
            int i=1;
            while(i<=number){
                if(number%i==0){// Checking if i is a factor of number
                    System.out.println(i);
                }
                i++;
            }
        }else{
            System.out.println("Please enter a natural number greater than 0.");
        }
        sc.close();
    }
}
