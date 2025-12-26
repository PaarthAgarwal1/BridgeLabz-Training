public class Employee {

    // same company name for every employee object
    static String companyName = "Innovate Solutions";
    static int totalEmployees = 0;

    // employee ID is fixed once assigned
    final int id;

    // holds the name of the employee
    String name;

    // holds the job role of the employee
    String designation;

    // constructor to assign employee information
    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;

        totalEmployees++;
    }

    // static function to show how many employees are created
    static void showEmployeeCount() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // method to output details of a single employee
    void displayEmployeeInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Company: " + companyName);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {

        // creating sample employee records
        Employee emp1 = new Employee("John Doe", 501, "Developer");
        Employee emp2 = new Employee("Jane Smith", 502, "Manager");

        // verify emp1 belongs to Employee class
        if (emp1 instanceof Employee) {
            emp1.displayEmployeeInfo();
        }

        // verify emp2 belongs to Employee class
        if (emp2 instanceof Employee) {
            emp2.displayEmployeeInfo();
        }

        // printing total employee count
        Employee.showEmployeeCount();
    }
}
