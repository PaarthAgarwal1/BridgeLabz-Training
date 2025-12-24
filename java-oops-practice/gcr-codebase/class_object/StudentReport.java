import java.util.Scanner;

class Student {
    // Attributes
    String name;
    int rollNumber;
    double [] marks;
    String grade;

    // Constructor
    public Student(String name, int rollNumber, double [] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.grade = calculateGrade();
    }

    public double calculateTotalMarks(){
        return Math.round((marks[0]+marks[1]+marks[2])*100/3)/100.0;
    }
    // Method to calculate grade
    public String calculateGrade() {
        double totalMarks=calculateTotalMarks();
        if (totalMarks >= 90) {
            return "A+";
        } else if (totalMarks >= 80) {
            return "A";
        } else if (totalMarks >= 70) {
            return "B";
        } else if (totalMarks >= 60) {
            return "C";
        } else if (totalMarks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Report:");
        System.out.println("Name                : " + name);
        System.out.println("Roll Number         : " + rollNumber);
        for(int i=0;i<3;i++){
        System.out.println("Marks of subject "+(i+1)+" : " + marks[i]);

        }
        System.out.println("Grade               : " + grade);
    }
}

public class StudentReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input  details
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int rollNumber = sc.nextInt();
        
        double[] marks=new double[3];
        for(int i=0;i<3;i++){
            System.out.print("Enter marks of subject "+(i+1)+" : ");
            marks[i]=sc.nextDouble();

        }

        // Create object
        Student student = new Student(name, rollNumber, marks);

        // Display details
        student.displayDetails();
        
    }
}