import java.util.*;

public class EmployeeGrouper {

    static class Employee {
        String name, dept;

        Employee(String n, String d) {
            name = n;
            dept = d;
        }

        // This helps in printing employee name instead of object reference
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> grouped = new HashMap<>();

        // Group employees based on department
        for (Employee e : employees) {
            grouped.computeIfAbsent(e.dept, k -> new ArrayList<>()).add(e);
        }

        // Print grouped employees
        System.out.println("Grouped: " + grouped);
    }
}
