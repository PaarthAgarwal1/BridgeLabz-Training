public class universityDiscount {
    public static void main(String[] args) {
        double originalFee = 125000.0; // Original university fee (given in question)
        double discountPercentage = 10.0; // Discount percentage (given in question)

        double discountAmount = (discountPercentage / 100) * originalFee;
        double discountedFee = originalFee - discountAmount;

        System.out.println("The discount amount is INR "+discountAmount+" and final discounted fee is INR "+discountedFee);
    }
}
