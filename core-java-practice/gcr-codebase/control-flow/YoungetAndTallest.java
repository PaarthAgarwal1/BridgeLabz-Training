
import java.util.Scanner;

public class YoungetAndTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of Amar: ");
        int amarAge = sc.nextInt();
        System.out.print("Enter the height of Amar in cm: ");
        int amarHeight = sc.nextInt();
        System.out.print("Enter the age of Akbar: ");
        int akbarAge = sc.nextInt();
        System.out.print("Enter the height of Akbar in cm: ");
        int akbarHeight = sc.nextInt();
        System.out.print("Enter the age of Anthony: ");
        int anthonyAge = sc.nextInt();
        System.out.print("Enter the height of Anthony in cm: ");
        int anthonyHeight = sc.nextInt();
        // Finding the youngest
        if (amarAge < akbarAge && amarAge < anthonyAge) {
            System.out.println("Amar's age is " + amarAge + " so Amar is the youngest.");
        } else if (akbarAge < amarAge && akbarAge < anthonyAge) {
            System.out.println("Akbar's age is " + akbarAge + " so Akbar is the youngest.");
        } else if (anthonyAge < amarAge && anthonyAge < akbarAge) {
            System.out.println("Anthony's age is " + anthonyAge + " so Anthony is the youngest.");
        } else {
            System.out.println("There is a tie for the youngest age.");
        }
        // Finding the tallest
        if (amarHeight > akbarHeight && amarHeight > anthonyHeight) {
            System.out.println("Amar's height is " + amarHeight + " so Amar is the tallest.");
        } else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight) {
            System.out.println("Akbar's height is " + akbarHeight + " so Akbar is the tallest.");
        } else if (anthonyHeight > amarHeight && anthonyHeight > akbarHeight) {
            System.out.println("Anthony's height is " + anthonyHeight + " so Anthony is the tallest.");
        } else {
            System.out.println("There is a tie for the tallest height.");
        }
        sc.close();
    }
}
