
import java.util.Scanner;

public class NumberOfHandshakes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //taking user input for number of students
        System.out.print("Enter the number of students : ");
        int students=sc.nextInt();

        int maxHandshakes=numberOfHandshakes(students); //method call to find the maximum number of handshakes
        System.out.println("The maximum number of handshakes among " + students + " students is: " + maxHandshakes);
    
    }
    //Method for calculating the number of handshakes
    public static int numberOfHandshakes(int students){
        int handshakes=students*(students-1)/2;
        return handshakes;
    }
}
