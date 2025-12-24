
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    static  Scanner sc = new Scanner(System.in);
    static int low=1;
    static int high=100;
    
    public static int generateGuess(){
        Random random=new Random();
        return random.nextInt(high-low+1)+low;
    }
    public static char getFeedback(int guess){
        System.out.print("Is "+guess+" too High (H), too Low (L), or correct (C) :" );
        String ch=sc.next();
        return ch.toUpperCase().charAt(0);
    }
    public static void updateRange(char feedback,int guess){
        if (feedback == 'H') {
            high = guess - 1;
        } else if (feedback == 'L') {
            low = guess + 1;
        }
    }
    public static void main(String[] args) {

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it!");

        boolean guessedCorrectly = false;

        while (!guessedCorrectly) {
            int guess = generateGuess();
            char feedback = getFeedback(guess);

            if (feedback == 'C') {
                System.out.println("Yay! I guessed your number correctly: " + guess);
                guessedCorrectly = true;
            } else {
                updateRange(feedback, guess);
            }
        }
    }
}
