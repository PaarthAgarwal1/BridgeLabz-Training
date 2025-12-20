
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter weight in kilograms: ");
        double weight=sc.nextDouble();
        System.out.print("Enter height in centimeters: ");
        double height=sc.nextDouble();
        double heightInMeters=height/100;
        double bmi=Math.round(weight/(heightInMeters*heightInMeters)*100.0)/100.0;
        String status;
        if(bmi<=18.4){
            status="Underweight";
        }else if(bmi>=18.5 && bmi<24.9){
            status="Normal weight";
        }else if(bmi>=25 && bmi<39.9){
            status="Overweight";
        }else{
            status="Obesity";
        }
        System.out.println("your BMI is: "+bmi);
        System.out.println("Status: "+status);
    }
}
