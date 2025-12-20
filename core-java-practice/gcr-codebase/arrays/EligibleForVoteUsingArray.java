
import java.util.Scanner;

public class EligibleForVoteUsingArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Students Age:");
        int [] ages=new int[10]; //array to hold ages of 10 students
        for(int i=0;i<ages.length;i++){
            ages[i]=sc.nextInt();
        }
        System.out.println("Students Eligible for Voting:");
        for(int i=0;i<ages.length;i++){
            if(ages[i]>=18){
                System.out.println("The student with the age "+ages[i]+" can vote");
            }else{
                System.out.println("The student with the age "+ages[i]+" cannot vote");
            }
        }
    }
}
