
import java.util.Scanner;

//class name Employee
public class EmployeeDetails {
    // Attributes
    String name;
    int id;
    double salary;

    // Constructor
    public EmployeeDetails(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name  : " + name);
        System.out.println("ID    : " + id);
        System.out.println("Salary: INR " + salary);
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the Employee name : ");
        String name=sc.nextLine();
        System.out.print("Enter Employee Id : ");
        int id=sc.nextInt();
        System.out.print("Enter Employee Salary : ");
        double salary=sc.nextDouble();

        // Creating an Employee object
        EmployeeDetails emp = new EmployeeDetails(name,id,salary);

        // Displaying details
        emp.displayDetails();
    }
}