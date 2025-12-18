
import java.util.Scanner;

public class universityDiscountWithUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the original university fee (Ex-125000.0) :");
        double originalFee = sc.nextDouble();
        System.out.print("Enter the discount percentage (Ex-10.0) :");
        double discountPercentage = sc.nextDouble();

        double discountAmount = (discountPercentage / 100) * originalFee;
        double discountedFee = originalFee - discountAmount;

        System.out.println("The discount amount is INR "+discountAmount+" and final discounted fee is INR "+discountedFee);
    }
}
