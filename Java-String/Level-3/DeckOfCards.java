import java.util.Scanner;

public class DeckOfCards {

    public static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    public static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    public static String[] initializeDeck() {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCard = i + (int)(Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCard];
            deck[randomCard] = temp;
        }
    }

    public static String[][] distributeCards(String[] deck, int nCards, int nPlayers) {
        if (nCards % nPlayers != 0) {
            System.out.println("Cannot distribute evenly! Please check values.");
            return null;
        }

        int cardsPerPlayer = nCards / nPlayers;
        String[][] players = new String[nPlayers][cardsPerPlayer];
        int index = 0;

        for (int i = 0; i < nPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[index++];
            }
        }
        return players;
    }
    public static void printPlayers(String[][] players) {
        if (players == null){ 
            return;
        }
        for (int i = 0; i < players.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + " cards:");
            for (String card : players[i]) {
                System.out.println("  " + card);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize and shuffle deck
        String[] deck = initializeDeck();
        shuffleDeck(deck);

        System.out.print("Enter number of players: ");
        int nPlayers = sc.nextInt();
        System.out.print("Enter number of cards to distribute: ");
        int nCards = sc.nextInt();

        String[][] players = distributeCards(deck, nCards, nPlayers);
        printPlayers(players);
    }
}
