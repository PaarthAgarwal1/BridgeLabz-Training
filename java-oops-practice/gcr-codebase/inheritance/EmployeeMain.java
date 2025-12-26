// parent class representing a general employee
class Employee {
    String name;
    int id;
    double salary;

    // constructor to set basic employee information
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // method to print standard employee data
    void showDetails() {
        System.out.println("Employee ID: " + id +
                ", Name: " + name +
                ", Salary: ₹" + salary);
    }
}

// subclass representing a team lead or manager
class Manager extends Employee {
    int teamCount;

    // constructor for manager-specific data
    Manager(String name, int id, double salary, int teamCount) {
        super(name, id, salary);
        this.teamCount = teamCount;
    }

    // overridden method to include team information
    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Position: Manager | Team Members: " + teamCount);
    }
}

// subclass representing a software developer
class Developer extends Employee {
    String techStack;

    // constructor for developer-specific information
    Developer(String name, int id, double salary, String techStack) {
        super(name, id, salary);
        this.techStack = techStack;
    }

    // overridden method to include technology details
    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Position: Developer | Technology: " + techStack);
    }
}

// subclass representing a trainee or intern
class Intern extends Employee {
    String institute;

    // constructor for intern-related data
    Intern(String name, int id, double salary, String institute) {
        super(name, id, salary);
        this.institute = institute;
    }

    // overridden method to include academic institution
    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Position: Intern | Institute: " + institute);
    }
}

// main class to execute the employee hierarchy
public class EmployeeMain {
    public static void main(String[] args) {

        // creating sample employee objects with new data
        Manager manager = new Manager("Rahul", 201, 90000, 8);
        Developer developer = new Developer("Neha", 202, 65000, "React");
        Intern intern = new Intern("Arjun", 203, 25000, "Stanford University");

        manager.showDetails();
        System.out.println("--------------");
        developer.showDetails();
        System.out.println("--------------");
        intern.showDetails();
    }
}
