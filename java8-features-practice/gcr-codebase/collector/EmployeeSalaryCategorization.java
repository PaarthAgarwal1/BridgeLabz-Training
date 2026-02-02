import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Employee class
class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeSalaryCategorization {
    public static void main(String[] args) {
        // Sample list of employees
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "IT", 60000),
            new Employee("Bob", "HR", 50000),
            new Employee("Charlie", "IT", 70000),
            new Employee("David", "Finance", 65000),
            new Employee("Eve", "HR", 55000)
        );

        // Group employees by department and calculate average salary
        Map<String, Double> avgSalaryByDept = employees.stream()
            .collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.averagingDouble(Employee::getSalary)
            ));

        // Print the average salary per department
        System.out.println("Average Salary by Department:");
        avgSalaryByDept.forEach((dept, avgSalary) ->
            System.out.println("Department: " + dept + ", Average Salary: " + avgSalary)
        );
    }
}
