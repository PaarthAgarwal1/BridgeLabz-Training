
import java.util.Scanner;

public class FriendsAgeHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input age and height
        System.out.println("=== Enter Age and Height for Amar, Akbar, Anthony ===\n");
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = sc.nextDouble();
            System.out.println();
        }
        // Find the index of the youngest friend
        int youngestIndex = 0;
        for (int i = 1; i < names.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        // Find the index of the tallest friend
        int tallestIndex = 0;
        for (int i = 1; i < names.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        System.out.println("=== Results ===");
        System.out.println("Youngest Friend: " + names[youngestIndex] + ", Age: " + ages[youngestIndex]);
        System.out.println("Tallest Friend: " + names[tallestIndex] + ", Height: " + heights[tallestIndex] + " cm");
    }    
}
