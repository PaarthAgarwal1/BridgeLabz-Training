import java.util.Scanner;
public class IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter first integer:");
        int firstInt = sc.nextInt();
        System.err.print("Enter second integer:");
        int secondInt = sc.nextInt();
        System.err.print("Enter third integer:");
        int thirdInt = sc.nextInt();

        int opt1=firstInt + secondInt * thirdInt;
        int opt2=firstInt * secondInt + thirdInt;
        int opt3=thirdInt + firstInt / secondInt;
        int opt4=firstInt % secondInt + thirdInt;

        System.err.println("The result of Int Operations are "+opt1+", "+opt2+", "+opt3+", "+ " and "+opt4);
    }
}
