
import java.util.Scanner;

public class BMIFitnessTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the BMI Fitness Tracker!");
        System.out.print("Please enter your name: ");
        String name = sc.nextLine().trim();
        System.out.print("Please enter your weight in kilograms: ");
        double weight = sc.nextDouble();
        System.out.print("Please enter your height in centimeters: ");
        double height = sc.nextDouble();
        double heightInMeters = height / 100.0; // convert height to meters
        double bmi = Math.round(weight / (heightInMeters * heightInMeters)*100)/100.0; // rounded to 2 decimal places
        String category;
        if (bmi <= 18.5) {// BMI categorization based on standard ranges
            category = "Underweight";
        } else if (bmi <= 24.9) {
            category = "Normal weight";
        } else if (bmi <= 39.9) {
            category = "Overweight";
        } else {
            category = "Obesity";
        }
        System.out.println("======BMI FITNESS TRACKER======"); // Displaying the results
        System.out.println("Name           : " + name);
        System.out.println("Weight (kg)    : " + weight);
        System.out.println("Height (cm)    : " + height);
        System.out.println("BMI            : " + bmi);
        System.out.println("Category       : " + category);
        System.out.println("================================");
    }
}
