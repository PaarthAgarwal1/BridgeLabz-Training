
import java.util.Scanner;

public class maximumNumberOfHandshake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of people (Ex-5): ");
        int n = sc.nextInt();
        int maxHandshakes = (n * (n - 1)) / 2;
        System.out.println("The maximum number of handshakes among " + n + " people is: " + maxHandshakes);
    }
}
