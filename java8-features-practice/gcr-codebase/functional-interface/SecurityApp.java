interface SensitiveData{
    //Marker interfdace
}
class BankAccount implements SensitiveData{
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber,double balance) {
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
}
class EncryptionService{
    static void process(Object obj){
        if(obj instanceof SensitiveData){
            System.out.println("Encrypting sensitive data...");
        }else{
            System.out.println("Normal processing...");
        }
    }
}
public class SecurityApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345", 50000);
        EncryptionService.process(account);
    }
}
