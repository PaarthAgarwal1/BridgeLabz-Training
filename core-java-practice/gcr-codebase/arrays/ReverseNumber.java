
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int numberOFDigit=0;
        int originalNumber=number;
        //counting number of digits
        while(number>0){
            number=number/10;
            numberOFDigit++;
        }
        int [] digits = new int[numberOFDigit];
        //storing the digits of the number in an array
        for(int i=0;i<digits.length;i++){
            digits[i]=originalNumber%10;
            originalNumber=originalNumber/10;
        }
        //reversing the number using the digits array
        int reversedNumber=0;
        for(int i=0; i<digits.length;i++){
            reversedNumber=reversedNumber*10+digits[i];
        }
        System.out.print("Reversed Number: ");
        System.out.println(reversedNumber);
    }
}
