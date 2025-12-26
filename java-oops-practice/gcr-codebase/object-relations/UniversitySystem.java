import java.util.ArrayList;
import java.util.List;

// Department class (part of University)
class Department {
    private String deptName;

    Department(String deptName) {
        this.deptName = deptName;
        System.out.println("Department created: " + deptName);
    }

    void showDepartment() {
        System.out.println("Department: " + deptName);
    }
}

// Faculty class (independent entity)
class Faculty {
    private String facultyName;

    Faculty(String facultyName) {
        this.facultyName = facultyName;
    }

    void showFaculty() {
        System.out.println("Faculty Member: " + facultyName);
    }
}

// University class (owns departments)
class University {
    private String universityName;
    private List<Department> departments = new ArrayList<>();
    private List<Faculty> faculties = new ArrayList<>();

    University(String universityName) {
        this.universityName = universityName;
    }

    // Adding department (composition)
    void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    // Adding faculty (aggregation)
    void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    void showDetails() {
        System.out.println("\nUniversity: " + universityName);
        System.out.println("Departments:");
        for (Department d : departments) {
            d.showDepartment();
        }

        System.out.println("Faculties:");
        for (Faculty f : faculties) {
            f.showFaculty();
        }
    }
}

public class UniversitySystem {
    public static void main(String[] args) {

        Faculty f1 = new Faculty("Dr. Sharma");
        Faculty f2 = new Faculty("Dr. Mehta");

        University uni = new University("Global University");
        uni.addDepartment("Computer Science");
        uni.addDepartment("Mechanical");

        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.showDetails();

        // Deleting university (departments are destroyed)
        uni = null;
        System.out.println("\nUniversity deleted but faculty still exists:");
        f1.showFaculty();
    }
}
