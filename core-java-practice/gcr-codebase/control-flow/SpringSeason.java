
import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter day of the month: ");
        int day = sc.nextInt();

        if(month==3 && day>=20 && day<=31){
            System.out.println("Date "+month+"/"+day+" is in Spring season.");
        }else if(month==4 && day>=1 && day<=30){
            System.out.println("Date "+month+"/"+day+" is in Spring season.");
        }else if(month==5 && day>=1 && day<=31){
            System.out.println("Date "+month+"/"+day+" is in Spring season.");
        }else if(month==6 && day>=1 && day<=20){
            System.out.println("Date "+month+"/"+day+" is in Spring season.");
        }else{
            System.out.println("Date "+month+"/"+day+" is not in Spring season or the given date is invalid.");
        }
    }
}
