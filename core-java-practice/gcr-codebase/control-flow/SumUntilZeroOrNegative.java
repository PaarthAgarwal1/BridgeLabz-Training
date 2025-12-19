public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double sum = 0;
        // Continuously read numbers until 0 or negative number is entered
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double number = sc.nextDouble();
            if (number <= 0) {
                break;
            }
            sum += number;
        }
        System.out.println("The total sum is: " + sum);
        sc.close();
    }
}
