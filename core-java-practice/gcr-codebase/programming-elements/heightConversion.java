
import java.util.Scanner;

public class HeightConversion {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height in centimeters (Ex-170.0) :");
        double heightCm = sc.nextDouble();
        double heightInches = Math.round(heightCm / 2.54 * 100.0) / 100.0;
        double heightFeet = Math.round(heightCm / 30.48 * 100.0) / 100.0;
        System.out.println("Your Height in cm is "+heightCm+"while in feet is "+heightFeet+" and inches is "+heightInches);
    }
}
