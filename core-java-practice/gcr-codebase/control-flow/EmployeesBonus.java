
import java.util.Scanner;

public class EmployeesBonus {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the employee's salary: ");
        double salary=sc.nextDouble();
        System.out.print("Enter the employee's years of service: ");
        int serviceYears =sc.nextInt();
        double bonus;
        if(serviceYears>5){
            bonus=0.05*salary;
            System.out.println("The employee is eligible for a bonus of: " + bonus);
        } else {
            System.out.println("The employee is not eligible for a bonus.");
        }

    }
}
