public class penDistribution {
    public static void main(String[] args) {
        int totalPens = 14; // Total number of pens (given in question)
        int students = 3; // Number of students (given in question)

        int pensPerStudent = totalPens / students;
        int remainingPens = totalPens % students;

        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}
