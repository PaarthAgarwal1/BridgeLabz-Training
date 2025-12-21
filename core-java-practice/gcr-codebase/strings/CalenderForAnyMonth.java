
import java.util.Scanner;

public class CalenderForAnyMonth {
    // Gregorian calendar algorithm to find the first day of the month
    public static int getFirstDayOfMonth(int month,int year){
        int y0=year-(14-month)/12;
        int x=y0+y0/4 - y0/100 + y0/400;
        int m0=month+12*((14-month)/12)-2;
        int d0=(1 + x + (31*m0)/12)%7;
        return d0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        int daysInMonth;
        // determine number of days in the month
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                daysInMonth = 31;
                break;
            case 4, 6, 9, 11:
                daysInMonth = 30;
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) { // Leap year check
                    daysInMonth = 29; // Leap year
                } else {
                    daysInMonth = 28;
                }
                break;
            default:
                System.out.println("Invalid month number.");
                return;
        }
        // calculate the first day of the month
        int firstDay = getFirstDayOfMonth(month, year);
        // print the calendar
        System.out.println("\n       " + months[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        // print leading spaces 
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day); // print day
            if ((day + firstDay) % 7 == 0) {
                System.out.println(); // new line after Saturday
            }
        }
    }
}
