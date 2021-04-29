/* Main for BlackJack
 * Matthew W. Gavin R. Caleb P. Sean C.
 * 27 April 2021
 * Controls the flow of the game
 */



import java.util.Scanner;

public class Main {
    public static <current> void main(String[] args) {
        Deck deck = new Deck();

        Player[] players = new Player[2];
        int current;
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to BlackJack\n" + "What is the name of the first player? ");
        players[0] = new Player(input.nextLine(), 1);
        System.out.print( "What is the name of the second player? ");
        players[1] = new Player(input.nextLine(), 2);
        System.out.println( "Welcome " + players[0]
                + " and " + players[1] + ". Please enjoy your game.");
        current = 0;
        boolean loop = true;
        int playerIndex = 0;
        do {
            System.out.println("It is now time for " + players[current] + " to make a move");

            if (playerIndex == 0) loop = false;
            else playerIndex--;
        } while (loop);
    }
}

