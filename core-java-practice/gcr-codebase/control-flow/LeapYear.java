
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if (year >= 1582) {
            if (year % 400 == 0) {
                System.out.println(year + " is a leap year.");
            } else if (year % 100 == 0) {
                System.out.println(year + " is not a leap year.");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        } else {
            System.out.println("Please enter a year greater than or equal to 1582.");
        }
        sc.close();
    }
}
