import java.util.Scanner;
public class volumeOfCylinder {
    public static double calculateVolume(double radius, double height) {
        return Math.round(Math.PI * radius * radius * height * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the cylinder (Ex-5.0) :");
        double radius = sc.nextDouble(); 
        System.out.println("Enter height of the cylinder (Ex-10.0) :");
        double height = sc.nextDouble();
        double volume = calculateVolume(radius, height);
        System.out.println("Volume of cylinder with radius " + radius + " and height " + height + " is: " + volume);
    }
}
