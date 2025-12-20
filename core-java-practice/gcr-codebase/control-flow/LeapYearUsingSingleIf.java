
import java.util.Scanner;

public class LeapYearUsingSingleIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if (year >= 1582 && ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0))) {// Combined condition to check for leap year
            System.out.println(year + " is a leap year.");
        } else if (year < 1582) {// Check for year less than 1582
            System.out.println("Please enter a year greater than or equal to 1582.");
        } else {// If none of the above, it's not a leap year
            System.out.println(year + " is not a leap year.");
        }
    }
}
