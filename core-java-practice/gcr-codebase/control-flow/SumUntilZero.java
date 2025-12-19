public class SumUntilZero {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double sum = 0;
        // Continuously read numbers until 0 is entered
        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            double number = sc.nextDouble();
            if (number == 0) {
                break;
            }
            sum += number;
        }
        System.out.println("The sum of the entered numbers is: " + sum);
        sc.close();
    }
}
