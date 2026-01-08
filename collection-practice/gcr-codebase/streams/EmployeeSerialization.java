import java.io.*;
import java.util.*;

// Employee class must implement Serializable
class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    int id;
    String name;
    String department;
    double salary;

    // Constructor
    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Display employee details
    void display() {
        System.out.println("ID: " + id +", Name: " + name +", Department: " + department +", Salary: ₹" + salary);
    }
}

public class EmployeeSerialization {

    static final String FILE_NAME = "employees.dat";

    public static void main(String[] args) {

        // Create list of employees
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Amit", "IT", 60000));
        employees.add(new Employee(2, "Neha", "HR", 45000));
        employees.add(new Employee(3, "Ravi", "Finance", 55000));

        // Serialize employee list
        saveEmployees(employees);

        // Deserialize and display employee list
        loadEmployees();
    }

    // Method to serialize employees
    static void saveEmployees(List<Employee> employees) {

        try (ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(employees);
            System.out.println("Employees saved successfully.\n");

        } catch (IOException e) {
            System.out.println("Error while saving employees.");
            e.printStackTrace();
        }
    }

    // Method to deserialize employees
    static void loadEmployees() {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            // Read object and cast it
            List<Employee> employees =
                    (List<Employee>) ois.readObject();

            System.out.println("Employees loaded from file:");
            for (Employee emp : employees) {
                emp.display();
            }

        } catch (IOException e) {
            System.out.println("Error while reading employees.");
            e.printStackTrace();

        } catch (ClassNotFoundException e) {
            System.out.println("Employee class not found.");
            e.printStackTrace();
        }
    }
}
