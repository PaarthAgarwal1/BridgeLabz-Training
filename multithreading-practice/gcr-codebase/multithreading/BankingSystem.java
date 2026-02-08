
import java.time.LocalTime;

class BankAccount{
    private double balance=10000;
    public synchronized boolean withdraw(double amount){
        if(balance>=amount){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance-=amount;
            return true;
        }
        return false;
    }
    public double getBalance(){
        return balance;
    }

}
class Transaction implements Runnable{
    private BankAccount account;
    private double amount;
    private String customerName;

    public Transaction(BankAccount account, double amount, String customerName) {
        this.account = account;
        this.amount = amount;
        this.customerName = customerName;
    }
    
    @Override
    public void run(){
        System.out.println("["+customerName+"] Attempting to withdraw "+amount);
        boolean success=account.withdraw(amount);
        if(success){
            System.out.println("Transaction successfull: "+customerName+", Amount: "+amount+", Balance: "+account.getBalance()+", Time: "+LocalTime.now());
        }else{
            System.out.println("Transaction failed: " + customerName +", Amount: " + amount +", Time: " + LocalTime.now());
        }
    }

}
public class BankingSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread t1 = new Thread(new Transaction(account, 3000, "Customer-1"), "Customer-1");
        Thread t2 = new Thread(new Transaction(account, 4000, "Customer-2"), "Customer-2");
        Thread t3 = new Thread(new Transaction(account, 2000, "Customer-3"), "Customer-3");
        Thread t4 = new Thread(new Transaction(account, 5000, "Customer-4"), "Customer-4");
        Thread t5 = new Thread(new Transaction(account, 1500, "Customer-5"), "Customer-5");

        // Display thread states before start
        System.out.println("Thread States Before Execution:");
        System.out.println(t1.getName() + " : " + t1.getState());
        System.out.println(t2.getName() + " : " + t2.getState());
        System.out.println(t3.getName() + " : " + t3.getState());
        System.out.println(t4.getName() + " : " + t4.getState());
        System.out.println(t5.getName() + " : " + t5.getState());

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
