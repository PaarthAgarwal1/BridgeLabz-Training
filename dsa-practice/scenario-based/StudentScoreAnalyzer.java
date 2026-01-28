
import java.util.Scanner;


public class StudentScoreAnalyzer {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int n=sc.nextInt();

        int [] scores =new int [n];
        int sum=0;
        for(int i=0;i<n;i++){
            while (true) { 
                System.out.println("Enter score for student " + (i + 1) + " (0-100):");
                if(sc.hasNextInt()){
                    int score=sc.nextInt();
                    if(score>=0 && score<=100){
                        scores[i]=score;
                        sum+=score;
                        break;
                    } else {
                        System.out.println("Invalid input. Score must be between 0 and 100.");
                    }
                }else{
                    System.out.println("Invalid input. Please enter an integer.");
                    sc.next(); // Clear invalid input
                }
            }
        }
        double average=(double)sum/n;
        int highest=scores[0];
        int lowest=scores[0];
        for(int score:scores){
            if(score>highest){
                highest=score;
            }
            if(score<lowest){
                lowest=score;
            }
        }
        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
        System.out.println("Scores above average:");
        for(int score:scores){
            if(score>average){
                System.out.print(score+" ");
            }
        }
        
    }
}
