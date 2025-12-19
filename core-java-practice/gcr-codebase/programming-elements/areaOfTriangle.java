
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base of the triangle (Ex-5.0) :");
        double base=sc.nextDouble();
        System.out.print("Enter the height of the triangle (Ex-10.0) :");
        double height=sc.nextDouble();
        double areaInches=0.5*base*height*0.394*0.394;
        double areaCm=0.5*base*height;
        System.out.println("The area of triangle in square centimeters is "+areaCm+" and in square inches is "+areaInches);
    }
}
