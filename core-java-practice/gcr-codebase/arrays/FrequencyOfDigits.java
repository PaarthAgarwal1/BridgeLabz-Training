
import java.util.Scanner;

public class FrequencyOfDigits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int [] frequency = new int[10];
        //storing the digits of the number in an array
        while(number>0){
            int digit=number%10;
            frequency[digit]++;
            number=number/10;
        }
        //printing the frequency of each digit
        System.out.println("Digit | Frequency");
        for(int i=0;i<frequency.length;i++){
            if(frequency[i]>0){
                System.out.println("  " + i + "  |    " + frequency[i]);
            }
        }

    }
}
