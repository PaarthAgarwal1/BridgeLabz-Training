
import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Physics marks: ");
        int physics = sc.nextInt();
        System.out.print("Enter your Chemistry marks: ");
        int chemistry = sc.nextInt();
        System.out.print("Enter your Mathematics marks: ");
        int mathematics = sc.nextInt();
        int total = physics + chemistry + mathematics;
        double percentage = Math.round((total / 300.0) * 100 * 100) / 100.0; // Rounded to 2 decimal places
        char grade;
        String remark;
        if (percentage >= 80) {
            grade = 'A';
            remark = "(Level 4, above agency-normalized standard)";
        } else if (percentage >= 70) {
            grade = 'B';
            remark = "(Level 3, agency-normalized standard)";
        } else if (percentage >= 60) {
            grade = 'C';
            remark = "(Level 2,below, but approaching agency-normalized standard)";
        } else if (percentage >= 50) {
            grade = 'D';
            remark = "(Level 1, well below agency-normalized standard)";
        } else if (percentage >= 40) {
            grade = 'E';
            remark = "(Level 1-, too below agency-normalized standard)";
        } else {
            grade = 'R';
            remark = "(Remedial standard)";
        }
        System.out.println("Total Marks: "+total+" out of 300");
        System.out.println("percentage: " + percentage + "%");
        System.out.println("Grade: " + grade + " Remark: " + remark);
        sc.close();
    }
}
