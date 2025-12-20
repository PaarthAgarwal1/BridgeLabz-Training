
import java.util.Scanner;

public class DayOfWeek {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month number (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter the day number (1-31): ");
        int day = sc.nextInt();
        System.out.print("Enter the year (e.g., 2024): ");
        int year = sc.nextInt();
        //calculating the day of the week
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int d = (day + x + (31 * m) / 12) % 7;
        // matching the calculated value to the corresponding day
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("The day of the week is: " + days[d]);
        sc.close();
    }
}
