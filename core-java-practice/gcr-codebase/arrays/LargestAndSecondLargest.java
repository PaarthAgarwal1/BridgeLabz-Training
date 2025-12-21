
import java.util.Scanner;

public class LargestAndSecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number =sc.nextInt();
        int [] digits = new int[10];
        //storing the digits of the number in an array
        for(int i=0;i<digits.length;i++){
            digits[i]=number%10;
            number=number/10;
        }
        int largest=0;
        int secondLargest=0;
        //finding largest and second largest digit
        for(int i=0;i<digits.length;i++){
            if(digits[i]>largest){ //if current digit is greater than largest
                secondLargest=largest;
                largest=digits[i];
            }else if(digits[i]>secondLargest && digits[i]!=largest){ //if current digit is greater than second largest and not equal to largest
                secondLargest=digits[i];
            }
        }
        System.out.println("Largest Digit: "+largest);
        System.out.println("Second Largest Digit: "+secondLargest);
    }
}
