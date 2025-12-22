
import java.util.Scanner;

public class DeckOfCards { 
    // Define suits and ranks
    static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberOfCards=suits.length * ranks.length; //52
        String [] deck=getDeckOfCards(numberOfCards); // creating deck of cards
        shuffleDeck(deck); // shuffling the deck of cards
        System.out.print("Enter the number of players: ");
        int numberOfPlayers=sc.nextInt(); // getting number of players
        String [][] distributedCards=distribute(deck, numberOfPlayers); // distributing cards to players
        
        printCards(distributedCards,numberOfPlayers); // printing the distributed cards to each player



    } 
    // Method to print the distributed cards to each player
    public static void printCards(String [][] distributedCards,int numberOfPlayers){
        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (String card : distributedCards[i]) {
                System.out.println(card);
            }
            System.out.println();
        }

    }
    // Method to distribute cards to players
    public static String[][] distribute(String[] deck, int numberOfPlayers) {
        int cardsPerPlayer = deck.length / numberOfPlayers;
        String[][] playersCards = new String[numberOfPlayers][cardsPerPlayer];
        for (int i = 0; i < numberOfPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playersCards[i][j] = deck[i * cardsPerPlayer + j]; //
            }
        }
        return playersCards;
    }
    // Method to create a deck of cards
    public static String[] getDeckOfCards(int numberOfCards) {
        String[] deck = new String[numberOfCards];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }
    // Method to shuffle the deck of cards
    public static void shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = i + (int) (Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }

}
