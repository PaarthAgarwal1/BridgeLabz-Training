import java.util.Scanner;

public class CorporateEmailAccessControl {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        while (n-->0){
            String email=sc.nextLine();
            if(email.matches("[a-z]{3,}\\.[a-z]{3,}[0-9]{4,}@(sales|marketing|IT|product)\\.company\\.com")){
                System.out.println("Access Granted");
            }else{
                System.out.println("Access Denied");
            }
        }
    }
}
