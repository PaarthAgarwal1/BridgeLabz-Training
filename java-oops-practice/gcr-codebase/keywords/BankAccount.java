public class BankAccount {
    private static String bankName="Union Bank";
    private static int totalAccount=0;
    private String accountHolderName;
    private final String accountNumber;
    private double balance;

    public BankAccount(String accountHolderName,String accountNumber,double balance){
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        this.balance=balance;
        totalAccount++;
    }

    public static void getTotalAccounts(){
        System.out.println("Total Number of Account : " + totalAccount);
    }

    public void displayBankAccount(){
        if(this instanceof BankAccount){
           System.out.println("Bank Name: " + bankName);
           System.out.println("Account Holder: " + accountHolderName);
           System.out.println("Account Number: " + accountNumber);
           System.out.println("Balance: $" + balance);
       } else {
           System.out.println("Invalid account instance.");
       }

    }

     public String getAccountHolderName() {
       return accountHolderName;
   }
   public void setAccountHolderName(String accountHolderName) {
       this.accountHolderName = accountHolderName;
   }
   public double getBalance() {
       return balance;
   }
   public void deposit(double amount) {
       if (amount > 0) {
           balance += amount;
           System.out.println("Deposited: $" + amount);
     } else {
           System.out.println("Invalid deposit amount.");
       }
   }
   public void withdraw(double amount) {
       if (amount > 0 && amount <= balance) {
           balance -= amount;
           System.out.println("Withdrawn: $" + amount);
       } else {
           System.err.println("Insufficient balance or invalid amount.");
       }
   }
   // Main method for testing
   public static void main(String[] args) {
       // Create two bank accounts
       BankAccount account1 = new BankAccount("Lynda Princy", "ACC12345", 1000.00);
       BankAccount account2 = new BankAccount("Prince Danish", "ACC67890", 500.00);
       // Display account details
       System.out.println("\nAccount 1 Details:");
       account1.displayBankAccount();
       System.out.println("\nAccount 2 Details:");
       account2.displayBankAccount();
       // Check total accounts
       BankAccount.getTotalAccounts();
       // Deposit and withdraw operations
       System.out.println("\nPerforming transactions on Account 1:");
       account1.deposit(200);
       account1.withdraw(150);
       account1.displayBankAccount();
       account2.displayBankAccount();
       account2.deposit(100);
       account2.withdraw(800);
   }


}
