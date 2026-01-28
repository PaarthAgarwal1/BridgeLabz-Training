
interface PaymentProcessor {

    void processPayment(double amount);

    // New feature added later – does NOT break old providers
    default void refund(double amount) {
        System.out.println("Refund of " + amount + " processed using standard policy.");
    }
}
class RazorpayProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Payment of " + amount + " processed via Razorpay");
    }
}

class PaypalProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Payment of " + amount + " processed via PayPal");
    }
}

class StripeProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Payment of " + amount + " processed via Stripe");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Stripe refund of " + amount + " completed with instant reversal");
    }
}

public class PaymentGatewayInterface {
    public static void main(String[] args) {


        PaymentProcessor razorpay = new RazorpayProcessor();
        PaymentProcessor paypal = new PaypalProcessor();
        PaymentProcessor stripe = new StripeProcessor();


        razorpay.processPayment(5000);
        razorpay.refund(2000);


        paypal.processPayment(3000);
        paypal.refund(1000);


        stripe.processPayment(8000);
        stripe.refund(4000);
    }
}
