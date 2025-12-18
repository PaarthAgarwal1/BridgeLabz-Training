public class averageMarkInPCM {
    public static void main(String[] args) {
        int physics = 95; // Example marks in Physics (given in question)
        int chemistry = 96; // Example marks in Chemistry (given in question)
        int math = 94; // Example marks in Mathematics (given in question)

        int totalMarks = physics + chemistry + math;
        double averageMarks = totalMarks * 100.0 / 300.0;

        System.out.println("Sam's average mark in PCM is " + averageMarks);
    }
}
