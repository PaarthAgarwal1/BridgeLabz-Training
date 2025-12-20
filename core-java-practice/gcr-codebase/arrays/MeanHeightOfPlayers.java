
import java.util.Scanner;

public class MeanHeightOfPlayers  {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the heights of players in cm ");
        double [] heights = new double[11];
        double sum = 0.0;
        for(int i=0;i<heights.length;i++){
            System.out.print("Height of player "+(i+1)+": ");
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }
        double meanHeight = Math.round((sum / heights.length)*100)/100.0; // calculating mean height rounded to 2 decimal places
        System.out.println("Mean Height of Players: " + meanHeight + " cm");
        
    }
}
