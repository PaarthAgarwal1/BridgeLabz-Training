interface DigitalPaymentService {
    void pay(String user, double amount);
}
class UPI implements DigitalPaymentService {

    @Override
    public void pay(String user, double amount) {
        System.out.println("Paid " + amount + " using UPI by " + user);
    }
}

class CreditCard implements DigitalPaymentService {

    @Override
    public void pay(String user, double amount) {
        System.out.println("Paid " + amount + " using Credit Card by " + user);
    }
}

class Wallet implements DigitalPaymentService {

    @Override
    public void pay(String user, double amount) {
        System.out.println("Paid " + amount + " using Wallet by " + user);
    }
}

public class DigitalPayment {
    public static void main(String[] args) {
        DigitalPaymentService upiPayment = new UPI();
        DigitalPaymentService creditCardPayment = new CreditCard();
        DigitalPaymentService walletPayment = new Wallet();

        upiPayment.pay("Paarth", 1500.00);
        creditCardPayment.pay("Garvit", 2500.50);
        walletPayment.pay("Vyomi", 500.75);
    }
    
}
