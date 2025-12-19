
import java.util.Scanner;

public class OddAndEven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number=sc.nextInt();
        if(number>0){
            for(int i=1;i<=number;i++){
                if(i%2==0){
                    System.out.println(i + " is Even number.");
                } else {
                    System.out.println(i + " is Odd number.");
                }
            }
        }else{
            System.out.println("Please enter a natural number greater than 0.");
        }

    }
}
